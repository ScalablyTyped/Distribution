package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IPolicy
import typings.sawtoothSdk.protobufMod.Policy.IEntry
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.Policy")
@js.native
/**
  * Constructs a new Policy.
  * @param [properties] Properties to set
  */
class Policy ()
  extends typings.sawtoothSdk.protobufMod.Policy {
  def this(properties: IPolicy) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.Policy")
@js.native
object Policy extends js.Object {
  /** Represents an Entry. */
  @js.native
  /**
    * Constructs a new Entry.
    * @param [properties] Properties to set
    */
  class Entry ()
    extends typings.sawtoothSdk.protobufMod.Policy.Entry {
    def this(properties: IEntry) = this()
  }
  
  /**
    * Creates a new Policy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Policy instance
    */
  def create(): typings.sawtoothSdk.protobufMod.Policy = js.native
  def create(properties: IPolicy): typings.sawtoothSdk.protobufMod.Policy = js.native
  /**
    * Decodes a Policy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Policy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.Policy = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.Policy = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Policy = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.Policy = js.native
  /**
    * Decodes a Policy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Policy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.Policy = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Policy = js.native
  /**
    * Encodes the specified Policy message. Does not implicitly {@link Policy.verify|verify} messages.
    * @param message Policy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPolicy): Writer = js.native
  def encode(message: IPolicy, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Policy message, length delimited. Does not implicitly {@link Policy.verify|verify} messages.
    * @param message Policy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPolicy): Writer = js.native
  def encodeDelimited(message: IPolicy, writer: Writer): Writer = js.native
  /**
    * Creates a Policy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Policy
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.Policy = js.native
  /**
    * Creates a plain object from a Policy message. Also converts values to other types if specified.
    * @param message Policy
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.Policy): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.Policy, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Policy message.
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
    def create(): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    def create(properties: IEntry): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    /**
      * Decodes an Entry message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    /**
      * Decodes an Entry message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
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
    def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    /**
      * Creates a plain object from an Entry message. Also converts values to other types if specified.
      * @param message Entry
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typings.sawtoothSdk.protobufMod.Policy.Entry): StringDictionary[js.Any] = js.native
    def toObject(message: typings.sawtoothSdk.protobufMod.Policy.Entry, options: IConversionOptions): StringDictionary[js.Any] = js.native
    /**
      * Verifies an Entry message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** EntryType enum. */
  @js.native
  object EntryType extends js.Object {
    /* 2 */ val DENY_KEY: typings.sawtoothSdk.protobufMod.Policy.EntryType.DENY_KEY with Double = js.native
    /* 0 */ val ENTRY_TYPE_UNSET: typings.sawtoothSdk.protobufMod.Policy.EntryType.ENTRY_TYPE_UNSET with Double = js.native
    /* 1 */ val PERMIT_KEY: typings.sawtoothSdk.protobufMod.Policy.EntryType.PERMIT_KEY with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.Policy.EntryType with Double] = js.native
  }
  
}

