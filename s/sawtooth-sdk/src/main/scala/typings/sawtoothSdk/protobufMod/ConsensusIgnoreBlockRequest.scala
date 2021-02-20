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

@JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest")
@js.native
/**
  * Constructs a new ConsensusIgnoreBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusIgnoreBlockRequest () extends IConsensusIgnoreBlockRequest {
  def this(properties: IConsensusIgnoreBlockRequest) = this()
  
  /** ConsensusIgnoreBlockRequest blockId. */
  @JSName("blockId")
  var blockId_ConsensusIgnoreBlockRequest: Uint8Array = js.native
  
  /**
    * Converts this ConsensusIgnoreBlockRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusIgnoreBlockRequest {
  
  /**
    * Creates a new ConsensusIgnoreBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusIgnoreBlockRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest.create")
  @js.native
  def create(): ConsensusIgnoreBlockRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest.create")
  @js.native
  def create(properties: IConsensusIgnoreBlockRequest): ConsensusIgnoreBlockRequest = js.native
  
  /**
    * Decodes a ConsensusIgnoreBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusIgnoreBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest.decode")
  @js.native
  def decode(reader: Reader): ConsensusIgnoreBlockRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusIgnoreBlockRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusIgnoreBlockRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusIgnoreBlockRequest = js.native
  
  /**
    * Decodes a ConsensusIgnoreBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusIgnoreBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusIgnoreBlockRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusIgnoreBlockRequest = js.native
  
  /**
    * Encodes the specified ConsensusIgnoreBlockRequest message. Does not implicitly {@link ConsensusIgnoreBlockRequest.verify|verify} messages.
    * @param message ConsensusIgnoreBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest.encode")
  @js.native
  def encode(message: IConsensusIgnoreBlockRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest.encode")
  @js.native
  def encode(message: IConsensusIgnoreBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusIgnoreBlockRequest message, length delimited. Does not implicitly {@link ConsensusIgnoreBlockRequest.verify|verify} messages.
    * @param message ConsensusIgnoreBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusIgnoreBlockRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusIgnoreBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusIgnoreBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusIgnoreBlockRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusIgnoreBlockRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusIgnoreBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusIgnoreBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest.toObject")
  @js.native
  def toObject(message: ConsensusIgnoreBlockRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest.toObject")
  @js.native
  def toObject(message: ConsensusIgnoreBlockRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusIgnoreBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
