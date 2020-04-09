package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusRequest")
@js.native
/**
  * Constructs a new ClientBatchStatusRequest.
  * @param [properties] Properties to set
  */
class ClientBatchStatusRequest () extends IClientBatchStatusRequest {
  def this(properties: IClientBatchStatusRequest) = this()
  /** ClientBatchStatusRequest batchIds. */
  @JSName("batchIds")
  var batchIds_ClientBatchStatusRequest: js.Array[String] = js.native
  /** ClientBatchStatusRequest timeout. */
  @JSName("timeout")
  var timeout_ClientBatchStatusRequest: Double = js.native
  /** ClientBatchStatusRequest wait. */
  @JSName("wait")
  var wait_FClientBatchStatusRequest: Boolean = js.native
  /**
    * Converts this ClientBatchStatusRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusRequest")
@js.native
object ClientBatchStatusRequest extends js.Object {
  /**
    * Creates a new ClientBatchStatusRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchStatusRequest instance
    */
  def create(): ClientBatchStatusRequest = js.native
  def create(properties: IClientBatchStatusRequest): ClientBatchStatusRequest = js.native
  /**
    * Decodes a ClientBatchStatusRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchStatusRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ClientBatchStatusRequest = js.native
  def decode(reader: Reader, length: Double): ClientBatchStatusRequest = js.native
  def decode(reader: Uint8Array): ClientBatchStatusRequest = js.native
  def decode(reader: Uint8Array, length: Double): ClientBatchStatusRequest = js.native
  /**
    * Decodes a ClientBatchStatusRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchStatusRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ClientBatchStatusRequest = js.native
  def decodeDelimited(reader: Uint8Array): ClientBatchStatusRequest = js.native
  /**
    * Encodes the specified ClientBatchStatusRequest message. Does not implicitly {@link ClientBatchStatusRequest.verify|verify} messages.
    * @param message ClientBatchStatusRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBatchStatusRequest): Writer = js.native
  def encode(message: IClientBatchStatusRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientBatchStatusRequest message, length delimited. Does not implicitly {@link ClientBatchStatusRequest.verify|verify} messages.
    * @param message ClientBatchStatusRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBatchStatusRequest): Writer = js.native
  def encodeDelimited(message: IClientBatchStatusRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ClientBatchStatusRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchStatusRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ClientBatchStatusRequest = js.native
  /**
    * Creates a plain object from a ClientBatchStatusRequest message. Also converts values to other types if specified.
    * @param message ClientBatchStatusRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ClientBatchStatusRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ClientBatchStatusRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientBatchStatusRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

