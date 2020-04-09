package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IEventList
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.EventList")
@js.native
/**
  * Constructs a new EventList.
  * @param [properties] Properties to set
  */
class EventList ()
  extends typings.sawtoothSdk.protobufMod.EventList {
  def this(properties: IEventList) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.EventList")
@js.native
object EventList extends js.Object {
  /**
    * Creates a new EventList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EventList instance
    */
  def create(): typings.sawtoothSdk.protobufMod.EventList = js.native
  def create(properties: IEventList): typings.sawtoothSdk.protobufMod.EventList = js.native
  /**
    * Decodes an EventList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EventList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.EventList = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.EventList = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.EventList = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.EventList = js.native
  /**
    * Decodes an EventList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EventList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.EventList = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.EventList = js.native
  /**
    * Encodes the specified EventList message. Does not implicitly {@link EventList.verify|verify} messages.
    * @param message EventList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEventList): Writer = js.native
  def encode(message: IEventList, writer: Writer): Writer = js.native
  /**
    * Encodes the specified EventList message, length delimited. Does not implicitly {@link EventList.verify|verify} messages.
    * @param message EventList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEventList): Writer = js.native
  def encodeDelimited(message: IEventList, writer: Writer): Writer = js.native
  /**
    * Creates an EventList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EventList
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.EventList = js.native
  /**
    * Creates a plain object from an EventList message. Also converts values to other types if specified.
    * @param message EventList
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.EventList): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.EventList, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an EventList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

