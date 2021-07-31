package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest")
@js.native
/**
  * Constructs a new ClientBlockGetByTransactionIdRequest.
  * @param [properties] Properties to set
  */
class ClientBlockGetByTransactionIdRequest ()
  extends StObject
     with IClientBlockGetByTransactionIdRequest {
  def this(properties: IClientBlockGetByTransactionIdRequest) = this()
  
  /**
    * Converts this ClientBlockGetByTransactionIdRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ClientBlockGetByTransactionIdRequest transactionId. */
  @JSName("transactionId")
  var transactionId_ClientBlockGetByTransactionIdRequest: String = js.native
}
/* static members */
object ClientBlockGetByTransactionIdRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientBlockGetByTransactionIdRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetByTransactionIdRequest instance
    */
  @scala.inline
  def create(): ClientBlockGetByTransactionIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientBlockGetByTransactionIdRequest]
  @scala.inline
  def create(properties: IClientBlockGetByTransactionIdRequest): ClientBlockGetByTransactionIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByTransactionIdRequest]
  
  /**
    * Decodes a ClientBlockGetByTransactionIdRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetByTransactionIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ClientBlockGetByTransactionIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByTransactionIdRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): ClientBlockGetByTransactionIdRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBlockGetByTransactionIdRequest]
  @scala.inline
  def decode(reader: Uint8Array): ClientBlockGetByTransactionIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByTransactionIdRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ClientBlockGetByTransactionIdRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBlockGetByTransactionIdRequest]
  
  /**
    * Decodes a ClientBlockGetByTransactionIdRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetByTransactionIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ClientBlockGetByTransactionIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByTransactionIdRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ClientBlockGetByTransactionIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByTransactionIdRequest]
  
  /**
    * Encodes the specified ClientBlockGetByTransactionIdRequest message. Does not implicitly {@link ClientBlockGetByTransactionIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByTransactionIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IClientBlockGetByTransactionIdRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IClientBlockGetByTransactionIdRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientBlockGetByTransactionIdRequest message, length delimited. Does not implicitly {@link ClientBlockGetByTransactionIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByTransactionIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IClientBlockGetByTransactionIdRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IClientBlockGetByTransactionIdRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientBlockGetByTransactionIdRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetByTransactionIdRequest
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ClientBlockGetByTransactionIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByTransactionIdRequest]
  
  /**
    * Creates a plain object from a ClientBlockGetByTransactionIdRequest message. Also converts values to other types if specified.
    * @param message ClientBlockGetByTransactionIdRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ClientBlockGetByTransactionIdRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ClientBlockGetByTransactionIdRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientBlockGetByTransactionIdRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
