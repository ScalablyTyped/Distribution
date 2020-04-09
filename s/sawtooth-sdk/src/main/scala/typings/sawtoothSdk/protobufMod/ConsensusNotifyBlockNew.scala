package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockNew")
@js.native
/**
  * Constructs a new ConsensusNotifyBlockNew.
  * @param [properties] Properties to set
  */
class ConsensusNotifyBlockNew () extends IConsensusNotifyBlockNew {
  def this(properties: IConsensusNotifyBlockNew) = this()
  /**
    * Converts this ConsensusNotifyBlockNew to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockNew")
@js.native
object ConsensusNotifyBlockNew extends js.Object {
  /**
    * Creates a new ConsensusNotifyBlockNew instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyBlockNew instance
    */
  def create(): ConsensusNotifyBlockNew = js.native
  def create(properties: IConsensusNotifyBlockNew): ConsensusNotifyBlockNew = js.native
  /**
    * Decodes a ConsensusNotifyBlockNew message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyBlockNew
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusNotifyBlockNew = js.native
  def decode(reader: Reader, length: Double): ConsensusNotifyBlockNew = js.native
  def decode(reader: Uint8Array): ConsensusNotifyBlockNew = js.native
  def decode(reader: Uint8Array, length: Double): ConsensusNotifyBlockNew = js.native
  /**
    * Decodes a ConsensusNotifyBlockNew message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyBlockNew
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusNotifyBlockNew = js.native
  def decodeDelimited(reader: Uint8Array): ConsensusNotifyBlockNew = js.native
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
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusNotifyBlockNew = js.native
  /**
    * Creates a plain object from a ConsensusNotifyBlockNew message. Also converts values to other types if specified.
    * @param message ConsensusNotifyBlockNew
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusNotifyBlockNew): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusNotifyBlockNew, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusNotifyBlockNew message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

