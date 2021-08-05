package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "GetPeersResponse")
@js.native
/**
  * Constructs a new GetPeersResponse.
  * @param [properties] Properties to set
  */
class GetPeersResponse ()
  extends StObject
     with IGetPeersResponse {
  def this(properties: IGetPeersResponse) = this()
  
  /** GetPeersResponse peerEndpoints. */
  @JSName("peerEndpoints")
  var peerEndpoints_GetPeersResponse: js.Array[String] = js.native
  
  /**
    * Converts this GetPeersResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object GetPeersResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "GetPeersResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GetPeersResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetPeersResponse instance
    */
  inline def create(): GetPeersResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GetPeersResponse]
  inline def create(properties: IGetPeersResponse): GetPeersResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GetPeersResponse]
  
  /**
    * Decodes a GetPeersResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetPeersResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): GetPeersResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetPeersResponse]
  inline def decode(reader: Reader, length: Double): GetPeersResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetPeersResponse]
  inline def decode(reader: Uint8Array): GetPeersResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetPeersResponse]
  inline def decode(reader: Uint8Array, length: Double): GetPeersResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetPeersResponse]
  
  /**
    * Decodes a GetPeersResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetPeersResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): GetPeersResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetPeersResponse]
  inline def decodeDelimited(reader: Uint8Array): GetPeersResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetPeersResponse]
  
  /**
    * Encodes the specified GetPeersResponse message. Does not implicitly {@link GetPeersResponse.verify|verify} messages.
    * @param message GetPeersResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IGetPeersResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGetPeersResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GetPeersResponse message, length delimited. Does not implicitly {@link GetPeersResponse.verify|verify} messages.
    * @param message GetPeersResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IGetPeersResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGetPeersResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GetPeersResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetPeersResponse
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): GetPeersResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GetPeersResponse]
  
  /**
    * Creates a plain object from a GetPeersResponse message. Also converts values to other types if specified.
    * @param message GetPeersResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: GetPeersResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: GetPeersResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a GetPeersResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
