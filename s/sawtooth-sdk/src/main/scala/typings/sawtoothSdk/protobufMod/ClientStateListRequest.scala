package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientStateListRequest")
@js.native
/**
  * Constructs a new ClientStateListRequest.
  * @param [properties] Properties to set
  */
open class ClientStateListRequest ()
  extends StObject
     with IClientStateListRequest {
  def this(properties: IClientStateListRequest) = this()
  
  /** ClientStateListRequest address. */
  @JSName("address")
  var address_ClientStateListRequest: String = js.native
  
  /** ClientStateListRequest sorting. */
  @JSName("sorting")
  var sorting_ClientStateListRequest: js.Array[IClientSortControls] = js.native
  
  /** ClientStateListRequest stateRoot. */
  @JSName("stateRoot")
  var stateRoot_ClientStateListRequest: String = js.native
  
  /**
    * Converts this ClientStateListRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ClientStateListRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientStateListRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStateListRequest instance
    */
  inline def create(): ClientStateListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientStateListRequest]
  inline def create(properties: IClientStateListRequest): ClientStateListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientStateListRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ClientStateListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStateListRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ClientStateListRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientStateListRequest]
  /**
    * Decodes a ClientStateListRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStateListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientStateListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStateListRequest]
  inline def decode(reader: Reader, length: Double): ClientStateListRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientStateListRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ClientStateListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStateListRequest]
  /**
    * Decodes a ClientStateListRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStateListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientStateListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStateListRequest]
  
  /**
    * Encodes the specified ClientStateListRequest message. Does not implicitly {@link ClientStateListRequest.verify|verify} messages.
    * @param message ClientStateListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientStateListRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientStateListRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientStateListRequest message, length delimited. Does not implicitly {@link ClientStateListRequest.verify|verify} messages.
    * @param message ClientStateListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientStateListRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientStateListRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientStateListRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStateListRequest
    */
  inline def fromObject(`object`: StringDictionary[Any]): ClientStateListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientStateListRequest]
  
  /**
    * Creates a plain object from a ClientStateListRequest message. Also converts values to other types if specified.
    * @param message ClientStateListRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientStateListRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ClientStateListRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ClientStateListRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
