package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest")
@js.native
/**
  * Constructs a new ClientPeersGetRequest.
  * @param [properties] Properties to set
  */
class ClientPeersGetRequest ()
  extends StObject
     with IClientPeersGetRequest {
  def this(properties: IClientPeersGetRequest) = this()
  
  /**
    * Converts this ClientPeersGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientPeersGetRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientPeersGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientPeersGetRequest instance
    */
  inline def create(): ClientPeersGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientPeersGetRequest]
  inline def create(properties: IClientPeersGetRequest): ClientPeersGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientPeersGetRequest]
  
  /**
    * Decodes a ClientPeersGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientPeersGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientPeersGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientPeersGetRequest]
  inline def decode(reader: Reader, length: Double): ClientPeersGetRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientPeersGetRequest]
  inline def decode(reader: Uint8Array): ClientPeersGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientPeersGetRequest]
  inline def decode(reader: Uint8Array, length: Double): ClientPeersGetRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientPeersGetRequest]
  
  /**
    * Decodes a ClientPeersGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientPeersGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientPeersGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientPeersGetRequest]
  inline def decodeDelimited(reader: Uint8Array): ClientPeersGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientPeersGetRequest]
  
  /**
    * Encodes the specified ClientPeersGetRequest message. Does not implicitly {@link ClientPeersGetRequest.verify|verify} messages.
    * @param message ClientPeersGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientPeersGetRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientPeersGetRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientPeersGetRequest message, length delimited. Does not implicitly {@link ClientPeersGetRequest.verify|verify} messages.
    * @param message ClientPeersGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientPeersGetRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientPeersGetRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientPeersGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientPeersGetRequest
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): ClientPeersGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientPeersGetRequest]
  
  /**
    * Creates a plain object from a ClientPeersGetRequest message. Also converts values to other types if specified.
    * @param message ClientPeersGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientPeersGetRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ClientPeersGetRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientPeersGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
