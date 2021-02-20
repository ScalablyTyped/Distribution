package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.TpStateSetResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse")
@js.native
/**
  * Constructs a new TpStateSetResponse.
  * @param [properties] Properties to set
  */
class TpStateSetResponse () extends ITpStateSetResponse {
  def this(properties: ITpStateSetResponse) = this()
  
  /** TpStateSetResponse addresses. */
  @JSName("addresses")
  var addresses_TpStateSetResponse: js.Array[String] = js.native
  
  /** TpStateSetResponse status. */
  @JSName("status")
  var status_TpStateSetResponse: Status = js.native
  
  /**
    * Converts this TpStateSetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TpStateSetResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait AUTHORIZATION_ERROR extends Status
    /* 2 */ val AUTHORIZATION_ERROR: typings.sawtoothSdk.protobufMod.TpStateSetResponse.Status.AUTHORIZATION_ERROR with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpStateSetResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpStateSetResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new TpStateSetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateSetResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.create")
  @js.native
  def create(): TpStateSetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.create")
  @js.native
  def create(properties: ITpStateSetResponse): TpStateSetResponse = js.native
  
  /**
    * Decodes a TpStateSetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateSetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.decode")
  @js.native
  def decode(reader: Reader): TpStateSetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): TpStateSetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.decode")
  @js.native
  def decode(reader: Uint8Array): TpStateSetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): TpStateSetResponse = js.native
  
  /**
    * Decodes a TpStateSetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateSetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TpStateSetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): TpStateSetResponse = js.native
  
  /**
    * Encodes the specified TpStateSetResponse message. Does not implicitly {@link TpStateSetResponse.verify|verify} messages.
    * @param message TpStateSetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.encode")
  @js.native
  def encode(message: ITpStateSetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.encode")
  @js.native
  def encode(message: ITpStateSetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpStateSetResponse message, length delimited. Does not implicitly {@link TpStateSetResponse.verify|verify} messages.
    * @param message TpStateSetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateSetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateSetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpStateSetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateSetResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TpStateSetResponse = js.native
  
  /**
    * Creates a plain object from a TpStateSetResponse message. Also converts values to other types if specified.
    * @param message TpStateSetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.toObject")
  @js.native
  def toObject(message: TpStateSetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.toObject")
  @js.native
  def toObject(message: TpStateSetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpStateSetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
