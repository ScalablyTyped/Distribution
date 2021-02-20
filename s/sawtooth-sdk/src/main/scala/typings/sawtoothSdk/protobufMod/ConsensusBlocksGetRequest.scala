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

@JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest")
@js.native
/**
  * Constructs a new ConsensusBlocksGetRequest.
  * @param [properties] Properties to set
  */
class ConsensusBlocksGetRequest () extends IConsensusBlocksGetRequest {
  def this(properties: IConsensusBlocksGetRequest) = this()
  
  /** ConsensusBlocksGetRequest blockIds. */
  @JSName("blockIds")
  var blockIds_ConsensusBlocksGetRequest: js.Array[Uint8Array] = js.native
  
  /**
    * Converts this ConsensusBlocksGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusBlocksGetRequest {
  
  /**
    * Creates a new ConsensusBlocksGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBlocksGetRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest.create")
  @js.native
  def create(): ConsensusBlocksGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest.create")
  @js.native
  def create(properties: IConsensusBlocksGetRequest): ConsensusBlocksGetRequest = js.native
  
  /**
    * Decodes a ConsensusBlocksGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBlocksGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest.decode")
  @js.native
  def decode(reader: Reader): ConsensusBlocksGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusBlocksGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusBlocksGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusBlocksGetRequest = js.native
  
  /**
    * Decodes a ConsensusBlocksGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBlocksGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusBlocksGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusBlocksGetRequest = js.native
  
  /**
    * Encodes the specified ConsensusBlocksGetRequest message. Does not implicitly {@link ConsensusBlocksGetRequest.verify|verify} messages.
    * @param message ConsensusBlocksGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest.encode")
  @js.native
  def encode(message: IConsensusBlocksGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest.encode")
  @js.native
  def encode(message: IConsensusBlocksGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusBlocksGetRequest message, length delimited. Does not implicitly {@link ConsensusBlocksGetRequest.verify|verify} messages.
    * @param message ConsensusBlocksGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusBlocksGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusBlocksGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusBlocksGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusBlocksGetRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusBlocksGetRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusBlocksGetRequest message. Also converts values to other types if specified.
    * @param message ConsensusBlocksGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest.toObject")
  @js.native
  def toObject(message: ConsensusBlocksGetRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest.toObject")
  @js.native
  def toObject(message: ConsensusBlocksGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusBlocksGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
