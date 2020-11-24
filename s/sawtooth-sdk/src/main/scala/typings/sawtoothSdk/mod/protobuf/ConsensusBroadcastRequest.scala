package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusBroadcastRequest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusBroadcastRequest")
@js.native
/**
  * Constructs a new ConsensusBroadcastRequest.
  * @param [properties] Properties to set
  */
class ConsensusBroadcastRequest ()
  extends typings.sawtoothSdk.protobufMod.ConsensusBroadcastRequest {
  def this(properties: IConsensusBroadcastRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusBroadcastRequest")
@js.native
object ConsensusBroadcastRequest extends js.Object {
  
  /**
    * Creates a new ConsensusBroadcastRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBroadcastRequest instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ConsensusBroadcastRequest = js.native
  def create(properties: IConsensusBroadcastRequest): typings.sawtoothSdk.protobufMod.ConsensusBroadcastRequest = js.native
  
  /**
    * Decodes a ConsensusBroadcastRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBroadcastRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusBroadcastRequest = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusBroadcastRequest = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusBroadcastRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusBroadcastRequest = js.native
  
  /**
    * Decodes a ConsensusBroadcastRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBroadcastRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusBroadcastRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusBroadcastRequest = js.native
  
  /**
    * Encodes the specified ConsensusBroadcastRequest message. Does not implicitly {@link ConsensusBroadcastRequest.verify|verify} messages.
    * @param message ConsensusBroadcastRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusBroadcastRequest): Writer = js.native
  def encode(message: IConsensusBroadcastRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusBroadcastRequest message, length delimited. Does not implicitly {@link ConsensusBroadcastRequest.verify|verify} messages.
    * @param message ConsensusBroadcastRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusBroadcastRequest): Writer = js.native
  def encodeDelimited(message: IConsensusBroadcastRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusBroadcastRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusBroadcastRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusBroadcastRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusBroadcastRequest message. Also converts values to other types if specified.
    * @param message ConsensusBroadcastRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusBroadcastRequest): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusBroadcastRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusBroadcastRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
