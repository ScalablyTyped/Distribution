package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object ConsensusSettingsGetResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST extends Status
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.BAD_REQUEST with Double = js.native
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.NOT_READY with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR extends Status
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.SERVICE_ERROR with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.STATUS_UNSET with Double = js.native
    
    @js.native
    sealed trait UNKNOWN_BLOCK extends Status
    /* 5 */ val UNKNOWN_BLOCK: typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.UNKNOWN_BLOCK with Double = js.native
  }
  
  /**
    * Creates a new ConsensusSettingsGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSettingsGetResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.create")
  @js.native
  def create(): ConsensusSettingsGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.create")
  @js.native
  def create(properties: IConsensusSettingsGetResponse): ConsensusSettingsGetResponse = js.native
  
  /**
    * Decodes a ConsensusSettingsGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSettingsGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.decode")
  @js.native
  def decode(reader: Reader): ConsensusSettingsGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusSettingsGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusSettingsGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusSettingsGetResponse = js.native
  
  /**
    * Decodes a ConsensusSettingsGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSettingsGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusSettingsGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusSettingsGetResponse = js.native
  
  /**
    * Encodes the specified ConsensusSettingsGetResponse message. Does not implicitly {@link ConsensusSettingsGetResponse.verify|verify} messages.
    * @param message ConsensusSettingsGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.encode")
  @js.native
  def encode(message: IConsensusSettingsGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.encode")
  @js.native
  def encode(message: IConsensusSettingsGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusSettingsGetResponse message, length delimited. Does not implicitly {@link ConsensusSettingsGetResponse.verify|verify} messages.
    * @param message ConsensusSettingsGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusSettingsGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusSettingsGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusSettingsGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSettingsGetResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusSettingsGetResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusSettingsGetResponse message. Also converts values to other types if specified.
    * @param message ConsensusSettingsGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.toObject")
  @js.native
  def toObject(message: ConsensusSettingsGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.toObject")
  @js.native
  def toObject(message: ConsensusSettingsGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusSettingsGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
