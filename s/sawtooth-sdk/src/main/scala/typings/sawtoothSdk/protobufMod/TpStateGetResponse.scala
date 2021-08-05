package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.TpStateGetResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse")
@js.native
/**
  * Constructs a new TpStateGetResponse.
  * @param [properties] Properties to set
  */
class TpStateGetResponse ()
  extends StObject
     with ITpStateGetResponse {
  def this(properties: ITpStateGetResponse) = this()
  
  /** TpStateGetResponse entries. */
  @JSName("entries")
  var entries_TpStateGetResponse: js.Array[ITpStateEntry] = js.native
  
  /** TpStateGetResponse status. */
  @JSName("status")
  var status_TpStateGetResponse: Status = js.native
  
  /**
    * Converts this TpStateGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TpStateGetResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "TpStateGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait AUTHORIZATION_ERROR
      extends StObject
         with Status
    /* 2 */ val AUTHORIZATION_ERROR: typings.sawtoothSdk.protobufMod.TpStateGetResponse.Status.AUTHORIZATION_ERROR & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpStateGetResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpStateGetResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new TpStateGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateGetResponse instance
    */
  inline def create(): TpStateGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TpStateGetResponse]
  inline def create(properties: ITpStateGetResponse): TpStateGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TpStateGetResponse]
  
  /**
    * Decodes a TpStateGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): TpStateGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpStateGetResponse]
  inline def decode(reader: Reader, length: Double): TpStateGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpStateGetResponse]
  inline def decode(reader: Uint8Array): TpStateGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpStateGetResponse]
  inline def decode(reader: Uint8Array, length: Double): TpStateGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpStateGetResponse]
  
  /**
    * Decodes a TpStateGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): TpStateGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpStateGetResponse]
  inline def decodeDelimited(reader: Uint8Array): TpStateGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpStateGetResponse]
  
  /**
    * Encodes the specified TpStateGetResponse message. Does not implicitly {@link TpStateGetResponse.verify|verify} messages.
    * @param message TpStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: ITpStateGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITpStateGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TpStateGetResponse message, length delimited. Does not implicitly {@link TpStateGetResponse.verify|verify} messages.
    * @param message TpStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: ITpStateGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITpStateGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TpStateGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateGetResponse
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): TpStateGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TpStateGetResponse]
  
  /**
    * Creates a plain object from a TpStateGetResponse message. Also converts values to other types if specified.
    * @param message TpStateGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: TpStateGetResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: TpStateGetResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TpStateGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
