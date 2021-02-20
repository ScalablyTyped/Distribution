package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ChangeLogEntry.ISuccessor
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry")
@js.native
/**
  * Constructs a new ChangeLogEntry.
  * @param [properties] Properties to set
  */
class ChangeLogEntry () extends IChangeLogEntry {
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
  
  /** Represents a Successor. */
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor")
  @js.native
  /**
    * Constructs a new Successor.
    * @param [properties] Properties to set
    */
  class Successor () extends ISuccessor {
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
    
    /**
      * Creates a new Successor instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Successor instance
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor.create")
    @js.native
    def create(): Successor = js.native
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor.create")
    @js.native
    def create(properties: ISuccessor): Successor = js.native
    
    /**
      * Decodes a Successor message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Successor
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor.decode")
    @js.native
    def decode(reader: Reader): Successor = js.native
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor.decode")
    @js.native
    def decode(reader: Reader, length: Double): Successor = js.native
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor.decode")
    @js.native
    def decode(reader: Uint8Array): Successor = js.native
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Successor = js.native
    
    /**
      * Decodes a Successor message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Successor
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Successor = js.native
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Successor = js.native
    
    /**
      * Encodes the specified Successor message. Does not implicitly {@link ChangeLogEntry.Successor.verify|verify} messages.
      * @param message Successor message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor.encode")
    @js.native
    def encode(message: ISuccessor): Writer = js.native
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor.encode")
    @js.native
    def encode(message: ISuccessor, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Successor message, length delimited. Does not implicitly {@link ChangeLogEntry.Successor.verify|verify} messages.
      * @param message Successor message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor.encodeDelimited")
    @js.native
    def encodeDelimited(message: ISuccessor): Writer = js.native
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor.encodeDelimited")
    @js.native
    def encodeDelimited(message: ISuccessor, writer: Writer): Writer = js.native
    
    /**
      * Creates a Successor message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Successor
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Successor = js.native
    
    /**
      * Creates a plain object from a Successor message. Also converts values to other types if specified.
      * @param message Successor
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor.toObject")
    @js.native
    def toObject(message: Successor): StringDictionary[js.Any] = js.native
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor.toObject")
    @js.native
    def toObject(message: Successor, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Successor message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new ChangeLogEntry instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ChangeLogEntry instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.create")
  @js.native
  def create(): ChangeLogEntry = js.native
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.create")
  @js.native
  def create(properties: IChangeLogEntry): ChangeLogEntry = js.native
  
  /**
    * Decodes a ChangeLogEntry message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ChangeLogEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.decode")
  @js.native
  def decode(reader: Reader): ChangeLogEntry = js.native
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.decode")
  @js.native
  def decode(reader: Reader, length: Double): ChangeLogEntry = js.native
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.decode")
  @js.native
  def decode(reader: Uint8Array): ChangeLogEntry = js.native
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ChangeLogEntry = js.native
  
  /**
    * Decodes a ChangeLogEntry message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ChangeLogEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ChangeLogEntry = js.native
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ChangeLogEntry = js.native
  
  /**
    * Encodes the specified ChangeLogEntry message. Does not implicitly {@link ChangeLogEntry.verify|verify} messages.
    * @param message ChangeLogEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.encode")
  @js.native
  def encode(message: IChangeLogEntry): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.encode")
  @js.native
  def encode(message: IChangeLogEntry, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ChangeLogEntry message, length delimited. Does not implicitly {@link ChangeLogEntry.verify|verify} messages.
    * @param message ChangeLogEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.encodeDelimited")
  @js.native
  def encodeDelimited(message: IChangeLogEntry): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.encodeDelimited")
  @js.native
  def encodeDelimited(message: IChangeLogEntry, writer: Writer): Writer = js.native
  
  /**
    * Creates a ChangeLogEntry message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ChangeLogEntry
    */
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ChangeLogEntry = js.native
  
  /**
    * Creates a plain object from a ChangeLogEntry message. Also converts values to other types if specified.
    * @param message ChangeLogEntry
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.toObject")
  @js.native
  def toObject(message: ChangeLogEntry): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.toObject")
  @js.native
  def toObject(message: ChangeLogEntry, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ChangeLogEntry message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of a Successor. */
  @js.native
  trait ISuccessor extends StObject {
    
    /** Successor deletions */
    var deletions: js.UndefOr[js.Array[Uint8Array] | Null] = js.native
    
    /** Successor successor */
    var successor: js.UndefOr[Uint8Array | Null] = js.native
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
