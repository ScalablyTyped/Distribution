package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage")
@js.native
/**
  * Constructs a new ConsensusPeerMessage.
  * @param [properties] Properties to set
  */
class ConsensusPeerMessage () extends IConsensusPeerMessage {
  def this(properties: IConsensusPeerMessage) = this()
  /** ConsensusPeerMessage content. */
  @JSName("content")
  var content_ConsensusPeerMessage: Uint8Array = js.native
  /** ConsensusPeerMessage messageType. */
  @JSName("messageType")
  var messageType_ConsensusPeerMessage: String = js.native
  /** ConsensusPeerMessage name. */
  @JSName("name")
  var name_ConsensusPeerMessage: String = js.native
  /** ConsensusPeerMessage version. */
  @JSName("version")
  var version_ConsensusPeerMessage: String = js.native
  /**
    * Converts this ConsensusPeerMessage to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage")
@js.native
object ConsensusPeerMessage extends js.Object {
  /**
    * Creates a new ConsensusPeerMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusPeerMessage instance
    */
  def create(): ConsensusPeerMessage = js.native
  def create(properties: IConsensusPeerMessage): ConsensusPeerMessage = js.native
  /**
    * Decodes a ConsensusPeerMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusPeerMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusPeerMessage = js.native
  def decode(reader: Reader, length: Double): ConsensusPeerMessage = js.native
  def decode(reader: Uint8Array): ConsensusPeerMessage = js.native
  def decode(reader: Uint8Array, length: Double): ConsensusPeerMessage = js.native
  /**
    * Decodes a ConsensusPeerMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusPeerMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusPeerMessage = js.native
  def decodeDelimited(reader: Uint8Array): ConsensusPeerMessage = js.native
  /**
    * Encodes the specified ConsensusPeerMessage message. Does not implicitly {@link ConsensusPeerMessage.verify|verify} messages.
    * @param message ConsensusPeerMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusPeerMessage): Writer = js.native
  def encode(message: IConsensusPeerMessage, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusPeerMessage message, length delimited. Does not implicitly {@link ConsensusPeerMessage.verify|verify} messages.
    * @param message ConsensusPeerMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusPeerMessage): Writer = js.native
  def encodeDelimited(message: IConsensusPeerMessage, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusPeerMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusPeerMessage
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusPeerMessage = js.native
  /**
    * Creates a plain object from a ConsensusPeerMessage message. Also converts values to other types if specified.
    * @param message ConsensusPeerMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusPeerMessage): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusPeerMessage, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusPeerMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

