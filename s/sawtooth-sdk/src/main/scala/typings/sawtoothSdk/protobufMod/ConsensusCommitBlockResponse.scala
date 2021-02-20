package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse")
@js.native
/**
  * Constructs a new ConsensusCommitBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusCommitBlockResponse () extends IConsensusCommitBlockResponse {
  def this(properties: IConsensusCommitBlockResponse) = this()
  
  /** ConsensusCommitBlockResponse status. */
  @JSName("status")
  var status_ConsensusCommitBlockResponse: Status = js.native
  
  /**
    * Converts this ConsensusCommitBlockResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusCommitBlockResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST extends Status
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.BAD_REQUEST with Double = js.native
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.NOT_READY with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR extends Status
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.SERVICE_ERROR with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.STATUS_UNSET with Double = js.native
    
    @js.native
    sealed trait UNKNOWN_BLOCK extends Status
    /* 5 */ val UNKNOWN_BLOCK: typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.UNKNOWN_BLOCK with Double = js.native
  }
  
  /**
    * Creates a new ConsensusCommitBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCommitBlockResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.create")
  @js.native
  def create(): ConsensusCommitBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.create")
  @js.native
  def create(properties: IConsensusCommitBlockResponse): ConsensusCommitBlockResponse = js.native
  
  /**
    * Decodes a ConsensusCommitBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCommitBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.decode")
  @js.native
  def decode(reader: Reader): ConsensusCommitBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusCommitBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusCommitBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusCommitBlockResponse = js.native
  
  /**
    * Decodes a ConsensusCommitBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCommitBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusCommitBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusCommitBlockResponse = js.native
  
  /**
    * Encodes the specified ConsensusCommitBlockResponse message. Does not implicitly {@link ConsensusCommitBlockResponse.verify|verify} messages.
    * @param message ConsensusCommitBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.encode")
  @js.native
  def encode(message: IConsensusCommitBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.encode")
  @js.native
  def encode(message: IConsensusCommitBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusCommitBlockResponse message, length delimited. Does not implicitly {@link ConsensusCommitBlockResponse.verify|verify} messages.
    * @param message ConsensusCommitBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusCommitBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusCommitBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusCommitBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCommitBlockResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusCommitBlockResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusCommitBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusCommitBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.toObject")
  @js.native
  def toObject(message: ConsensusCommitBlockResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.toObject")
  @js.native
  def toObject(message: ConsensusCommitBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusCommitBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCommitBlockResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
