package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ClientBlockListRequest")
@js.native
/**
  * Constructs a new ClientBlockListRequest.
  * @param [properties] Properties to set
  */
class ClientBlockListRequest () extends IClientBlockListRequest {
  def this(properties: IClientBlockListRequest) = this()
  /** ClientBlockListRequest blockIds. */
  @JSName("blockIds")
  var blockIds_ClientBlockListRequest: js.Array[String] = js.native
  /** ClientBlockListRequest headId. */
  @JSName("headId")
  var headId_ClientBlockListRequest: String = js.native
  /** ClientBlockListRequest sorting. */
  @JSName("sorting")
  var sorting_ClientBlockListRequest: js.Array[IClientSortControls] = js.native
  /**
    * Converts this ClientBlockListRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientBlockListRequest")
@js.native
object ClientBlockListRequest extends js.Object {
  /**
    * Creates a new ClientBlockListRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockListRequest instance
    */
  def create(): ClientBlockListRequest = js.native
  def create(properties: IClientBlockListRequest): ClientBlockListRequest = js.native
  /**
    * Decodes a ClientBlockListRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ClientBlockListRequest = js.native
  def decode(reader: Reader, length: Double): ClientBlockListRequest = js.native
  def decode(reader: Uint8Array): ClientBlockListRequest = js.native
  def decode(reader: Uint8Array, length: Double): ClientBlockListRequest = js.native
  /**
    * Decodes a ClientBlockListRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ClientBlockListRequest = js.native
  def decodeDelimited(reader: Uint8Array): ClientBlockListRequest = js.native
  /**
    * Encodes the specified ClientBlockListRequest message. Does not implicitly {@link ClientBlockListRequest.verify|verify} messages.
    * @param message ClientBlockListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBlockListRequest): Writer = js.native
  def encode(message: IClientBlockListRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientBlockListRequest message, length delimited. Does not implicitly {@link ClientBlockListRequest.verify|verify} messages.
    * @param message ClientBlockListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBlockListRequest): Writer = js.native
  def encodeDelimited(message: IClientBlockListRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ClientBlockListRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockListRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ClientBlockListRequest = js.native
  /**
    * Creates a plain object from a ClientBlockListRequest message. Also converts values to other types if specified.
    * @param message ClientBlockListRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ClientBlockListRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ClientBlockListRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientBlockListRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

