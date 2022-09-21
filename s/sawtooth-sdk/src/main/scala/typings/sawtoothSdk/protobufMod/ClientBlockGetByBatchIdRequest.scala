package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest")
@js.native
/**
  * Constructs a new ClientBlockGetByBatchIdRequest.
  * @param [properties] Properties to set
  */
open class ClientBlockGetByBatchIdRequest ()
  extends StObject
     with IClientBlockGetByBatchIdRequest {
  def this(properties: IClientBlockGetByBatchIdRequest) = this()
  
  /** ClientBlockGetByBatchIdRequest batchId. */
  @JSName("batchId")
  var batchId_ClientBlockGetByBatchIdRequest: String = js.native
  
  /**
    * Converts this ClientBlockGetByBatchIdRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ClientBlockGetByBatchIdRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientBlockGetByBatchIdRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetByBatchIdRequest instance
    */
  inline def create(): ClientBlockGetByBatchIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientBlockGetByBatchIdRequest]
  inline def create(properties: IClientBlockGetByBatchIdRequest): ClientBlockGetByBatchIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByBatchIdRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ClientBlockGetByBatchIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByBatchIdRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ClientBlockGetByBatchIdRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBlockGetByBatchIdRequest]
  /**
    * Decodes a ClientBlockGetByBatchIdRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetByBatchIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientBlockGetByBatchIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByBatchIdRequest]
  inline def decode(reader: Reader, length: Double): ClientBlockGetByBatchIdRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBlockGetByBatchIdRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ClientBlockGetByBatchIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByBatchIdRequest]
  /**
    * Decodes a ClientBlockGetByBatchIdRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetByBatchIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientBlockGetByBatchIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByBatchIdRequest]
  
  /**
    * Encodes the specified ClientBlockGetByBatchIdRequest message. Does not implicitly {@link ClientBlockGetByBatchIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByBatchIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientBlockGetByBatchIdRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientBlockGetByBatchIdRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientBlockGetByBatchIdRequest message, length delimited. Does not implicitly {@link ClientBlockGetByBatchIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByBatchIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientBlockGetByBatchIdRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientBlockGetByBatchIdRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientBlockGetByBatchIdRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetByBatchIdRequest
    */
  inline def fromObject(`object`: StringDictionary[Any]): ClientBlockGetByBatchIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByBatchIdRequest]
  
  /**
    * Creates a plain object from a ClientBlockGetByBatchIdRequest message. Also converts values to other types if specified.
    * @param message ClientBlockGetByBatchIdRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientBlockGetByBatchIdRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ClientBlockGetByBatchIdRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ClientBlockGetByBatchIdRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
