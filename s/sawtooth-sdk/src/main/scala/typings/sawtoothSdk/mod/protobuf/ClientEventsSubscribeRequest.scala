package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientEventsSubscribeRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientEventsSubscribeRequest")
@js.native
/**
  * Constructs a new ClientEventsSubscribeRequest.
  * @param [properties] Properties to set
  */
class ClientEventsSubscribeRequest ()
  extends typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest {
  def this(properties: IClientEventsSubscribeRequest) = this()
}
/* static members */
object ClientEventsSubscribeRequest {
  
  @JSImport("sawtooth-sdk", "protobuf.ClientEventsSubscribeRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientEventsSubscribeRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientEventsSubscribeRequest instance
    */
  inline def create(): typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest]
  inline def create(properties: IClientEventsSubscribeRequest): typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest]
  
  /**
    * Decodes a ClientEventsSubscribeRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientEventsSubscribeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest]
  inline def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest]
  inline def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest]
  inline def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest]
  
  /**
    * Decodes a ClientEventsSubscribeRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientEventsSubscribeRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest]
  inline def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest]
  
  /**
    * Encodes the specified ClientEventsSubscribeRequest message. Does not implicitly {@link ClientEventsSubscribeRequest.verify|verify} messages.
    * @param message ClientEventsSubscribeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientEventsSubscribeRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientEventsSubscribeRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientEventsSubscribeRequest message, length delimited. Does not implicitly {@link ClientEventsSubscribeRequest.verify|verify} messages.
    * @param message ClientEventsSubscribeRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientEventsSubscribeRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientEventsSubscribeRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientEventsSubscribeRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientEventsSubscribeRequest
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest]
  
  /**
    * Creates a plain object from a ClientEventsSubscribeRequest message. Also converts values to other types if specified.
    * @param message ClientEventsSubscribeRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: typings.sawtoothSdk.protobufMod.ClientEventsSubscribeRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientEventsSubscribeRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
