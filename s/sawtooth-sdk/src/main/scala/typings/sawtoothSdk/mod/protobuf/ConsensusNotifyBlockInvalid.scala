package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusNotifyBlockInvalid
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockInvalid")
@js.native
/**
  * Constructs a new ConsensusNotifyBlockInvalid.
  * @param [properties] Properties to set
  */
class ConsensusNotifyBlockInvalid ()
  extends typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid {
  def this(properties: IConsensusNotifyBlockInvalid) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockInvalid")
@js.native
object ConsensusNotifyBlockInvalid extends js.Object {
  /**
    * Creates a new ConsensusNotifyBlockInvalid instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyBlockInvalid instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = js.native
  def create(properties: IConsensusNotifyBlockInvalid): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = js.native
  /**
    * Decodes a ConsensusNotifyBlockInvalid message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyBlockInvalid
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = js.native
  /**
    * Decodes a ConsensusNotifyBlockInvalid message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyBlockInvalid
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = js.native
  /**
    * Encodes the specified ConsensusNotifyBlockInvalid message. Does not implicitly {@link ConsensusNotifyBlockInvalid.verify|verify} messages.
    * @param message ConsensusNotifyBlockInvalid message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusNotifyBlockInvalid): Writer = js.native
  def encode(message: IConsensusNotifyBlockInvalid, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusNotifyBlockInvalid message, length delimited. Does not implicitly {@link ConsensusNotifyBlockInvalid.verify|verify} messages.
    * @param message ConsensusNotifyBlockInvalid message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusNotifyBlockInvalid): Writer = js.native
  def encodeDelimited(message: IConsensusNotifyBlockInvalid, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusNotifyBlockInvalid message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyBlockInvalid
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = js.native
  /**
    * Creates a plain object from a ConsensusNotifyBlockInvalid message. Also converts values to other types if specified.
    * @param message ConsensusNotifyBlockInvalid
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusNotifyBlockInvalid message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

