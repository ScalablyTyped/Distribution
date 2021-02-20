package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.EventFilter.FilterType
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "EventFilter")
@js.native
/**
  * Constructs a new EventFilter.
  * @param [properties] Properties to set
  */
class EventFilter () extends IEventFilter {
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
  
  @js.native
  sealed trait FilterType extends StObject
  /** FilterType enum. */
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.FilterType")
  @js.native
  object FilterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FilterType with Double] = js.native
    
    @js.native
    sealed trait FILTER_TYPE_UNSET extends FilterType
    /* 0 */ val FILTER_TYPE_UNSET: typings.sawtoothSdk.protobufMod.EventFilter.FilterType.FILTER_TYPE_UNSET with Double = js.native
    
    @js.native
    sealed trait REGEX_ALL extends FilterType
    /* 4 */ val REGEX_ALL: typings.sawtoothSdk.protobufMod.EventFilter.FilterType.REGEX_ALL with Double = js.native
    
    @js.native
    sealed trait REGEX_ANY extends FilterType
    /* 3 */ val REGEX_ANY: typings.sawtoothSdk.protobufMod.EventFilter.FilterType.REGEX_ANY with Double = js.native
    
    @js.native
    sealed trait SIMPLE_ALL extends FilterType
    /* 2 */ val SIMPLE_ALL: typings.sawtoothSdk.protobufMod.EventFilter.FilterType.SIMPLE_ALL with Double = js.native
    
    @js.native
    sealed trait SIMPLE_ANY extends FilterType
    /* 1 */ val SIMPLE_ANY: typings.sawtoothSdk.protobufMod.EventFilter.FilterType.SIMPLE_ANY with Double = js.native
  }
  
  /**
    * Creates a new EventFilter instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EventFilter instance
    */
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.create")
  @js.native
  def create(): EventFilter = js.native
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.create")
  @js.native
  def create(properties: IEventFilter): EventFilter = js.native
  
  /**
    * Decodes an EventFilter message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EventFilter
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.decode")
  @js.native
  def decode(reader: Reader): EventFilter = js.native
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.decode")
  @js.native
  def decode(reader: Reader, length: Double): EventFilter = js.native
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.decode")
  @js.native
  def decode(reader: Uint8Array): EventFilter = js.native
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): EventFilter = js.native
  
  /**
    * Decodes an EventFilter message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EventFilter
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): EventFilter = js.native
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): EventFilter = js.native
  
  /**
    * Encodes the specified EventFilter message. Does not implicitly {@link EventFilter.verify|verify} messages.
    * @param message EventFilter message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.encode")
  @js.native
  def encode(message: IEventFilter): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.encode")
  @js.native
  def encode(message: IEventFilter, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EventFilter message, length delimited. Does not implicitly {@link EventFilter.verify|verify} messages.
    * @param message EventFilter message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEventFilter): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEventFilter, writer: Writer): Writer = js.native
  
  /**
    * Creates an EventFilter message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EventFilter
    */
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): EventFilter = js.native
  
  /**
    * Creates a plain object from an EventFilter message. Also converts values to other types if specified.
    * @param message EventFilter
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.toObject")
  @js.native
  def toObject(message: EventFilter): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.toObject")
  @js.native
  def toObject(message: EventFilter, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an EventFilter message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "EventFilter.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
