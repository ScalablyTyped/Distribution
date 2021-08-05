package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientStateGetRequest")
@js.native
/**
  * Constructs a new ClientStateGetRequest.
  * @param [properties] Properties to set
  */
class ClientStateGetRequest ()
  extends StObject
     with IClientStateGetRequest {
  def this(properties: IClientStateGetRequest) = this()
  
  /** ClientStateGetRequest address. */
  @JSName("address")
  var address_ClientStateGetRequest: String = js.native
  
  /** ClientStateGetRequest stateRoot. */
  @JSName("stateRoot")
  var stateRoot_ClientStateGetRequest: String = js.native
  
  /**
    * Converts this ClientStateGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientStateGetRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientStateGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStateGetRequest instance
    */
  inline def create(): ClientStateGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientStateGetRequest]
  inline def create(properties: IClientStateGetRequest): ClientStateGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientStateGetRequest]
  
  /**
    * Decodes a ClientStateGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStateGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientStateGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStateGetRequest]
  inline def decode(reader: Reader, length: Double): ClientStateGetRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientStateGetRequest]
  inline def decode(reader: Uint8Array): ClientStateGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStateGetRequest]
  inline def decode(reader: Uint8Array, length: Double): ClientStateGetRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientStateGetRequest]
  
  /**
    * Decodes a ClientStateGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStateGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientStateGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStateGetRequest]
  inline def decodeDelimited(reader: Uint8Array): ClientStateGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStateGetRequest]
  
  /**
    * Encodes the specified ClientStateGetRequest message. Does not implicitly {@link ClientStateGetRequest.verify|verify} messages.
    * @param message ClientStateGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientStateGetRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientStateGetRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientStateGetRequest message, length delimited. Does not implicitly {@link ClientStateGetRequest.verify|verify} messages.
    * @param message ClientStateGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientStateGetRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientStateGetRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientStateGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStateGetRequest
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): ClientStateGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientStateGetRequest]
  
  /**
    * Creates a plain object from a ClientStateGetRequest message. Also converts values to other types if specified.
    * @param message ClientStateGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientStateGetRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ClientStateGetRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientStateGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
