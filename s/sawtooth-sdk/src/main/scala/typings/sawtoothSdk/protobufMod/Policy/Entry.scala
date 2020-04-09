package typings.sawtoothSdk.protobufMod.Policy

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an Entry. */
@JSImport("sawtooth-sdk/protobuf", "Policy.Entry")
@js.native
/**
  * Constructs a new Entry.
  * @param [properties] Properties to set
  */
class Entry () extends IEntry {
  def this(properties: IEntry) = this()
  /** Entry key. */
  @JSName("key")
  var key_Entry: String = js.native
  /** Entry type. */
  @JSName("type")
  var type_Entry: EntryType = js.native
  /**
    * Converts this Entry to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "Policy.Entry")
@js.native
object Entry extends js.Object {
  /**
    * Creates a new Entry instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Entry instance
    */
  def create(): Entry = js.native
  def create(properties: IEntry): Entry = js.native
  /**
    * Decodes an Entry message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Entry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Entry = js.native
  def decode(reader: Reader, length: Double): Entry = js.native
  def decode(reader: Uint8Array): Entry = js.native
  def decode(reader: Uint8Array, length: Double): Entry = js.native
  /**
    * Decodes an Entry message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Entry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Entry = js.native
  def decodeDelimited(reader: Uint8Array): Entry = js.native
  /**
    * Encodes the specified Entry message. Does not implicitly {@link Policy.Entry.verify|verify} messages.
    * @param message Entry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEntry): Writer = js.native
  def encode(message: IEntry, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Entry message, length delimited. Does not implicitly {@link Policy.Entry.verify|verify} messages.
    * @param message Entry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEntry): Writer = js.native
  def encodeDelimited(message: IEntry, writer: Writer): Writer = js.native
  /**
    * Creates an Entry message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Entry
    */
  def fromObject(`object`: StringDictionary[js.Any]): Entry = js.native
  /**
    * Creates a plain object from an Entry message. Also converts values to other types if specified.
    * @param message Entry
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Entry): StringDictionary[js.Any] = js.native
  def toObject(message: Entry, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an Entry message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

