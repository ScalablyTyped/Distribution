package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "Type")
@js.native
class Type protected () extends NamespaceBase {
  /**
    * Constructs a new reflected message type instance.
    * @param name Message name
    * @param [options] Declared options
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  /**
    * The registered constructor, if any registered, otherwise a generic constructor.
    * Assigning a function replaces the internal constructor. If the function does not extend {@link Message} yet, its prototype will be setup accordingly and static methods will be populated. If it already extends {@link Message}, it will just replace the internal constructor.
    */
  var ctor: Constructor[js.Object] = js.native
  /** Extension ranges, if any. */
  var extensions: js.Array[js.Array[scala.Double]] = js.native
  /** Message fields. */
  var fields: org.scalablytyped.runtime.StringDictionary[Field] = js.native
  /** Fields of this message as an array for iteration. */
  val fieldsArray: js.Array[Field] = js.native
  /** Message fields by id. */
  val fieldsById: org.scalablytyped.runtime.NumberDictionary[Field] = js.native
  /** Oneofs declared within this namespace, if any. */
  var oneofs: org.scalablytyped.runtime.StringDictionary[OneOf] = js.native
  /** Oneofs of this message as an array for iteration. */
  val oneofsArray: js.Array[OneOf] = js.native
  /** Reserved ranges, if any. */
  var reserved: js.Array[js.Array[scala.Double] | java.lang.String] = js.native
  /**
    * Creates a new message of this type using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  def create(): Message[js.Object] = js.native
  def create(properties: org.scalablytyped.runtime.StringDictionary[js.Any]): Message[js.Object] = js.native
  /**
    * Decodes a message of this type.
    * @param reader Reader or buffer to decode from
    * @param [length] Length of the message, if known beforehand
    * @returns Decoded message
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {util.ProtocolError<{}>} If required fields are missing
    */
  def decode(reader: Reader): Message[js.Object] = js.native
  def decode(reader: Reader, length: scala.Double): Message[js.Object] = js.native
  def decode(reader: stdLib.Uint8Array): Message[js.Object] = js.native
  def decode(reader: stdLib.Uint8Array, length: scala.Double): Message[js.Object] = js.native
  /**
    * Decodes a message of this type preceeded by its byte length as a varint.
    * @param reader Reader or buffer to decode from
    * @returns Decoded message
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Message[js.Object] = js.native
  def decodeDelimited(reader: stdLib.Uint8Array): Message[js.Object] = js.native
  def encode(message: org.scalablytyped.runtime.StringDictionary[js.Any]): Writer = js.native
  def encode(message: org.scalablytyped.runtime.StringDictionary[js.Any], writer: Writer): Writer = js.native
  /**
    * Encodes a message of this type. Does not implicitly {@link Type#verify|verify} messages.
    * @param message Message instance or plain object
    * @param [writer] Writer to encode to
    * @returns writer
    */
  def encode(message: Message[js.Object]): Writer = js.native
  def encode(message: Message[js.Object], writer: Writer): Writer = js.native
  def encodeDelimited(message: org.scalablytyped.runtime.StringDictionary[js.Any]): Writer = js.native
  def encodeDelimited(message: org.scalablytyped.runtime.StringDictionary[js.Any], writer: Writer): Writer = js.native
  /**
    * Encodes a message of this type preceeded by its byte length as a varint. Does not implicitly {@link Type#verify|verify} messages.
    * @param message Message instance or plain object
    * @param [writer] Writer to encode to
    * @returns writer
    */
  def encodeDelimited(message: Message[js.Object]): Writer = js.native
  def encodeDelimited(message: Message[js.Object], writer: Writer): Writer = js.native
  /**
    * Creates a new message of this type from a plain object. Also converts values to their respective internal types.
    * @param object Plain object to convert
    * @returns Message instance
    */
  def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): Message[js.Object] = js.native
  /**
    * Tests if the specified id is reserved.
    * @param id Id to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReservedId(id: scala.Double): scala.Boolean = js.native
  /**
    * Tests if the specified name is reserved.
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReservedName(name: java.lang.String): scala.Boolean = js.native
  /**
    * Sets up {@link Type#encode|encode}, {@link Type#decode|decode} and {@link Type#verify|verify}.
    * @returns `this`
    */
  def setup(): Type = js.native
  /**
    * Creates a plain object from a message of this type. Also converts values to other types if specified.
    * @param message Message instance
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Message[js.Object]): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def toObject(message: Message[js.Object], options: IConversionOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Verifies that field values are valid and that required fields are present.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Null | java.lang.String = js.native
}

@JSImport("protobufjs", "Type")
@js.native
object Type extends js.Object {
  /**
    * Type decorator (TypeScript).
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Decorator function
    */
  def d[T /* <: protobufjsLib.protobufjsMod.Message[T] */](): protobufjsLib.TypeDecorator[T] = js.native
  def d[T /* <: protobufjsLib.protobufjsMod.Message[T] */](typeName: java.lang.String): protobufjsLib.TypeDecorator[T] = js.native
  /**
    * Creates a message type from a message type descriptor.
    * @param name Message name
    * @param json Message type descriptor
    * @returns Created message type
    */
  def fromJSON(name: java.lang.String, json: protobufjsLib.protobufjsMod.IType): protobufjsLib.protobufjsMod.Type = js.native
  /**
    * Generates a constructor function for the specified type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  def generateConstructor(mtype: protobufjsLib.protobufjsMod.Type): protobufjsLib.Codegen = js.native
}

