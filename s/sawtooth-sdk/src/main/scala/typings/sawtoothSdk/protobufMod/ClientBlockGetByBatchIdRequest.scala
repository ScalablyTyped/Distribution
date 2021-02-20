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

@JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest")
@js.native
/**
  * Constructs a new ClientBlockGetByBatchIdRequest.
  * @param [properties] Properties to set
  */
class ClientBlockGetByBatchIdRequest () extends IClientBlockGetByBatchIdRequest {
  def this(properties: IClientBlockGetByBatchIdRequest) = this()
  
  /** ClientBlockGetByBatchIdRequest batchId. */
  @JSName("batchId")
  var batchId_ClientBlockGetByBatchIdRequest: String = js.native
  
  /**
    * Converts this ClientBlockGetByBatchIdRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientBlockGetByBatchIdRequest {
  
  /**
    * Creates a new ClientBlockGetByBatchIdRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetByBatchIdRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest.create")
  @js.native
  def create(): ClientBlockGetByBatchIdRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest.create")
  @js.native
  def create(properties: IClientBlockGetByBatchIdRequest): ClientBlockGetByBatchIdRequest = js.native
  
  /**
    * Decodes a ClientBlockGetByBatchIdRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetByBatchIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest.decode")
  @js.native
  def decode(reader: Reader): ClientBlockGetByBatchIdRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientBlockGetByBatchIdRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ClientBlockGetByBatchIdRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ClientBlockGetByBatchIdRequest = js.native
  
  /**
    * Decodes a ClientBlockGetByBatchIdRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetByBatchIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientBlockGetByBatchIdRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ClientBlockGetByBatchIdRequest = js.native
  
  /**
    * Encodes the specified ClientBlockGetByBatchIdRequest message. Does not implicitly {@link ClientBlockGetByBatchIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByBatchIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest.encode")
  @js.native
  def encode(message: IClientBlockGetByBatchIdRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest.encode")
  @js.native
  def encode(message: IClientBlockGetByBatchIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBlockGetByBatchIdRequest message, length delimited. Does not implicitly {@link ClientBlockGetByBatchIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByBatchIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockGetByBatchIdRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockGetByBatchIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBlockGetByBatchIdRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetByBatchIdRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientBlockGetByBatchIdRequest = js.native
  
  /**
    * Creates a plain object from a ClientBlockGetByBatchIdRequest message. Also converts values to other types if specified.
    * @param message ClientBlockGetByBatchIdRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest.toObject")
  @js.native
  def toObject(message: ClientBlockGetByBatchIdRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest.toObject")
  @js.native
  def toObject(message: ClientBlockGetByBatchIdRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBlockGetByBatchIdRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByBatchIdRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
