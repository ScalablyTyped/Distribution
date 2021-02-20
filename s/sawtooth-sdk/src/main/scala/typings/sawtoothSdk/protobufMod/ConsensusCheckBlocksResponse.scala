package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse")
@js.native
/**
  * Constructs a new ConsensusCheckBlocksResponse.
  * @param [properties] Properties to set
  */
class ConsensusCheckBlocksResponse () extends IConsensusCheckBlocksResponse {
  def this(properties: IConsensusCheckBlocksResponse) = this()
  
  /** ConsensusCheckBlocksResponse status. */
  @JSName("status")
  var status_ConsensusCheckBlocksResponse: Status = js.native
  
  /**
    * Converts this ConsensusCheckBlocksResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusCheckBlocksResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST extends Status
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.BAD_REQUEST with Double = js.native
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.NOT_READY with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR extends Status
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.SERVICE_ERROR with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.STATUS_UNSET with Double = js.native
    
    @js.native
    sealed trait UNKNOWN_BLOCK extends Status
    /* 5 */ val UNKNOWN_BLOCK: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.UNKNOWN_BLOCK with Double = js.native
  }
  
  /**
    * Creates a new ConsensusCheckBlocksResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCheckBlocksResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.create")
  @js.native
  def create(): ConsensusCheckBlocksResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.create")
  @js.native
  def create(properties: IConsensusCheckBlocksResponse): ConsensusCheckBlocksResponse = js.native
  
  /**
    * Decodes a ConsensusCheckBlocksResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCheckBlocksResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.decode")
  @js.native
  def decode(reader: Reader): ConsensusCheckBlocksResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusCheckBlocksResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusCheckBlocksResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusCheckBlocksResponse = js.native
  
  /**
    * Decodes a ConsensusCheckBlocksResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCheckBlocksResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusCheckBlocksResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusCheckBlocksResponse = js.native
  
  /**
    * Encodes the specified ConsensusCheckBlocksResponse message. Does not implicitly {@link ConsensusCheckBlocksResponse.verify|verify} messages.
    * @param message ConsensusCheckBlocksResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.encode")
  @js.native
  def encode(message: IConsensusCheckBlocksResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.encode")
  @js.native
  def encode(message: IConsensusCheckBlocksResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusCheckBlocksResponse message, length delimited. Does not implicitly {@link ConsensusCheckBlocksResponse.verify|verify} messages.
    * @param message ConsensusCheckBlocksResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusCheckBlocksResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusCheckBlocksResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusCheckBlocksResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCheckBlocksResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusCheckBlocksResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusCheckBlocksResponse message. Also converts values to other types if specified.
    * @param message ConsensusCheckBlocksResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.toObject")
  @js.native
  def toObject(message: ConsensusCheckBlocksResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.toObject")
  @js.native
  def toObject(message: ConsensusCheckBlocksResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusCheckBlocksResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
