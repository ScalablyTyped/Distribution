package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientTransactionGetRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest")
@js.native
/**
  * Constructs a new ClientTransactionGetRequest.
  * @param [properties] Properties to set
  */
class ClientTransactionGetRequest ()
  extends typings.sawtoothSdk.protobufMod.ClientTransactionGetRequest {
  def this(properties: IClientTransactionGetRequest) = this()
}
/* static members */
object ClientTransactionGetRequest {
  
  /**
    * Creates a new ClientTransactionGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientTransactionGetRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest.create")
  @js.native
  def create(properties: IClientTransactionGetRequest): typings.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  
  /**
    * Decodes a ClientTransactionGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientTransactionGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  
  /**
    * Decodes a ClientTransactionGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientTransactionGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  
  /**
    * Encodes the specified ClientTransactionGetRequest message. Does not implicitly {@link ClientTransactionGetRequest.verify|verify} messages.
    * @param message ClientTransactionGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest.encode")
  @js.native
  def encode(message: IClientTransactionGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest.encode")
  @js.native
  def encode(message: IClientTransactionGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientTransactionGetRequest message, length delimited. Does not implicitly {@link ClientTransactionGetRequest.verify|verify} messages.
    * @param message ClientTransactionGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientTransactionGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientTransactionGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientTransactionGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientTransactionGetRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientTransactionGetRequest = js.native
  
  /**
    * Creates a plain object from a ClientTransactionGetRequest message. Also converts values to other types if specified.
    * @param message ClientTransactionGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientTransactionGetRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientTransactionGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientTransactionGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
