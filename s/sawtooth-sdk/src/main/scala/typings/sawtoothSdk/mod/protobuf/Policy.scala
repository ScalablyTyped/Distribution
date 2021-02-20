package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IPolicy
import typings.sawtoothSdk.protobufMod.Policy.IEntry
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Policy {
  
  /** Represents an Entry. */
  @JSImport("sawtooth-sdk", "protobuf.Policy.Entry")
  @js.native
  /**
    * Constructs a new Entry.
    * @param [properties] Properties to set
    */
  class Entry ()
    extends typings.sawtoothSdk.protobufMod.Policy.Entry {
    def this(properties: IEntry) = this()
  }
  object Entry {
    
    /**
      * Creates a new Entry instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Entry instance
      */
    /* static member */
    @JSImport("sawtooth-sdk", "protobuf.Policy.Entry.create")
    @js.native
    def create(): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    @JSImport("sawtooth-sdk", "protobuf.Policy.Entry.create")
    @js.native
    def create(properties: IEntry): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    
    /**
      * Decodes an Entry message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("sawtooth-sdk", "protobuf.Policy.Entry.decode")
    @js.native
    def decode(reader: Reader): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    @JSImport("sawtooth-sdk", "protobuf.Policy.Entry.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    @JSImport("sawtooth-sdk", "protobuf.Policy.Entry.decode")
    @js.native
    def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    @JSImport("sawtooth-sdk", "protobuf.Policy.Entry.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    
    /**
      * Decodes an Entry message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("sawtooth-sdk", "protobuf.Policy.Entry.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    @JSImport("sawtooth-sdk", "protobuf.Policy.Entry.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    
    /**
      * Encodes the specified Entry message. Does not implicitly {@link Policy.Entry.verify|verify} messages.
      * @param message Entry message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("sawtooth-sdk", "protobuf.Policy.Entry.encode")
    @js.native
    def encode(message: IEntry): Writer = js.native
    @JSImport("sawtooth-sdk", "protobuf.Policy.Entry.encode")
    @js.native
    def encode(message: IEntry, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Entry message, length delimited. Does not implicitly {@link Policy.Entry.verify|verify} messages.
      * @param message Entry message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("sawtooth-sdk", "protobuf.Policy.Entry.encodeDelimited")
    @js.native
    def encodeDelimited(message: IEntry): Writer = js.native
    @JSImport("sawtooth-sdk", "protobuf.Policy.Entry.encodeDelimited")
    @js.native
    def encodeDelimited(message: IEntry, writer: Writer): Writer = js.native
    
    /**
      * Creates an Entry message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Entry
      */
    /* static member */
    @JSImport("sawtooth-sdk", "protobuf.Policy.Entry.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.Policy.Entry = js.native
    
    /**
      * Creates a plain object from an Entry message. Also converts values to other types if specified.
      * @param message Entry
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("sawtooth-sdk", "protobuf.Policy.Entry.toObject")
    @js.native
    def toObject(message: typings.sawtoothSdk.protobufMod.Policy.Entry): StringDictionary[js.Any] = js.native
    @JSImport("sawtooth-sdk", "protobuf.Policy.Entry.toObject")
    @js.native
    def toObject(message: typings.sawtoothSdk.protobufMod.Policy.Entry, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an Entry message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("sawtooth-sdk", "protobuf.Policy.Entry.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** EntryType enum. */
  @JSImport("sawtooth-sdk", "protobuf.Policy.EntryType")
  @js.native
  object EntryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.Policy.EntryType with Double] = js.native
    
    /* 2 */ val DENY_KEY: typings.sawtoothSdk.protobufMod.Policy.EntryType.DENY_KEY with Double = js.native
    
    /* 0 */ val ENTRY_TYPE_UNSET: typings.sawtoothSdk.protobufMod.Policy.EntryType.ENTRY_TYPE_UNSET with Double = js.native
    
    /* 1 */ val PERMIT_KEY: typings.sawtoothSdk.protobufMod.Policy.EntryType.PERMIT_KEY with Double = js.native
  }
  
  /**
    * Creates a new Policy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Policy instance
    */
  @JSImport("sawtooth-sdk", "protobuf.Policy.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.Policy = js.native
  @JSImport("sawtooth-sdk", "protobuf.Policy.create")
  @js.native
  def create(properties: IPolicy): typings.sawtoothSdk.protobufMod.Policy = js.native
  
  /**
    * Decodes a Policy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Policy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.Policy.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.Policy = js.native
  @JSImport("sawtooth-sdk", "protobuf.Policy.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.Policy = js.native
  @JSImport("sawtooth-sdk", "protobuf.Policy.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Policy = js.native
  @JSImport("sawtooth-sdk", "protobuf.Policy.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.Policy = js.native
  
  /**
    * Decodes a Policy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Policy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.Policy.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.Policy = js.native
  @JSImport("sawtooth-sdk", "protobuf.Policy.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Policy = js.native
  
  /**
    * Encodes the specified Policy message. Does not implicitly {@link Policy.verify|verify} messages.
    * @param message Policy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.Policy.encode")
  @js.native
  def encode(message: IPolicy): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.Policy.encode")
  @js.native
  def encode(message: IPolicy, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Policy message, length delimited. Does not implicitly {@link Policy.verify|verify} messages.
    * @param message Policy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.Policy.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPolicy): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.Policy.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPolicy, writer: Writer): Writer = js.native
  
  /**
    * Creates a Policy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Policy
    */
  @JSImport("sawtooth-sdk", "protobuf.Policy.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.Policy = js.native
  
  /**
    * Creates a plain object from a Policy message. Also converts values to other types if specified.
    * @param message Policy
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.Policy.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.Policy): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.Policy.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.Policy, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Policy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.Policy.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
