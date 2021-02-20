package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.TpStateGetResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse")
@js.native
/**
  * Constructs a new TpStateGetResponse.
  * @param [properties] Properties to set
  */
class TpStateGetResponse () extends ITpStateGetResponse {
  def this(properties: ITpStateGetResponse) = this()
  
  /** TpStateGetResponse entries. */
  @JSName("entries")
  var entries_TpStateGetResponse: js.Array[ITpStateEntry] = js.native
  
  /** TpStateGetResponse status. */
  @JSName("status")
  var status_TpStateGetResponse: Status = js.native
  
  /**
    * Converts this TpStateGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TpStateGetResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait AUTHORIZATION_ERROR extends Status
    /* 2 */ val AUTHORIZATION_ERROR: typings.sawtoothSdk.protobufMod.TpStateGetResponse.Status.AUTHORIZATION_ERROR with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpStateGetResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpStateGetResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new TpStateGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateGetResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.create")
  @js.native
  def create(): TpStateGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.create")
  @js.native
  def create(properties: ITpStateGetResponse): TpStateGetResponse = js.native
  
  /**
    * Decodes a TpStateGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.decode")
  @js.native
  def decode(reader: Reader): TpStateGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): TpStateGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array): TpStateGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): TpStateGetResponse = js.native
  
  /**
    * Decodes a TpStateGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TpStateGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): TpStateGetResponse = js.native
  
  /**
    * Encodes the specified TpStateGetResponse message. Does not implicitly {@link TpStateGetResponse.verify|verify} messages.
    * @param message TpStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.encode")
  @js.native
  def encode(message: ITpStateGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.encode")
  @js.native
  def encode(message: ITpStateGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpStateGetResponse message, length delimited. Does not implicitly {@link TpStateGetResponse.verify|verify} messages.
    * @param message TpStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpStateGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateGetResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TpStateGetResponse = js.native
  
  /**
    * Creates a plain object from a TpStateGetResponse message. Also converts values to other types if specified.
    * @param message TpStateGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.toObject")
  @js.native
  def toObject(message: TpStateGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.toObject")
  @js.native
  def toObject(message: TpStateGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpStateGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
