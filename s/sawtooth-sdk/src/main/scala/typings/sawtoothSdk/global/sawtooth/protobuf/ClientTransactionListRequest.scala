package typings.sawtoothSdk.global.sawtooth.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientTransactionListRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sawtooth.protobuf.ClientTransactionListRequest")
@js.native
/**
  * Constructs a new ClientTransactionListRequest.
  * @param [properties] Properties to set
  */
open class ClientTransactionListRequest ()
  extends typings.sawtoothSdk.mod.protobuf.ClientTransactionListRequest {
  def this(properties: IClientTransactionListRequest) = this()
}
/* static members */
object ClientTransactionListRequest {
  
  @JSGlobal("sawtooth.protobuf.ClientTransactionListRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientTransactionListRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientTransactionListRequest instance
    */
  inline def create(): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.sawtoothSdk.protobufMod.ClientTransactionListRequest]
  inline def create(properties: IClientTransactionListRequest): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientTransactionListRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientTransactionListRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientTransactionListRequest]
  /**
    * Decodes a ClientTransactionListRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientTransactionListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientTransactionListRequest]
  inline def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientTransactionListRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientTransactionListRequest]
  /**
    * Decodes a ClientTransactionListRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientTransactionListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientTransactionListRequest]
  
  /**
    * Encodes the specified ClientTransactionListRequest message. Does not implicitly {@link ClientTransactionListRequest.verify|verify} messages.
    * @param message ClientTransactionListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientTransactionListRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientTransactionListRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientTransactionListRequest message, length delimited. Does not implicitly {@link ClientTransactionListRequest.verify|verify} messages.
    * @param message ClientTransactionListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientTransactionListRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientTransactionListRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientTransactionListRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientTransactionListRequest
    */
  inline def fromObject(`object`: StringDictionary[Any]): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ClientTransactionListRequest]
  
  /**
    * Creates a plain object from a ClientTransactionListRequest message. Also converts values to other types if specified.
    * @param message ClientTransactionListRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typings.sawtoothSdk.protobufMod.ClientTransactionListRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: typings.sawtoothSdk.protobufMod.ClientTransactionListRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ClientTransactionListRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
