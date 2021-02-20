package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse")
@js.native
/**
  * Constructs a new ConsensusCancelBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusCancelBlockResponse () extends IConsensusCancelBlockResponse {
  def this(properties: IConsensusCancelBlockResponse) = this()
  
  /** ConsensusCancelBlockResponse status. */
  @JSName("status")
  var status_ConsensusCancelBlockResponse: Status = js.native
  
  /**
    * Converts this ConsensusCancelBlockResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusCancelBlockResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST extends Status
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.BAD_REQUEST with Double = js.native
    
    @js.native
    sealed trait INVALID_STATE extends Status
    /* 5 */ val INVALID_STATE: typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.INVALID_STATE with Double = js.native
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.NOT_READY with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR extends Status
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.SERVICE_ERROR with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ConsensusCancelBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCancelBlockResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.create")
  @js.native
  def create(): ConsensusCancelBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.create")
  @js.native
  def create(properties: IConsensusCancelBlockResponse): ConsensusCancelBlockResponse = js.native
  
  /**
    * Decodes a ConsensusCancelBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCancelBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.decode")
  @js.native
  def decode(reader: Reader): ConsensusCancelBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusCancelBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusCancelBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusCancelBlockResponse = js.native
  
  /**
    * Decodes a ConsensusCancelBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCancelBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusCancelBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusCancelBlockResponse = js.native
  
  /**
    * Encodes the specified ConsensusCancelBlockResponse message. Does not implicitly {@link ConsensusCancelBlockResponse.verify|verify} messages.
    * @param message ConsensusCancelBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.encode")
  @js.native
  def encode(message: IConsensusCancelBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.encode")
  @js.native
  def encode(message: IConsensusCancelBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusCancelBlockResponse message, length delimited. Does not implicitly {@link ConsensusCancelBlockResponse.verify|verify} messages.
    * @param message ConsensusCancelBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusCancelBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusCancelBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusCancelBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCancelBlockResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusCancelBlockResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusCancelBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusCancelBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.toObject")
  @js.native
  def toObject(message: ConsensusCancelBlockResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.toObject")
  @js.native
  def toObject(message: ConsensusCancelBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusCancelBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
