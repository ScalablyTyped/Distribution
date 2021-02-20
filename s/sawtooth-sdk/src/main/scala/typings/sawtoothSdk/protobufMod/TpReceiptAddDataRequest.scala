package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest")
@js.native
/**
  * Constructs a new TpReceiptAddDataRequest.
  * @param [properties] Properties to set
  */
class TpReceiptAddDataRequest () extends ITpReceiptAddDataRequest {
  def this(properties: ITpReceiptAddDataRequest) = this()
  
  /** TpReceiptAddDataRequest contextId. */
  @JSName("contextId")
  var contextId_TpReceiptAddDataRequest: String = js.native
  
  /** TpReceiptAddDataRequest data. */
  @JSName("data")
  var data_TpReceiptAddDataRequest: Uint8Array = js.native
  
  /**
    * Converts this TpReceiptAddDataRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TpReceiptAddDataRequest {
  
  /**
    * Creates a new TpReceiptAddDataRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpReceiptAddDataRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest.create")
  @js.native
  def create(): TpReceiptAddDataRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest.create")
  @js.native
  def create(properties: ITpReceiptAddDataRequest): TpReceiptAddDataRequest = js.native
  
  /**
    * Decodes a TpReceiptAddDataRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpReceiptAddDataRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest.decode")
  @js.native
  def decode(reader: Reader): TpReceiptAddDataRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): TpReceiptAddDataRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest.decode")
  @js.native
  def decode(reader: Uint8Array): TpReceiptAddDataRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): TpReceiptAddDataRequest = js.native
  
  /**
    * Decodes a TpReceiptAddDataRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpReceiptAddDataRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TpReceiptAddDataRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): TpReceiptAddDataRequest = js.native
  
  /**
    * Encodes the specified TpReceiptAddDataRequest message. Does not implicitly {@link TpReceiptAddDataRequest.verify|verify} messages.
    * @param message TpReceiptAddDataRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest.encode")
  @js.native
  def encode(message: ITpReceiptAddDataRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest.encode")
  @js.native
  def encode(message: ITpReceiptAddDataRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpReceiptAddDataRequest message, length delimited. Does not implicitly {@link TpReceiptAddDataRequest.verify|verify} messages.
    * @param message TpReceiptAddDataRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpReceiptAddDataRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpReceiptAddDataRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpReceiptAddDataRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpReceiptAddDataRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TpReceiptAddDataRequest = js.native
  
  /**
    * Creates a plain object from a TpReceiptAddDataRequest message. Also converts values to other types if specified.
    * @param message TpReceiptAddDataRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest.toObject")
  @js.native
  def toObject(message: TpReceiptAddDataRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest.toObject")
  @js.native
  def toObject(message: TpReceiptAddDataRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpReceiptAddDataRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
