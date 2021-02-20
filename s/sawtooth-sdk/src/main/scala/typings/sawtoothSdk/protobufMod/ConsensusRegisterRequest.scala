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

@JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest")
@js.native
/**
  * Constructs a new ConsensusRegisterRequest.
  * @param [properties] Properties to set
  */
class ConsensusRegisterRequest () extends IConsensusRegisterRequest {
  def this(properties: IConsensusRegisterRequest) = this()
  
  /** ConsensusRegisterRequest name. */
  @JSName("name")
  var name_ConsensusRegisterRequest: String = js.native
  
  /**
    * Converts this ConsensusRegisterRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ConsensusRegisterRequest version. */
  @JSName("version")
  var version_ConsensusRegisterRequest: String = js.native
}
/* static members */
object ConsensusRegisterRequest {
  
  /**
    * Creates a new ConsensusRegisterRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusRegisterRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest.create")
  @js.native
  def create(): ConsensusRegisterRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest.create")
  @js.native
  def create(properties: IConsensusRegisterRequest): ConsensusRegisterRequest = js.native
  
  /**
    * Decodes a ConsensusRegisterRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusRegisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest.decode")
  @js.native
  def decode(reader: Reader): ConsensusRegisterRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusRegisterRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusRegisterRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusRegisterRequest = js.native
  
  /**
    * Decodes a ConsensusRegisterRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusRegisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusRegisterRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusRegisterRequest = js.native
  
  /**
    * Encodes the specified ConsensusRegisterRequest message. Does not implicitly {@link ConsensusRegisterRequest.verify|verify} messages.
    * @param message ConsensusRegisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest.encode")
  @js.native
  def encode(message: IConsensusRegisterRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest.encode")
  @js.native
  def encode(message: IConsensusRegisterRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusRegisterRequest message, length delimited. Does not implicitly {@link ConsensusRegisterRequest.verify|verify} messages.
    * @param message ConsensusRegisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusRegisterRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusRegisterRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusRegisterRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusRegisterRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusRegisterRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusRegisterRequest message. Also converts values to other types if specified.
    * @param message ConsensusRegisterRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest.toObject")
  @js.native
  def toObject(message: ConsensusRegisterRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest.toObject")
  @js.native
  def toObject(message: ConsensusRegisterRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusRegisterRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
