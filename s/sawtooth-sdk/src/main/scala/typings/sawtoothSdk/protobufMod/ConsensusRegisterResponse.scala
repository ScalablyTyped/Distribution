package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object ConsensusRegisterResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST extends Status
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status.BAD_REQUEST with Double = js.native
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status.NOT_READY with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR extends Status
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status.SERVICE_ERROR with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ConsensusRegisterResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusRegisterResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.create")
  @js.native
  def create(): ConsensusRegisterResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.create")
  @js.native
  def create(properties: IConsensusRegisterResponse): ConsensusRegisterResponse = js.native
  
  /**
    * Decodes a ConsensusRegisterResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.decode")
  @js.native
  def decode(reader: Reader): ConsensusRegisterResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusRegisterResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusRegisterResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusRegisterResponse = js.native
  
  /**
    * Decodes a ConsensusRegisterResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusRegisterResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusRegisterResponse = js.native
  
  /**
    * Encodes the specified ConsensusRegisterResponse message. Does not implicitly {@link ConsensusRegisterResponse.verify|verify} messages.
    * @param message ConsensusRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.encode")
  @js.native
  def encode(message: IConsensusRegisterResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.encode")
  @js.native
  def encode(message: IConsensusRegisterResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusRegisterResponse message, length delimited. Does not implicitly {@link ConsensusRegisterResponse.verify|verify} messages.
    * @param message ConsensusRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusRegisterResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusRegisterResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusRegisterResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusRegisterResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusRegisterResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusRegisterResponse message. Also converts values to other types if specified.
    * @param message ConsensusRegisterResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.toObject")
  @js.native
  def toObject(message: ConsensusRegisterResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.toObject")
  @js.native
  def toObject(message: ConsensusRegisterResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusRegisterResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
