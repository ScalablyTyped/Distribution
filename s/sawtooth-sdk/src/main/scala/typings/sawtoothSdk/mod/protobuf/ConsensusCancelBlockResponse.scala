package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusCancelBlockResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockResponse")
@js.native
/**
  * Constructs a new ConsensusCancelBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusCancelBlockResponse ()
  extends typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse {
  def this(properties: IConsensusCancelBlockResponse) = this()
}
/* static members */
object ConsensusCancelBlockResponse {
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status & Double] = js.native
    
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.BAD_REQUEST & Double = js.native
    
    /* 5 */ val INVALID_STATE: typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.INVALID_STATE & Double = js.native
    
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.NOT_READY & Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.OK & Double = js.native
    
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.SERVICE_ERROR & Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new ConsensusCancelBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCancelBlockResponse instance
    */
  @scala.inline
  def create(): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse]
  @scala.inline
  def create(properties: IConsensusCancelBlockResponse): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse]
  
  /**
    * Decodes a ConsensusCancelBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCancelBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse]
  @scala.inline
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse]
  
  /**
    * Decodes a ConsensusCancelBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCancelBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse]
  
  /**
    * Encodes the specified ConsensusCancelBlockResponse message. Does not implicitly {@link ConsensusCancelBlockResponse.verify|verify} messages.
    * @param message ConsensusCancelBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IConsensusCancelBlockResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IConsensusCancelBlockResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusCancelBlockResponse message, length delimited. Does not implicitly {@link ConsensusCancelBlockResponse.verify|verify} messages.
    * @param message ConsensusCancelBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IConsensusCancelBlockResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IConsensusCancelBlockResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusCancelBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCancelBlockResponse
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse]
  
  /**
    * Creates a plain object from a ConsensusCancelBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusCancelBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusCancelBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
