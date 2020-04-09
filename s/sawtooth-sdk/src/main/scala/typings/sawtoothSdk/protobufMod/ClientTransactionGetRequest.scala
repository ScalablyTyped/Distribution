package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest")
@js.native
/**
  * Constructs a new ClientTransactionGetRequest.
  * @param [properties] Properties to set
  */
class ClientTransactionGetRequest () extends IClientTransactionGetRequest {
  def this(properties: IClientTransactionGetRequest) = this()
  /** ClientTransactionGetRequest transactionId. */
  @JSName("transactionId")
  var transactionId_ClientTransactionGetRequest: String = js.native
  /**
    * Converts this ClientTransactionGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetRequest")
@js.native
object ClientTransactionGetRequest extends js.Object {
  /**
    * Creates a new ClientTransactionGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientTransactionGetRequest instance
    */
  def create(): ClientTransactionGetRequest = js.native
  def create(properties: IClientTransactionGetRequest): ClientTransactionGetRequest = js.native
  /**
    * Decodes a ClientTransactionGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientTransactionGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ClientTransactionGetRequest = js.native
  def decode(reader: Reader, length: Double): ClientTransactionGetRequest = js.native
  def decode(reader: Uint8Array): ClientTransactionGetRequest = js.native
  def decode(reader: Uint8Array, length: Double): ClientTransactionGetRequest = js.native
  /**
    * Decodes a ClientTransactionGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientTransactionGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ClientTransactionGetRequest = js.native
  def decodeDelimited(reader: Uint8Array): ClientTransactionGetRequest = js.native
  /**
    * Encodes the specified ClientTransactionGetRequest message. Does not implicitly {@link ClientTransactionGetRequest.verify|verify} messages.
    * @param message ClientTransactionGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientTransactionGetRequest): Writer = js.native
  def encode(message: IClientTransactionGetRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientTransactionGetRequest message, length delimited. Does not implicitly {@link ClientTransactionGetRequest.verify|verify} messages.
    * @param message ClientTransactionGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientTransactionGetRequest): Writer = js.native
  def encodeDelimited(message: IClientTransactionGetRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ClientTransactionGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientTransactionGetRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ClientTransactionGetRequest = js.native
  /**
    * Creates a plain object from a ClientTransactionGetRequest message. Also converts values to other types if specified.
    * @param message ClientTransactionGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ClientTransactionGetRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ClientTransactionGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientTransactionGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

