package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse")
@js.native
/**
  * Constructs a new ConsensusStateGetResponse.
  * @param [properties] Properties to set
  */
class ConsensusStateGetResponse () extends IConsensusStateGetResponse {
  def this(properties: IConsensusStateGetResponse) = this()
  
  /** ConsensusStateGetResponse entries. */
  @JSName("entries")
  var entries_ConsensusStateGetResponse: js.Array[IConsensusStateEntry] = js.native
  
  /** ConsensusStateGetResponse status. */
  @JSName("status")
  var status_ConsensusStateGetResponse: Status = js.native
  
  /**
    * Converts this ConsensusStateGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusStateGetResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST extends Status
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status.BAD_REQUEST with Double = js.native
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status.NOT_READY with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR extends Status
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status.SERVICE_ERROR with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status.STATUS_UNSET with Double = js.native
    
    @js.native
    sealed trait UNKNOWN_BLOCK extends Status
    /* 5 */ val UNKNOWN_BLOCK: typings.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status.UNKNOWN_BLOCK with Double = js.native
  }
  
  /**
    * Creates a new ConsensusStateGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusStateGetResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.create")
  @js.native
  def create(): ConsensusStateGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.create")
  @js.native
  def create(properties: IConsensusStateGetResponse): ConsensusStateGetResponse = js.native
  
  /**
    * Decodes a ConsensusStateGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.decode")
  @js.native
  def decode(reader: Reader): ConsensusStateGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusStateGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusStateGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusStateGetResponse = js.native
  
  /**
    * Decodes a ConsensusStateGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusStateGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusStateGetResponse = js.native
  
  /**
    * Encodes the specified ConsensusStateGetResponse message. Does not implicitly {@link ConsensusStateGetResponse.verify|verify} messages.
    * @param message ConsensusStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.encode")
  @js.native
  def encode(message: IConsensusStateGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.encode")
  @js.native
  def encode(message: IConsensusStateGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusStateGetResponse message, length delimited. Does not implicitly {@link ConsensusStateGetResponse.verify|verify} messages.
    * @param message ConsensusStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusStateGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusStateGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusStateGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusStateGetResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusStateGetResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusStateGetResponse message. Also converts values to other types if specified.
    * @param message ConsensusStateGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.toObject")
  @js.native
  def toObject(message: ConsensusStateGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.toObject")
  @js.native
  def toObject(message: ConsensusStateGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusStateGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
