package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protobufjs", "Message")
@js.native
/**
  * Constructs a new message instance.
  * @param [properties] Properties to set
  */
class Message[T /* <: js.Object */] () extends StObject {
  def this(properties: Properties[T]) = this()
  
  /** Reference to the reflected type. */
  @JSName("$type")
  val $type: Type = js.native
  
  /**
    * Converts this message to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object Message {
  
  /** Reference to the reflected type. */
  @JSImport("protobufjs", "Message.$type")
  @js.native
  val $type: Type = js.native
  
  /**
    * Creates a new message of this type using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  @JSImport("protobufjs", "Message.create")
  @js.native
  def create[T /* <: Message[T] */](): Message[T] = js.native
  @JSImport("protobufjs", "Message.create")
  @js.native
  def create[T /* <: Message[T] */](properties: StringDictionary[js.Any]): Message[T] = js.native
  
  /**
    * Decodes a message of this type.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  @JSImport("protobufjs", "Message.decode")
  @js.native
  def decode[T /* <: Message[T] */](reader: Reader): T = js.native
  @JSImport("protobufjs", "Message.decode")
  @js.native
  def decode[T /* <: Message[T] */](reader: Uint8Array): T = js.native
  
  /**
    * Decodes a message of this type preceeded by its length as a varint.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  @JSImport("protobufjs", "Message.decodeDelimited")
  @js.native
  def decodeDelimited[T /* <: Message[T] */](reader: Reader): T = js.native
  @JSImport("protobufjs", "Message.decodeDelimited")
  @js.native
  def decodeDelimited[T /* <: Message[T] */](reader: Uint8Array): T = js.native
  
  /**
    * Encodes a message of this type.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  @JSImport("protobufjs", "Message.encode")
  @js.native
  def encode[T /* <: Message[T] */](message: T): Writer = js.native
  @JSImport("protobufjs", "Message.encode")
  @js.native
  def encode[T /* <: Message[T] */](message: T, writer: Writer): Writer = js.native
  @JSImport("protobufjs", "Message.encode")
  @js.native
  def encode[T /* <: Message[T] */](message: StringDictionary[js.Any]): Writer = js.native
  @JSImport("protobufjs", "Message.encode")
  @js.native
  def encode[T /* <: Message[T] */](message: StringDictionary[js.Any], writer: Writer): Writer = js.native
  
  /**
    * Encodes a message of this type preceeded by its length as a varint.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  @JSImport("protobufjs", "Message.encodeDelimited")
  @js.native
  def encodeDelimited[T /* <: Message[T] */](message: T): Writer = js.native
  @JSImport("protobufjs", "Message.encodeDelimited")
  @js.native
  def encodeDelimited[T /* <: Message[T] */](message: T, writer: Writer): Writer = js.native
  @JSImport("protobufjs", "Message.encodeDelimited")
  @js.native
  def encodeDelimited[T /* <: Message[T] */](message: StringDictionary[js.Any]): Writer = js.native
  @JSImport("protobufjs", "Message.encodeDelimited")
  @js.native
  def encodeDelimited[T /* <: Message[T] */](message: StringDictionary[js.Any], writer: Writer): Writer = js.native
  
  /**
    * Creates a new message of this type from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Message instance
    */
  @JSImport("protobufjs", "Message.fromObject")
  @js.native
  def fromObject[T /* <: Message[T] */](`object`: StringDictionary[js.Any]): T = js.native
  
  /**
    * Creates a plain object from a message of this type. Also converts values to other types if specified.
    * @param message Message instance
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("protobufjs", "Message.toObject")
  @js.native
  def toObject[T /* <: Message[T] */](message: T): StringDictionary[js.Any] = js.native
  @JSImport("protobufjs", "Message.toObject")
  @js.native
  def toObject[T /* <: Message[T] */](message: T, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a message of this type.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("protobufjs", "Message.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
