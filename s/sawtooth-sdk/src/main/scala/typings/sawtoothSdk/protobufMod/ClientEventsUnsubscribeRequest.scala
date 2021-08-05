package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientEventsUnsubscribeRequest")
@js.native
/**
  * Constructs a new ClientEventsUnsubscribeRequest.
  * @param [properties] Properties to set
  */
class ClientEventsUnsubscribeRequest ()
  extends StObject
     with IClientEventsUnsubscribeRequest {
  def this(properties: IClientEventsUnsubscribeRequest) = this()
  
  /**
    * Converts this ClientEventsUnsubscribeRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientEventsUnsubscribeRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsUnsubscribeRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientEventsUnsubscribeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientEventsUnsubscribeRequest instance
    */
  inline def create(): ClientEventsUnsubscribeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientEventsUnsubscribeRequest]
  inline def create(properties: IClientEventsUnsubscribeRequest): ClientEventsUnsubscribeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientEventsUnsubscribeRequest]
  
  /**
    * Decodes a ClientEventsUnsubscribeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientEventsUnsubscribeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientEventsUnsubscribeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientEventsUnsubscribeRequest]
  inline def decode(reader: Reader, length: Double): ClientEventsUnsubscribeRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientEventsUnsubscribeRequest]
  inline def decode(reader: Uint8Array): ClientEventsUnsubscribeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientEventsUnsubscribeRequest]
  inline def decode(reader: Uint8Array, length: Double): ClientEventsUnsubscribeRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientEventsUnsubscribeRequest]
  
  /**
    * Decodes a ClientEventsUnsubscribeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientEventsUnsubscribeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientEventsUnsubscribeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientEventsUnsubscribeRequest]
  inline def decodeDelimited(reader: Uint8Array): ClientEventsUnsubscribeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientEventsUnsubscribeRequest]
  
  /**
    * Encodes the specified ClientEventsUnsubscribeRequest message. Does not implicitly {@link ClientEventsUnsubscribeRequest.verify|verify} messages.
    * @param message ClientEventsUnsubscribeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientEventsUnsubscribeRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientEventsUnsubscribeRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientEventsUnsubscribeRequest message, length delimited. Does not implicitly {@link ClientEventsUnsubscribeRequest.verify|verify} messages.
    * @param message ClientEventsUnsubscribeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientEventsUnsubscribeRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientEventsUnsubscribeRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientEventsUnsubscribeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientEventsUnsubscribeRequest
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): ClientEventsUnsubscribeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientEventsUnsubscribeRequest]
  
  /**
    * Creates a plain object from a ClientEventsUnsubscribeRequest message. Also converts values to other types if specified.
    * @param message ClientEventsUnsubscribeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientEventsUnsubscribeRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ClientEventsUnsubscribeRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientEventsUnsubscribeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
