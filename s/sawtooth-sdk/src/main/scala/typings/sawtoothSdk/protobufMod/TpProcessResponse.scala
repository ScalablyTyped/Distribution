package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.TpProcessResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpProcessResponse")
@js.native
/**
  * Constructs a new TpProcessResponse.
  * @param [properties] Properties to set
  */
class TpProcessResponse () extends ITpProcessResponse {
  def this(properties: ITpProcessResponse) = this()
  
  /** TpProcessResponse extendedData. */
  @JSName("extendedData")
  var extendedData_TpProcessResponse: Uint8Array = js.native
  
  /** TpProcessResponse message. */
  @JSName("message")
  var message_TpProcessResponse: String = js.native
  
  /** TpProcessResponse status. */
  @JSName("status")
  var status_TpProcessResponse: Status = js.native
  
  /**
    * Converts this TpProcessResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TpProcessResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR extends Status
    /* 3 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.TpProcessResponse.Status.INTERNAL_ERROR with Double = js.native
    
    @js.native
    sealed trait INVALID_TRANSACTION extends Status
    /* 2 */ val INVALID_TRANSACTION: typings.sawtoothSdk.protobufMod.TpProcessResponse.Status.INVALID_TRANSACTION with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpProcessResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpProcessResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new TpProcessResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpProcessResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.create")
  @js.native
  def create(): TpProcessResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.create")
  @js.native
  def create(properties: ITpProcessResponse): TpProcessResponse = js.native
  
  /**
    * Decodes a TpProcessResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpProcessResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.decode")
  @js.native
  def decode(reader: Reader): TpProcessResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): TpProcessResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.decode")
  @js.native
  def decode(reader: Uint8Array): TpProcessResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): TpProcessResponse = js.native
  
  /**
    * Decodes a TpProcessResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpProcessResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TpProcessResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): TpProcessResponse = js.native
  
  /**
    * Encodes the specified TpProcessResponse message. Does not implicitly {@link TpProcessResponse.verify|verify} messages.
    * @param message TpProcessResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.encode")
  @js.native
  def encode(message: ITpProcessResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.encode")
  @js.native
  def encode(message: ITpProcessResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpProcessResponse message, length delimited. Does not implicitly {@link TpProcessResponse.verify|verify} messages.
    * @param message TpProcessResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpProcessResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpProcessResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpProcessResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpProcessResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TpProcessResponse = js.native
  
  /**
    * Creates a plain object from a TpProcessResponse message. Also converts values to other types if specified.
    * @param message TpProcessResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.toObject")
  @js.native
  def toObject(message: TpProcessResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.toObject")
  @js.native
  def toObject(message: TpProcessResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpProcessResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
