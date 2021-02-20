package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientStateListRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest")
@js.native
/**
  * Constructs a new ClientStateListRequest.
  * @param [properties] Properties to set
  */
class ClientStateListRequest ()
  extends typings.sawtoothSdk.protobufMod.ClientStateListRequest {
  def this(properties: IClientStateListRequest) = this()
}
/* static members */
object ClientStateListRequest {
  
  /**
    * Creates a new ClientStateListRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStateListRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ClientStateListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest.create")
  @js.native
  def create(properties: IClientStateListRequest): typings.sawtoothSdk.protobufMod.ClientStateListRequest = js.native
  
  /**
    * Decodes a ClientStateListRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStateListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientStateListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientStateListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientStateListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientStateListRequest = js.native
  
  /**
    * Decodes a ClientStateListRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStateListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientStateListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientStateListRequest = js.native
  
  /**
    * Encodes the specified ClientStateListRequest message. Does not implicitly {@link ClientStateListRequest.verify|verify} messages.
    * @param message ClientStateListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest.encode")
  @js.native
  def encode(message: IClientStateListRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest.encode")
  @js.native
  def encode(message: IClientStateListRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientStateListRequest message, length delimited. Does not implicitly {@link ClientStateListRequest.verify|verify} messages.
    * @param message ClientStateListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientStateListRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientStateListRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientStateListRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStateListRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientStateListRequest = js.native
  
  /**
    * Creates a plain object from a ClientStateListRequest message. Also converts values to other types if specified.
    * @param message ClientStateListRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientStateListRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientStateListRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientStateListRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateListRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
