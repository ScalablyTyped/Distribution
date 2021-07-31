package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITpStateDeleteResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TpStateDeleteResponse")
@js.native
/**
  * Constructs a new TpStateDeleteResponse.
  * @param [properties] Properties to set
  */
class TpStateDeleteResponse ()
  extends typings.sawtoothSdk.protobufMod.TpStateDeleteResponse {
  def this(properties: ITpStateDeleteResponse) = this()
}
/* static members */
object TpStateDeleteResponse {
  
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.TpStateDeleteResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.TpStateDeleteResponse.Status & Double] = js.native
    
    /* 2 */ val AUTHORIZATION_ERROR: typings.sawtoothSdk.protobufMod.TpStateDeleteResponse.Status.AUTHORIZATION_ERROR & Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpStateDeleteResponse.Status.OK & Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpStateDeleteResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new TpStateDeleteResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateDeleteResponse instance
    */
  @scala.inline
  def create(): typings.sawtoothSdk.protobufMod.TpStateDeleteResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.sawtoothSdk.protobufMod.TpStateDeleteResponse]
  @scala.inline
  def create(properties: ITpStateDeleteResponse): typings.sawtoothSdk.protobufMod.TpStateDeleteResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TpStateDeleteResponse]
  
  /**
    * Decodes a TpStateDeleteResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateDeleteResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TpStateDeleteResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TpStateDeleteResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TpStateDeleteResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.TpStateDeleteResponse]
  @scala.inline
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpStateDeleteResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TpStateDeleteResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TpStateDeleteResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.TpStateDeleteResponse]
  
  /**
    * Decodes a TpStateDeleteResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateDeleteResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TpStateDeleteResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TpStateDeleteResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpStateDeleteResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TpStateDeleteResponse]
  
  /**
    * Encodes the specified TpStateDeleteResponse message. Does not implicitly {@link TpStateDeleteResponse.verify|verify} messages.
    * @param message TpStateDeleteResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: ITpStateDeleteResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ITpStateDeleteResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TpStateDeleteResponse message, length delimited. Does not implicitly {@link TpStateDeleteResponse.verify|verify} messages.
    * @param message TpStateDeleteResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: ITpStateDeleteResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ITpStateDeleteResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TpStateDeleteResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateDeleteResponse
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TpStateDeleteResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TpStateDeleteResponse]
  
  /**
    * Creates a plain object from a TpStateDeleteResponse message. Also converts values to other types if specified.
    * @param message TpStateDeleteResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: typings.sawtoothSdk.protobufMod.TpStateDeleteResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: typings.sawtoothSdk.protobufMod.TpStateDeleteResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TpStateDeleteResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
