// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: service_kotlin.proto
package com.squareup.wire.protos.kotlin

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Nothing
import kotlin.String
import kotlin.jvm.JvmField
import okio.ByteString

data class SomeRequest(
  val unknownFields: ByteString = ByteString.EMPTY
) : Message<SomeRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing {
    throw AssertionError()
  }

  override fun equals(other: Any?): Boolean = other is SomeRequest

  override fun hashCode(): Int = unknownFields.hashCode()

  override fun toString(): String = "SomeRequest{}"

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<SomeRequest> = object : ProtoAdapter<SomeRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      SomeRequest::class
    ) {
      override fun encodedSize(value: SomeRequest): Int = 
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: SomeRequest) {
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): SomeRequest {
        val unknownFields = reader.forEachTag(reader::readUnknownField)
        return SomeRequest(
          unknownFields = unknownFields
        )
      }

      override fun redact(value: SomeRequest): SomeRequest = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
