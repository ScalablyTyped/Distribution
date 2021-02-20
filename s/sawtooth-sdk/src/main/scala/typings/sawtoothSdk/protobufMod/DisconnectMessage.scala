package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "DisconnectMessage")
@js.native
/**
  * Constructs a new DisconnectMessage.
  * @param [properties] Properties to set
  */
class DisconnectMessage () extends IDisconnectMessage {
  def this(properties: IDisconnectMessage) = this()
  
  /**
    * Converts this DisconnectMessage to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object DisconnectMessage {
  
  /**
    * Creates a new DisconnectMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DisconnectMessage instance
    */
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage.create")
  @js.native
  def create(): DisconnectMessage = js.native
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage.create")
  @js.native
  def create(properties: IDisconnectMessage): DisconnectMessage = js.native
  
  /**
    * Decodes a DisconnectMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DisconnectMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage.decode")
  @js.native
  def decode(reader: Reader): DisconnectMessage = js.native
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage.decode")
  @js.native
  def decode(reader: Reader, length: Double): DisconnectMessage = js.native
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage.decode")
  @js.native
  def decode(reader: Uint8Array): DisconnectMessage = js.native
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): DisconnectMessage = js.native
  
  /**
    * Decodes a DisconnectMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DisconnectMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): DisconnectMessage = js.native
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): DisconnectMessage = js.native
  
  /**
    * Encodes the specified DisconnectMessage message. Does not implicitly {@link DisconnectMessage.verify|verify} messages.
    * @param message DisconnectMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage.encode")
  @js.native
  def encode(message: IDisconnectMessage): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage.encode")
  @js.native
  def encode(message: IDisconnectMessage, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DisconnectMessage message, length delimited. Does not implicitly {@link DisconnectMessage.verify|verify} messages.
    * @param message DisconnectMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDisconnectMessage): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDisconnectMessage, writer: Writer): Writer = js.native
  
  /**
    * Creates a DisconnectMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DisconnectMessage
    */
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): DisconnectMessage = js.native
  
  /**
    * Creates a plain object from a DisconnectMessage message. Also converts values to other types if specified.
    * @param message DisconnectMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage.toObject")
  @js.native
  def toObject(message: DisconnectMessage): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage.toObject")
  @js.native
  def toObject(message: DisconnectMessage, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DisconnectMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
