package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientPagingResponse")
@js.native
/**
  * Constructs a new ClientPagingResponse.
  * @param [properties] Properties to set
  */
class ClientPagingResponse ()
  extends StObject
     with IClientPagingResponse {
  def this(properties: IClientPagingResponse) = this()
  
  /** ClientPagingResponse limit. */
  @JSName("limit")
  var limit_ClientPagingResponse: Double = js.native
  
  /** ClientPagingResponse next. */
  @JSName("next")
  var next_ClientPagingResponse: String = js.native
  
  /** ClientPagingResponse start. */
  @JSName("start")
  var start_ClientPagingResponse: String = js.native
  
  /**
    * Converts this ClientPagingResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientPagingResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientPagingResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientPagingResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientPagingResponse instance
    */
  @scala.inline
  def create(): ClientPagingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientPagingResponse]
  @scala.inline
  def create(properties: IClientPagingResponse): ClientPagingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientPagingResponse]
  
  /**
    * Decodes a ClientPagingResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientPagingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ClientPagingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientPagingResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): ClientPagingResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientPagingResponse]
  @scala.inline
  def decode(reader: Uint8Array): ClientPagingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientPagingResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ClientPagingResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientPagingResponse]
  
  /**
    * Decodes a ClientPagingResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientPagingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ClientPagingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientPagingResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ClientPagingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientPagingResponse]
  
  /**
    * Encodes the specified ClientPagingResponse message. Does not implicitly {@link ClientPagingResponse.verify|verify} messages.
    * @param message ClientPagingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IClientPagingResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IClientPagingResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientPagingResponse message, length delimited. Does not implicitly {@link ClientPagingResponse.verify|verify} messages.
    * @param message ClientPagingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IClientPagingResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IClientPagingResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientPagingResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientPagingResponse
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ClientPagingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientPagingResponse]
  
  /**
    * Creates a plain object from a ClientPagingResponse message. Also converts values to other types if specified.
    * @param message ClientPagingResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ClientPagingResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ClientPagingResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientPagingResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
