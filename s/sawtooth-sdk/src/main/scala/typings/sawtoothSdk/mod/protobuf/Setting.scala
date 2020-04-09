package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ISetting
import typings.sawtoothSdk.protobufMod.Setting.IEntry
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.Setting")
@js.native
/**
  * Constructs a new Setting.
  * @param [properties] Properties to set
  */
class Setting ()
  extends typings.sawtoothSdk.protobufMod.Setting {
  def this(properties: ISetting) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.Setting")
@js.native
object Setting extends js.Object {
  /** Represents an Entry. */
  @js.native
  /**
    * Constructs a new Entry.
    * @param [properties] Properties to set
    */
  class Entry ()
    extends typings.sawtoothSdk.protobufMod.Setting.Entry {
    def this(properties: IEntry) = this()
  }
  
  /**
    * Creates a new Setting instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Setting instance
    */
  def create(): typings.sawtoothSdk.protobufMod.Setting = js.native
  def create(properties: ISetting): typings.sawtoothSdk.protobufMod.Setting = js.native
  /**
    * Decodes a Setting message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Setting
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.Setting = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.Setting = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Setting = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.Setting = js.native
  /**
    * Decodes a Setting message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Setting
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.Setting = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Setting = js.native
  /**
    * Encodes the specified Setting message. Does not implicitly {@link Setting.verify|verify} messages.
    * @param message Setting message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISetting): Writer = js.native
  def encode(message: ISetting, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Setting message, length delimited. Does not implicitly {@link Setting.verify|verify} messages.
    * @param message Setting message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISetting): Writer = js.native
  def encodeDelimited(message: ISetting, writer: Writer): Writer = js.native
  /**
    * Creates a Setting message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Setting
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.Setting = js.native
  /**
    * Creates a plain object from a Setting message. Also converts values to other types if specified.
    * @param message Setting
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.Setting): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.Setting, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Setting message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /* static members */
  @js.native
  object Entry extends js.Object {
    /**
      * Creates a new Entry instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Entry instance
      */
    def create(): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    def create(properties: IEntry): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    /**
      * Decodes an Entry message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    /**
      * Decodes an Entry message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    /**
      * Encodes the specified Entry message. Does not implicitly {@link Setting.Entry.verify|verify} messages.
      * @param message Entry message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IEntry): Writer = js.native
    def encode(message: IEntry, writer: Writer): Writer = js.native
    /**
      * Encodes the specified Entry message, length delimited. Does not implicitly {@link Setting.Entry.verify|verify} messages.
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
    def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    /**
      * Creates a plain object from an Entry message. Also converts values to other types if specified.
      * @param message Entry
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typings.sawtoothSdk.protobufMod.Setting.Entry): StringDictionary[js.Any] = js.native
    def toObject(message: typings.sawtoothSdk.protobufMod.Setting.Entry, options: IConversionOptions): StringDictionary[js.Any] = js.native
    /**
      * Verifies an Entry message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
}

