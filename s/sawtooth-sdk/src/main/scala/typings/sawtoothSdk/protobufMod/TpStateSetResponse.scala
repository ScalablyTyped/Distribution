package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.TpStateSetResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse")
@js.native
/**
  * Constructs a new TpStateSetResponse.
  * @param [properties] Properties to set
  */
class TpStateSetResponse ()
  extends StObject
     with ITpStateSetResponse {
  def this(properties: ITpStateSetResponse) = this()
  
  /** TpStateSetResponse addresses. */
  @JSName("addresses")
  var addresses_TpStateSetResponse: js.Array[String] = js.native
  
  /** TpStateSetResponse status. */
  @JSName("status")
  var status_TpStateSetResponse: Status = js.native
  
  /**
    * Converts this TpStateSetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TpStateSetResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "TpStateSetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait AUTHORIZATION_ERROR
      extends StObject
         with Status
    /* 2 */ val AUTHORIZATION_ERROR: typings.sawtoothSdk.protobufMod.TpStateSetResponse.Status.AUTHORIZATION_ERROR & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpStateSetResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpStateSetResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new TpStateSetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateSetResponse instance
    */
  @scala.inline
  def create(): TpStateSetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TpStateSetResponse]
  @scala.inline
  def create(properties: ITpStateSetResponse): TpStateSetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TpStateSetResponse]
  
  /**
    * Decodes a TpStateSetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateSetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): TpStateSetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpStateSetResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): TpStateSetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpStateSetResponse]
  @scala.inline
  def decode(reader: Uint8Array): TpStateSetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpStateSetResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): TpStateSetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpStateSetResponse]
  
  /**
    * Decodes a TpStateSetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateSetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): TpStateSetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpStateSetResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): TpStateSetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpStateSetResponse]
  
  /**
    * Encodes the specified TpStateSetResponse message. Does not implicitly {@link TpStateSetResponse.verify|verify} messages.
    * @param message TpStateSetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: ITpStateSetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ITpStateSetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TpStateSetResponse message, length delimited. Does not implicitly {@link TpStateSetResponse.verify|verify} messages.
    * @param message TpStateSetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: ITpStateSetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ITpStateSetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TpStateSetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateSetResponse
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): TpStateSetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TpStateSetResponse]
  
  /**
    * Creates a plain object from a TpStateSetResponse message. Also converts values to other types if specified.
    * @param message TpStateSetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: TpStateSetResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: TpStateSetResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TpStateSetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
