package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientPagingResponse")
@js.native
/**
  * Constructs a new ClientPagingResponse.
  * @param [properties] Properties to set
  */
class ClientPagingResponse () extends IClientPagingResponse {
  def this(properties: IClientPagingResponse) = this()
  
  /** ClientPagingResponse limit. */
  @JSName("limit")
  var limit_ClientPagingResponse: Double = js.native
  
  /** ClientPagingResponse next. */
  @JSName("next")
  var next_ClientPagingResponse: String = js.native
  
  /** ClientPagingResponse start. */
  @JSName("start")
  var start_ClientPagingResponse: String = js.native
  
  /**
    * Converts this ClientPagingResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientPagingResponse")
@js.native
object ClientPagingResponse extends js.Object {
  
  /**
    * Creates a new ClientPagingResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientPagingResponse instance
    */
  def create(): ClientPagingResponse = js.native
  def create(properties: IClientPagingResponse): ClientPagingResponse = js.native
  
  /**
    * Decodes a ClientPagingResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientPagingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ClientPagingResponse = js.native
  def decode(reader: Reader, length: Double): ClientPagingResponse = js.native
  def decode(reader: Uint8Array): ClientPagingResponse = js.native
  def decode(reader: Uint8Array, length: Double): ClientPagingResponse = js.native
  
  /**
    * Decodes a ClientPagingResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientPagingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ClientPagingResponse = js.native
  def decodeDelimited(reader: Uint8Array): ClientPagingResponse = js.native
  
  /**
    * Encodes the specified ClientPagingResponse message. Does not implicitly {@link ClientPagingResponse.verify|verify} messages.
    * @param message ClientPagingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientPagingResponse): Writer = js.native
  def encode(message: IClientPagingResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientPagingResponse message, length delimited. Does not implicitly {@link ClientPagingResponse.verify|verify} messages.
    * @param message ClientPagingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientPagingResponse): Writer = js.native
  def encodeDelimited(message: IClientPagingResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientPagingResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientPagingResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ClientPagingResponse = js.native
  
  /**
    * Creates a plain object from a ClientPagingResponse message. Also converts values to other types if specified.
    * @param message ClientPagingResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ClientPagingResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ClientPagingResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientPagingResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
