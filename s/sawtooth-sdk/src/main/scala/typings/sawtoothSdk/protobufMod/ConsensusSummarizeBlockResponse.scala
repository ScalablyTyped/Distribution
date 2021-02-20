package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse")
@js.native
/**
  * Constructs a new ConsensusSummarizeBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusSummarizeBlockResponse () extends IConsensusSummarizeBlockResponse {
  def this(properties: IConsensusSummarizeBlockResponse) = this()
  
  /** ConsensusSummarizeBlockResponse status. */
  @JSName("status")
  var status_ConsensusSummarizeBlockResponse: Status = js.native
  
  /** ConsensusSummarizeBlockResponse summary. */
  @JSName("summary")
  var summary_ConsensusSummarizeBlockResponse: Uint8Array = js.native
  
  /**
    * Converts this ConsensusSummarizeBlockResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusSummarizeBlockResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST extends Status
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.BAD_REQUEST with Double = js.native
    
    @js.native
    sealed trait BLOCK_NOT_READY extends Status
    /* 6 */ val BLOCK_NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.BLOCK_NOT_READY with Double = js.native
    
    @js.native
    sealed trait INVALID_STATE extends Status
    /* 5 */ val INVALID_STATE: typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.INVALID_STATE with Double = js.native
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.NOT_READY with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR extends Status
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.SERVICE_ERROR with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ConsensusSummarizeBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSummarizeBlockResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.create")
  @js.native
  def create(): ConsensusSummarizeBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.create")
  @js.native
  def create(properties: IConsensusSummarizeBlockResponse): ConsensusSummarizeBlockResponse = js.native
  
  /**
    * Decodes a ConsensusSummarizeBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSummarizeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.decode")
  @js.native
  def decode(reader: Reader): ConsensusSummarizeBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusSummarizeBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusSummarizeBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusSummarizeBlockResponse = js.native
  
  /**
    * Decodes a ConsensusSummarizeBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSummarizeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusSummarizeBlockResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusSummarizeBlockResponse = js.native
  
  /**
    * Encodes the specified ConsensusSummarizeBlockResponse message. Does not implicitly {@link ConsensusSummarizeBlockResponse.verify|verify} messages.
    * @param message ConsensusSummarizeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.encode")
  @js.native
  def encode(message: IConsensusSummarizeBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.encode")
  @js.native
  def encode(message: IConsensusSummarizeBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusSummarizeBlockResponse message, length delimited. Does not implicitly {@link ConsensusSummarizeBlockResponse.verify|verify} messages.
    * @param message ConsensusSummarizeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusSummarizeBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusSummarizeBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusSummarizeBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSummarizeBlockResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusSummarizeBlockResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusSummarizeBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusSummarizeBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.toObject")
  @js.native
  def toObject(message: ConsensusSummarizeBlockResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.toObject")
  @js.native
  def toObject(message: ConsensusSummarizeBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusSummarizeBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
