package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.TpUnregisterResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse")
@js.native
/**
  * Constructs a new TpUnregisterResponse.
  * @param [properties] Properties to set
  */
class TpUnregisterResponse ()
  extends StObject
     with ITpUnregisterResponse {
  def this(properties: ITpUnregisterResponse) = this()
  
  /** TpUnregisterResponse status. */
  @JSName("status")
  var status_TpUnregisterResponse: Status = js.native
  
  /**
    * Converts this TpUnregisterResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TpUnregisterResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with Status
    /* 2 */ val ERROR: typings.sawtoothSdk.protobufMod.TpUnregisterResponse.Status.ERROR & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpUnregisterResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpUnregisterResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new TpUnregisterResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpUnregisterResponse instance
    */
  inline def create(): TpUnregisterResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TpUnregisterResponse]
  inline def create(properties: ITpUnregisterResponse): TpUnregisterResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TpUnregisterResponse]
  
  /**
    * Decodes a TpUnregisterResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpUnregisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): TpUnregisterResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpUnregisterResponse]
  inline def decode(reader: Reader, length: Double): TpUnregisterResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpUnregisterResponse]
  inline def decode(reader: Uint8Array): TpUnregisterResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpUnregisterResponse]
  inline def decode(reader: Uint8Array, length: Double): TpUnregisterResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpUnregisterResponse]
  
  /**
    * Decodes a TpUnregisterResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpUnregisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): TpUnregisterResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpUnregisterResponse]
  inline def decodeDelimited(reader: Uint8Array): TpUnregisterResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpUnregisterResponse]
  
  /**
    * Encodes the specified TpUnregisterResponse message. Does not implicitly {@link TpUnregisterResponse.verify|verify} messages.
    * @param message TpUnregisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: ITpUnregisterResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITpUnregisterResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TpUnregisterResponse message, length delimited. Does not implicitly {@link TpUnregisterResponse.verify|verify} messages.
    * @param message TpUnregisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: ITpUnregisterResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITpUnregisterResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TpUnregisterResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpUnregisterResponse
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): TpUnregisterResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TpUnregisterResponse]
  
  /**
    * Creates a plain object from a TpUnregisterResponse message. Also converts values to other types if specified.
    * @param message TpUnregisterResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: TpUnregisterResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: TpUnregisterResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TpUnregisterResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
