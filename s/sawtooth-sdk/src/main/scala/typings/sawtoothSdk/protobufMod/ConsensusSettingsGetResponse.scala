package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse")
@js.native
/**
  * Constructs a new ConsensusSettingsGetResponse.
  * @param [properties] Properties to set
  */
class ConsensusSettingsGetResponse () extends IConsensusSettingsGetResponse {
  def this(properties: IConsensusSettingsGetResponse) = this()
  /** ConsensusSettingsGetResponse entries. */
  @JSName("entries")
  var entries_ConsensusSettingsGetResponse: js.Array[IConsensusSettingsEntry] = js.native
  /** ConsensusSettingsGetResponse status. */
  @JSName("status")
  var status_ConsensusSettingsGetResponse: Status = js.native
  /**
    * Converts this ConsensusSettingsGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse")
@js.native
object ConsensusSettingsGetResponse extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  /**
    * Creates a new ConsensusSettingsGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSettingsGetResponse instance
    */
  def create(): ConsensusSettingsGetResponse = js.native
  def create(properties: IConsensusSettingsGetResponse): ConsensusSettingsGetResponse = js.native
  /**
    * Decodes a ConsensusSettingsGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSettingsGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusSettingsGetResponse = js.native
  def decode(reader: Reader, length: Double): ConsensusSettingsGetResponse = js.native
  def decode(reader: Uint8Array): ConsensusSettingsGetResponse = js.native
  def decode(reader: Uint8Array, length: Double): ConsensusSettingsGetResponse = js.native
  /**
    * Decodes a ConsensusSettingsGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSettingsGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusSettingsGetResponse = js.native
  def decodeDelimited(reader: Uint8Array): ConsensusSettingsGetResponse = js.native
  /**
    * Encodes the specified ConsensusSettingsGetResponse message. Does not implicitly {@link ConsensusSettingsGetResponse.verify|verify} messages.
    * @param message ConsensusSettingsGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusSettingsGetResponse): Writer = js.native
  def encode(message: IConsensusSettingsGetResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusSettingsGetResponse message, length delimited. Does not implicitly {@link ConsensusSettingsGetResponse.verify|verify} messages.
    * @param message ConsensusSettingsGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusSettingsGetResponse): Writer = js.native
  def encodeDelimited(message: IConsensusSettingsGetResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusSettingsGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSettingsGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusSettingsGetResponse = js.native
  /**
    * Creates a plain object from a ConsensusSettingsGetResponse message. Also converts values to other types if specified.
    * @param message ConsensusSettingsGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusSettingsGetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusSettingsGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusSettingsGetResponse message.
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

