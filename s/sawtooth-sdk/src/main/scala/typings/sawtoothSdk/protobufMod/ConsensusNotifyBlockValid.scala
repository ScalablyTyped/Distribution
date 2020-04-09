package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockValid")
@js.native
/**
  * Constructs a new ConsensusNotifyBlockValid.
  * @param [properties] Properties to set
  */
class ConsensusNotifyBlockValid () extends IConsensusNotifyBlockValid {
  def this(properties: IConsensusNotifyBlockValid) = this()
  /** ConsensusNotifyBlockValid blockId. */
  @JSName("blockId")
  var blockId_ConsensusNotifyBlockValid: Uint8Array = js.native
  /**
    * Converts this ConsensusNotifyBlockValid to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockValid")
@js.native
object ConsensusNotifyBlockValid extends js.Object {
  /**
    * Creates a new ConsensusNotifyBlockValid instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyBlockValid instance
    */
  def create(): ConsensusNotifyBlockValid = js.native
  def create(properties: IConsensusNotifyBlockValid): ConsensusNotifyBlockValid = js.native
  /**
    * Decodes a ConsensusNotifyBlockValid message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyBlockValid
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusNotifyBlockValid = js.native
  def decode(reader: Reader, length: Double): ConsensusNotifyBlockValid = js.native
  def decode(reader: Uint8Array): ConsensusNotifyBlockValid = js.native
  def decode(reader: Uint8Array, length: Double): ConsensusNotifyBlockValid = js.native
  /**
    * Decodes a ConsensusNotifyBlockValid message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyBlockValid
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusNotifyBlockValid = js.native
  def decodeDelimited(reader: Uint8Array): ConsensusNotifyBlockValid = js.native
  /**
    * Encodes the specified ConsensusNotifyBlockValid message. Does not implicitly {@link ConsensusNotifyBlockValid.verify|verify} messages.
    * @param message ConsensusNotifyBlockValid message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusNotifyBlockValid): Writer = js.native
  def encode(message: IConsensusNotifyBlockValid, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusNotifyBlockValid message, length delimited. Does not implicitly {@link ConsensusNotifyBlockValid.verify|verify} messages.
    * @param message ConsensusNotifyBlockValid message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusNotifyBlockValid): Writer = js.native
  def encodeDelimited(message: IConsensusNotifyBlockValid, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusNotifyBlockValid message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyBlockValid
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusNotifyBlockValid = js.native
  /**
    * Creates a plain object from a ConsensusNotifyBlockValid message. Also converts values to other types if specified.
    * @param message ConsensusNotifyBlockValid
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusNotifyBlockValid): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusNotifyBlockValid, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusNotifyBlockValid message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

