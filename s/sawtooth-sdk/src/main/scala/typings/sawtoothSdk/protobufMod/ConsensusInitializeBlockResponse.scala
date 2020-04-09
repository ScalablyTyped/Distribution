package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse")
@js.native
/**
  * Constructs a new ConsensusInitializeBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusInitializeBlockResponse () extends IConsensusInitializeBlockResponse {
  def this(properties: IConsensusInitializeBlockResponse) = this()
  /** ConsensusInitializeBlockResponse status. */
  @JSName("status")
  var status_ConsensusInitializeBlockResponse: Status = js.native
  /**
    * Converts this ConsensusInitializeBlockResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse")
@js.native
object ConsensusInitializeBlockResponse extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  /**
    * Creates a new ConsensusInitializeBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusInitializeBlockResponse instance
    */
  def create(): ConsensusInitializeBlockResponse = js.native
  def create(properties: IConsensusInitializeBlockResponse): ConsensusInitializeBlockResponse = js.native
  /**
    * Decodes a ConsensusInitializeBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusInitializeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusInitializeBlockResponse = js.native
  def decode(reader: Reader, length: Double): ConsensusInitializeBlockResponse = js.native
  def decode(reader: Uint8Array): ConsensusInitializeBlockResponse = js.native
  def decode(reader: Uint8Array, length: Double): ConsensusInitializeBlockResponse = js.native
  /**
    * Decodes a ConsensusInitializeBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusInitializeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusInitializeBlockResponse = js.native
  def decodeDelimited(reader: Uint8Array): ConsensusInitializeBlockResponse = js.native
  /**
    * Encodes the specified ConsensusInitializeBlockResponse message. Does not implicitly {@link ConsensusInitializeBlockResponse.verify|verify} messages.
    * @param message ConsensusInitializeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusInitializeBlockResponse): Writer = js.native
  def encode(message: IConsensusInitializeBlockResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusInitializeBlockResponse message, length delimited. Does not implicitly {@link ConsensusInitializeBlockResponse.verify|verify} messages.
    * @param message ConsensusInitializeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusInitializeBlockResponse): Writer = js.native
  def encodeDelimited(message: IConsensusInitializeBlockResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusInitializeBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusInitializeBlockResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusInitializeBlockResponse = js.native
  /**
    * Creates a plain object from a ConsensusInitializeBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusInitializeBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusInitializeBlockResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusInitializeBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusInitializeBlockResponse message.
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
    sealed trait INVALID_STATE extends Status
    
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
    
    /* 5 */ @js.native
    object INVALID_STATE extends TopLevel[INVALID_STATE with Double]
    
    /* 4 */ @js.native
    object NOT_READY extends TopLevel[NOT_READY with Double]
    
    /* 1 */ @js.native
    object OK extends TopLevel[OK with Double]
    
    /* 3 */ @js.native
    object SERVICE_ERROR extends TopLevel[SERVICE_ERROR with Double]
    
    /* 0 */ @js.native
    object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
    
    /* 6 */ @js.native
    object UNKNOWN_BLOCK extends TopLevel[UNKNOWN_BLOCK with Double]
    
  }
  
}

