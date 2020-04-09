package typings.sawtoothSdk.protobufMod.Message

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IMessage
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "Message")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new Message instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  def create(): typings.sawtoothSdk.protobufMod.Message = js.native
  def create(properties: IMessage): typings.sawtoothSdk.protobufMod.Message = js.native
  /**
    * Decodes a Message message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Message
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.Message = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.Message = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Message = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.Message = js.native
  /**
    * Decodes a Message message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Message
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.Message = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Message = js.native
  /**
    * Encodes the specified Message message. Does not implicitly {@link Message.verify|verify} messages.
    * @param message Message message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IMessage): Writer = js.native
  def encode(message: IMessage, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Message message, length delimited. Does not implicitly {@link Message.verify|verify} messages.
    * @param message Message message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IMessage): Writer = js.native
  def encodeDelimited(message: IMessage, writer: Writer): Writer = js.native
  /**
    * Creates a Message message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Message
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.Message = js.native
  /**
    * Creates a plain object from a Message message. Also converts values to other types if specified.
    * @param message Message
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.Message): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.Message, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Message message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

