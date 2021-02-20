package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object ConsensusInitializeBlockResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST extends Status
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.BAD_REQUEST with Double = js.native
    
    @js.native
    sealed trait INVALID_STATE extends Status
    /* 5 */ val INVALID_STATE: typings.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.INVALID_STATE with Double = js.native
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.NOT_READY with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR extends Status
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.SERVICE_ERROR with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.STATUS_UNSET with Double = js.native
    
    @js.native
    sealed trait UNKNOWN_BLOCK extends Status
    /* 6 */ val UNKNOWN_BLOCK: typings.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.UNKNOWN_BLOCK with Double = js.native
  }
  
  /**
    * Creates a new ConsensusInitializeBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusInitializeBlockResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.create")
  @js.native
  def create(): ConsensusInitializeBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.create")
  @js.native
  def create(properties: IConsensusInitializeBlockResponse): ConsensusInitializeBlockResponse = js.native
  
  /**
    * Decodes a ConsensusInitializeBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusInitializeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.decode")
  @js.native
  def decode(reader: Reader): ConsensusInitializeBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusInitializeBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusInitializeBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusInitializeBlockResponse = js.native
  
  /**
    * Decodes a ConsensusInitializeBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusInitializeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusInitializeBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusInitializeBlockResponse = js.native
  
  /**
    * Encodes the specified ConsensusInitializeBlockResponse message. Does not implicitly {@link ConsensusInitializeBlockResponse.verify|verify} messages.
    * @param message ConsensusInitializeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.encode")
  @js.native
  def encode(message: IConsensusInitializeBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.encode")
  @js.native
  def encode(message: IConsensusInitializeBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusInitializeBlockResponse message, length delimited. Does not implicitly {@link ConsensusInitializeBlockResponse.verify|verify} messages.
    * @param message ConsensusInitializeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusInitializeBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusInitializeBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusInitializeBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusInitializeBlockResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusInitializeBlockResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusInitializeBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusInitializeBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.toObject")
  @js.native
  def toObject(message: ConsensusInitializeBlockResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.toObject")
  @js.native
  def toObject(message: ConsensusInitializeBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusInitializeBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
