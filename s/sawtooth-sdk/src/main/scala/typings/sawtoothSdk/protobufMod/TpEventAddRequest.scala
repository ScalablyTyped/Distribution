package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest")
@js.native
/**
  * Constructs a new TpEventAddRequest.
  * @param [properties] Properties to set
  */
class TpEventAddRequest ()
  extends StObject
     with ITpEventAddRequest {
  def this(properties: ITpEventAddRequest) = this()
  
  /** TpEventAddRequest contextId. */
  @JSName("contextId")
  var contextId_TpEventAddRequest: String = js.native
  
  /**
    * Converts this TpEventAddRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TpEventAddRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TpEventAddRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpEventAddRequest instance
    */
  @scala.inline
  def create(): TpEventAddRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TpEventAddRequest]
  @scala.inline
  def create(properties: ITpEventAddRequest): TpEventAddRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TpEventAddRequest]
  
  /**
    * Decodes a TpEventAddRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpEventAddRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): TpEventAddRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpEventAddRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): TpEventAddRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpEventAddRequest]
  @scala.inline
  def decode(reader: Uint8Array): TpEventAddRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpEventAddRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): TpEventAddRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpEventAddRequest]
  
  /**
    * Decodes a TpEventAddRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpEventAddRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): TpEventAddRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpEventAddRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): TpEventAddRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpEventAddRequest]
  
  /**
    * Encodes the specified TpEventAddRequest message. Does not implicitly {@link TpEventAddRequest.verify|verify} messages.
    * @param message TpEventAddRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: ITpEventAddRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ITpEventAddRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TpEventAddRequest message, length delimited. Does not implicitly {@link TpEventAddRequest.verify|verify} messages.
    * @param message TpEventAddRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: ITpEventAddRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ITpEventAddRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TpEventAddRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpEventAddRequest
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): TpEventAddRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TpEventAddRequest]
  
  /**
    * Creates a plain object from a TpEventAddRequest message. Also converts values to other types if specified.
    * @param message TpEventAddRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: TpEventAddRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: TpEventAddRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TpEventAddRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
