package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.EventFilter.FilterType
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "EventFilter")
@js.native
/**
  * Constructs a new EventFilter.
  * @param [properties] Properties to set
  */
class EventFilter ()
  extends StObject
     with IEventFilter {
  def this(properties: IEventFilter) = this()
  
  /** EventFilter filterType. */
  @JSName("filterType")
  var filterType_EventFilter: FilterType = js.native
  
  /** EventFilter key. */
  @JSName("key")
  var key_EventFilter: String = js.native
  
  /** EventFilter matchString. */
  @JSName("matchString")
  var matchString_EventFilter: String = js.native
  
  /**
    * Converts this EventFilter to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object EventFilter {
  
  @JSImport("sawtooth-sdk/protobuf", "EventFilter")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait FilterType extends StObject
  /** FilterType enum. */
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.FilterType")
  @js.native
  object FilterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FilterType & Double] = js.native
    
    @js.native
    sealed trait FILTER_TYPE_UNSET
      extends StObject
         with FilterType
    /* 0 */ val FILTER_TYPE_UNSET: typings.sawtoothSdk.protobufMod.EventFilter.FilterType.FILTER_TYPE_UNSET & Double = js.native
    
    @js.native
    sealed trait REGEX_ALL
      extends StObject
         with FilterType
    /* 4 */ val REGEX_ALL: typings.sawtoothSdk.protobufMod.EventFilter.FilterType.REGEX_ALL & Double = js.native
    
    @js.native
    sealed trait REGEX_ANY
      extends StObject
         with FilterType
    /* 3 */ val REGEX_ANY: typings.sawtoothSdk.protobufMod.EventFilter.FilterType.REGEX_ANY & Double = js.native
    
    @js.native
    sealed trait SIMPLE_ALL
      extends StObject
         with FilterType
    /* 2 */ val SIMPLE_ALL: typings.sawtoothSdk.protobufMod.EventFilter.FilterType.SIMPLE_ALL & Double = js.native
    
    @js.native
    sealed trait SIMPLE_ANY
      extends StObject
         with FilterType
    /* 1 */ val SIMPLE_ANY: typings.sawtoothSdk.protobufMod.EventFilter.FilterType.SIMPLE_ANY & Double = js.native
  }
  
  /**
    * Creates a new EventFilter instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EventFilter instance
    */
  inline def create(): EventFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[EventFilter]
  inline def create(properties: IEventFilter): EventFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[EventFilter]
  
  /**
    * Decodes an EventFilter message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EventFilter
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): EventFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EventFilter]
  inline def decode(reader: Reader, length: Double): EventFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EventFilter]
  inline def decode(reader: Uint8Array): EventFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EventFilter]
  inline def decode(reader: Uint8Array, length: Double): EventFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EventFilter]
  
  /**
    * Decodes an EventFilter message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EventFilter
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): EventFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EventFilter]
  inline def decodeDelimited(reader: Uint8Array): EventFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EventFilter]
  
  /**
    * Encodes the specified EventFilter message. Does not implicitly {@link EventFilter.verify|verify} messages.
    * @param message EventFilter message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IEventFilter): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IEventFilter, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified EventFilter message, length delimited. Does not implicitly {@link EventFilter.verify|verify} messages.
    * @param message EventFilter message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IEventFilter): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IEventFilter, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an EventFilter message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EventFilter
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): EventFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[EventFilter]
  
  /**
    * Creates a plain object from an EventFilter message. Also converts values to other types if specified.
    * @param message EventFilter
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: EventFilter): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: EventFilter, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an EventFilter message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
