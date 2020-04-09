package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "MessageList")
@js.native
/**
  * Constructs a new MessageList.
  * @param [properties] Properties to set
  */
class MessageList () extends IMessageList {
  def this(properties: IMessageList) = this()
  /** MessageList messages. */
  @JSName("messages")
  var messages_MessageList: js.Array[IMessage] = js.native
  /**
    * Converts this MessageList to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "MessageList")
@js.native
object MessageList extends js.Object {
  /**
    * Creates a new MessageList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MessageList instance
    */
  def create(): MessageList = js.native
  def create(properties: IMessageList): MessageList = js.native
  /**
    * Decodes a MessageList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MessageList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): MessageList = js.native
  def decode(reader: Reader, length: Double): MessageList = js.native
  def decode(reader: Uint8Array): MessageList = js.native
  def decode(reader: Uint8Array, length: Double): MessageList = js.native
  /**
    * Decodes a MessageList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MessageList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): MessageList = js.native
  def decodeDelimited(reader: Uint8Array): MessageList = js.native
  /**
    * Encodes the specified MessageList message. Does not implicitly {@link MessageList.verify|verify} messages.
    * @param message MessageList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IMessageList): Writer = js.native
  def encode(message: IMessageList, writer: Writer): Writer = js.native
  /**
    * Encodes the specified MessageList message, length delimited. Does not implicitly {@link MessageList.verify|verify} messages.
    * @param message MessageList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IMessageList): Writer = js.native
  def encodeDelimited(message: IMessageList, writer: Writer): Writer = js.native
  /**
    * Creates a MessageList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MessageList
    */
  def fromObject(`object`: StringDictionary[js.Any]): MessageList = js.native
  /**
    * Creates a plain object from a MessageList message. Also converts values to other types if specified.
    * @param message MessageList
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: MessageList): StringDictionary[js.Any] = js.native
  def toObject(message: MessageList, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a MessageList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

