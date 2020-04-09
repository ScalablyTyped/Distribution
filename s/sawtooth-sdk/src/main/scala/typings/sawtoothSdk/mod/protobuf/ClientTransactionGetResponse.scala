package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientTransactionGetResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse")
@js.native
/**
  * Constructs a new ClientTransactionGetResponse.
  * @param [properties] Properties to set
  */
class ClientTransactionGetResponse ()
  extends typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse {
  def this(properties: IClientTransactionGetResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse")
@js.native
object ClientTransactionGetResponse extends js.Object {
  /**
    * Creates a new ClientTransactionGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientTransactionGetResponse instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  def create(properties: IClientTransactionGetResponse): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  /**
    * Decodes a ClientTransactionGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientTransactionGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  /**
    * Decodes a ClientTransactionGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientTransactionGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  /**
    * Encodes the specified ClientTransactionGetResponse message. Does not implicitly {@link ClientTransactionGetResponse.verify|verify} messages.
    * @param message ClientTransactionGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientTransactionGetResponse): Writer = js.native
  def encode(message: IClientTransactionGetResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientTransactionGetResponse message, length delimited. Does not implicitly {@link ClientTransactionGetResponse.verify|verify} messages.
    * @param message ClientTransactionGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientTransactionGetResponse): Writer = js.native
  def encodeDelimited(message: IClientTransactionGetResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ClientTransactionGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientTransactionGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  /**
    * Creates a plain object from a ClientTransactionGetResponse message. Also converts values to other types if specified.
    * @param message ClientTransactionGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientTransactionGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.INTERNAL_ERROR with Double = js.native
    /* 8 */ val INVALID_ID: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.INVALID_ID with Double = js.native
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.NO_RESOURCE with Double = js.native
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status with Double] = js.native
  }
  
}

