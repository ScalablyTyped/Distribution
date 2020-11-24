package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusNotifyPeerMessage
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyPeerMessage")
@js.native
/**
  * Constructs a new ConsensusNotifyPeerMessage.
  * @param [properties] Properties to set
  */
class ConsensusNotifyPeerMessage ()
  extends typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerMessage {
  def this(properties: IConsensusNotifyPeerMessage) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyPeerMessage")
@js.native
object ConsensusNotifyPeerMessage extends js.Object {
  
  /**
    * Creates a new ConsensusNotifyPeerMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyPeerMessage instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerMessage = js.native
  def create(properties: IConsensusNotifyPeerMessage): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerMessage = js.native
  
  /**
    * Decodes a ConsensusNotifyPeerMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyPeerMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerMessage = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerMessage = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerMessage = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerMessage = js.native
  
  /**
    * Decodes a ConsensusNotifyPeerMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyPeerMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerMessage = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerMessage = js.native
  
  /**
    * Encodes the specified ConsensusNotifyPeerMessage message. Does not implicitly {@link ConsensusNotifyPeerMessage.verify|verify} messages.
    * @param message ConsensusNotifyPeerMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusNotifyPeerMessage): Writer = js.native
  def encode(message: IConsensusNotifyPeerMessage, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusNotifyPeerMessage message, length delimited. Does not implicitly {@link ConsensusNotifyPeerMessage.verify|verify} messages.
    * @param message ConsensusNotifyPeerMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusNotifyPeerMessage): Writer = js.native
  def encodeDelimited(message: IConsensusNotifyPeerMessage, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusNotifyPeerMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyPeerMessage
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerMessage = js.native
  
  /**
    * Creates a plain object from a ConsensusNotifyPeerMessage message. Also converts values to other types if specified.
    * @param message ConsensusNotifyPeerMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerMessage): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerMessage, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusNotifyPeerMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
