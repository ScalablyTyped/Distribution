package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse")
@js.native
/**
  * Constructs a new ConsensusRegisterResponse.
  * @param [properties] Properties to set
  */
class ConsensusRegisterResponse () extends IConsensusRegisterResponse {
  def this(properties: IConsensusRegisterResponse) = this()
  /** ConsensusRegisterResponse peers. */
  @JSName("peers")
  var peers_ConsensusRegisterResponse: js.Array[IConsensusPeerInfo] = js.native
  /** ConsensusRegisterResponse status. */
  @JSName("status")
  var status_ConsensusRegisterResponse: Status = js.native
  /**
    * Converts this ConsensusRegisterResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse")
@js.native
object ConsensusRegisterResponse extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  /**
    * Creates a new ConsensusRegisterResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusRegisterResponse instance
    */
  def create(): ConsensusRegisterResponse = js.native
  def create(properties: IConsensusRegisterResponse): ConsensusRegisterResponse = js.native
  /**
    * Decodes a ConsensusRegisterResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusRegisterResponse = js.native
  def decode(reader: Reader, length: Double): ConsensusRegisterResponse = js.native
  def decode(reader: Uint8Array): ConsensusRegisterResponse = js.native
  def decode(reader: Uint8Array, length: Double): ConsensusRegisterResponse = js.native
  /**
    * Decodes a ConsensusRegisterResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusRegisterResponse = js.native
  def decodeDelimited(reader: Uint8Array): ConsensusRegisterResponse = js.native
  /**
    * Encodes the specified ConsensusRegisterResponse message. Does not implicitly {@link ConsensusRegisterResponse.verify|verify} messages.
    * @param message ConsensusRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusRegisterResponse): Writer = js.native
  def encode(message: IConsensusRegisterResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusRegisterResponse message, length delimited. Does not implicitly {@link ConsensusRegisterResponse.verify|verify} messages.
    * @param message ConsensusRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusRegisterResponse): Writer = js.native
  def encodeDelimited(message: IConsensusRegisterResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusRegisterResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusRegisterResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusRegisterResponse = js.native
  /**
    * Creates a plain object from a ConsensusRegisterResponse message. Also converts values to other types if specified.
    * @param message ConsensusRegisterResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusRegisterResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusRegisterResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusRegisterResponse message.
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
    
  }
  
}

