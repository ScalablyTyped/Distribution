package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientTransactionListRequest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest")
@js.native
/**
  * Constructs a new ClientTransactionListRequest.
  * @param [properties] Properties to set
  */
class ClientTransactionListRequest ()
  extends typings.sawtoothSdk.protobufMod.ClientTransactionListRequest {
  def this(properties: IClientTransactionListRequest) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest")
@js.native
object ClientTransactionListRequest extends js.Object {
  /**
    * Creates a new ClientTransactionListRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientTransactionListRequest instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  def create(properties: IClientTransactionListRequest): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  /**
    * Decodes a ClientTransactionListRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientTransactionListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  /**
    * Decodes a ClientTransactionListRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientTransactionListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  /**
    * Encodes the specified ClientTransactionListRequest message. Does not implicitly {@link ClientTransactionListRequest.verify|verify} messages.
    * @param message ClientTransactionListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientTransactionListRequest): Writer = js.native
  def encode(message: IClientTransactionListRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientTransactionListRequest message, length delimited. Does not implicitly {@link ClientTransactionListRequest.verify|verify} messages.
    * @param message ClientTransactionListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientTransactionListRequest): Writer = js.native
  def encodeDelimited(message: IClientTransactionListRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ClientTransactionListRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientTransactionListRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  /**
    * Creates a plain object from a ClientTransactionListRequest message. Also converts values to other types if specified.
    * @param message ClientTransactionListRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientTransactionListRequest): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientTransactionListRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientTransactionListRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

