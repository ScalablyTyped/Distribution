package typings.sawtoothSdk.protobufMod.Event

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an Attribute. */
@JSImport("sawtooth-sdk/protobuf", "Event.Attribute")
@js.native
/**
  * Constructs a new Attribute.
  * @param [properties] Properties to set
  */
class Attribute () extends IAttribute {
  def this(properties: IAttribute) = this()
  /** Attribute key. */
  @JSName("key")
  var key_Attribute: String = js.native
  /** Attribute value. */
  @JSName("value")
  var value_Attribute: String = js.native
  /**
    * Converts this Attribute to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "Event.Attribute")
@js.native
object Attribute extends js.Object {
  /**
    * Creates a new Attribute instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Attribute instance
    */
  def create(): Attribute = js.native
  def create(properties: IAttribute): Attribute = js.native
  /**
    * Decodes an Attribute message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Attribute
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Attribute = js.native
  def decode(reader: Reader, length: Double): Attribute = js.native
  def decode(reader: Uint8Array): Attribute = js.native
  def decode(reader: Uint8Array, length: Double): Attribute = js.native
  /**
    * Decodes an Attribute message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Attribute
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Attribute = js.native
  def decodeDelimited(reader: Uint8Array): Attribute = js.native
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
  def fromObject(`object`: StringDictionary[js.Any]): Attribute = js.native
  /**
    * Creates a plain object from an Attribute message. Also converts values to other types if specified.
    * @param message Attribute
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Attribute): StringDictionary[js.Any] = js.native
  def toObject(message: Attribute, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an Attribute message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

