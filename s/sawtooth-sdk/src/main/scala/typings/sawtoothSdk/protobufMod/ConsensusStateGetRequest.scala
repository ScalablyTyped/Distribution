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

@JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest")
@js.native
/**
  * Constructs a new ConsensusStateGetRequest.
  * @param [properties] Properties to set
  */
class ConsensusStateGetRequest () extends IConsensusStateGetRequest {
  def this(properties: IConsensusStateGetRequest) = this()
  
  /** ConsensusStateGetRequest addresses. */
  @JSName("addresses")
  var addresses_ConsensusStateGetRequest: js.Array[String] = js.native
  
  /** ConsensusStateGetRequest blockId. */
  @JSName("blockId")
  var blockId_ConsensusStateGetRequest: Uint8Array = js.native
  
  /**
    * Converts this ConsensusStateGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusStateGetRequest {
  
  /**
    * Creates a new ConsensusStateGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusStateGetRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest.create")
  @js.native
  def create(): ConsensusStateGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest.create")
  @js.native
  def create(properties: IConsensusStateGetRequest): ConsensusStateGetRequest = js.native
  
  /**
    * Decodes a ConsensusStateGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusStateGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest.decode")
  @js.native
  def decode(reader: Reader): ConsensusStateGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusStateGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusStateGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusStateGetRequest = js.native
  
  /**
    * Decodes a ConsensusStateGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusStateGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusStateGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusStateGetRequest = js.native
  
  /**
    * Encodes the specified ConsensusStateGetRequest message. Does not implicitly {@link ConsensusStateGetRequest.verify|verify} messages.
    * @param message ConsensusStateGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest.encode")
  @js.native
  def encode(message: IConsensusStateGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest.encode")
  @js.native
  def encode(message: IConsensusStateGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusStateGetRequest message, length delimited. Does not implicitly {@link ConsensusStateGetRequest.verify|verify} messages.
    * @param message ConsensusStateGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusStateGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusStateGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusStateGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusStateGetRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusStateGetRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusStateGetRequest message. Also converts values to other types if specified.
    * @param message ConsensusStateGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest.toObject")
  @js.native
  def toObject(message: ConsensusStateGetRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest.toObject")
  @js.native
  def toObject(message: ConsensusStateGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusStateGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
