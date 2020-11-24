package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientEventsGetRequest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientEventsGetRequest")
@js.native
/**
  * Constructs a new ClientEventsGetRequest.
  * @param [properties] Properties to set
  */
class ClientEventsGetRequest ()
  extends typings.sawtoothSdk.protobufMod.ClientEventsGetRequest {
  def this(properties: IClientEventsGetRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientEventsGetRequest")
@js.native
object ClientEventsGetRequest extends js.Object {
  
  /**
    * Creates a new ClientEventsGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientEventsGetRequest instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  def create(properties: IClientEventsGetRequest): typings.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  
  /**
    * Decodes a ClientEventsGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientEventsGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  
  /**
    * Decodes a ClientEventsGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientEventsGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  
  /**
    * Encodes the specified ClientEventsGetRequest message. Does not implicitly {@link ClientEventsGetRequest.verify|verify} messages.
    * @param message ClientEventsGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientEventsGetRequest): Writer = js.native
  def encode(message: IClientEventsGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientEventsGetRequest message, length delimited. Does not implicitly {@link ClientEventsGetRequest.verify|verify} messages.
    * @param message ClientEventsGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientEventsGetRequest): Writer = js.native
  def encodeDelimited(message: IClientEventsGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientEventsGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientEventsGetRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientEventsGetRequest = js.native
  
  /**
    * Creates a plain object from a ClientEventsGetRequest message. Also converts values to other types if specified.
    * @param message ClientEventsGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientEventsGetRequest): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientEventsGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientEventsGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
