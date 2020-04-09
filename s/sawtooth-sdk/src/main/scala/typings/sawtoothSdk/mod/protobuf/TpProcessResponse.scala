package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITpProcessResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.TpProcessResponse")
@js.native
/**
  * Constructs a new TpProcessResponse.
  * @param [properties] Properties to set
  */
class TpProcessResponse ()
  extends typings.sawtoothSdk.protobufMod.TpProcessResponse {
  def this(properties: ITpProcessResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.TpProcessResponse")
@js.native
object TpProcessResponse extends js.Object {
  /**
    * Creates a new TpProcessResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpProcessResponse instance
    */
  def create(): typings.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  def create(properties: ITpProcessResponse): typings.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  /**
    * Decodes a TpProcessResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpProcessResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  /**
    * Decodes a TpProcessResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpProcessResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  /**
    * Encodes the specified TpProcessResponse message. Does not implicitly {@link TpProcessResponse.verify|verify} messages.
    * @param message TpProcessResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpProcessResponse): Writer = js.native
  def encode(message: ITpProcessResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TpProcessResponse message, length delimited. Does not implicitly {@link TpProcessResponse.verify|verify} messages.
    * @param message TpProcessResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpProcessResponse): Writer = js.native
  def encodeDelimited(message: ITpProcessResponse, writer: Writer): Writer = js.native
  /**
    * Creates a TpProcessResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpProcessResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TpProcessResponse = js.native
  /**
    * Creates a plain object from a TpProcessResponse message. Also converts values to other types if specified.
    * @param message TpProcessResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.TpProcessResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpProcessResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TpProcessResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 3 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.TpProcessResponse.Status.INTERNAL_ERROR with Double = js.native
    /* 2 */ val INVALID_TRANSACTION: typings.sawtoothSdk.protobufMod.TpProcessResponse.Status.INVALID_TRANSACTION with Double = js.native
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpProcessResponse.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpProcessResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.TpProcessResponse.Status with Double] = js.native
  }
  
}

