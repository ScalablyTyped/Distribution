package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBatchSubmitRequest")
@js.native
/**
  * Constructs a new ClientBatchSubmitRequest.
  * @param [properties] Properties to set
  */
class ClientBatchSubmitRequest ()
  extends StObject
     with IClientBatchSubmitRequest {
  def this(properties: IClientBatchSubmitRequest) = this()
  
  /** ClientBatchSubmitRequest batches. */
  @JSName("batches")
  var batches_ClientBatchSubmitRequest: js.Array[IBatch] = js.native
  
  /**
    * Converts this ClientBatchSubmitRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientBatchSubmitRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchSubmitRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientBatchSubmitRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchSubmitRequest instance
    */
  inline def create(): ClientBatchSubmitRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientBatchSubmitRequest]
  inline def create(properties: IClientBatchSubmitRequest): ClientBatchSubmitRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientBatchSubmitRequest]
  
  /**
    * Decodes a ClientBatchSubmitRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchSubmitRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientBatchSubmitRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchSubmitRequest]
  inline def decode(reader: Reader, length: Double): ClientBatchSubmitRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBatchSubmitRequest]
  inline def decode(reader: Uint8Array): ClientBatchSubmitRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchSubmitRequest]
  inline def decode(reader: Uint8Array, length: Double): ClientBatchSubmitRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBatchSubmitRequest]
  
  /**
    * Decodes a ClientBatchSubmitRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchSubmitRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientBatchSubmitRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchSubmitRequest]
  inline def decodeDelimited(reader: Uint8Array): ClientBatchSubmitRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchSubmitRequest]
  
  /**
    * Encodes the specified ClientBatchSubmitRequest message. Does not implicitly {@link ClientBatchSubmitRequest.verify|verify} messages.
    * @param message ClientBatchSubmitRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientBatchSubmitRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientBatchSubmitRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientBatchSubmitRequest message, length delimited. Does not implicitly {@link ClientBatchSubmitRequest.verify|verify} messages.
    * @param message ClientBatchSubmitRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientBatchSubmitRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientBatchSubmitRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientBatchSubmitRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchSubmitRequest
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): ClientBatchSubmitRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientBatchSubmitRequest]
  
  /**
    * Creates a plain object from a ClientBatchSubmitRequest message. Also converts values to other types if specified.
    * @param message ClientBatchSubmitRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientBatchSubmitRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ClientBatchSubmitRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientBatchSubmitRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
