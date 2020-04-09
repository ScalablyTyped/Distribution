package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientPeersGetResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse")
@js.native
/**
  * Constructs a new ClientPeersGetResponse.
  * @param [properties] Properties to set
  */
class ClientPeersGetResponse ()
  extends typings.sawtoothSdk.protobufMod.ClientPeersGetResponse {
  def this(properties: IClientPeersGetResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientPeersGetResponse")
@js.native
object ClientPeersGetResponse extends js.Object {
  /**
    * Creates a new ClientPeersGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientPeersGetResponse instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  def create(properties: IClientPeersGetResponse): typings.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  /**
    * Decodes a ClientPeersGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientPeersGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  /**
    * Decodes a ClientPeersGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientPeersGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  /**
    * Encodes the specified ClientPeersGetResponse message. Does not implicitly {@link ClientPeersGetResponse.verify|verify} messages.
    * @param message ClientPeersGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientPeersGetResponse): Writer = js.native
  def encode(message: IClientPeersGetResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientPeersGetResponse message, length delimited. Does not implicitly {@link ClientPeersGetResponse.verify|verify} messages.
    * @param message ClientPeersGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientPeersGetResponse): Writer = js.native
  def encodeDelimited(message: IClientPeersGetResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ClientPeersGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientPeersGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientPeersGetResponse = js.native
  /**
    * Creates a plain object from a ClientPeersGetResponse message. Also converts values to other types if specified.
    * @param message ClientPeersGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientPeersGetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientPeersGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientPeersGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val ERROR: typings.sawtoothSdk.protobufMod.ClientPeersGetResponse.Status.ERROR with Double = js.native
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientPeersGetResponse.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientPeersGetResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ClientPeersGetResponse.Status with Double] = js.native
  }
  
}

