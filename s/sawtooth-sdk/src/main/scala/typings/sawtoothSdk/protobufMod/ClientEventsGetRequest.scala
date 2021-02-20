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

@JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest")
@js.native
/**
  * Constructs a new ClientEventsGetRequest.
  * @param [properties] Properties to set
  */
class ClientEventsGetRequest () extends IClientEventsGetRequest {
  def this(properties: IClientEventsGetRequest) = this()
  
  /** ClientEventsGetRequest blockIds. */
  @JSName("blockIds")
  var blockIds_ClientEventsGetRequest: js.Array[String] = js.native
  
  /** ClientEventsGetRequest subscriptions. */
  @JSName("subscriptions")
  var subscriptions_ClientEventsGetRequest: js.Array[IEventSubscription] = js.native
  
  /**
    * Converts this ClientEventsGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientEventsGetRequest {
  
  /**
    * Creates a new ClientEventsGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientEventsGetRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest.create")
  @js.native
  def create(): ClientEventsGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest.create")
  @js.native
  def create(properties: IClientEventsGetRequest): ClientEventsGetRequest = js.native
  
  /**
    * Decodes a ClientEventsGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientEventsGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest.decode")
  @js.native
  def decode(reader: Reader): ClientEventsGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientEventsGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest.decode")
  @js.native
  def decode(reader: Uint8Array): ClientEventsGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ClientEventsGetRequest = js.native
  
  /**
    * Decodes a ClientEventsGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientEventsGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientEventsGetRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ClientEventsGetRequest = js.native
  
  /**
    * Encodes the specified ClientEventsGetRequest message. Does not implicitly {@link ClientEventsGetRequest.verify|verify} messages.
    * @param message ClientEventsGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest.encode")
  @js.native
  def encode(message: IClientEventsGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest.encode")
  @js.native
  def encode(message: IClientEventsGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientEventsGetRequest message, length delimited. Does not implicitly {@link ClientEventsGetRequest.verify|verify} messages.
    * @param message ClientEventsGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientEventsGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientEventsGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientEventsGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientEventsGetRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientEventsGetRequest = js.native
  
  /**
    * Creates a plain object from a ClientEventsGetRequest message. Also converts values to other types if specified.
    * @param message ClientEventsGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest.toObject")
  @js.native
  def toObject(message: ClientEventsGetRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest.toObject")
  @js.native
  def toObject(message: ClientEventsGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientEventsGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
