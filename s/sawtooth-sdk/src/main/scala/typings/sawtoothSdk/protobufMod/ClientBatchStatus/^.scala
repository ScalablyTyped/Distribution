package typings.sawtoothSdk.protobufMod.ClientBatchStatus

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientBatchStatus
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus")
@js.native
object ^ extends js.Object {
  
  /**
    * Creates a new ClientBatchStatus instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchStatus instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  def create(properties: IClientBatchStatus): typings.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  
  /**
    * Decodes a ClientBatchStatus message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchStatus
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  
  /**
    * Decodes a ClientBatchStatus message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchStatus
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  
  /**
    * Encodes the specified ClientBatchStatus message. Does not implicitly {@link ClientBatchStatus.verify|verify} messages.
    * @param message ClientBatchStatus message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBatchStatus): Writer = js.native
  def encode(message: IClientBatchStatus, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBatchStatus message, length delimited. Does not implicitly {@link ClientBatchStatus.verify|verify} messages.
    * @param message ClientBatchStatus message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBatchStatus): Writer = js.native
  def encodeDelimited(message: IClientBatchStatus, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBatchStatus message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchStatus
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientBatchStatus = js.native
  
  /**
    * Creates a plain object from a ClientBatchStatus message. Also converts values to other types if specified.
    * @param message ClientBatchStatus
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBatchStatus): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBatchStatus, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBatchStatus message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
