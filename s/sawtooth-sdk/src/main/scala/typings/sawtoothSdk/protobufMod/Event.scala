package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.Event.IAttribute
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "Event")
@js.native
/**
  * Constructs a new Event.
  * @param [properties] Properties to set
  */
class Event ()
  extends StObject
     with IEvent {
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
  
  @JSImport("sawtooth-sdk/protobuf", "Event")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an Attribute. */
  @JSImport("sawtooth-sdk/protobuf", "Event.Attribute")
  @js.native
  /**
    * Constructs a new Attribute.
    * @param [properties] Properties to set
    */
  class Attribute ()
    extends StObject
       with IAttribute {
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
    
    @JSImport("sawtooth-sdk/protobuf", "Event.Attribute")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Attribute instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Attribute instance
      */
    /* static member */
    inline def create(): Attribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Attribute]
    inline def create(properties: IAttribute): Attribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Attribute]
    
    /**
      * Decodes an Attribute message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Attribute
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Attribute = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Attribute]
    inline def decode(reader: Reader, length: Double): Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Attribute]
    inline def decode(reader: Uint8Array): Attribute = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Attribute]
    inline def decode(reader: Uint8Array, length: Double): Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Attribute]
    
    /**
      * Decodes an Attribute message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Attribute
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Attribute = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Attribute]
    inline def decodeDelimited(reader: Uint8Array): Attribute = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Attribute]
    
    /**
      * Encodes the specified Attribute message. Does not implicitly {@link Event.Attribute.verify|verify} messages.
      * @param message Attribute message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IAttribute): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IAttribute, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Attribute message, length delimited. Does not implicitly {@link Event.Attribute.verify|verify} messages.
      * @param message Attribute message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IAttribute): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IAttribute, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an Attribute message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Attribute
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[js.Any]): Attribute = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Attribute]
    
    /**
      * Creates a plain object from an Attribute message. Also converts values to other types if specified.
      * @param message Attribute
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Attribute): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    inline def toObject(message: Attribute, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies an Attribute message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new Event instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Event instance
    */
  inline def create(): Event = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Event]
  inline def create(properties: IEvent): Event = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Event]
  
  /**
    * Decodes an Event message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Event
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): Event = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Event]
  inline def decode(reader: Reader, length: Double): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def decode(reader: Uint8Array): Event = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Event]
  inline def decode(reader: Uint8Array, length: Double): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  /**
    * Decodes an Event message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Event
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): Event = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Event]
  inline def decodeDelimited(reader: Uint8Array): Event = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Event]
  
  /**
    * Encodes the specified Event message. Does not implicitly {@link Event.verify|verify} messages.
    * @param message Event message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IEvent): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IEvent, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Event message, length delimited. Does not implicitly {@link Event.verify|verify} messages.
    * @param message Event message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IEvent): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IEvent, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an Event message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Event
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): Event = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Event]
  
  /**
    * Creates a plain object from an Event message. Also converts values to other types if specified.
    * @param message Event
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: Event): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: Event, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an Event message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of an Attribute. */
  trait IAttribute extends StObject {
    
    /** Attribute key */
    var key: js.UndefOr[String | Null] = js.undefined
    
    /** Attribute value */
    var value: js.UndefOr[String | Null] = js.undefined
  }
  object IAttribute {
    
    inline def apply(): IAttribute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAttribute]
    }
    
    extension [Self <: IAttribute](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
