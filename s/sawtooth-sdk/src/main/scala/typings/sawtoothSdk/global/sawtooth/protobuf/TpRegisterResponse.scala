package typings.sawtoothSdk.global.sawtooth.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITpRegisterResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sawtooth.protobuf.TpRegisterResponse")
@js.native
/**
  * Constructs a new TpRegisterResponse.
  * @param [properties] Properties to set
  */
open class TpRegisterResponse ()
  extends typings.sawtoothSdk.mod.protobuf.TpRegisterResponse {
  def this(properties: ITpRegisterResponse) = this()
}
/* static members */
object TpRegisterResponse {
  
  @JSGlobal("sawtooth.protobuf.TpRegisterResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /** Status enum. */
  @JSGlobal("sawtooth.protobuf.TpRegisterResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.TpRegisterResponse.Status & Double] = js.native
    
    /* 2 */ val ERROR: typings.sawtoothSdk.protobufMod.TpRegisterResponse.Status.ERROR & Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpRegisterResponse.Status.OK & Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpRegisterResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new TpRegisterResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpRegisterResponse instance
    */
  inline def create(): typings.sawtoothSdk.protobufMod.TpRegisterResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.sawtoothSdk.protobufMod.TpRegisterResponse]
  inline def create(properties: ITpRegisterResponse): typings.sawtoothSdk.protobufMod.TpRegisterResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TpRegisterResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.sawtoothSdk.protobufMod.TpRegisterResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TpRegisterResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TpRegisterResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.TpRegisterResponse]
  /**
    * Decodes a TpRegisterResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TpRegisterResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TpRegisterResponse]
  inline def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TpRegisterResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.TpRegisterResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.sawtoothSdk.protobufMod.TpRegisterResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TpRegisterResponse]
  /**
    * Decodes a TpRegisterResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TpRegisterResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TpRegisterResponse]
  
  /**
    * Encodes the specified TpRegisterResponse message. Does not implicitly {@link TpRegisterResponse.verify|verify} messages.
    * @param message TpRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: ITpRegisterResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITpRegisterResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TpRegisterResponse message, length delimited. Does not implicitly {@link TpRegisterResponse.verify|verify} messages.
    * @param message TpRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: ITpRegisterResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITpRegisterResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TpRegisterResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpRegisterResponse
    */
  inline def fromObject(`object`: StringDictionary[Any]): typings.sawtoothSdk.protobufMod.TpRegisterResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TpRegisterResponse]
  
  /**
    * Creates a plain object from a TpRegisterResponse message. Also converts values to other types if specified.
    * @param message TpRegisterResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typings.sawtoothSdk.protobufMod.TpRegisterResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: typings.sawtoothSdk.protobufMod.TpRegisterResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a TpRegisterResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
