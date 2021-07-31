package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.Policy.IEntry
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "Policy")
@js.native
/**
  * Constructs a new Policy.
  * @param [properties] Properties to set
  */
class Policy ()
  extends StObject
     with IPolicy {
  def this(properties: IPolicy) = this()
  
  /** Policy entries. */
  @JSName("entries")
  var entries_Policy: js.Array[IEntry] = js.native
  
  /** Policy name. */
  @JSName("name")
  var name_Policy: String = js.native
  
  /**
    * Converts this Policy to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object Policy {
  
  @JSImport("sawtooth-sdk/protobuf", "Policy")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an Entry. */
  @JSImport("sawtooth-sdk/protobuf", "Policy.Entry")
  @js.native
  /**
    * Constructs a new Entry.
    * @param [properties] Properties to set
    */
  class Entry ()
    extends StObject
       with IEntry {
    def this(properties: IEntry) = this()
    
    /** Entry key. */
    @JSName("key")
    var key_Entry: String = js.native
    
    /**
      * Converts this Entry to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /** Entry type. */
    @JSName("type")
    var type_Entry: EntryType = js.native
  }
  object Entry {
    
    @JSImport("sawtooth-sdk/protobuf", "Policy.Entry")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Entry instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Entry instance
      */
    /* static member */
    @scala.inline
    def create(): Entry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Entry]
    @scala.inline
    def create(properties: IEntry): Entry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Entry]
    
    /**
      * Decodes an Entry message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): Entry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Entry]
    @scala.inline
    def decode(reader: Reader, length: Double): Entry = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Entry]
    @scala.inline
    def decode(reader: Uint8Array): Entry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Entry]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): Entry = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Entry]
    
    /**
      * Decodes an Entry message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): Entry = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Entry]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): Entry = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Entry]
    
    /**
      * Encodes the specified Entry message. Does not implicitly {@link Policy.Entry.verify|verify} messages.
      * @param message Entry message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IEntry): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IEntry, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Entry message, length delimited. Does not implicitly {@link Policy.Entry.verify|verify} messages.
      * @param message Entry message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IEntry): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IEntry, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an Entry message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Entry
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): Entry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Entry]
    
    /**
      * Creates a plain object from an Entry message. Also converts values to other types if specified.
      * @param message Entry
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: Entry): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: Entry, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies an Entry message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  @js.native
  sealed trait EntryType extends StObject
  /** EntryType enum. */
  @JSImport("sawtooth-sdk/protobuf", "Policy.EntryType")
  @js.native
  object EntryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EntryType & Double] = js.native
    
    @js.native
    sealed trait DENY_KEY
      extends StObject
         with EntryType
    /* 2 */ val DENY_KEY: typings.sawtoothSdk.protobufMod.Policy.EntryType.DENY_KEY & Double = js.native
    
    @js.native
    sealed trait ENTRY_TYPE_UNSET
      extends StObject
         with EntryType
    /* 0 */ val ENTRY_TYPE_UNSET: typings.sawtoothSdk.protobufMod.Policy.EntryType.ENTRY_TYPE_UNSET & Double = js.native
    
    @js.native
    sealed trait PERMIT_KEY
      extends StObject
         with EntryType
    /* 1 */ val PERMIT_KEY: typings.sawtoothSdk.protobufMod.Policy.EntryType.PERMIT_KEY & Double = js.native
  }
  
  /**
    * Creates a new Policy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Policy instance
    */
  @scala.inline
  def create(): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Policy]
  @scala.inline
  def create(properties: IPolicy): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Policy]
  
  /**
    * Decodes a Policy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Policy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Policy]
  @scala.inline
  def decode(reader: Reader, length: Double): Policy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Policy]
  @scala.inline
  def decode(reader: Uint8Array): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Policy]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): Policy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Policy]
  
  /**
    * Decodes a Policy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Policy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Policy]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Policy]
  
  /**
    * Encodes the specified Policy message. Does not implicitly {@link Policy.verify|verify} messages.
    * @param message Policy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IPolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IPolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Policy message, length delimited. Does not implicitly {@link Policy.verify|verify} messages.
    * @param message Policy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IPolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IPolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Policy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Policy
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Policy]
  
  /**
    * Creates a plain object from a Policy message. Also converts values to other types if specified.
    * @param message Policy
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: Policy): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: Policy, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Policy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of an Entry. */
  trait IEntry extends StObject {
    
    /** Entry key */
    var key: js.UndefOr[String | Null] = js.undefined
    
    /** Entry type */
    var `type`: js.UndefOr[EntryType | Null] = js.undefined
  }
  object IEntry {
    
    @scala.inline
    def apply(): IEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEntry]
    }
    
    @scala.inline
    implicit class IEntryMutableBuilder[Self <: IEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setType(value: EntryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
