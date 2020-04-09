package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientBatchStatusResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusResponse")
@js.native
/**
  * Constructs a new ClientBatchStatusResponse.
  * @param [properties] Properties to set
  */
class ClientBatchStatusResponse ()
  extends typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse {
  def this(properties: IClientBatchStatusResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusResponse")
@js.native
object ClientBatchStatusResponse extends js.Object {
  /**
    * Creates a new ClientBatchStatusResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchStatusResponse instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = js.native
  def create(properties: IClientBatchStatusResponse): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = js.native
  /**
    * Decodes a ClientBatchStatusResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchStatusResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = js.native
  /**
    * Decodes a ClientBatchStatusResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchStatusResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = js.native
  /**
    * Encodes the specified ClientBatchStatusResponse message. Does not implicitly {@link ClientBatchStatusResponse.verify|verify} messages.
    * @param message ClientBatchStatusResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBatchStatusResponse): Writer = js.native
  def encode(message: IClientBatchStatusResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientBatchStatusResponse message, length delimited. Does not implicitly {@link ClientBatchStatusResponse.verify|verify} messages.
    * @param message ClientBatchStatusResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBatchStatusResponse): Writer = js.native
  def encodeDelimited(message: IClientBatchStatusResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ClientBatchStatusResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchStatusResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = js.native
  /**
    * Creates a plain object from a ClientBatchStatusResponse message. Also converts values to other types if specified.
    * @param message ClientBatchStatusResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientBatchStatusResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status.INTERNAL_ERROR with Double = js.native
    /* 8 */ val INVALID_ID: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status.INVALID_ID with Double = js.native
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status.NO_RESOURCE with Double = js.native
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status with Double] = js.native
  }
  
}

