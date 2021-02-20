package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IEventFilter
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.EventFilter")
@js.native
/**
  * Constructs a new EventFilter.
  * @param [properties] Properties to set
  */
class EventFilter ()
  extends typings.sawtoothSdk.protobufMod.EventFilter {
  def this(properties: IEventFilter) = this()
}
/* static members */
object EventFilter {
  
  /** FilterType enum. */
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.FilterType")
  @js.native
  object FilterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.EventFilter.FilterType with Double] = js.native
    
    /* 0 */ val FILTER_TYPE_UNSET: typings.sawtoothSdk.protobufMod.EventFilter.FilterType.FILTER_TYPE_UNSET with Double = js.native
    
    /* 4 */ val REGEX_ALL: typings.sawtoothSdk.protobufMod.EventFilter.FilterType.REGEX_ALL with Double = js.native
    
    /* 3 */ val REGEX_ANY: typings.sawtoothSdk.protobufMod.EventFilter.FilterType.REGEX_ANY with Double = js.native
    
    /* 2 */ val SIMPLE_ALL: typings.sawtoothSdk.protobufMod.EventFilter.FilterType.SIMPLE_ALL with Double = js.native
    
    /* 1 */ val SIMPLE_ANY: typings.sawtoothSdk.protobufMod.EventFilter.FilterType.SIMPLE_ANY with Double = js.native
  }
  
  /**
    * Creates a new EventFilter instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EventFilter instance
    */
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.EventFilter = js.native
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.create")
  @js.native
  def create(properties: IEventFilter): typings.sawtoothSdk.protobufMod.EventFilter = js.native
  
  /**
    * Decodes an EventFilter message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EventFilter
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.EventFilter = js.native
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.EventFilter = js.native
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.EventFilter = js.native
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.EventFilter = js.native
  
  /**
    * Decodes an EventFilter message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EventFilter
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.EventFilter = js.native
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.EventFilter = js.native
  
  /**
    * Encodes the specified EventFilter message. Does not implicitly {@link EventFilter.verify|verify} messages.
    * @param message EventFilter message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.encode")
  @js.native
  def encode(message: IEventFilter): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.encode")
  @js.native
  def encode(message: IEventFilter, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EventFilter message, length delimited. Does not implicitly {@link EventFilter.verify|verify} messages.
    * @param message EventFilter message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEventFilter): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEventFilter, writer: Writer): Writer = js.native
  
  /**
    * Creates an EventFilter message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EventFilter
    */
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.EventFilter = js.native
  
  /**
    * Creates a plain object from an EventFilter message. Also converts values to other types if specified.
    * @param message EventFilter
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.EventFilter): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.EventFilter, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an EventFilter message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.EventFilter.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
