package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataResponse")
@js.native
/**
  * Constructs a new TpReceiptAddDataResponse.
  * @param [properties] Properties to set
  */
class TpReceiptAddDataResponse () extends ITpReceiptAddDataResponse {
  def this(properties: ITpReceiptAddDataResponse) = this()
  /** TpReceiptAddDataResponse status. */
  @JSName("status")
  var status_TpReceiptAddDataResponse: Status = js.native
  /**
    * Converts this TpReceiptAddDataResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataResponse")
@js.native
object TpReceiptAddDataResponse extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  /**
    * Creates a new TpReceiptAddDataResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpReceiptAddDataResponse instance
    */
  def create(): TpReceiptAddDataResponse = js.native
  def create(properties: ITpReceiptAddDataResponse): TpReceiptAddDataResponse = js.native
  /**
    * Decodes a TpReceiptAddDataResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpReceiptAddDataResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TpReceiptAddDataResponse = js.native
  def decode(reader: Reader, length: Double): TpReceiptAddDataResponse = js.native
  def decode(reader: Uint8Array): TpReceiptAddDataResponse = js.native
  def decode(reader: Uint8Array, length: Double): TpReceiptAddDataResponse = js.native
  /**
    * Decodes a TpReceiptAddDataResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpReceiptAddDataResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TpReceiptAddDataResponse = js.native
  def decodeDelimited(reader: Uint8Array): TpReceiptAddDataResponse = js.native
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
  def fromObject(`object`: StringDictionary[js.Any]): TpReceiptAddDataResponse = js.native
  /**
    * Creates a plain object from a TpReceiptAddDataResponse message. Also converts values to other types if specified.
    * @param message TpReceiptAddDataResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TpReceiptAddDataResponse): StringDictionary[js.Any] = js.native
  def toObject(message: TpReceiptAddDataResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TpReceiptAddDataResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    @js.native
    sealed trait ERROR extends Status
    
    @js.native
    sealed trait OK extends Status
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    /* 2 */ @js.native
    object ERROR extends TopLevel[ERROR with Double]
    
    /* 1 */ @js.native
    object OK extends TopLevel[OK with Double]
    
    /* 0 */ @js.native
    object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
    
  }
  
}

