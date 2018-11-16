package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "Writer")
@js.native
class Writer () extends js.Object {
  /** Operations head. */
  var head: js.Object = js.native
  /** Current length. */
  var len: scala.Double = js.native
  /** Linked forked states. */
  var states: js.Object | scala.Null = js.native
  /** Operations tail */
  var tail: js.Object = js.native
  /**
       * Writes a boolish value as a varint.
       * @param value Value to write
       * @returns `this`
       */
  def bool(value: scala.Boolean): Writer = js.native
  /**
       * Writes a sequence of bytes.
       * @param value Buffer or base64 encoded string to write
       * @returns `this`
       */
  def bytes(value: java.lang.String): Writer = js.native
  /**
       * Writes a sequence of bytes.
       * @param value Buffer or base64 encoded string to write
       * @returns `this`
       */
  def bytes(value: stdLib.Uint8Array): Writer = js.native
  /**
       * Writes a double (64 bit float).
       * @param value Value to write
       * @returns `this`
       */
  def double(value: scala.Double): Writer = js.native
  /**
       * Finishes the write operation.
       * @returns Finished buffer
       */
  def finish(): stdLib.Uint8Array = js.native
  /**
       * Writes an unsigned 32 bit value as fixed 32 bits.
       * @param value Value to write
       * @returns `this`
       */
  def fixed32(value: scala.Double): Writer = js.native
  /**
       * Writes an unsigned 64 bit value as fixed 64 bits.
       * @param value Value to write
       * @returns `this`
       * @throws {TypeError} If `value` is a string and no long library is present.
       */
  def fixed64(value: java.lang.String): Writer = js.native
  /**
       * Writes an unsigned 64 bit value as fixed 64 bits.
       * @param value Value to write
       * @returns `this`
       * @throws {TypeError} If `value` is a string and no long library is present.
       */
  def fixed64(value: Long): Writer = js.native
  /**
       * Writes an unsigned 64 bit value as fixed 64 bits.
       * @param value Value to write
       * @returns `this`
       * @throws {TypeError} If `value` is a string and no long library is present.
       */
  def fixed64(value: scala.Double): Writer = js.native
  /**
       * Writes a float (32 bit).
       * @param value Value to write
       * @returns `this`
       */
  def float(value: scala.Double): Writer = js.native
  /**
       * Forks this writer's state by pushing it to a stack.
       * Calling {@link Writer#reset|reset} or {@link Writer#ldelim|ldelim} resets the writer to the previous state.
       * @returns `this`
       */
  def fork(): Writer = js.native
  /**
       * Writes a signed 32 bit value as a varint.
       * @param value Value to write
       * @returns `this`
       */
  def int32(value: scala.Double): Writer = js.native
  /**
       * Writes a signed 64 bit value as a varint.
       * @param value Value to write
       * @returns `this`
       * @throws {TypeError} If `value` is a string and no long library is present.
       */
  def int64(value: java.lang.String): Writer = js.native
  /**
       * Writes a signed 64 bit value as a varint.
       * @param value Value to write
       * @returns `this`
       * @throws {TypeError} If `value` is a string and no long library is present.
       */
  def int64(value: Long): Writer = js.native
  /**
       * Writes a signed 64 bit value as a varint.
       * @param value Value to write
       * @returns `this`
       * @throws {TypeError} If `value` is a string and no long library is present.
       */
  def int64(value: scala.Double): Writer = js.native
  /**
       * Resets to the last state and appends the fork state's current write length as a varint followed by its operations.
       * @returns `this`
       */
  def ldelim(): Writer = js.native
  /**
       * Resets this instance to the last state.
       * @returns `this`
       */
  def reset(): Writer = js.native
  /**
       * Writes a signed 32 bit value as fixed 32 bits.
       * @param value Value to write
       * @returns `this`
       */
  def sfixed32(value: scala.Double): Writer = js.native
  /**
       * Writes a signed 64 bit value as fixed 64 bits.
       * @param value Value to write
       * @returns `this`
       * @throws {TypeError} If `value` is a string and no long library is present.
       */
  def sfixed64(value: java.lang.String): Writer = js.native
  /**
       * Writes a signed 64 bit value as fixed 64 bits.
       * @param value Value to write
       * @returns `this`
       * @throws {TypeError} If `value` is a string and no long library is present.
       */
  def sfixed64(value: Long): Writer = js.native
  /**
       * Writes a signed 64 bit value as fixed 64 bits.
       * @param value Value to write
       * @returns `this`
       * @throws {TypeError} If `value` is a string and no long library is present.
       */
  def sfixed64(value: scala.Double): Writer = js.native
  /**
       * Writes a 32 bit value as a varint, zig-zag encoded.
       * @param value Value to write
       * @returns `this`
       */
  def sint32(value: scala.Double): Writer = js.native
  /**
       * Writes a signed 64 bit value as a varint, zig-zag encoded.
       * @param value Value to write
       * @returns `this`
       * @throws {TypeError} If `value` is a string and no long library is present.
       */
  def sint64(value: java.lang.String): Writer = js.native
  /**
       * Writes a signed 64 bit value as a varint, zig-zag encoded.
       * @param value Value to write
       * @returns `this`
       * @throws {TypeError} If `value` is a string and no long library is present.
       */
  def sint64(value: Long): Writer = js.native
  /**
       * Writes a signed 64 bit value as a varint, zig-zag encoded.
       * @param value Value to write
       * @returns `this`
       * @throws {TypeError} If `value` is a string and no long library is present.
       */
  def sint64(value: scala.Double): Writer = js.native
  /**
       * Writes a string.
       * @param value Value to write
       * @returns `this`
       */
  def string(value: java.lang.String): Writer = js.native
  /**
       * Writes an unsigned 32 bit value as a varint.
       * @param value Value to write
       * @returns `this`
       */
  def uint32(value: scala.Double): Writer = js.native
  /**
       * Writes an unsigned 64 bit value as a varint.
       * @param value Value to write
       * @returns `this`
       * @throws {TypeError} If `value` is a string and no long library is present.
       */
  def uint64(value: java.lang.String): Writer = js.native
  /**
       * Writes an unsigned 64 bit value as a varint.
       * @param value Value to write
       * @returns `this`
       * @throws {TypeError} If `value` is a string and no long library is present.
       */
  def uint64(value: Long): Writer = js.native
  /**
       * Writes an unsigned 64 bit value as a varint.
       * @param value Value to write
       * @returns `this`
       * @throws {TypeError} If `value` is a string and no long library is present.
       */
  def uint64(value: scala.Double): Writer = js.native
}

@JSImport("protobufjs", "Writer")
@js.native
object Writer extends js.Object {
  /**
       * Allocates a buffer of the specified size.
       * @param size Buffer size
       * @returns Buffer
       */
  def alloc(size: scala.Double): stdLib.Uint8Array = js.native
  /**
       * Creates a new writer.
       * @returns A {@link BufferWriter} when Buffers are supported, otherwise a {@link Writer}
       */
  def create(): protobufjsLib.protobufjsMod.BufferWriter | protobufjsLib.protobufjsMod.Writer = js.native
}

