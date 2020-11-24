package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.EventFilter.FilterType
import typings.std.Uint8Array
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
@JSImport("sawtooth-sdk/protobuf", "EventFilter")
@js.native
object EventFilter extends js.Object {
  
  /**
    * Creates a new EventFilter instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EventFilter instance
    */
  def create(): EventFilter = js.native
  def create(properties: IEventFilter): EventFilter = js.native
  
  /**
    * Decodes an EventFilter message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EventFilter
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): EventFilter = js.native
  def decode(reader: Reader, length: Double): EventFilter = js.native
  def decode(reader: Uint8Array): EventFilter = js.native
  def decode(reader: Uint8Array, length: Double): EventFilter = js.native
  
  /**
    * Decodes an EventFilter message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EventFilter
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): EventFilter = js.native
  def decodeDelimited(reader: Uint8Array): EventFilter = js.native
  
  /**
    * Encodes the specified EventFilter message. Does not implicitly {@link EventFilter.verify|verify} messages.
    * @param message EventFilter message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEventFilter): Writer = js.native
  def encode(message: IEventFilter, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EventFilter message, length delimited. Does not implicitly {@link EventFilter.verify|verify} messages.
    * @param message EventFilter message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEventFilter): Writer = js.native
  def encodeDelimited(message: IEventFilter, writer: Writer): Writer = js.native
  
  /**
    * Creates an EventFilter message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EventFilter
    */
  def fromObject(`object`: StringDictionary[js.Any]): EventFilter = js.native
  
  /**
    * Creates a plain object from an EventFilter message. Also converts values to other types if specified.
    * @param message EventFilter
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: EventFilter): StringDictionary[js.Any] = js.native
  def toObject(message: EventFilter, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an EventFilter message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  @js.native
  sealed trait FilterType extends js.Object
  /** FilterType enum. */
  @js.native
  object FilterType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FilterType with Double] = js.native
    
    @js.native
    sealed trait FILTER_TYPE_UNSET extends FilterType
    /* 0 */ @js.native
    object FILTER_TYPE_UNSET extends TopLevel[FILTER_TYPE_UNSET with Double]
    
    @js.native
    sealed trait REGEX_ALL extends FilterType
    /* 4 */ @js.native
    object REGEX_ALL extends TopLevel[REGEX_ALL with Double]
    
    @js.native
    sealed trait REGEX_ANY extends FilterType
    /* 3 */ @js.native
    object REGEX_ANY extends TopLevel[REGEX_ANY with Double]
    
    @js.native
    sealed trait SIMPLE_ALL extends FilterType
    /* 2 */ @js.native
    object SIMPLE_ALL extends TopLevel[SIMPLE_ALL with Double]
    
    @js.native
    sealed trait SIMPLE_ANY extends FilterType
    /* 1 */ @js.native
    object SIMPLE_ANY extends TopLevel[SIMPLE_ANY with Double]
  }
}
