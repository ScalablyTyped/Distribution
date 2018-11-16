package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "Reader")
@js.native
class Reader protected () extends js.Object {
  /**
       * Constructs a new reader instance using the specified buffer.
       * @param buffer Buffer to read from
       */
  def this(buffer: stdLib.Uint8Array) = this()
  /** Read buffer. */
  var buf: stdLib.Uint8Array = js.native
  /** Read buffer length. */
  var len: scala.Double = js.native
  /** Read buffer position. */
  var pos: scala.Double = js.native
  /**
       * Reads a varint as a boolean.
       * @returns Value read
       */
  def bool(): scala.Boolean = js.native
  /**
       * Reads a sequence of bytes preceeded by its length as a varint.
       * @returns Value read
       */
  def bytes(): stdLib.Uint8Array = js.native
  /**
       * Reads a double (64 bit float) as a number.
       * @returns Value read
       */
  def double(): scala.Double = js.native
  /**
       * Reads fixed 32 bits as an unsigned 32 bit integer.
       * @returns Value read
       */
  def fixed32(): scala.Double = js.native
  /**
       * Reads fixed 64 bits.
       * @returns Value read
       */
  def fixed64(): Long = js.native
  /**
       * Reads a float (32 bit) as a number.
       * @returns Value read
       */
  def float(): scala.Double = js.native
  /**
       * Reads a varint as a signed 32 bit value.
       * @returns Value read
       */
  def int32(): scala.Double = js.native
  /**
       * Reads a varint as a signed 64 bit value.
       * @returns Value read
       */
  def int64(): Long = js.native
  /**
       * Reads fixed 32 bits as a signed 32 bit integer.
       * @returns Value read
       */
  def sfixed32(): scala.Double = js.native
  /**
       * Reads zig-zag encoded fixed 64 bits.
       * @returns Value read
       */
  def sfixed64(): Long = js.native
  /**
       * Reads a zig-zag encoded varint as a signed 32 bit value.
       * @returns Value read
       */
  def sint32(): scala.Double = js.native
  /**
       * Reads a zig-zag encoded varint as a signed 64 bit value.
       * @returns Value read
       */
  def sint64(): Long = js.native
  /**
       * Skips the specified number of bytes if specified, otherwise skips a varint.
       * @param [length] Length if known, otherwise a varint is assumed
       * @returns `this`
       */
  def skip(): Reader = js.native
  /**
       * Skips the specified number of bytes if specified, otherwise skips a varint.
       * @param [length] Length if known, otherwise a varint is assumed
       * @returns `this`
       */
  def skip(length: scala.Double): Reader = js.native
  /**
       * Skips the next element of the specified wire type.
       * @param wireType Wire type received
       * @returns `this`
       */
  def skipType(wireType: scala.Double): Reader = js.native
  /**
       * Reads a string preceeded by its byte length as a varint.
       * @returns Value read
       */
  def string(): java.lang.String = js.native
  /**
       * Reads a varint as an unsigned 32 bit value.
       * @returns Value read
       */
  def uint32(): scala.Double = js.native
  /**
       * Reads a varint as an unsigned 64 bit value.
       * @returns Value read
       */
  def uint64(): Long = js.native
}

@JSImport("protobufjs", "Reader")
@js.native
object Reader extends js.Object {
  /**
       * Creates a new reader using the specified buffer.
       * @param buffer Buffer to read from
       * @returns A {@link BufferReader} if `buffer` is a Buffer, otherwise a {@link Reader}
       * @throws {Error} If `buffer` is not a valid buffer
       */
  def create(buffer: protobufjsLib.protobufjsMod.Buffer | stdLib.Uint8Array): protobufjsLib.protobufjsMod.Reader | protobufjsLib.protobufjsMod.BufferReader = js.native
}

