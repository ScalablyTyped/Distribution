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

@JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest")
@js.native
/**
  * Constructs a new ClientPeersGetRequest.
  * @param [properties] Properties to set
  */
class ClientPeersGetRequest () extends IClientPeersGetRequest {
  def this(properties: IClientPeersGetRequest) = this()
  
  /**
    * Converts this ClientPeersGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientPeersGetRequest {
  
  /**
    * Creates a new ClientPeersGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientPeersGetRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest.create")
  @js.native
  def create(): ClientPeersGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest.create")
  @js.native
  def create(properties: IClientPeersGetRequest): ClientPeersGetRequest = js.native
  
  /**
    * Decodes a ClientPeersGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientPeersGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest.decode")
  @js.native
  def decode(reader: Reader): ClientPeersGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientPeersGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ClientPeersGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ClientPeersGetRequest = js.native
  
  /**
    * Decodes a ClientPeersGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientPeersGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientPeersGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ClientPeersGetRequest = js.native
  
  /**
    * Encodes the specified ClientPeersGetRequest message. Does not implicitly {@link ClientPeersGetRequest.verify|verify} messages.
    * @param message ClientPeersGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest.encode")
  @js.native
  def encode(message: IClientPeersGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest.encode")
  @js.native
  def encode(message: IClientPeersGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientPeersGetRequest message, length delimited. Does not implicitly {@link ClientPeersGetRequest.verify|verify} messages.
    * @param message ClientPeersGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientPeersGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientPeersGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientPeersGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientPeersGetRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientPeersGetRequest = js.native
  
  /**
    * Creates a plain object from a ClientPeersGetRequest message. Also converts values to other types if specified.
    * @param message ClientPeersGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest.toObject")
  @js.native
  def toObject(message: ClientPeersGetRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest.toObject")
  @js.native
  def toObject(message: ClientPeersGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientPeersGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientPeersGetRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
