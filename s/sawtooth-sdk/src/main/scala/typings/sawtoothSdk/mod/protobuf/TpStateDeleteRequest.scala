package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITpStateDeleteRequest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest")
@js.native
/**
  * Constructs a new TpStateDeleteRequest.
  * @param [properties] Properties to set
  */
class TpStateDeleteRequest ()
  extends typings.sawtoothSdk.protobufMod.TpStateDeleteRequest {
  def this(properties: ITpStateDeleteRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.TpStateDeleteRequest")
@js.native
object TpStateDeleteRequest extends js.Object {
  
  /**
    * Creates a new TpStateDeleteRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateDeleteRequest instance
    */
  def create(): typings.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  def create(properties: ITpStateDeleteRequest): typings.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  
  /**
    * Decodes a TpStateDeleteRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateDeleteRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  
  /**
    * Decodes a TpStateDeleteRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateDeleteRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  
  /**
    * Encodes the specified TpStateDeleteRequest message. Does not implicitly {@link TpStateDeleteRequest.verify|verify} messages.
    * @param message TpStateDeleteRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpStateDeleteRequest): Writer = js.native
  def encode(message: ITpStateDeleteRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpStateDeleteRequest message, length delimited. Does not implicitly {@link TpStateDeleteRequest.verify|verify} messages.
    * @param message TpStateDeleteRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpStateDeleteRequest): Writer = js.native
  def encodeDelimited(message: ITpStateDeleteRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpStateDeleteRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateDeleteRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TpStateDeleteRequest = js.native
  
  /**
    * Creates a plain object from a TpStateDeleteRequest message. Also converts values to other types if specified.
    * @param message TpStateDeleteRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.TpStateDeleteRequest): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpStateDeleteRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpStateDeleteRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
