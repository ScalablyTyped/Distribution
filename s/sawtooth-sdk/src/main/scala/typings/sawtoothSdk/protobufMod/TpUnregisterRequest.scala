package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpUnregisterRequest")
@js.native
/**
  * Constructs a new TpUnregisterRequest.
  * @param [properties] Properties to set
  */
class TpUnregisterRequest ()
  extends StObject
     with ITpUnregisterRequest {
  def this(properties: ITpUnregisterRequest) = this()
  
  /**
    * Converts this TpUnregisterRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TpUnregisterRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "TpUnregisterRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TpUnregisterRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpUnregisterRequest instance
    */
  inline def create(): TpUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TpUnregisterRequest]
  inline def create(properties: ITpUnregisterRequest): TpUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TpUnregisterRequest]
  
  /**
    * Decodes a TpUnregisterRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpUnregisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): TpUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpUnregisterRequest]
  inline def decode(reader: Reader, length: Double): TpUnregisterRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpUnregisterRequest]
  inline def decode(reader: Uint8Array): TpUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpUnregisterRequest]
  inline def decode(reader: Uint8Array, length: Double): TpUnregisterRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpUnregisterRequest]
  
  /**
    * Decodes a TpUnregisterRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpUnregisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): TpUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpUnregisterRequest]
  inline def decodeDelimited(reader: Uint8Array): TpUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpUnregisterRequest]
  
  /**
    * Encodes the specified TpUnregisterRequest message. Does not implicitly {@link TpUnregisterRequest.verify|verify} messages.
    * @param message TpUnregisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: ITpUnregisterRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITpUnregisterRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TpUnregisterRequest message, length delimited. Does not implicitly {@link TpUnregisterRequest.verify|verify} messages.
    * @param message TpUnregisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: ITpUnregisterRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITpUnregisterRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TpUnregisterRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpUnregisterRequest
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): TpUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TpUnregisterRequest]
  
  /**
    * Creates a plain object from a TpUnregisterRequest message. Also converts values to other types if specified.
    * @param message TpUnregisterRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: TpUnregisterRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: TpUnregisterRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TpUnregisterRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
