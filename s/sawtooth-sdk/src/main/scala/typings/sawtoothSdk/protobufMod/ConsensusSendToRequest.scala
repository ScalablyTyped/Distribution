package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ConsensusSendToRequest")
@js.native
/**
  * Constructs a new ConsensusSendToRequest.
  * @param [properties] Properties to set
  */
class ConsensusSendToRequest () extends IConsensusSendToRequest {
  def this(properties: IConsensusSendToRequest) = this()
  /** ConsensusSendToRequest peerId. */
  @JSName("peerId")
  var peerId_ConsensusSendToRequest: Uint8Array = js.native
  /**
    * Converts this ConsensusSendToRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusSendToRequest")
@js.native
object ConsensusSendToRequest extends js.Object {
  /**
    * Creates a new ConsensusSendToRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSendToRequest instance
    */
  def create(): ConsensusSendToRequest = js.native
  def create(properties: IConsensusSendToRequest): ConsensusSendToRequest = js.native
  /**
    * Decodes a ConsensusSendToRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSendToRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusSendToRequest = js.native
  def decode(reader: Reader, length: Double): ConsensusSendToRequest = js.native
  def decode(reader: Uint8Array): ConsensusSendToRequest = js.native
  def decode(reader: Uint8Array, length: Double): ConsensusSendToRequest = js.native
  /**
    * Decodes a ConsensusSendToRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSendToRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusSendToRequest = js.native
  def decodeDelimited(reader: Uint8Array): ConsensusSendToRequest = js.native
  /**
    * Encodes the specified ConsensusSendToRequest message. Does not implicitly {@link ConsensusSendToRequest.verify|verify} messages.
    * @param message ConsensusSendToRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusSendToRequest): Writer = js.native
  def encode(message: IConsensusSendToRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusSendToRequest message, length delimited. Does not implicitly {@link ConsensusSendToRequest.verify|verify} messages.
    * @param message ConsensusSendToRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusSendToRequest): Writer = js.native
  def encodeDelimited(message: IConsensusSendToRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusSendToRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSendToRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusSendToRequest = js.native
  /**
    * Creates a plain object from a ConsensusSendToRequest message. Also converts values to other types if specified.
    * @param message ConsensusSendToRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusSendToRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusSendToRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusSendToRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

