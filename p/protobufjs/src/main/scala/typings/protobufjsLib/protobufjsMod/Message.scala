package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "Message")
@js.native
/**
  * Constructs a new message instance.
  * @param [properties] Properties to set
  */
class Message[T /* <: js.Object */] () extends js.Object {
  def this(properties: protobufjsLib.Properties[T]) = this()
  /** Reference to the reflected type. */
  @JSName("$type")
  val $type: Type = js.native
  /**
    * Converts this message to JSON.
    * @returns JSON object
    */
  def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("protobufjs", "Message")
@js.native
object Message extends js.Object {
  /** Reference to the reflected type. */
  @JSName("$type")
  val $type: protobufjsLib.protobufjsMod.Type = js.native
  /**
    * Creates a new message of this type using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  def create[T /* <: protobufjsLib.protobufjsMod.Message[T] */](`this`: protobufjsLib.protobufjsMod.Constructor[T]): protobufjsLib.protobufjsMod.Message[T] = js.native
  def create[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    `this`: protobufjsLib.protobufjsMod.Constructor[T],
    properties: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): protobufjsLib.protobufjsMod.Message[T] = js.native
  /**
    * Decodes a message of this type.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  def decode[T /* <: protobufjsLib.protobufjsMod.Message[T] */](`this`: protobufjsLib.protobufjsMod.Constructor[T], reader: protobufjsLib.protobufjsMod.Reader): T = js.native
  def decode[T /* <: protobufjsLib.protobufjsMod.Message[T] */](`this`: protobufjsLib.protobufjsMod.Constructor[T], reader: stdLib.Uint8Array): T = js.native
  /**
    * Decodes a message of this type preceeded by its length as a varint.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  def decodeDelimited[T /* <: protobufjsLib.protobufjsMod.Message[T] */](`this`: protobufjsLib.protobufjsMod.Constructor[T], reader: protobufjsLib.protobufjsMod.Reader): T = js.native
  def decodeDelimited[T /* <: protobufjsLib.protobufjsMod.Message[T] */](`this`: protobufjsLib.protobufjsMod.Constructor[T], reader: stdLib.Uint8Array): T = js.native
  /**
    * Encodes a message of this type.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  def encode[T /* <: protobufjsLib.protobufjsMod.Message[T] */](`this`: protobufjsLib.protobufjsMod.Constructor[T], message: T): protobufjsLib.protobufjsMod.Writer = js.native
  def encode[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    `this`: protobufjsLib.protobufjsMod.Constructor[T],
    message: T,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  def encode[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    `this`: protobufjsLib.protobufjsMod.Constructor[T],
    message: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): protobufjsLib.protobufjsMod.Writer = js.native
  def encode[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    `this`: protobufjsLib.protobufjsMod.Constructor[T],
    message: org.scalablytyped.runtime.StringDictionary[js.Any],
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
    * Encodes a message of this type preceeded by its length as a varint.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  def encodeDelimited[T /* <: protobufjsLib.protobufjsMod.Message[T] */](`this`: protobufjsLib.protobufjsMod.Constructor[T], message: T): protobufjsLib.protobufjsMod.Writer = js.native
  def encodeDelimited[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    `this`: protobufjsLib.protobufjsMod.Constructor[T],
    message: T,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  def encodeDelimited[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    `this`: protobufjsLib.protobufjsMod.Constructor[T],
    message: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): protobufjsLib.protobufjsMod.Writer = js.native
  def encodeDelimited[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    `this`: protobufjsLib.protobufjsMod.Constructor[T],
    message: org.scalablytyped.runtime.StringDictionary[js.Any],
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
    * Creates a new message of this type from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Message instance
    */
  def fromObject[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    `this`: protobufjsLib.protobufjsMod.Constructor[T],
    `object`: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): T = js.native
  /**
    * Creates a plain object from a message of this type. Also converts values to other types if specified.
    * @param message Message instance
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject[T /* <: protobufjsLib.protobufjsMod.Message[T] */](`this`: protobufjsLib.protobufjsMod.Constructor[T], message: T): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def toObject[T /* <: protobufjsLib.protobufjsMod.Message[T] */](
    `this`: protobufjsLib.protobufjsMod.Constructor[T],
    message: T,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Verifies a message of this type.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

