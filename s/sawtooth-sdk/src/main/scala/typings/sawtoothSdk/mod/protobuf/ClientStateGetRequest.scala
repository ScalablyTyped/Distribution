package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientStateGetRequest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ClientStateGetRequest")
@js.native
/**
  * Constructs a new ClientStateGetRequest.
  * @param [properties] Properties to set
  */
class ClientStateGetRequest ()
  extends typings.sawtoothSdk.protobufMod.ClientStateGetRequest {
  def this(properties: IClientStateGetRequest) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientStateGetRequest")
@js.native
object ClientStateGetRequest extends js.Object {
  /**
    * Creates a new ClientStateGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStateGetRequest instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ClientStateGetRequest = js.native
  def create(properties: IClientStateGetRequest): typings.sawtoothSdk.protobufMod.ClientStateGetRequest = js.native
  /**
    * Decodes a ClientStateGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStateGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientStateGetRequest = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientStateGetRequest = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientStateGetRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientStateGetRequest = js.native
  /**
    * Decodes a ClientStateGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStateGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientStateGetRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientStateGetRequest = js.native
  /**
    * Encodes the specified ClientStateGetRequest message. Does not implicitly {@link ClientStateGetRequest.verify|verify} messages.
    * @param message ClientStateGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientStateGetRequest): Writer = js.native
  def encode(message: IClientStateGetRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientStateGetRequest message, length delimited. Does not implicitly {@link ClientStateGetRequest.verify|verify} messages.
    * @param message ClientStateGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientStateGetRequest): Writer = js.native
  def encodeDelimited(message: IClientStateGetRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ClientStateGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStateGetRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientStateGetRequest = js.native
  /**
    * Creates a plain object from a ClientStateGetRequest message. Also converts values to other types if specified.
    * @param message ClientStateGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientStateGetRequest): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientStateGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientStateGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

