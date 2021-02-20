package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse")
@js.native
/**
  * Constructs a new ConsensusFinalizeBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusFinalizeBlockResponse () extends IConsensusFinalizeBlockResponse {
  def this(properties: IConsensusFinalizeBlockResponse) = this()
  
  /** ConsensusFinalizeBlockResponse blockId. */
  @JSName("blockId")
  var blockId_ConsensusFinalizeBlockResponse: Uint8Array = js.native
  
  /** ConsensusFinalizeBlockResponse status. */
  @JSName("status")
  var status_ConsensusFinalizeBlockResponse: Status = js.native
  
  /**
    * Converts this ConsensusFinalizeBlockResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusFinalizeBlockResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST extends Status
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.BAD_REQUEST with Double = js.native
    
    @js.native
    sealed trait BLOCK_NOT_READY extends Status
    /* 6 */ val BLOCK_NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.BLOCK_NOT_READY with Double = js.native
    
    @js.native
    sealed trait INVALID_STATE extends Status
    /* 5 */ val INVALID_STATE: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.INVALID_STATE with Double = js.native
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.NOT_READY with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR extends Status
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.SERVICE_ERROR with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ConsensusFinalizeBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusFinalizeBlockResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.create")
  @js.native
  def create(): ConsensusFinalizeBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.create")
  @js.native
  def create(properties: IConsensusFinalizeBlockResponse): ConsensusFinalizeBlockResponse = js.native
  
  /**
    * Decodes a ConsensusFinalizeBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusFinalizeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.decode")
  @js.native
  def decode(reader: Reader): ConsensusFinalizeBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusFinalizeBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusFinalizeBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusFinalizeBlockResponse = js.native
  
  /**
    * Decodes a ConsensusFinalizeBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusFinalizeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusFinalizeBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusFinalizeBlockResponse = js.native
  
  /**
    * Encodes the specified ConsensusFinalizeBlockResponse message. Does not implicitly {@link ConsensusFinalizeBlockResponse.verify|verify} messages.
    * @param message ConsensusFinalizeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.encode")
  @js.native
  def encode(message: IConsensusFinalizeBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.encode")
  @js.native
  def encode(message: IConsensusFinalizeBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusFinalizeBlockResponse message, length delimited. Does not implicitly {@link ConsensusFinalizeBlockResponse.verify|verify} messages.
    * @param message ConsensusFinalizeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusFinalizeBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusFinalizeBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusFinalizeBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusFinalizeBlockResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusFinalizeBlockResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusFinalizeBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusFinalizeBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.toObject")
  @js.native
  def toObject(message: ConsensusFinalizeBlockResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.toObject")
  @js.native
  def toObject(message: ConsensusFinalizeBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusFinalizeBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
