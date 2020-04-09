package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "TpUnregisterRequest")
@js.native
/**
  * Constructs a new TpUnregisterRequest.
  * @param [properties] Properties to set
  */
class TpUnregisterRequest () extends ITpUnregisterRequest {
  def this(properties: ITpUnregisterRequest) = this()
  /**
    * Converts this TpUnregisterRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "TpUnregisterRequest")
@js.native
object TpUnregisterRequest extends js.Object {
  /**
    * Creates a new TpUnregisterRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpUnregisterRequest instance
    */
  def create(): TpUnregisterRequest = js.native
  def create(properties: ITpUnregisterRequest): TpUnregisterRequest = js.native
  /**
    * Decodes a TpUnregisterRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpUnregisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TpUnregisterRequest = js.native
  def decode(reader: Reader, length: Double): TpUnregisterRequest = js.native
  def decode(reader: Uint8Array): TpUnregisterRequest = js.native
  def decode(reader: Uint8Array, length: Double): TpUnregisterRequest = js.native
  /**
    * Decodes a TpUnregisterRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpUnregisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TpUnregisterRequest = js.native
  def decodeDelimited(reader: Uint8Array): TpUnregisterRequest = js.native
  /**
    * Encodes the specified TpUnregisterRequest message. Does not implicitly {@link TpUnregisterRequest.verify|verify} messages.
    * @param message TpUnregisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpUnregisterRequest): Writer = js.native
  def encode(message: ITpUnregisterRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TpUnregisterRequest message, length delimited. Does not implicitly {@link TpUnregisterRequest.verify|verify} messages.
    * @param message TpUnregisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpUnregisterRequest): Writer = js.native
  def encodeDelimited(message: ITpUnregisterRequest, writer: Writer): Writer = js.native
  /**
    * Creates a TpUnregisterRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpUnregisterRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): TpUnregisterRequest = js.native
  /**
    * Creates a plain object from a TpUnregisterRequest message. Also converts values to other types if specified.
    * @param message TpUnregisterRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TpUnregisterRequest): StringDictionary[js.Any] = js.native
  def toObject(message: TpUnregisterRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TpUnregisterRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

