package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusNotifyPeerDisconnected
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyPeerDisconnected")
@js.native
/**
  * Constructs a new ConsensusNotifyPeerDisconnected.
  * @param [properties] Properties to set
  */
class ConsensusNotifyPeerDisconnected ()
  extends typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected {
  def this(properties: IConsensusNotifyPeerDisconnected) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyPeerDisconnected")
@js.native
object ConsensusNotifyPeerDisconnected extends js.Object {
  /**
    * Creates a new ConsensusNotifyPeerDisconnected instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyPeerDisconnected instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = js.native
  def create(properties: IConsensusNotifyPeerDisconnected): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = js.native
  /**
    * Decodes a ConsensusNotifyPeerDisconnected message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyPeerDisconnected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = js.native
  /**
    * Decodes a ConsensusNotifyPeerDisconnected message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyPeerDisconnected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = js.native
  /**
    * Encodes the specified ConsensusNotifyPeerDisconnected message. Does not implicitly {@link ConsensusNotifyPeerDisconnected.verify|verify} messages.
    * @param message ConsensusNotifyPeerDisconnected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusNotifyPeerDisconnected): Writer = js.native
  def encode(message: IConsensusNotifyPeerDisconnected, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusNotifyPeerDisconnected message, length delimited. Does not implicitly {@link ConsensusNotifyPeerDisconnected.verify|verify} messages.
    * @param message ConsensusNotifyPeerDisconnected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusNotifyPeerDisconnected): Writer = js.native
  def encodeDelimited(message: IConsensusNotifyPeerDisconnected, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusNotifyPeerDisconnected message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyPeerDisconnected
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = js.native
  /**
    * Creates a plain object from a ConsensusNotifyPeerDisconnected message. Also converts values to other types if specified.
    * @param message ConsensusNotifyPeerDisconnected
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusNotifyPeerDisconnected message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

