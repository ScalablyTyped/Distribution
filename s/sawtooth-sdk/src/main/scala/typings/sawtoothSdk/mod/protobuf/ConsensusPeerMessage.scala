package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusPeerMessage
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage")
@js.native
/**
  * Constructs a new ConsensusPeerMessage.
  * @param [properties] Properties to set
  */
class ConsensusPeerMessage ()
  extends typings.sawtoothSdk.protobufMod.ConsensusPeerMessage {
  def this(properties: IConsensusPeerMessage) = this()
}
/* static members */
object ConsensusPeerMessage {
  
  /**
    * Creates a new ConsensusPeerMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusPeerMessage instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ConsensusPeerMessage = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage.create")
  @js.native
  def create(properties: IConsensusPeerMessage): typings.sawtoothSdk.protobufMod.ConsensusPeerMessage = js.native
  
  /**
    * Decodes a ConsensusPeerMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusPeerMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusPeerMessage = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusPeerMessage = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusPeerMessage = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusPeerMessage = js.native
  
  /**
    * Decodes a ConsensusPeerMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusPeerMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusPeerMessage = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusPeerMessage = js.native
  
  /**
    * Encodes the specified ConsensusPeerMessage message. Does not implicitly {@link ConsensusPeerMessage.verify|verify} messages.
    * @param message ConsensusPeerMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage.encode")
  @js.native
  def encode(message: IConsensusPeerMessage): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage.encode")
  @js.native
  def encode(message: IConsensusPeerMessage, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusPeerMessage message, length delimited. Does not implicitly {@link ConsensusPeerMessage.verify|verify} messages.
    * @param message ConsensusPeerMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusPeerMessage): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusPeerMessage, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusPeerMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusPeerMessage
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusPeerMessage = js.native
  
  /**
    * Creates a plain object from a ConsensusPeerMessage message. Also converts values to other types if specified.
    * @param message ConsensusPeerMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusPeerMessage): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusPeerMessage, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusPeerMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusPeerMessage.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
