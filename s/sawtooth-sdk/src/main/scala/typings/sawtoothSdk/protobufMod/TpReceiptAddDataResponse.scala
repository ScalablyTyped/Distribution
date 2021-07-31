package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataResponse")
@js.native
/**
  * Constructs a new TpReceiptAddDataResponse.
  * @param [properties] Properties to set
  */
class TpReceiptAddDataResponse ()
  extends StObject
     with ITpReceiptAddDataResponse {
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
object TpReceiptAddDataResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "TpReceiptAddDataResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with Status
    /* 2 */ val ERROR: typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status.ERROR & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new TpReceiptAddDataResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpReceiptAddDataResponse instance
    */
  @scala.inline
  def create(): TpReceiptAddDataResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TpReceiptAddDataResponse]
  @scala.inline
  def create(properties: ITpReceiptAddDataResponse): TpReceiptAddDataResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TpReceiptAddDataResponse]
  
  /**
    * Decodes a TpReceiptAddDataResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpReceiptAddDataResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): TpReceiptAddDataResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpReceiptAddDataResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): TpReceiptAddDataResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpReceiptAddDataResponse]
  @scala.inline
  def decode(reader: Uint8Array): TpReceiptAddDataResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpReceiptAddDataResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): TpReceiptAddDataResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpReceiptAddDataResponse]
  
  /**
    * Decodes a TpReceiptAddDataResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpReceiptAddDataResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): TpReceiptAddDataResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpReceiptAddDataResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): TpReceiptAddDataResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpReceiptAddDataResponse]
  
  /**
    * Encodes the specified TpReceiptAddDataResponse message. Does not implicitly {@link TpReceiptAddDataResponse.verify|verify} messages.
    * @param message TpReceiptAddDataResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: ITpReceiptAddDataResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ITpReceiptAddDataResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TpReceiptAddDataResponse message, length delimited. Does not implicitly {@link TpReceiptAddDataResponse.verify|verify} messages.
    * @param message TpReceiptAddDataResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: ITpReceiptAddDataResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ITpReceiptAddDataResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TpReceiptAddDataResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpReceiptAddDataResponse
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): TpReceiptAddDataResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TpReceiptAddDataResponse]
  
  /**
    * Creates a plain object from a TpReceiptAddDataResponse message. Also converts values to other types if specified.
    * @param message TpReceiptAddDataResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: TpReceiptAddDataResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: TpReceiptAddDataResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TpReceiptAddDataResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
