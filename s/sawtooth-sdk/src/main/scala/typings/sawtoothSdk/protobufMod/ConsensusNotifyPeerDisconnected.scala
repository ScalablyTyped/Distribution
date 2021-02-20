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

@JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected")
@js.native
/**
  * Constructs a new ConsensusNotifyPeerDisconnected.
  * @param [properties] Properties to set
  */
class ConsensusNotifyPeerDisconnected () extends IConsensusNotifyPeerDisconnected {
  def this(properties: IConsensusNotifyPeerDisconnected) = this()
  
  /** ConsensusNotifyPeerDisconnected peerId. */
  @JSName("peerId")
  var peerId_ConsensusNotifyPeerDisconnected: Uint8Array = js.native
  
  /**
    * Converts this ConsensusNotifyPeerDisconnected to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusNotifyPeerDisconnected {
  
  /**
    * Creates a new ConsensusNotifyPeerDisconnected instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyPeerDisconnected instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected.create")
  @js.native
  def create(): ConsensusNotifyPeerDisconnected = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected.create")
  @js.native
  def create(properties: IConsensusNotifyPeerDisconnected): ConsensusNotifyPeerDisconnected = js.native
  
  /**
    * Decodes a ConsensusNotifyPeerDisconnected message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyPeerDisconnected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected.decode")
  @js.native
  def decode(reader: Reader): ConsensusNotifyPeerDisconnected = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusNotifyPeerDisconnected = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusNotifyPeerDisconnected = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusNotifyPeerDisconnected = js.native
  
  /**
    * Decodes a ConsensusNotifyPeerDisconnected message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyPeerDisconnected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusNotifyPeerDisconnected = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusNotifyPeerDisconnected = js.native
  
  /**
    * Encodes the specified ConsensusNotifyPeerDisconnected message. Does not implicitly {@link ConsensusNotifyPeerDisconnected.verify|verify} messages.
    * @param message ConsensusNotifyPeerDisconnected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected.encode")
  @js.native
  def encode(message: IConsensusNotifyPeerDisconnected): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected.encode")
  @js.native
  def encode(message: IConsensusNotifyPeerDisconnected, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusNotifyPeerDisconnected message, length delimited. Does not implicitly {@link ConsensusNotifyPeerDisconnected.verify|verify} messages.
    * @param message ConsensusNotifyPeerDisconnected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusNotifyPeerDisconnected): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusNotifyPeerDisconnected, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusNotifyPeerDisconnected message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyPeerDisconnected
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusNotifyPeerDisconnected = js.native
  
  /**
    * Creates a plain object from a ConsensusNotifyPeerDisconnected message. Also converts values to other types if specified.
    * @param message ConsensusNotifyPeerDisconnected
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected.toObject")
  @js.native
  def toObject(message: ConsensusNotifyPeerDisconnected): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected.toObject")
  @js.native
  def toObject(message: ConsensusNotifyPeerDisconnected, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusNotifyPeerDisconnected message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerDisconnected.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
