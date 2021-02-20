package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.TpEventAddResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse")
@js.native
/**
  * Constructs a new TpEventAddResponse.
  * @param [properties] Properties to set
  */
class TpEventAddResponse () extends ITpEventAddResponse {
  def this(properties: ITpEventAddResponse) = this()
  
  /** TpEventAddResponse status. */
  @JSName("status")
  var status_TpEventAddResponse: Status = js.native
  
  /**
    * Converts this TpEventAddResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TpEventAddResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait ERROR extends Status
    /* 2 */ val ERROR: typings.sawtoothSdk.protobufMod.TpEventAddResponse.Status.ERROR with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpEventAddResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpEventAddResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new TpEventAddResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpEventAddResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.create")
  @js.native
  def create(): TpEventAddResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.create")
  @js.native
  def create(properties: ITpEventAddResponse): TpEventAddResponse = js.native
  
  /**
    * Decodes a TpEventAddResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpEventAddResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.decode")
  @js.native
  def decode(reader: Reader): TpEventAddResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): TpEventAddResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.decode")
  @js.native
  def decode(reader: Uint8Array): TpEventAddResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): TpEventAddResponse = js.native
  
  /**
    * Decodes a TpEventAddResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpEventAddResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TpEventAddResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): TpEventAddResponse = js.native
  
  /**
    * Encodes the specified TpEventAddResponse message. Does not implicitly {@link TpEventAddResponse.verify|verify} messages.
    * @param message TpEventAddResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.encode")
  @js.native
  def encode(message: ITpEventAddResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.encode")
  @js.native
  def encode(message: ITpEventAddResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpEventAddResponse message, length delimited. Does not implicitly {@link TpEventAddResponse.verify|verify} messages.
    * @param message TpEventAddResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpEventAddResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpEventAddResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpEventAddResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpEventAddResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TpEventAddResponse = js.native
  
  /**
    * Creates a plain object from a TpEventAddResponse message. Also converts values to other types if specified.
    * @param message TpEventAddResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.toObject")
  @js.native
  def toObject(message: TpEventAddResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.toObject")
  @js.native
  def toObject(message: TpEventAddResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpEventAddResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
