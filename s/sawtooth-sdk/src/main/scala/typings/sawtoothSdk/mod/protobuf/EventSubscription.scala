package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IEventSubscription
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.EventSubscription")
@js.native
/**
  * Constructs a new EventSubscription.
  * @param [properties] Properties to set
  */
class EventSubscription ()
  extends typings.sawtoothSdk.protobufMod.EventSubscription {
  def this(properties: IEventSubscription) = this()
}
/* static members */
object EventSubscription {
  
  /**
    * Creates a new EventSubscription instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EventSubscription instance
    */
  @JSImport("sawtooth-sdk", "protobuf.EventSubscription.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.EventSubscription = js.native
  @JSImport("sawtooth-sdk", "protobuf.EventSubscription.create")
  @js.native
  def create(properties: IEventSubscription): typings.sawtoothSdk.protobufMod.EventSubscription = js.native
  
  /**
    * Decodes an EventSubscription message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EventSubscription
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.EventSubscription.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.EventSubscription = js.native
  @JSImport("sawtooth-sdk", "protobuf.EventSubscription.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.EventSubscription = js.native
  @JSImport("sawtooth-sdk", "protobuf.EventSubscription.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.EventSubscription = js.native
  @JSImport("sawtooth-sdk", "protobuf.EventSubscription.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.EventSubscription = js.native
  
  /**
    * Decodes an EventSubscription message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EventSubscription
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.EventSubscription.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.EventSubscription = js.native
  @JSImport("sawtooth-sdk", "protobuf.EventSubscription.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.EventSubscription = js.native
  
  /**
    * Encodes the specified EventSubscription message. Does not implicitly {@link EventSubscription.verify|verify} messages.
    * @param message EventSubscription message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.EventSubscription.encode")
  @js.native
  def encode(message: IEventSubscription): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.EventSubscription.encode")
  @js.native
  def encode(message: IEventSubscription, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EventSubscription message, length delimited. Does not implicitly {@link EventSubscription.verify|verify} messages.
    * @param message EventSubscription message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.EventSubscription.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEventSubscription): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.EventSubscription.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEventSubscription, writer: Writer): Writer = js.native
  
  /**
    * Creates an EventSubscription message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EventSubscription
    */
  @JSImport("sawtooth-sdk", "protobuf.EventSubscription.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.EventSubscription = js.native
  
  /**
    * Creates a plain object from an EventSubscription message. Also converts values to other types if specified.
    * @param message EventSubscription
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.EventSubscription.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.EventSubscription): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.EventSubscription.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.EventSubscription, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an EventSubscription message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.EventSubscription.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
