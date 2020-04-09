package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITpRegisterResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse")
@js.native
/**
  * Constructs a new TpRegisterResponse.
  * @param [properties] Properties to set
  */
class TpRegisterResponse ()
  extends typings.sawtoothSdk.protobufMod.TpRegisterResponse {
  def this(properties: ITpRegisterResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse")
@js.native
object TpRegisterResponse extends js.Object {
  /**
    * Creates a new TpRegisterResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpRegisterResponse instance
    */
  def create(): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  def create(properties: ITpRegisterResponse): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  /**
    * Decodes a TpRegisterResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  /**
    * Decodes a TpRegisterResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  /**
    * Encodes the specified TpRegisterResponse message. Does not implicitly {@link TpRegisterResponse.verify|verify} messages.
    * @param message TpRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpRegisterResponse): Writer = js.native
  def encode(message: ITpRegisterResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TpRegisterResponse message, length delimited. Does not implicitly {@link TpRegisterResponse.verify|verify} messages.
    * @param message TpRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpRegisterResponse): Writer = js.native
  def encodeDelimited(message: ITpRegisterResponse, writer: Writer): Writer = js.native
  /**
    * Creates a TpRegisterResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpRegisterResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  /**
    * Creates a plain object from a TpRegisterResponse message. Also converts values to other types if specified.
    * @param message TpRegisterResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.TpRegisterResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpRegisterResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TpRegisterResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val ERROR: typings.sawtoothSdk.protobufMod.TpRegisterResponse.Status.ERROR with Double = js.native
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpRegisterResponse.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpRegisterResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.TpRegisterResponse.Status with Double] = js.native
  }
  
}

