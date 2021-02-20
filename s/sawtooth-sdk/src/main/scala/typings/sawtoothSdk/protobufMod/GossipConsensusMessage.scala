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

@JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage")
@js.native
/**
  * Constructs a new GossipConsensusMessage.
  * @param [properties] Properties to set
  */
class GossipConsensusMessage () extends IGossipConsensusMessage {
  def this(properties: IGossipConsensusMessage) = this()
  
  /** GossipConsensusMessage message. */
  @JSName("message")
  var message_GossipConsensusMessage: Uint8Array = js.native
  
  /** GossipConsensusMessage senderId. */
  @JSName("senderId")
  var senderId_GossipConsensusMessage: Uint8Array = js.native
  
  /** GossipConsensusMessage timeToLive. */
  @JSName("timeToLive")
  var timeToLive_GossipConsensusMessage: Double = js.native
  
  /**
    * Converts this GossipConsensusMessage to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object GossipConsensusMessage {
  
  /**
    * Creates a new GossipConsensusMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipConsensusMessage instance
    */
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage.create")
  @js.native
  def create(): GossipConsensusMessage = js.native
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage.create")
  @js.native
  def create(properties: IGossipConsensusMessage): GossipConsensusMessage = js.native
  
  /**
    * Decodes a GossipConsensusMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipConsensusMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage.decode")
  @js.native
  def decode(reader: Reader): GossipConsensusMessage = js.native
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage.decode")
  @js.native
  def decode(reader: Reader, length: Double): GossipConsensusMessage = js.native
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage.decode")
  @js.native
  def decode(reader: Uint8Array): GossipConsensusMessage = js.native
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): GossipConsensusMessage = js.native
  
  /**
    * Decodes a GossipConsensusMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipConsensusMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): GossipConsensusMessage = js.native
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): GossipConsensusMessage = js.native
  
  /**
    * Encodes the specified GossipConsensusMessage message. Does not implicitly {@link GossipConsensusMessage.verify|verify} messages.
    * @param message GossipConsensusMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage.encode")
  @js.native
  def encode(message: IGossipConsensusMessage): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage.encode")
  @js.native
  def encode(message: IGossipConsensusMessage, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GossipConsensusMessage message, length delimited. Does not implicitly {@link GossipConsensusMessage.verify|verify} messages.
    * @param message GossipConsensusMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGossipConsensusMessage): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGossipConsensusMessage, writer: Writer): Writer = js.native
  
  /**
    * Creates a GossipConsensusMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipConsensusMessage
    */
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): GossipConsensusMessage = js.native
  
  /**
    * Creates a plain object from a GossipConsensusMessage message. Also converts values to other types if specified.
    * @param message GossipConsensusMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage.toObject")
  @js.native
  def toObject(message: GossipConsensusMessage): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage.toObject")
  @js.native
  def toObject(message: GossipConsensusMessage, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GossipConsensusMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
