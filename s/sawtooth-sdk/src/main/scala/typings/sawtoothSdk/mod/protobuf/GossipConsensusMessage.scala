package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IGossipConsensusMessage
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage")
@js.native
/**
  * Constructs a new GossipConsensusMessage.
  * @param [properties] Properties to set
  */
class GossipConsensusMessage ()
  extends typings.sawtoothSdk.protobufMod.GossipConsensusMessage {
  def this(properties: IGossipConsensusMessage) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.GossipConsensusMessage")
@js.native
object GossipConsensusMessage extends js.Object {
  
  /**
    * Creates a new GossipConsensusMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipConsensusMessage instance
    */
  def create(): typings.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  def create(properties: IGossipConsensusMessage): typings.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  
  /**
    * Decodes a GossipConsensusMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipConsensusMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  
  /**
    * Decodes a GossipConsensusMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipConsensusMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  
  /**
    * Encodes the specified GossipConsensusMessage message. Does not implicitly {@link GossipConsensusMessage.verify|verify} messages.
    * @param message GossipConsensusMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGossipConsensusMessage): Writer = js.native
  def encode(message: IGossipConsensusMessage, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GossipConsensusMessage message, length delimited. Does not implicitly {@link GossipConsensusMessage.verify|verify} messages.
    * @param message GossipConsensusMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGossipConsensusMessage): Writer = js.native
  def encodeDelimited(message: IGossipConsensusMessage, writer: Writer): Writer = js.native
  
  /**
    * Creates a GossipConsensusMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipConsensusMessage
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.GossipConsensusMessage = js.native
  
  /**
    * Creates a plain object from a GossipConsensusMessage message. Also converts values to other types if specified.
    * @param message GossipConsensusMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.GossipConsensusMessage): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.GossipConsensusMessage, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GossipConsensusMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
