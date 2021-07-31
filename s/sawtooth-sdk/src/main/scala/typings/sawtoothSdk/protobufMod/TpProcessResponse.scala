package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.TpProcessResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpProcessResponse")
@js.native
/**
  * Constructs a new TpProcessResponse.
  * @param [properties] Properties to set
  */
class TpProcessResponse ()
  extends StObject
     with ITpProcessResponse {
  def this(properties: ITpProcessResponse) = this()
  
  /** TpProcessResponse extendedData. */
  @JSName("extendedData")
  var extendedData_TpProcessResponse: Uint8Array = js.native
  
  /** TpProcessResponse message. */
  @JSName("message")
  var message_TpProcessResponse: String = js.native
  
  /** TpProcessResponse status. */
  @JSName("status")
  var status_TpProcessResponse: Status = js.native
  
  /**
    * Converts this TpProcessResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TpProcessResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "TpProcessResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends StObject
         with Status
    /* 3 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.TpProcessResponse.Status.INTERNAL_ERROR & Double = js.native
    
    @js.native
    sealed trait INVALID_TRANSACTION
      extends StObject
         with Status
    /* 2 */ val INVALID_TRANSACTION: typings.sawtoothSdk.protobufMod.TpProcessResponse.Status.INVALID_TRANSACTION & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpProcessResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpProcessResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new TpProcessResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpProcessResponse instance
    */
  @scala.inline
  def create(): TpProcessResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TpProcessResponse]
  @scala.inline
  def create(properties: ITpProcessResponse): TpProcessResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TpProcessResponse]
  
  /**
    * Decodes a TpProcessResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpProcessResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): TpProcessResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpProcessResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): TpProcessResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpProcessResponse]
  @scala.inline
  def decode(reader: Uint8Array): TpProcessResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpProcessResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): TpProcessResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpProcessResponse]
  
  /**
    * Decodes a TpProcessResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpProcessResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): TpProcessResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpProcessResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): TpProcessResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpProcessResponse]
  
  /**
    * Encodes the specified TpProcessResponse message. Does not implicitly {@link TpProcessResponse.verify|verify} messages.
    * @param message TpProcessResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: ITpProcessResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ITpProcessResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TpProcessResponse message, length delimited. Does not implicitly {@link TpProcessResponse.verify|verify} messages.
    * @param message TpProcessResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: ITpProcessResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ITpProcessResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TpProcessResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpProcessResponse
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): TpProcessResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TpProcessResponse]
  
  /**
    * Creates a plain object from a TpProcessResponse message. Also converts values to other types if specified.
    * @param message TpProcessResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: TpProcessResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: TpProcessResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TpProcessResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
