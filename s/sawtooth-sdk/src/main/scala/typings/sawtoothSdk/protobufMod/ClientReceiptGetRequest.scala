package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest")
@js.native
/**
  * Constructs a new ClientReceiptGetRequest.
  * @param [properties] Properties to set
  */
class ClientReceiptGetRequest () extends IClientReceiptGetRequest {
  def this(properties: IClientReceiptGetRequest) = this()
  
  /**
    * Converts this ClientReceiptGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ClientReceiptGetRequest transactionIds. */
  @JSName("transactionIds")
  var transactionIds_ClientReceiptGetRequest: js.Array[String] = js.native
}
/* static members */
object ClientReceiptGetRequest {
  
  /**
    * Creates a new ClientReceiptGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientReceiptGetRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest.create")
  @js.native
  def create(): ClientReceiptGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest.create")
  @js.native
  def create(properties: IClientReceiptGetRequest): ClientReceiptGetRequest = js.native
  
  /**
    * Decodes a ClientReceiptGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientReceiptGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest.decode")
  @js.native
  def decode(reader: Reader): ClientReceiptGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientReceiptGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ClientReceiptGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ClientReceiptGetRequest = js.native
  
  /**
    * Decodes a ClientReceiptGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientReceiptGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientReceiptGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ClientReceiptGetRequest = js.native
  
  /**
    * Encodes the specified ClientReceiptGetRequest message. Does not implicitly {@link ClientReceiptGetRequest.verify|verify} messages.
    * @param message ClientReceiptGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest.encode")
  @js.native
  def encode(message: IClientReceiptGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest.encode")
  @js.native
  def encode(message: IClientReceiptGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientReceiptGetRequest message, length delimited. Does not implicitly {@link ClientReceiptGetRequest.verify|verify} messages.
    * @param message ClientReceiptGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientReceiptGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientReceiptGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientReceiptGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientReceiptGetRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientReceiptGetRequest = js.native
  
  /**
    * Creates a plain object from a ClientReceiptGetRequest message. Also converts values to other types if specified.
    * @param message ClientReceiptGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest.toObject")
  @js.native
  def toObject(message: ClientReceiptGetRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest.toObject")
  @js.native
  def toObject(message: ClientReceiptGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientReceiptGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
