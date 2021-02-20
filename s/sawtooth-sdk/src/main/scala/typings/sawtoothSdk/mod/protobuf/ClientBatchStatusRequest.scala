package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientBatchStatusRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest")
@js.native
/**
  * Constructs a new ClientBatchStatusRequest.
  * @param [properties] Properties to set
  */
class ClientBatchStatusRequest ()
  extends typings.sawtoothSdk.protobufMod.ClientBatchStatusRequest {
  def this(properties: IClientBatchStatusRequest) = this()
}
/* static members */
object ClientBatchStatusRequest {
  
  /**
    * Creates a new ClientBatchStatusRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchStatusRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest.create")
  @js.native
  def create(properties: IClientBatchStatusRequest): typings.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  
  /**
    * Decodes a ClientBatchStatusRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchStatusRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  
  /**
    * Decodes a ClientBatchStatusRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchStatusRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  
  /**
    * Encodes the specified ClientBatchStatusRequest message. Does not implicitly {@link ClientBatchStatusRequest.verify|verify} messages.
    * @param message ClientBatchStatusRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest.encode")
  @js.native
  def encode(message: IClientBatchStatusRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest.encode")
  @js.native
  def encode(message: IClientBatchStatusRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBatchStatusRequest message, length delimited. Does not implicitly {@link ClientBatchStatusRequest.verify|verify} messages.
    * @param message ClientBatchStatusRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBatchStatusRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBatchStatusRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBatchStatusRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchStatusRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientBatchStatusRequest = js.native
  
  /**
    * Creates a plain object from a ClientBatchStatusRequest message. Also converts values to other types if specified.
    * @param message ClientBatchStatusRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBatchStatusRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBatchStatusRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBatchStatusRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBatchStatusRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
