package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksRequest")
@js.native
/**
  * Constructs a new ConsensusCheckBlocksRequest.
  * @param [properties] Properties to set
  */
class ConsensusCheckBlocksRequest () extends IConsensusCheckBlocksRequest {
  def this(properties: IConsensusCheckBlocksRequest) = this()
  /** ConsensusCheckBlocksRequest blockIds. */
  @JSName("blockIds")
  var blockIds_ConsensusCheckBlocksRequest: js.Array[Uint8Array] = js.native
  /**
    * Converts this ConsensusCheckBlocksRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksRequest")
@js.native
object ConsensusCheckBlocksRequest extends js.Object {
  /**
    * Creates a new ConsensusCheckBlocksRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCheckBlocksRequest instance
    */
  def create(): ConsensusCheckBlocksRequest = js.native
  def create(properties: IConsensusCheckBlocksRequest): ConsensusCheckBlocksRequest = js.native
  /**
    * Decodes a ConsensusCheckBlocksRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCheckBlocksRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusCheckBlocksRequest = js.native
  def decode(reader: Reader, length: Double): ConsensusCheckBlocksRequest = js.native
  def decode(reader: Uint8Array): ConsensusCheckBlocksRequest = js.native
  def decode(reader: Uint8Array, length: Double): ConsensusCheckBlocksRequest = js.native
  /**
    * Decodes a ConsensusCheckBlocksRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCheckBlocksRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusCheckBlocksRequest = js.native
  def decodeDelimited(reader: Uint8Array): ConsensusCheckBlocksRequest = js.native
  /**
    * Encodes the specified ConsensusCheckBlocksRequest message. Does not implicitly {@link ConsensusCheckBlocksRequest.verify|verify} messages.
    * @param message ConsensusCheckBlocksRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusCheckBlocksRequest): Writer = js.native
  def encode(message: IConsensusCheckBlocksRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusCheckBlocksRequest message, length delimited. Does not implicitly {@link ConsensusCheckBlocksRequest.verify|verify} messages.
    * @param message ConsensusCheckBlocksRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusCheckBlocksRequest): Writer = js.native
  def encodeDelimited(message: IConsensusCheckBlocksRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusCheckBlocksRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCheckBlocksRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusCheckBlocksRequest = js.native
  /**
    * Creates a plain object from a ConsensusCheckBlocksRequest message. Also converts values to other types if specified.
    * @param message ConsensusCheckBlocksRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusCheckBlocksRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusCheckBlocksRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusCheckBlocksRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

