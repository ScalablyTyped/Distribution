package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusBlocksGetRequest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest")
@js.native
/**
  * Constructs a new ConsensusBlocksGetRequest.
  * @param [properties] Properties to set
  */
class ConsensusBlocksGetRequest ()
  extends typings.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest {
  def this(properties: IConsensusBlocksGetRequest) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusBlocksGetRequest")
@js.native
object ConsensusBlocksGetRequest extends js.Object {
  /**
    * Creates a new ConsensusBlocksGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBlocksGetRequest instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  def create(properties: IConsensusBlocksGetRequest): typings.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  /**
    * Decodes a ConsensusBlocksGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBlocksGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  /**
    * Decodes a ConsensusBlocksGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBlocksGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  /**
    * Encodes the specified ConsensusBlocksGetRequest message. Does not implicitly {@link ConsensusBlocksGetRequest.verify|verify} messages.
    * @param message ConsensusBlocksGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusBlocksGetRequest): Writer = js.native
  def encode(message: IConsensusBlocksGetRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusBlocksGetRequest message, length delimited. Does not implicitly {@link ConsensusBlocksGetRequest.verify|verify} messages.
    * @param message ConsensusBlocksGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusBlocksGetRequest): Writer = js.native
  def encodeDelimited(message: IConsensusBlocksGetRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusBlocksGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusBlocksGetRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest = js.native
  /**
    * Creates a plain object from a ConsensusBlocksGetRequest message. Also converts values to other types if specified.
    * @param message ConsensusBlocksGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusBlocksGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusBlocksGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

