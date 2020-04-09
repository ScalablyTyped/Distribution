package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientBlockListResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ClientBlockListResponse")
@js.native
/**
  * Constructs a new ClientBlockListResponse.
  * @param [properties] Properties to set
  */
class ClientBlockListResponse ()
  extends typings.sawtoothSdk.protobufMod.ClientBlockListResponse {
  def this(properties: IClientBlockListResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientBlockListResponse")
@js.native
object ClientBlockListResponse extends js.Object {
  /**
    * Creates a new ClientBlockListResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockListResponse instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  def create(properties: IClientBlockListResponse): typings.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  /**
    * Decodes a ClientBlockListResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  /**
    * Decodes a ClientBlockListResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  /**
    * Encodes the specified ClientBlockListResponse message. Does not implicitly {@link ClientBlockListResponse.verify|verify} messages.
    * @param message ClientBlockListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBlockListResponse): Writer = js.native
  def encode(message: IClientBlockListResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientBlockListResponse message, length delimited. Does not implicitly {@link ClientBlockListResponse.verify|verify} messages.
    * @param message ClientBlockListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBlockListResponse): Writer = js.native
  def encodeDelimited(message: IClientBlockListResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ClientBlockListResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockListResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientBlockListResponse = js.native
  /**
    * Creates a plain object from a ClientBlockListResponse message. Also converts values to other types if specified.
    * @param message ClientBlockListResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBlockListResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBlockListResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientBlockListResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.INTERNAL_ERROR with Double = js.native
    /* 8 */ val INVALID_ID: typings.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.INVALID_ID with Double = js.native
    /* 6 */ val INVALID_PAGING: typings.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.INVALID_PAGING with Double = js.native
    /* 7 */ val INVALID_SORT: typings.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.INVALID_SORT with Double = js.native
    /* 3 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.NOT_READY with Double = js.native
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.NO_RESOURCE with Double = js.native
    /* 4 */ val NO_ROOT: typings.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.NO_ROOT with Double = js.native
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ClientBlockListResponse.Status with Double] = js.native
  }
  
}

