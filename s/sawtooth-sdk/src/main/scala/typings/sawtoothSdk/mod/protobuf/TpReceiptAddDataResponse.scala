package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITpReceiptAddDataResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse")
@js.native
/**
  * Constructs a new TpReceiptAddDataResponse.
  * @param [properties] Properties to set
  */
class TpReceiptAddDataResponse ()
  extends typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse {
  def this(properties: ITpReceiptAddDataResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse")
@js.native
object TpReceiptAddDataResponse extends js.Object {
  /**
    * Creates a new TpReceiptAddDataResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpReceiptAddDataResponse instance
    */
  def create(): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  def create(properties: ITpReceiptAddDataResponse): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  /**
    * Decodes a TpReceiptAddDataResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpReceiptAddDataResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  /**
    * Decodes a TpReceiptAddDataResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpReceiptAddDataResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  /**
    * Encodes the specified TpReceiptAddDataResponse message. Does not implicitly {@link TpReceiptAddDataResponse.verify|verify} messages.
    * @param message TpReceiptAddDataResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpReceiptAddDataResponse): Writer = js.native
  def encode(message: ITpReceiptAddDataResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TpReceiptAddDataResponse message, length delimited. Does not implicitly {@link TpReceiptAddDataResponse.verify|verify} messages.
    * @param message TpReceiptAddDataResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpReceiptAddDataResponse): Writer = js.native
  def encodeDelimited(message: ITpReceiptAddDataResponse, writer: Writer): Writer = js.native
  /**
    * Creates a TpReceiptAddDataResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpReceiptAddDataResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  /**
    * Creates a plain object from a TpReceiptAddDataResponse message. Also converts values to other types if specified.
    * @param message TpReceiptAddDataResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TpReceiptAddDataResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val ERROR: typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status.ERROR with Double = js.native
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status with Double] = js.native
  }
  
}

