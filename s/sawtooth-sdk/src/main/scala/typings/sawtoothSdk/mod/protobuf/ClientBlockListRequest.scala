package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientBlockListRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest")
@js.native
/**
  * Constructs a new ClientBlockListRequest.
  * @param [properties] Properties to set
  */
class ClientBlockListRequest ()
  extends typings.sawtoothSdk.protobufMod.ClientBlockListRequest {
  def this(properties: IClientBlockListRequest) = this()
}
/* static members */
object ClientBlockListRequest {
  
  /**
    * Creates a new ClientBlockListRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockListRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest.create")
  @js.native
  def create(properties: IClientBlockListRequest): typings.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  
  /**
    * Decodes a ClientBlockListRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  
  /**
    * Decodes a ClientBlockListRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  
  /**
    * Encodes the specified ClientBlockListRequest message. Does not implicitly {@link ClientBlockListRequest.verify|verify} messages.
    * @param message ClientBlockListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest.encode")
  @js.native
  def encode(message: IClientBlockListRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest.encode")
  @js.native
  def encode(message: IClientBlockListRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBlockListRequest message, length delimited. Does not implicitly {@link ClientBlockListRequest.verify|verify} messages.
    * @param message ClientBlockListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockListRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockListRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBlockListRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockListRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientBlockListRequest = js.native
  
  /**
    * Creates a plain object from a ClientBlockListRequest message. Also converts values to other types if specified.
    * @param message ClientBlockListRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBlockListRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBlockListRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBlockListRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockListRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
