package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.Event.IAttribute
import typings.sawtoothSdk.protobufMod.IEvent
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.Event")
@js.native
/**
  * Constructs a new Event.
  * @param [properties] Properties to set
  */
class Event ()
  extends typings.sawtoothSdk.protobufMod.Event {
  def this(properties: IEvent) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.Event")
@js.native
object Event extends js.Object {
  /** Represents an Attribute. */
  @js.native
  /**
    * Constructs a new Attribute.
    * @param [properties] Properties to set
    */
  class Attribute ()
    extends typings.sawtoothSdk.protobufMod.Event.Attribute {
    def this(properties: IAttribute) = this()
  }
  
  /**
    * Creates a new Event instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Event instance
    */
  def create(): typings.sawtoothSdk.protobufMod.Event = js.native
  def create(properties: IEvent): typings.sawtoothSdk.protobufMod.Event = js.native
  /**
    * Decodes an Event message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Event
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.Event = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.Event = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Event = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.Event = js.native
  /**
    * Decodes an Event message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Event
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.Event = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Event = js.native
  /**
    * Encodes the specified Event message. Does not implicitly {@link Event.verify|verify} messages.
    * @param message Event message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEvent): Writer = js.native
  def encode(message: IEvent, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Event message, length delimited. Does not implicitly {@link Event.verify|verify} messages.
    * @param message Event message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEvent): Writer = js.native
  def encodeDelimited(message: IEvent, writer: Writer): Writer = js.native
  /**
    * Creates an Event message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Event
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.Event = js.native
  /**
    * Creates a plain object from an Event message. Also converts values to other types if specified.
    * @param message Event
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.Event): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.Event, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an Event message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /* static members */
  @js.native
  object Attribute extends js.Object {
    /**
      * Creates a new Attribute instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Attribute instance
      */
    def create(): typings.sawtoothSdk.protobufMod.Event.Attribute = js.native
    def create(properties: IAttribute): typings.sawtoothSdk.protobufMod.Event.Attribute = js.native
    /**
      * Decodes an Attribute message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Attribute
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.sawtoothSdk.protobufMod.Event.Attribute = js.native
    def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.Event.Attribute = js.native
    def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Event.Attribute = js.native
    def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.Event.Attribute = js.native
    /**
      * Decodes an Attribute message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Attribute
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.Event.Attribute = js.native
    def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Event.Attribute = js.native
    /**
      * Encodes the specified Attribute message. Does not implicitly {@link Event.Attribute.verify|verify} messages.
      * @param message Attribute message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IAttribute): Writer = js.native
    def encode(message: IAttribute, writer: Writer): Writer = js.native
    /**
      * Encodes the specified Attribute message, length delimited. Does not implicitly {@link Event.Attribute.verify|verify} messages.
      * @param message Attribute message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IAttribute): Writer = js.native
    def encodeDelimited(message: IAttribute, writer: Writer): Writer = js.native
    /**
      * Creates an Attribute message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Attribute
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.Event.Attribute = js.native
    /**
      * Creates a plain object from an Attribute message. Also converts values to other types if specified.
      * @param message Attribute
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typings.sawtoothSdk.protobufMod.Event.Attribute): StringDictionary[js.Any] = js.native
    def toObject(message: typings.sawtoothSdk.protobufMod.Event.Attribute, options: IConversionOptions): StringDictionary[js.Any] = js.native
    /**
      * Verifies an Attribute message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
}

