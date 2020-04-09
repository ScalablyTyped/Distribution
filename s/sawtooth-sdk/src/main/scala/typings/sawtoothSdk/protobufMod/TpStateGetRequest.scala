package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "TpStateGetRequest")
@js.native
/**
  * Constructs a new TpStateGetRequest.
  * @param [properties] Properties to set
  */
class TpStateGetRequest () extends ITpStateGetRequest {
  def this(properties: ITpStateGetRequest) = this()
  /** TpStateGetRequest addresses. */
  @JSName("addresses")
  var addresses_TpStateGetRequest: js.Array[String] = js.native
  /** TpStateGetRequest contextId. */
  @JSName("contextId")
  var contextId_TpStateGetRequest: String = js.native
  /**
    * Converts this TpStateGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "TpStateGetRequest")
@js.native
object TpStateGetRequest extends js.Object {
  /**
    * Creates a new TpStateGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateGetRequest instance
    */
  def create(): TpStateGetRequest = js.native
  def create(properties: ITpStateGetRequest): TpStateGetRequest = js.native
  /**
    * Decodes a TpStateGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TpStateGetRequest = js.native
  def decode(reader: Reader, length: Double): TpStateGetRequest = js.native
  def decode(reader: Uint8Array): TpStateGetRequest = js.native
  def decode(reader: Uint8Array, length: Double): TpStateGetRequest = js.native
  /**
    * Decodes a TpStateGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TpStateGetRequest = js.native
  def decodeDelimited(reader: Uint8Array): TpStateGetRequest = js.native
  /**
    * Encodes the specified TpStateGetRequest message. Does not implicitly {@link TpStateGetRequest.verify|verify} messages.
    * @param message TpStateGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpStateGetRequest): Writer = js.native
  def encode(message: ITpStateGetRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TpStateGetRequest message, length delimited. Does not implicitly {@link TpStateGetRequest.verify|verify} messages.
    * @param message TpStateGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpStateGetRequest): Writer = js.native
  def encodeDelimited(message: ITpStateGetRequest, writer: Writer): Writer = js.native
  /**
    * Creates a TpStateGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateGetRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): TpStateGetRequest = js.native
  /**
    * Creates a plain object from a TpStateGetRequest message. Also converts values to other types if specified.
    * @param message TpStateGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TpStateGetRequest): StringDictionary[js.Any] = js.native
  def toObject(message: TpStateGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TpStateGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

