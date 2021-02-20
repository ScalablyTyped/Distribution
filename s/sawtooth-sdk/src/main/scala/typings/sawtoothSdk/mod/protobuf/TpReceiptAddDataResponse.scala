package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITpReceiptAddDataResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object TpReceiptAddDataResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status with Double] = js.native
    
    /* 2 */ val ERROR: typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status.ERROR with Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new TpReceiptAddDataResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpReceiptAddDataResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.create")
  @js.native
  def create(properties: ITpReceiptAddDataResponse): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  
  /**
    * Decodes a TpReceiptAddDataResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpReceiptAddDataResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  
  /**
    * Decodes a TpReceiptAddDataResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpReceiptAddDataResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  
  /**
    * Encodes the specified TpReceiptAddDataResponse message. Does not implicitly {@link TpReceiptAddDataResponse.verify|verify} messages.
    * @param message TpReceiptAddDataResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.encode")
  @js.native
  def encode(message: ITpReceiptAddDataResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.encode")
  @js.native
  def encode(message: ITpReceiptAddDataResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpReceiptAddDataResponse message, length delimited. Does not implicitly {@link TpReceiptAddDataResponse.verify|verify} messages.
    * @param message TpReceiptAddDataResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpReceiptAddDataResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpReceiptAddDataResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpReceiptAddDataResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpReceiptAddDataResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = js.native
  
  /**
    * Creates a plain object from a TpReceiptAddDataResponse message. Also converts values to other types if specified.
    * @param message TpReceiptAddDataResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpReceiptAddDataResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.TpReceiptAddDataResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
