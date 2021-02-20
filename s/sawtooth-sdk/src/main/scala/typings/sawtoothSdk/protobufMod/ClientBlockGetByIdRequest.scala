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

@JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest")
@js.native
/**
  * Constructs a new ClientBlockGetByIdRequest.
  * @param [properties] Properties to set
  */
class ClientBlockGetByIdRequest () extends IClientBlockGetByIdRequest {
  def this(properties: IClientBlockGetByIdRequest) = this()
  
  /** ClientBlockGetByIdRequest blockId. */
  @JSName("blockId")
  var blockId_ClientBlockGetByIdRequest: String = js.native
  
  /**
    * Converts this ClientBlockGetByIdRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientBlockGetByIdRequest {
  
  /**
    * Creates a new ClientBlockGetByIdRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetByIdRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest.create")
  @js.native
  def create(): ClientBlockGetByIdRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest.create")
  @js.native
  def create(properties: IClientBlockGetByIdRequest): ClientBlockGetByIdRequest = js.native
  
  /**
    * Decodes a ClientBlockGetByIdRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetByIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest.decode")
  @js.native
  def decode(reader: Reader): ClientBlockGetByIdRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientBlockGetByIdRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ClientBlockGetByIdRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ClientBlockGetByIdRequest = js.native
  
  /**
    * Decodes a ClientBlockGetByIdRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetByIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientBlockGetByIdRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ClientBlockGetByIdRequest = js.native
  
  /**
    * Encodes the specified ClientBlockGetByIdRequest message. Does not implicitly {@link ClientBlockGetByIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest.encode")
  @js.native
  def encode(message: IClientBlockGetByIdRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest.encode")
  @js.native
  def encode(message: IClientBlockGetByIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBlockGetByIdRequest message, length delimited. Does not implicitly {@link ClientBlockGetByIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockGetByIdRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockGetByIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBlockGetByIdRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetByIdRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientBlockGetByIdRequest = js.native
  
  /**
    * Creates a plain object from a ClientBlockGetByIdRequest message. Also converts values to other types if specified.
    * @param message ClientBlockGetByIdRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest.toObject")
  @js.native
  def toObject(message: ClientBlockGetByIdRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest.toObject")
  @js.native
  def toObject(message: ClientBlockGetByIdRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBlockGetByIdRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
