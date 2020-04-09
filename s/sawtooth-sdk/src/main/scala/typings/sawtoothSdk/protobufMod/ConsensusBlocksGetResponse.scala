package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetResponse")
@js.native
object ConsensusBlocksGetResponse extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  /**
    * Creates a new ConsensusBlocksGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBlocksGetResponse instance
    */
  def create(): ConsensusBlocksGetResponse = js.native
  def create(properties: IConsensusBlocksGetResponse): ConsensusBlocksGetResponse = js.native
  /**
    * Decodes a ConsensusBlocksGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBlocksGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusBlocksGetResponse = js.native
  def decode(reader: Reader, length: Double): ConsensusBlocksGetResponse = js.native
  def decode(reader: Uint8Array): ConsensusBlocksGetResponse = js.native
  def decode(reader: Uint8Array, length: Double): ConsensusBlocksGetResponse = js.native
  /**
    * Decodes a ConsensusBlocksGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBlocksGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusBlocksGetResponse = js.native
  def decodeDelimited(reader: Uint8Array): ConsensusBlocksGetResponse = js.native
  /**
    * Encodes the specified ConsensusBlocksGetResponse message. Does not implicitly {@link ConsensusBlocksGetResponse.verify|verify} messages.
    * @param message ConsensusBlocksGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusBlocksGetResponse): Writer = js.native
  def encode(message: IConsensusBlocksGetResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusBlocksGetResponse message, length delimited. Does not implicitly {@link ConsensusBlocksGetResponse.verify|verify} messages.
    * @param message ConsensusBlocksGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusBlocksGetResponse): Writer = js.native
  def encodeDelimited(message: IConsensusBlocksGetResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusBlocksGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusBlocksGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusBlocksGetResponse = js.native
  /**
    * Creates a plain object from a ConsensusBlocksGetResponse message. Also converts values to other types if specified.
    * @param message ConsensusBlocksGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusBlocksGetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusBlocksGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusBlocksGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    @js.native
    sealed trait BAD_REQUEST extends Status
    
    @js.native
    sealed trait NOT_READY extends Status
    
    @js.native
    sealed trait OK extends Status
    
    @js.native
    sealed trait SERVICE_ERROR extends Status
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    
    @js.native
    sealed trait UNKNOWN_BLOCK extends Status
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    /* 2 */ @js.native
    object BAD_REQUEST extends TopLevel[BAD_REQUEST with Double]
    
    /* 4 */ @js.native
    object NOT_READY extends TopLevel[NOT_READY with Double]
    
    /* 1 */ @js.native
    object OK extends TopLevel[OK with Double]
    
    /* 3 */ @js.native
    object SERVICE_ERROR extends TopLevel[SERVICE_ERROR with Double]
    
    /* 0 */ @js.native
    object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
    
    /* 5 */ @js.native
    object UNKNOWN_BLOCK extends TopLevel[UNKNOWN_BLOCK with Double]
    
  }
  
}

