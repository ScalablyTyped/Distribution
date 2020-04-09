package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ClientBatchGetRequest")
@js.native
/**
  * Constructs a new ClientBatchGetRequest.
  * @param [properties] Properties to set
  */
class ClientBatchGetRequest () extends IClientBatchGetRequest {
  def this(properties: IClientBatchGetRequest) = this()
  /** ClientBatchGetRequest batchId. */
  @JSName("batchId")
  var batchId_ClientBatchGetRequest: String = js.native
  /**
    * Converts this ClientBatchGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientBatchGetRequest")
@js.native
object ClientBatchGetRequest extends js.Object {
  /**
    * Creates a new ClientBatchGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchGetRequest instance
    */
  def create(): ClientBatchGetRequest = js.native
  def create(properties: IClientBatchGetRequest): ClientBatchGetRequest = js.native
  /**
    * Decodes a ClientBatchGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ClientBatchGetRequest = js.native
  def decode(reader: Reader, length: Double): ClientBatchGetRequest = js.native
  def decode(reader: Uint8Array): ClientBatchGetRequest = js.native
  def decode(reader: Uint8Array, length: Double): ClientBatchGetRequest = js.native
  /**
    * Decodes a ClientBatchGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ClientBatchGetRequest = js.native
  def decodeDelimited(reader: Uint8Array): ClientBatchGetRequest = js.native
  /**
    * Encodes the specified ClientBatchGetRequest message. Does not implicitly {@link ClientBatchGetRequest.verify|verify} messages.
    * @param message ClientBatchGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBatchGetRequest): Writer = js.native
  def encode(message: IClientBatchGetRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientBatchGetRequest message, length delimited. Does not implicitly {@link ClientBatchGetRequest.verify|verify} messages.
    * @param message ClientBatchGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBatchGetRequest): Writer = js.native
  def encodeDelimited(message: IClientBatchGetRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ClientBatchGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchGetRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ClientBatchGetRequest = js.native
  /**
    * Creates a plain object from a ClientBatchGetRequest message. Also converts values to other types if specified.
    * @param message ClientBatchGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ClientBatchGetRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ClientBatchGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientBatchGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

