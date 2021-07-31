package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ChangeLogEntry.ISuccessor
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry")
@js.native
/**
  * Constructs a new ChangeLogEntry.
  * @param [properties] Properties to set
  */
class ChangeLogEntry ()
  extends StObject
     with IChangeLogEntry {
  def this(properties: IChangeLogEntry) = this()
  
  /** ChangeLogEntry additions. */
  @JSName("additions")
  var additions_ChangeLogEntry: js.Array[Uint8Array] = js.native
  
  /** ChangeLogEntry parent. */
  @JSName("parent")
  var parent_ChangeLogEntry: Uint8Array = js.native
  
  /** ChangeLogEntry successors. */
  @JSName("successors")
  var successors_ChangeLogEntry: js.Array[ISuccessor] = js.native
  
  /**
    * Converts this ChangeLogEntry to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ChangeLogEntry {
  
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a Successor. */
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor")
  @js.native
  /**
    * Constructs a new Successor.
    * @param [properties] Properties to set
    */
  class Successor ()
    extends StObject
       with ISuccessor {
    def this(properties: ISuccessor) = this()
    
    /** Successor deletions. */
    @JSName("deletions")
    var deletions_Successor: js.Array[Uint8Array] = js.native
    
    /** Successor successor. */
    @JSName("successor")
    var successor_Successor: Uint8Array = js.native
    
    /**
      * Converts this Successor to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Successor {
    
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Successor instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Successor instance
      */
    /* static member */
    @scala.inline
    def create(): Successor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Successor]
    @scala.inline
    def create(properties: ISuccessor): Successor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Successor]
    
    /**
      * Decodes a Successor message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Successor
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): Successor = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Successor]
    @scala.inline
    def decode(reader: Reader, length: Double): Successor = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Successor]
    @scala.inline
    def decode(reader: Uint8Array): Successor = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Successor]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): Successor = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Successor]
    
    /**
      * Decodes a Successor message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Successor
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): Successor = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Successor]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): Successor = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Successor]
    
    /**
      * Encodes the specified Successor message. Does not implicitly {@link ChangeLogEntry.Successor.verify|verify} messages.
      * @param message Successor message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: ISuccessor): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: ISuccessor, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Successor message, length delimited. Does not implicitly {@link ChangeLogEntry.Successor.verify|verify} messages.
      * @param message Successor message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: ISuccessor): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: ISuccessor, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Successor message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Successor
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): Successor = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Successor]
    
    /**
      * Creates a plain object from a Successor message. Also converts values to other types if specified.
      * @param message Successor
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: Successor): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: Successor, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a Successor message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new ChangeLogEntry instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ChangeLogEntry instance
    */
  @scala.inline
  def create(): ChangeLogEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ChangeLogEntry]
  @scala.inline
  def create(properties: IChangeLogEntry): ChangeLogEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ChangeLogEntry]
  
  /**
    * Decodes a ChangeLogEntry message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ChangeLogEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ChangeLogEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ChangeLogEntry]
  @scala.inline
  def decode(reader: Reader, length: Double): ChangeLogEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ChangeLogEntry]
  @scala.inline
  def decode(reader: Uint8Array): ChangeLogEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ChangeLogEntry]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ChangeLogEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ChangeLogEntry]
  
  /**
    * Decodes a ChangeLogEntry message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ChangeLogEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ChangeLogEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ChangeLogEntry]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ChangeLogEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ChangeLogEntry]
  
  /**
    * Encodes the specified ChangeLogEntry message. Does not implicitly {@link ChangeLogEntry.verify|verify} messages.
    * @param message ChangeLogEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IChangeLogEntry): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IChangeLogEntry, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ChangeLogEntry message, length delimited. Does not implicitly {@link ChangeLogEntry.verify|verify} messages.
    * @param message ChangeLogEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IChangeLogEntry): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IChangeLogEntry, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ChangeLogEntry message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ChangeLogEntry
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ChangeLogEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ChangeLogEntry]
  
  /**
    * Creates a plain object from a ChangeLogEntry message. Also converts values to other types if specified.
    * @param message ChangeLogEntry
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ChangeLogEntry): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ChangeLogEntry, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ChangeLogEntry message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a Successor. */
  trait ISuccessor extends StObject {
    
    /** Successor deletions */
    var deletions: js.UndefOr[js.Array[Uint8Array] | Null] = js.undefined
    
    /** Successor successor */
    var successor: js.UndefOr[Uint8Array | Null] = js.undefined
  }
  object ISuccessor {
    
    @scala.inline
    def apply(): ISuccessor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISuccessor]
    }
    
    @scala.inline
    implicit class ISuccessorMutableBuilder[Self <: ISuccessor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeletions(value: js.Array[Uint8Array]): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionsNull: Self = StObject.set(x, "deletions", null)
      
      @scala.inline
      def setDeletionsUndefined: Self = StObject.set(x, "deletions", js.undefined)
      
      @scala.inline
      def setDeletionsVarargs(value: Uint8Array*): Self = StObject.set(x, "deletions", js.Array(value :_*))
      
      @scala.inline
      def setSuccessor(value: Uint8Array): Self = StObject.set(x, "successor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessorNull: Self = StObject.set(x, "successor", null)
      
      @scala.inline
      def setSuccessorUndefined: Self = StObject.set(x, "successor", js.undefined)
    }
  }
}
