package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.Event.IAttribute
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "Event")
@js.native
/**
  * Constructs a new Event.
  * @param [properties] Properties to set
  */
class Event () extends IEvent {
  def this(properties: IEvent) = this()
  
  /** Event attributes. */
  @JSName("attributes")
  var attributes_Event: js.Array[IAttribute] = js.native
  
  /** Event data. */
  @JSName("data")
  var data_Event: Uint8Array = js.native
  
  /** Event eventType. */
  @JSName("eventType")
  var eventType_Event: String = js.native
  
  /**
    * Converts this Event to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object Event {
  
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
    
    /**
      * Converts this Attribute to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /** Attribute value. */
    @JSName("value")
    var value_Attribute: String = js.native
  }
  object Attribute {
    
    /**
      * Creates a new Attribute instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Attribute instance
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute.create")
    @js.native
    def create(): Attribute = js.native
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute.create")
    @js.native
    def create(properties: IAttribute): Attribute = js.native
    
    /**
      * Decodes an Attribute message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Attribute
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute.decode")
    @js.native
    def decode(reader: Reader): Attribute = js.native
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute.decode")
    @js.native
    def decode(reader: Reader, length: Double): Attribute = js.native
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute.decode")
    @js.native
    def decode(reader: Uint8Array): Attribute = js.native
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Attribute = js.native
    
    /**
      * Decodes an Attribute message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Attribute
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Attribute = js.native
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Attribute = js.native
    
    /**
      * Encodes the specified Attribute message. Does not implicitly {@link Event.Attribute.verify|verify} messages.
      * @param message Attribute message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute.encode")
    @js.native
    def encode(message: IAttribute): Writer = js.native
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute.encode")
    @js.native
    def encode(message: IAttribute, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Attribute message, length delimited. Does not implicitly {@link Event.Attribute.verify|verify} messages.
      * @param message Attribute message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute.encodeDelimited")
    @js.native
    def encodeDelimited(message: IAttribute): Writer = js.native
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute.encodeDelimited")
    @js.native
    def encodeDelimited(message: IAttribute, writer: Writer): Writer = js.native
    
    /**
      * Creates an Attribute message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Attribute
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Attribute = js.native
    
    /**
      * Creates a plain object from an Attribute message. Also converts values to other types if specified.
      * @param message Attribute
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute.toObject")
    @js.native
    def toObject(message: Attribute): StringDictionary[js.Any] = js.native
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute.toObject")
    @js.native
    def toObject(message: Attribute, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an Attribute message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new Event instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Event instance
    */
  @JSImport("sawtooth-sdk/protobuf", "Event.create")
  @js.native
  def create(): Event = js.native
  @JSImport("sawtooth-sdk/protobuf", "Event.create")
  @js.native
  def create(properties: IEvent): Event = js.native
  
  /**
    * Decodes an Event message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Event
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "Event.decode")
  @js.native
  def decode(reader: Reader): Event = js.native
  @JSImport("sawtooth-sdk/protobuf", "Event.decode")
  @js.native
  def decode(reader: Reader, length: Double): Event = js.native
  @JSImport("sawtooth-sdk/protobuf", "Event.decode")
  @js.native
  def decode(reader: Uint8Array): Event = js.native
  @JSImport("sawtooth-sdk/protobuf", "Event.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Event = js.native
  
  /**
    * Decodes an Event message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Event
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "Event.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Event = js.native
  @JSImport("sawtooth-sdk/protobuf", "Event.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Event = js.native
  
  /**
    * Encodes the specified Event message. Does not implicitly {@link Event.verify|verify} messages.
    * @param message Event message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "Event.encode")
  @js.native
  def encode(message: IEvent): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "Event.encode")
  @js.native
  def encode(message: IEvent, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Event message, length delimited. Does not implicitly {@link Event.verify|verify} messages.
    * @param message Event message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "Event.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEvent): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "Event.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEvent, writer: Writer): Writer = js.native
  
  /**
    * Creates an Event message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Event
    */
  @JSImport("sawtooth-sdk/protobuf", "Event.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Event = js.native
  
  /**
    * Creates a plain object from an Event message. Also converts values to other types if specified.
    * @param message Event
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "Event.toObject")
  @js.native
  def toObject(message: Event): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "Event.toObject")
  @js.native
  def toObject(message: Event, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an Event message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "Event.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of an Attribute. */
  @js.native
  trait IAttribute extends StObject {
    
    /** Attribute key */
    var key: js.UndefOr[String | Null] = js.native
    
    /** Attribute value */
    var value: js.UndefOr[String | Null] = js.native
  }
  object IAttribute {
    
    @scala.inline
    def apply(): IAttribute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAttribute]
    }
    
    @scala.inline
    implicit class IAttributeMutableBuilder[Self <: IAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
