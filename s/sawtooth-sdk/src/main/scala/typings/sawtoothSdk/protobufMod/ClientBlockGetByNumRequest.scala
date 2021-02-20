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

@JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest")
@js.native
/**
  * Constructs a new ClientBlockGetByNumRequest.
  * @param [properties] Properties to set
  */
class ClientBlockGetByNumRequest () extends IClientBlockGetByNumRequest {
  def this(properties: IClientBlockGetByNumRequest) = this()
  
  /** ClientBlockGetByNumRequest blockNum. */
  @JSName("blockNum")
  var blockNum_ClientBlockGetByNumRequest: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  
  /**
    * Converts this ClientBlockGetByNumRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientBlockGetByNumRequest {
  
  /**
    * Creates a new ClientBlockGetByNumRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetByNumRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest.create")
  @js.native
  def create(): ClientBlockGetByNumRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest.create")
  @js.native
  def create(properties: IClientBlockGetByNumRequest): ClientBlockGetByNumRequest = js.native
  
  /**
    * Decodes a ClientBlockGetByNumRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetByNumRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest.decode")
  @js.native
  def decode(reader: Reader): ClientBlockGetByNumRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientBlockGetByNumRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ClientBlockGetByNumRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ClientBlockGetByNumRequest = js.native
  
  /**
    * Decodes a ClientBlockGetByNumRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetByNumRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientBlockGetByNumRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ClientBlockGetByNumRequest = js.native
  
  /**
    * Encodes the specified ClientBlockGetByNumRequest message. Does not implicitly {@link ClientBlockGetByNumRequest.verify|verify} messages.
    * @param message ClientBlockGetByNumRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest.encode")
  @js.native
  def encode(message: IClientBlockGetByNumRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest.encode")
  @js.native
  def encode(message: IClientBlockGetByNumRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBlockGetByNumRequest message, length delimited. Does not implicitly {@link ClientBlockGetByNumRequest.verify|verify} messages.
    * @param message ClientBlockGetByNumRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockGetByNumRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockGetByNumRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBlockGetByNumRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetByNumRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientBlockGetByNumRequest = js.native
  
  /**
    * Creates a plain object from a ClientBlockGetByNumRequest message. Also converts values to other types if specified.
    * @param message ClientBlockGetByNumRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest.toObject")
  @js.native
  def toObject(message: ClientBlockGetByNumRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest.toObject")
  @js.native
  def toObject(message: ClientBlockGetByNumRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBlockGetByNumRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
