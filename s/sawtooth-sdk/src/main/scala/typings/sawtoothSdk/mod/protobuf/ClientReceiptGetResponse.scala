package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientReceiptGetResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse")
@js.native
/**
  * Constructs a new ClientReceiptGetResponse.
  * @param [properties] Properties to set
  */
class ClientReceiptGetResponse ()
  extends typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse {
  def this(properties: IClientReceiptGetResponse) = this()
}
/* static members */
object ClientReceiptGetResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status with Double] = js.native
    
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status.INTERNAL_ERROR with Double = js.native
    
    /* 8 */ val INVALID_ID: typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status.INVALID_ID with Double = js.native
    
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status.NO_RESOURCE with Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ClientReceiptGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientReceiptGetResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.create")
  @js.native
  def create(properties: IClientReceiptGetResponse): typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  
  /**
    * Decodes a ClientReceiptGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientReceiptGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  
  /**
    * Decodes a ClientReceiptGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientReceiptGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  
  /**
    * Encodes the specified ClientReceiptGetResponse message. Does not implicitly {@link ClientReceiptGetResponse.verify|verify} messages.
    * @param message ClientReceiptGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.encode")
  @js.native
  def encode(message: IClientReceiptGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.encode")
  @js.native
  def encode(message: IClientReceiptGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientReceiptGetResponse message, length delimited. Does not implicitly {@link ClientReceiptGetResponse.verify|verify} messages.
    * @param message ClientReceiptGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientReceiptGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientReceiptGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientReceiptGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientReceiptGetResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse = js.native
  
  /**
    * Creates a plain object from a ClientReceiptGetResponse message. Also converts values to other types if specified.
    * @param message ClientReceiptGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientReceiptGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientReceiptGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
