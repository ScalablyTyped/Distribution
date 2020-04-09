package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest")
@js.native
/**
  * Constructs a new TpEventAddRequest.
  * @param [properties] Properties to set
  */
class TpEventAddRequest () extends ITpEventAddRequest {
  def this(properties: ITpEventAddRequest) = this()
  /** TpEventAddRequest contextId. */
  @JSName("contextId")
  var contextId_TpEventAddRequest: String = js.native
  /**
    * Converts this TpEventAddRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest")
@js.native
object TpEventAddRequest extends js.Object {
  /**
    * Creates a new TpEventAddRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpEventAddRequest instance
    */
  def create(): TpEventAddRequest = js.native
  def create(properties: ITpEventAddRequest): TpEventAddRequest = js.native
  /**
    * Decodes a TpEventAddRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpEventAddRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TpEventAddRequest = js.native
  def decode(reader: Reader, length: Double): TpEventAddRequest = js.native
  def decode(reader: Uint8Array): TpEventAddRequest = js.native
  def decode(reader: Uint8Array, length: Double): TpEventAddRequest = js.native
  /**
    * Decodes a TpEventAddRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpEventAddRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TpEventAddRequest = js.native
  def decodeDelimited(reader: Uint8Array): TpEventAddRequest = js.native
  /**
    * Encodes the specified TpEventAddRequest message. Does not implicitly {@link TpEventAddRequest.verify|verify} messages.
    * @param message TpEventAddRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpEventAddRequest): Writer = js.native
  def encode(message: ITpEventAddRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TpEventAddRequest message, length delimited. Does not implicitly {@link TpEventAddRequest.verify|verify} messages.
    * @param message TpEventAddRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpEventAddRequest): Writer = js.native
  def encodeDelimited(message: ITpEventAddRequest, writer: Writer): Writer = js.native
  /**
    * Creates a TpEventAddRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpEventAddRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): TpEventAddRequest = js.native
  /**
    * Creates a plain object from a TpEventAddRequest message. Also converts values to other types if specified.
    * @param message TpEventAddRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TpEventAddRequest): StringDictionary[js.Any] = js.native
  def toObject(message: TpEventAddRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TpEventAddRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

