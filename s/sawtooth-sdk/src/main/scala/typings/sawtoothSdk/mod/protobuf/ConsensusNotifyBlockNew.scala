package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusNotifyBlockNew
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockNew")
@js.native
/**
  * Constructs a new ConsensusNotifyBlockNew.
  * @param [properties] Properties to set
  */
class ConsensusNotifyBlockNew ()
  extends typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockNew {
  def this(properties: IConsensusNotifyBlockNew) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyBlockNew")
@js.native
object ConsensusNotifyBlockNew extends js.Object {
  /**
    * Creates a new ConsensusNotifyBlockNew instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyBlockNew instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockNew = js.native
  def create(properties: IConsensusNotifyBlockNew): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockNew = js.native
  /**
    * Decodes a ConsensusNotifyBlockNew message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyBlockNew
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockNew = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockNew = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockNew = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockNew = js.native
  /**
    * Decodes a ConsensusNotifyBlockNew message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyBlockNew
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockNew = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockNew = js.native
  /**
    * Encodes the specified ConsensusNotifyBlockNew message. Does not implicitly {@link ConsensusNotifyBlockNew.verify|verify} messages.
    * @param message ConsensusNotifyBlockNew message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusNotifyBlockNew): Writer = js.native
  def encode(message: IConsensusNotifyBlockNew, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusNotifyBlockNew message, length delimited. Does not implicitly {@link ConsensusNotifyBlockNew.verify|verify} messages.
    * @param message ConsensusNotifyBlockNew message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusNotifyBlockNew): Writer = js.native
  def encodeDelimited(message: IConsensusNotifyBlockNew, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusNotifyBlockNew message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyBlockNew
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockNew = js.native
  /**
    * Creates a plain object from a ConsensusNotifyBlockNew message. Also converts values to other types if specified.
    * @param message ConsensusNotifyBlockNew
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockNew): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusNotifyBlockNew, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusNotifyBlockNew message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

