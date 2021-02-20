package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientTransactionListRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest")
@js.native
/**
  * Constructs a new ClientTransactionListRequest.
  * @param [properties] Properties to set
  */
class ClientTransactionListRequest ()
  extends typings.sawtoothSdk.protobufMod.ClientTransactionListRequest {
  def this(properties: IClientTransactionListRequest) = this()
}
/* static members */
object ClientTransactionListRequest {
  
  /**
    * Creates a new ClientTransactionListRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientTransactionListRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest.create")
  @js.native
  def create(properties: IClientTransactionListRequest): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  
  /**
    * Decodes a ClientTransactionListRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientTransactionListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  
  /**
    * Decodes a ClientTransactionListRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientTransactionListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  
  /**
    * Encodes the specified ClientTransactionListRequest message. Does not implicitly {@link ClientTransactionListRequest.verify|verify} messages.
    * @param message ClientTransactionListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest.encode")
  @js.native
  def encode(message: IClientTransactionListRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest.encode")
  @js.native
  def encode(message: IClientTransactionListRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientTransactionListRequest message, length delimited. Does not implicitly {@link ClientTransactionListRequest.verify|verify} messages.
    * @param message ClientTransactionListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientTransactionListRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientTransactionListRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientTransactionListRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientTransactionListRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientTransactionListRequest = js.native
  
  /**
    * Creates a plain object from a ClientTransactionListRequest message. Also converts values to other types if specified.
    * @param message ClientTransactionListRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientTransactionListRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientTransactionListRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientTransactionListRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionListRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
