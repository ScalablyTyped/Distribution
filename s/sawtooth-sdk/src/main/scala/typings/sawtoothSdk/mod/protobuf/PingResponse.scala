package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IPingResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.PingResponse")
@js.native
/**
  * Constructs a new PingResponse.
  * @param [properties] Properties to set
  */
class PingResponse ()
  extends typings.sawtoothSdk.protobufMod.PingResponse {
  def this(properties: IPingResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.PingResponse")
@js.native
object PingResponse extends js.Object {
  
  /**
    * Creates a new PingResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PingResponse instance
    */
  def create(): typings.sawtoothSdk.protobufMod.PingResponse = js.native
  def create(properties: IPingResponse): typings.sawtoothSdk.protobufMod.PingResponse = js.native
  
  /**
    * Decodes a PingResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.PingResponse = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.PingResponse = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.PingResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.PingResponse = js.native
  
  /**
    * Decodes a PingResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.PingResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.PingResponse = js.native
  
  /**
    * Encodes the specified PingResponse message. Does not implicitly {@link PingResponse.verify|verify} messages.
    * @param message PingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPingResponse): Writer = js.native
  def encode(message: IPingResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PingResponse message, length delimited. Does not implicitly {@link PingResponse.verify|verify} messages.
    * @param message PingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPingResponse): Writer = js.native
  def encodeDelimited(message: IPingResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a PingResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PingResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.PingResponse = js.native
  
  /**
    * Creates a plain object from a PingResponse message. Also converts values to other types if specified.
    * @param message PingResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.PingResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.PingResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PingResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
