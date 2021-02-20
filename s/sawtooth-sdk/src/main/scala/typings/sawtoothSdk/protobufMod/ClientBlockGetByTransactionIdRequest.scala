package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest")
@js.native
/**
  * Constructs a new ClientBlockGetByTransactionIdRequest.
  * @param [properties] Properties to set
  */
class ClientBlockGetByTransactionIdRequest () extends IClientBlockGetByTransactionIdRequest {
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
  
  /**
    * Creates a new ClientBlockGetByTransactionIdRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetByTransactionIdRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest.create")
  @js.native
  def create(): ClientBlockGetByTransactionIdRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest.create")
  @js.native
  def create(properties: IClientBlockGetByTransactionIdRequest): ClientBlockGetByTransactionIdRequest = js.native
  
  /**
    * Decodes a ClientBlockGetByTransactionIdRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetByTransactionIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest.decode")
  @js.native
  def decode(reader: Reader): ClientBlockGetByTransactionIdRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientBlockGetByTransactionIdRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ClientBlockGetByTransactionIdRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ClientBlockGetByTransactionIdRequest = js.native
  
  /**
    * Decodes a ClientBlockGetByTransactionIdRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetByTransactionIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientBlockGetByTransactionIdRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ClientBlockGetByTransactionIdRequest = js.native
  
  /**
    * Encodes the specified ClientBlockGetByTransactionIdRequest message. Does not implicitly {@link ClientBlockGetByTransactionIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByTransactionIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest.encode")
  @js.native
  def encode(message: IClientBlockGetByTransactionIdRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest.encode")
  @js.native
  def encode(message: IClientBlockGetByTransactionIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBlockGetByTransactionIdRequest message, length delimited. Does not implicitly {@link ClientBlockGetByTransactionIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByTransactionIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockGetByTransactionIdRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockGetByTransactionIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBlockGetByTransactionIdRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetByTransactionIdRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientBlockGetByTransactionIdRequest = js.native
  
  /**
    * Creates a plain object from a ClientBlockGetByTransactionIdRequest message. Also converts values to other types if specified.
    * @param message ClientBlockGetByTransactionIdRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest.toObject")
  @js.native
  def toObject(message: ClientBlockGetByTransactionIdRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest.toObject")
  @js.native
  def toObject(message: ClientBlockGetByTransactionIdRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBlockGetByTransactionIdRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByTransactionIdRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
