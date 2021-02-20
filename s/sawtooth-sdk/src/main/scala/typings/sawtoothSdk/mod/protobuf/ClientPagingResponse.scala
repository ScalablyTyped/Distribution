package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientPagingResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse")
@js.native
/**
  * Constructs a new ClientPagingResponse.
  * @param [properties] Properties to set
  */
class ClientPagingResponse ()
  extends typings.sawtoothSdk.protobufMod.ClientPagingResponse {
  def this(properties: IClientPagingResponse) = this()
}
/* static members */
object ClientPagingResponse {
  
  /**
    * Creates a new ClientPagingResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientPagingResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse.create")
  @js.native
  def create(properties: IClientPagingResponse): typings.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  
  /**
    * Decodes a ClientPagingResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientPagingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  
  /**
    * Decodes a ClientPagingResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientPagingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  
  /**
    * Encodes the specified ClientPagingResponse message. Does not implicitly {@link ClientPagingResponse.verify|verify} messages.
    * @param message ClientPagingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse.encode")
  @js.native
  def encode(message: IClientPagingResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse.encode")
  @js.native
  def encode(message: IClientPagingResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientPagingResponse message, length delimited. Does not implicitly {@link ClientPagingResponse.verify|verify} messages.
    * @param message ClientPagingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientPagingResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientPagingResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientPagingResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientPagingResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientPagingResponse = js.native
  
  /**
    * Creates a plain object from a ClientPagingResponse message. Also converts values to other types if specified.
    * @param message ClientPagingResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientPagingResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientPagingResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientPagingResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
