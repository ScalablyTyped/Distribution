package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "EventSubscription")
@js.native
/**
  * Constructs a new EventSubscription.
  * @param [properties] Properties to set
  */
class EventSubscription ()
  extends StObject
     with IEventSubscription {
  def this(properties: IEventSubscription) = this()
  
  /** EventSubscription eventType. */
  @JSName("eventType")
  var eventType_EventSubscription: String = js.native
  
  /** EventSubscription filters. */
  @JSName("filters")
  var filters_EventSubscription: js.Array[IEventFilter] = js.native
  
  /**
    * Converts this EventSubscription to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object EventSubscription {
  
  @JSImport("sawtooth-sdk/protobuf", "EventSubscription")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new EventSubscription instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EventSubscription instance
    */
  inline def create(): EventSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[EventSubscription]
  inline def create(properties: IEventSubscription): EventSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[EventSubscription]
  
  /**
    * Decodes an EventSubscription message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EventSubscription
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): EventSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EventSubscription]
  inline def decode(reader: Reader, length: Double): EventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EventSubscription]
  inline def decode(reader: Uint8Array): EventSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EventSubscription]
  inline def decode(reader: Uint8Array, length: Double): EventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EventSubscription]
  
  /**
    * Decodes an EventSubscription message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EventSubscription
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): EventSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EventSubscription]
  inline def decodeDelimited(reader: Uint8Array): EventSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EventSubscription]
  
  /**
    * Encodes the specified EventSubscription message. Does not implicitly {@link EventSubscription.verify|verify} messages.
    * @param message EventSubscription message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IEventSubscription): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IEventSubscription, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified EventSubscription message, length delimited. Does not implicitly {@link EventSubscription.verify|verify} messages.
    * @param message EventSubscription message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IEventSubscription): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IEventSubscription, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an EventSubscription message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EventSubscription
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): EventSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[EventSubscription]
  
  /**
    * Creates a plain object from an EventSubscription message. Also converts values to other types if specified.
    * @param message EventSubscription
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: EventSubscription): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: EventSubscription, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an EventSubscription message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
