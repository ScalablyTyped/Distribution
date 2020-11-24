package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientStateListRequest")
@js.native
/**
  * Constructs a new ClientStateListRequest.
  * @param [properties] Properties to set
  */
class ClientStateListRequest () extends IClientStateListRequest {
  def this(properties: IClientStateListRequest) = this()
  
  /** ClientStateListRequest address. */
  @JSName("address")
  var address_ClientStateListRequest: String = js.native
  
  /** ClientStateListRequest sorting. */
  @JSName("sorting")
  var sorting_ClientStateListRequest: js.Array[IClientSortControls] = js.native
  
  /** ClientStateListRequest stateRoot. */
  @JSName("stateRoot")
  var stateRoot_ClientStateListRequest: String = js.native
  
  /**
    * Converts this ClientStateListRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientStateListRequest")
@js.native
object ClientStateListRequest extends js.Object {
  
  /**
    * Creates a new ClientStateListRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStateListRequest instance
    */
  def create(): ClientStateListRequest = js.native
  def create(properties: IClientStateListRequest): ClientStateListRequest = js.native
  
  /**
    * Decodes a ClientStateListRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStateListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ClientStateListRequest = js.native
  def decode(reader: Reader, length: Double): ClientStateListRequest = js.native
  def decode(reader: Uint8Array): ClientStateListRequest = js.native
  def decode(reader: Uint8Array, length: Double): ClientStateListRequest = js.native
  
  /**
    * Decodes a ClientStateListRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStateListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ClientStateListRequest = js.native
  def decodeDelimited(reader: Uint8Array): ClientStateListRequest = js.native
  
  /**
    * Encodes the specified ClientStateListRequest message. Does not implicitly {@link ClientStateListRequest.verify|verify} messages.
    * @param message ClientStateListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientStateListRequest): Writer = js.native
  def encode(message: IClientStateListRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientStateListRequest message, length delimited. Does not implicitly {@link ClientStateListRequest.verify|verify} messages.
    * @param message ClientStateListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientStateListRequest): Writer = js.native
  def encodeDelimited(message: IClientStateListRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientStateListRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStateListRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ClientStateListRequest = js.native
  
  /**
    * Creates a plain object from a ClientStateListRequest message. Also converts values to other types if specified.
    * @param message ClientStateListRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ClientStateListRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ClientStateListRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientStateListRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
