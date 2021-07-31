package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientBatchStatusResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusResponse")
@js.native
/**
  * Constructs a new ClientBatchStatusResponse.
  * @param [properties] Properties to set
  */
class ClientBatchStatusResponse ()
  extends typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse {
  def this(properties: IClientBatchStatusResponse) = this()
}
/* static members */
object ClientBatchStatusResponse {
  
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status & Double] = js.native
    
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status.INTERNAL_ERROR & Double = js.native
    
    /* 8 */ val INVALID_ID: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status.INVALID_ID & Double = js.native
    
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status.NO_RESOURCE & Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status.OK & Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new ClientBatchStatusResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchStatusResponse instance
    */
  @scala.inline
  def create(): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse]
  @scala.inline
  def create(properties: IClientBatchStatusResponse): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse]
  
  /**
    * Decodes a ClientBatchStatusResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchStatusResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse]
  @scala.inline
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse]
  
  /**
    * Decodes a ClientBatchStatusResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchStatusResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse]
  
  /**
    * Encodes the specified ClientBatchStatusResponse message. Does not implicitly {@link ClientBatchStatusResponse.verify|verify} messages.
    * @param message ClientBatchStatusResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IClientBatchStatusResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IClientBatchStatusResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientBatchStatusResponse message, length delimited. Does not implicitly {@link ClientBatchStatusResponse.verify|verify} messages.
    * @param message ClientBatchStatusResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IClientBatchStatusResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IClientBatchStatusResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientBatchStatusResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchStatusResponse
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse]
  
  /**
    * Creates a plain object from a ClientBatchStatusResponse message. Also converts values to other types if specified.
    * @param message ClientBatchStatusResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientBatchStatusResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
