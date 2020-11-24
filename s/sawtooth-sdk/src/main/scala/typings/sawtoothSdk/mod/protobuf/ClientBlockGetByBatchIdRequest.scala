package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientBlockGetByBatchIdRequest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest")
@js.native
/**
  * Constructs a new ClientBlockGetByBatchIdRequest.
  * @param [properties] Properties to set
  */
class ClientBlockGetByBatchIdRequest ()
  extends typings.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest {
  def this(properties: IClientBlockGetByBatchIdRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientBlockGetByBatchIdRequest")
@js.native
object ClientBlockGetByBatchIdRequest extends js.Object {
  
  /**
    * Creates a new ClientBlockGetByBatchIdRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetByBatchIdRequest instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  def create(properties: IClientBlockGetByBatchIdRequest): typings.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  
  /**
    * Decodes a ClientBlockGetByBatchIdRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetByBatchIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  
  /**
    * Decodes a ClientBlockGetByBatchIdRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetByBatchIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  
  /**
    * Encodes the specified ClientBlockGetByBatchIdRequest message. Does not implicitly {@link ClientBlockGetByBatchIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByBatchIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBlockGetByBatchIdRequest): Writer = js.native
  def encode(message: IClientBlockGetByBatchIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBlockGetByBatchIdRequest message, length delimited. Does not implicitly {@link ClientBlockGetByBatchIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByBatchIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBlockGetByBatchIdRequest): Writer = js.native
  def encodeDelimited(message: IClientBlockGetByBatchIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBlockGetByBatchIdRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetByBatchIdRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest = js.native
  
  /**
    * Creates a plain object from a ClientBlockGetByBatchIdRequest message. Also converts values to other types if specified.
    * @param message ClientBlockGetByBatchIdRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.sawtoothSdk.protobufMod.ClientBlockGetByBatchIdRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBlockGetByBatchIdRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
