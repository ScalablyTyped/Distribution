package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.TpEventAddResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse")
@js.native
/**
  * Constructs a new TpEventAddResponse.
  * @param [properties] Properties to set
  */
class TpEventAddResponse ()
  extends StObject
     with ITpEventAddResponse {
  def this(properties: ITpEventAddResponse) = this()
  
  /** TpEventAddResponse status. */
  @JSName("status")
  var status_TpEventAddResponse: Status = js.native
  
  /**
    * Converts this TpEventAddResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TpEventAddResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with Status
    /* 2 */ val ERROR: typings.sawtoothSdk.protobufMod.TpEventAddResponse.Status.ERROR & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpEventAddResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpEventAddResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new TpEventAddResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpEventAddResponse instance
    */
  inline def create(): TpEventAddResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TpEventAddResponse]
  inline def create(properties: ITpEventAddResponse): TpEventAddResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TpEventAddResponse]
  
  /**
    * Decodes a TpEventAddResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpEventAddResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): TpEventAddResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpEventAddResponse]
  inline def decode(reader: Reader, length: Double): TpEventAddResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpEventAddResponse]
  inline def decode(reader: Uint8Array): TpEventAddResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpEventAddResponse]
  inline def decode(reader: Uint8Array, length: Double): TpEventAddResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpEventAddResponse]
  
  /**
    * Decodes a TpEventAddResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpEventAddResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): TpEventAddResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpEventAddResponse]
  inline def decodeDelimited(reader: Uint8Array): TpEventAddResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpEventAddResponse]
  
  /**
    * Encodes the specified TpEventAddResponse message. Does not implicitly {@link TpEventAddResponse.verify|verify} messages.
    * @param message TpEventAddResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: ITpEventAddResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITpEventAddResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TpEventAddResponse message, length delimited. Does not implicitly {@link TpEventAddResponse.verify|verify} messages.
    * @param message TpEventAddResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: ITpEventAddResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITpEventAddResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TpEventAddResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpEventAddResponse
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): TpEventAddResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TpEventAddResponse]
  
  /**
    * Creates a plain object from a TpEventAddResponse message. Also converts values to other types if specified.
    * @param message TpEventAddResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: TpEventAddResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: TpEventAddResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TpEventAddResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
