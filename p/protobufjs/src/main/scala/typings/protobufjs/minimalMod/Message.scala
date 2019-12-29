package typings.protobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Properties
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", "Message")
@js.native
/**
  * Constructs a new message instance.
  * @param [properties] Properties to set
  */
class Message[T /* <: js.Object */] ()
  extends typings.protobufjs.protobufjsMod.Message[T] {
  def this(properties: Properties[T]) = this()
}

/* static members */
@JSImport("protobufjs/minimal", "Message")
@js.native
object Message extends js.Object {
  /** Reference to the reflected type. */
  @JSName("$type")
  val $type: typings.protobufjs.protobufjsMod.Type = js.native
  /**
    * Creates a new message of this type using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  def create[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](): typings.protobufjs.protobufjsMod.Message[T] = js.native
  def create[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](properties: StringDictionary[js.Any]): typings.protobufjs.protobufjsMod.Message[T] = js.native
  /**
    * Decodes a message of this type.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  def decode[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](reader: typings.protobufjs.protobufjsMod.Reader): T = js.native
  def decode[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](reader: Uint8Array): T = js.native
  /**
    * Decodes a message of this type preceeded by its length as a varint.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  def decodeDelimited[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](reader: typings.protobufjs.protobufjsMod.Reader): T = js.native
  def decodeDelimited[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](reader: Uint8Array): T = js.native
  /**
    * Encodes a message of this type.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  def encode[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](message: T): typings.protobufjs.protobufjsMod.Writer = js.native
  def encode[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](message: T, writer: typings.protobufjs.protobufjsMod.Writer): typings.protobufjs.protobufjsMod.Writer = js.native
  def encode[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](message: StringDictionary[js.Any]): typings.protobufjs.protobufjsMod.Writer = js.native
  def encode[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](message: StringDictionary[js.Any], writer: typings.protobufjs.protobufjsMod.Writer): typings.protobufjs.protobufjsMod.Writer = js.native
  /**
    * Encodes a message of this type preceeded by its length as a varint.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  def encodeDelimited[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](message: T): typings.protobufjs.protobufjsMod.Writer = js.native
  def encodeDelimited[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](message: T, writer: typings.protobufjs.protobufjsMod.Writer): typings.protobufjs.protobufjsMod.Writer = js.native
  def encodeDelimited[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](message: StringDictionary[js.Any]): typings.protobufjs.protobufjsMod.Writer = js.native
  def encodeDelimited[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](message: StringDictionary[js.Any], writer: typings.protobufjs.protobufjsMod.Writer): typings.protobufjs.protobufjsMod.Writer = js.native
  /**
    * Creates a new message of this type from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Message instance
    */
  def fromObject[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](`object`: StringDictionary[js.Any]): T = js.native
  /**
    * Creates a plain object from a message of this type. Also converts values to other types if specified.
    * @param message Message instance
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](message: T): StringDictionary[js.Any] = js.native
  def toObject[T /* <: typings.protobufjs.protobufjsMod.Message[T] */](message: T, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a message of this type.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

