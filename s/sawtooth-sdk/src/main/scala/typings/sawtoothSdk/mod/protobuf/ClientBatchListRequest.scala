package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientBatchListRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest")
@js.native
/**
  * Constructs a new ClientBatchListRequest.
  * @param [properties] Properties to set
  */
class ClientBatchListRequest ()
  extends typings.sawtoothSdk.protobufMod.ClientBatchListRequest {
  def this(properties: IClientBatchListRequest) = this()
}
/* static members */
object ClientBatchListRequest {
  
  /**
    * Creates a new ClientBatchListRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchListRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ClientBatchListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest.create")
  @js.native
  def create(properties: IClientBatchListRequest): typings.sawtoothSdk.protobufMod.ClientBatchListRequest = js.native
  
  /**
    * Decodes a ClientBatchListRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBatchListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientBatchListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBatchListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientBatchListRequest = js.native
  
  /**
    * Decodes a ClientBatchListRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBatchListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBatchListRequest = js.native
  
  /**
    * Encodes the specified ClientBatchListRequest message. Does not implicitly {@link ClientBatchListRequest.verify|verify} messages.
    * @param message ClientBatchListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest.encode")
  @js.native
  def encode(message: IClientBatchListRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest.encode")
  @js.native
  def encode(message: IClientBatchListRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBatchListRequest message, length delimited. Does not implicitly {@link ClientBatchListRequest.verify|verify} messages.
    * @param message ClientBatchListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBatchListRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBatchListRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBatchListRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchListRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientBatchListRequest = js.native
  
  /**
    * Creates a plain object from a ClientBatchListRequest message. Also converts values to other types if specified.
    * @param message ClientBatchListRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBatchListRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBatchListRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBatchListRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchListRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
