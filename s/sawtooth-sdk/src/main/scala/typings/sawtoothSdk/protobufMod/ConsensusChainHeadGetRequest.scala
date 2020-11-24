package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusChainHeadGetRequest")
@js.native
/**
  * Constructs a new ConsensusChainHeadGetRequest.
  * @param [properties] Properties to set
  */
class ConsensusChainHeadGetRequest () extends IConsensusChainHeadGetRequest {
  def this(properties: IConsensusChainHeadGetRequest) = this()
  
  /**
    * Converts this ConsensusChainHeadGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusChainHeadGetRequest")
@js.native
object ConsensusChainHeadGetRequest extends js.Object {
  
  /**
    * Creates a new ConsensusChainHeadGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusChainHeadGetRequest instance
    */
  def create(): ConsensusChainHeadGetRequest = js.native
  def create(properties: IConsensusChainHeadGetRequest): ConsensusChainHeadGetRequest = js.native
  
  /**
    * Decodes a ConsensusChainHeadGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusChainHeadGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusChainHeadGetRequest = js.native
  def decode(reader: Reader, length: Double): ConsensusChainHeadGetRequest = js.native
  def decode(reader: Uint8Array): ConsensusChainHeadGetRequest = js.native
  def decode(reader: Uint8Array, length: Double): ConsensusChainHeadGetRequest = js.native
  
  /**
    * Decodes a ConsensusChainHeadGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusChainHeadGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusChainHeadGetRequest = js.native
  def decodeDelimited(reader: Uint8Array): ConsensusChainHeadGetRequest = js.native
  
  /**
    * Encodes the specified ConsensusChainHeadGetRequest message. Does not implicitly {@link ConsensusChainHeadGetRequest.verify|verify} messages.
    * @param message ConsensusChainHeadGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusChainHeadGetRequest): Writer = js.native
  def encode(message: IConsensusChainHeadGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusChainHeadGetRequest message, length delimited. Does not implicitly {@link ConsensusChainHeadGetRequest.verify|verify} messages.
    * @param message ConsensusChainHeadGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusChainHeadGetRequest): Writer = js.native
  def encodeDelimited(message: IConsensusChainHeadGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusChainHeadGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusChainHeadGetRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusChainHeadGetRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusChainHeadGetRequest message. Also converts values to other types if specified.
    * @param message ConsensusChainHeadGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusChainHeadGetRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusChainHeadGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusChainHeadGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
