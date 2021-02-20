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

@JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest")
@js.native
/**
  * Constructs a new ConsensusInitializeBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusInitializeBlockRequest () extends IConsensusInitializeBlockRequest {
  def this(properties: IConsensusInitializeBlockRequest) = this()
  
  /** ConsensusInitializeBlockRequest previousId. */
  @JSName("previousId")
  var previousId_ConsensusInitializeBlockRequest: Uint8Array = js.native
  
  /**
    * Converts this ConsensusInitializeBlockRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusInitializeBlockRequest {
  
  /**
    * Creates a new ConsensusInitializeBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusInitializeBlockRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest.create")
  @js.native
  def create(): ConsensusInitializeBlockRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest.create")
  @js.native
  def create(properties: IConsensusInitializeBlockRequest): ConsensusInitializeBlockRequest = js.native
  
  /**
    * Decodes a ConsensusInitializeBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusInitializeBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest.decode")
  @js.native
  def decode(reader: Reader): ConsensusInitializeBlockRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusInitializeBlockRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusInitializeBlockRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusInitializeBlockRequest = js.native
  
  /**
    * Decodes a ConsensusInitializeBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusInitializeBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusInitializeBlockRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusInitializeBlockRequest = js.native
  
  /**
    * Encodes the specified ConsensusInitializeBlockRequest message. Does not implicitly {@link ConsensusInitializeBlockRequest.verify|verify} messages.
    * @param message ConsensusInitializeBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest.encode")
  @js.native
  def encode(message: IConsensusInitializeBlockRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest.encode")
  @js.native
  def encode(message: IConsensusInitializeBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusInitializeBlockRequest message, length delimited. Does not implicitly {@link ConsensusInitializeBlockRequest.verify|verify} messages.
    * @param message ConsensusInitializeBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusInitializeBlockRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusInitializeBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusInitializeBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusInitializeBlockRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusInitializeBlockRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusInitializeBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusInitializeBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest.toObject")
  @js.native
  def toObject(message: ConsensusInitializeBlockRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest.toObject")
  @js.native
  def toObject(message: ConsensusInitializeBlockRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusInitializeBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
