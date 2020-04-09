package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientBatchGetResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ClientBatchGetResponse")
@js.native
/**
  * Constructs a new ClientBatchGetResponse.
  * @param [properties] Properties to set
  */
class ClientBatchGetResponse ()
  extends typings.sawtoothSdk.protobufMod.ClientBatchGetResponse {
  def this(properties: IClientBatchGetResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientBatchGetResponse")
@js.native
object ClientBatchGetResponse extends js.Object {
  /**
    * Creates a new ClientBatchGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchGetResponse instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  def create(properties: IClientBatchGetResponse): typings.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  /**
    * Decodes a ClientBatchGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  /**
    * Decodes a ClientBatchGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  /**
    * Encodes the specified ClientBatchGetResponse message. Does not implicitly {@link ClientBatchGetResponse.verify|verify} messages.
    * @param message ClientBatchGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBatchGetResponse): Writer = js.native
  def encode(message: IClientBatchGetResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientBatchGetResponse message, length delimited. Does not implicitly {@link ClientBatchGetResponse.verify|verify} messages.
    * @param message ClientBatchGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBatchGetResponse): Writer = js.native
  def encodeDelimited(message: IClientBatchGetResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ClientBatchGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientBatchGetResponse = js.native
  /**
    * Creates a plain object from a ClientBatchGetResponse message. Also converts values to other types if specified.
    * @param message ClientBatchGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBatchGetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBatchGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientBatchGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status.INTERNAL_ERROR with Double = js.native
    /* 8 */ val INVALID_ID: typings.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status.INVALID_ID with Double = js.native
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status.NO_RESOURCE with Double = js.native
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status with Double] = js.native
  }
  
}

