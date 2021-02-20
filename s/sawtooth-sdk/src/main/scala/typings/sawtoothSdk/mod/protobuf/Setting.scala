package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ISetting
import typings.sawtoothSdk.protobufMod.Setting.IEntry
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Setting {
  
  /** Represents an Entry. */
  @JSImport("sawtooth-sdk", "protobuf.Setting.Entry")
  @js.native
  /**
    * Constructs a new Entry.
    * @param [properties] Properties to set
    */
  class Entry ()
    extends typings.sawtoothSdk.protobufMod.Setting.Entry {
    def this(properties: IEntry) = this()
  }
  object Entry {
    
    /**
      * Creates a new Entry instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Entry instance
      */
    /* static member */
    @JSImport("sawtooth-sdk", "protobuf.Setting.Entry.create")
    @js.native
    def create(): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    @JSImport("sawtooth-sdk", "protobuf.Setting.Entry.create")
    @js.native
    def create(properties: IEntry): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    
    /**
      * Decodes an Entry message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("sawtooth-sdk", "protobuf.Setting.Entry.decode")
    @js.native
    def decode(reader: Reader): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    @JSImport("sawtooth-sdk", "protobuf.Setting.Entry.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    @JSImport("sawtooth-sdk", "protobuf.Setting.Entry.decode")
    @js.native
    def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    @JSImport("sawtooth-sdk", "protobuf.Setting.Entry.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    
    /**
      * Decodes an Entry message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("sawtooth-sdk", "protobuf.Setting.Entry.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    @JSImport("sawtooth-sdk", "protobuf.Setting.Entry.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    
    /**
      * Encodes the specified Entry message. Does not implicitly {@link Setting.Entry.verify|verify} messages.
      * @param message Entry message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("sawtooth-sdk", "protobuf.Setting.Entry.encode")
    @js.native
    def encode(message: IEntry): Writer = js.native
    @JSImport("sawtooth-sdk", "protobuf.Setting.Entry.encode")
    @js.native
    def encode(message: IEntry, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Entry message, length delimited. Does not implicitly {@link Setting.Entry.verify|verify} messages.
      * @param message Entry message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("sawtooth-sdk", "protobuf.Setting.Entry.encodeDelimited")
    @js.native
    def encodeDelimited(message: IEntry): Writer = js.native
    @JSImport("sawtooth-sdk", "protobuf.Setting.Entry.encodeDelimited")
    @js.native
    def encodeDelimited(message: IEntry, writer: Writer): Writer = js.native
    
    /**
      * Creates an Entry message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Entry
      */
    /* static member */
    @JSImport("sawtooth-sdk", "protobuf.Setting.Entry.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.Setting.Entry = js.native
    
    /**
      * Creates a plain object from an Entry message. Also converts values to other types if specified.
      * @param message Entry
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("sawtooth-sdk", "protobuf.Setting.Entry.toObject")
    @js.native
    def toObject(message: typings.sawtoothSdk.protobufMod.Setting.Entry): StringDictionary[js.Any] = js.native
    @JSImport("sawtooth-sdk", "protobuf.Setting.Entry.toObject")
    @js.native
    def toObject(message: typings.sawtoothSdk.protobufMod.Setting.Entry, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an Entry message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("sawtooth-sdk", "protobuf.Setting.Entry.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new Setting instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Setting instance
    */
  @JSImport("sawtooth-sdk", "protobuf.Setting.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.Setting = js.native
  @JSImport("sawtooth-sdk", "protobuf.Setting.create")
  @js.native
  def create(properties: ISetting): typings.sawtoothSdk.protobufMod.Setting = js.native
  
  /**
    * Decodes a Setting message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Setting
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.Setting.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.Setting = js.native
  @JSImport("sawtooth-sdk", "protobuf.Setting.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.Setting = js.native
  @JSImport("sawtooth-sdk", "protobuf.Setting.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Setting = js.native
  @JSImport("sawtooth-sdk", "protobuf.Setting.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.Setting = js.native
  
  /**
    * Decodes a Setting message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Setting
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.Setting.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.Setting = js.native
  @JSImport("sawtooth-sdk", "protobuf.Setting.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Setting = js.native
  
  /**
    * Encodes the specified Setting message. Does not implicitly {@link Setting.verify|verify} messages.
    * @param message Setting message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.Setting.encode")
  @js.native
  def encode(message: ISetting): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.Setting.encode")
  @js.native
  def encode(message: ISetting, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Setting message, length delimited. Does not implicitly {@link Setting.verify|verify} messages.
    * @param message Setting message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.Setting.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISetting): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.Setting.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISetting, writer: Writer): Writer = js.native
  
  /**
    * Creates a Setting message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Setting
    */
  @JSImport("sawtooth-sdk", "protobuf.Setting.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.Setting = js.native
  
  /**
    * Creates a plain object from a Setting message. Also converts values to other types if specified.
    * @param message Setting
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.Setting.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.Setting): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.Setting.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.Setting, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Setting message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.Setting.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
