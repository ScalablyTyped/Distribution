package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse")
@js.native
/**
  * Constructs a new ConsensusBlocksGetResponse.
  * @param [properties] Properties to set
  */
class ConsensusBlocksGetResponse () extends IConsensusBlocksGetResponse {
  def this(properties: IConsensusBlocksGetResponse) = this()
  
  /** ConsensusBlocksGetResponse blocks. */
  @JSName("blocks")
  var blocks_ConsensusBlocksGetResponse: js.Array[IConsensusBlock] = js.native
  
  /** ConsensusBlocksGetResponse status. */
  @JSName("status")
  var status_ConsensusBlocksGetResponse: Status = js.native
  
  /**
    * Converts this ConsensusBlocksGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusBlocksGetResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST extends Status
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status.BAD_REQUEST with Double = js.native
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status.NOT_READY with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR extends Status
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status.SERVICE_ERROR with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status.STATUS_UNSET with Double = js.native
    
    @js.native
    sealed trait UNKNOWN_BLOCK extends Status
    /* 5 */ val UNKNOWN_BLOCK: typings.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status.UNKNOWN_BLOCK with Double = js.native
  }
  
  /**
    * Creates a new ConsensusBlocksGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBlocksGetResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.create")
  @js.native
  def create(): ConsensusBlocksGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.create")
  @js.native
  def create(properties: IConsensusBlocksGetResponse): ConsensusBlocksGetResponse = js.native
  
  /**
    * Decodes a ConsensusBlocksGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBlocksGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.decode")
  @js.native
  def decode(reader: Reader): ConsensusBlocksGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusBlocksGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusBlocksGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusBlocksGetResponse = js.native
  
  /**
    * Decodes a ConsensusBlocksGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBlocksGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusBlocksGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusBlocksGetResponse = js.native
  
  /**
    * Encodes the specified ConsensusBlocksGetResponse message. Does not implicitly {@link ConsensusBlocksGetResponse.verify|verify} messages.
    * @param message ConsensusBlocksGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.encode")
  @js.native
  def encode(message: IConsensusBlocksGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.encode")
  @js.native
  def encode(message: IConsensusBlocksGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusBlocksGetResponse message, length delimited. Does not implicitly {@link ConsensusBlocksGetResponse.verify|verify} messages.
    * @param message ConsensusBlocksGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusBlocksGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusBlocksGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusBlocksGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusBlocksGetResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusBlocksGetResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusBlocksGetResponse message. Also converts values to other types if specified.
    * @param message ConsensusBlocksGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.toObject")
  @js.native
  def toObject(message: ConsensusBlocksGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.toObject")
  @js.native
  def toObject(message: ConsensusBlocksGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusBlocksGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
