package typings.protobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protobufjs/minimal", "Message")
@js.native
/**
  * Constructs a new message instance.
  * @param [properties] Properties to set
  */
open class Message[T /* <: js.Object */] ()
  extends typings.protobufjs.mod.Message[T] {
  def this(properties: Properties[T]) = this()
}
/* static members */
object Message {
  
  @JSImport("protobufjs/minimal", "Message")
  @js.native
  val ^ : js.Any = js.native
  
  /** Reference to the reflected type. */
  @JSImport("protobufjs/minimal", "Message.$type")
  @js.native
  val $type: typings.protobufjs.mod.Type = js.native
  
  /**
    * Creates a new message of this type using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  inline def create[T /* <: typings.protobufjs.mod.Message[T] */](): typings.protobufjs.mod.Message[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.protobufjs.mod.Message[T]]
  inline def create[T /* <: typings.protobufjs.mod.Message[T] */](properties: StringDictionary[Any]): typings.protobufjs.mod.Message[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.Message[T]]
  
  inline def decode[T /* <: typings.protobufjs.mod.Message[T] */](reader: js.typedarray.Uint8Array): T = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[T]
  /**
    * Decodes a message of this type.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  inline def decode[T /* <: typings.protobufjs.mod.Message[T] */](reader: typings.protobufjs.mod.Reader): T = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def decodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](reader: js.typedarray.Uint8Array): T = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[T]
  /**
    * Decodes a message of this type preceeded by its length as a varint.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  inline def decodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](reader: typings.protobufjs.mod.Reader): T = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Encodes a message of this type.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  inline def encode[T /* <: typings.protobufjs.mod.Message[T] */](message: T): typings.protobufjs.mod.Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.Writer]
  inline def encode[T /* <: typings.protobufjs.mod.Message[T] */](message: T, writer: typings.protobufjs.mod.Writer): typings.protobufjs.mod.Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.Writer]
  inline def encode[T /* <: typings.protobufjs.mod.Message[T] */](message: StringDictionary[Any]): typings.protobufjs.mod.Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.Writer]
  inline def encode[T /* <: typings.protobufjs.mod.Message[T] */](message: StringDictionary[Any], writer: typings.protobufjs.mod.Writer): typings.protobufjs.mod.Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.Writer]
  
  /**
    * Encodes a message of this type preceeded by its length as a varint.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  inline def encodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](message: T): typings.protobufjs.mod.Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.Writer]
  inline def encodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](message: T, writer: typings.protobufjs.mod.Writer): typings.protobufjs.mod.Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.Writer]
  inline def encodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](message: StringDictionary[Any]): typings.protobufjs.mod.Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.Writer]
  inline def encodeDelimited[T /* <: typings.protobufjs.mod.Message[T] */](message: StringDictionary[Any], writer: typings.protobufjs.mod.Writer): typings.protobufjs.mod.Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.Writer]
  
  /**
    * Creates a new message of this type from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Message instance
    */
  inline def fromObject[T /* <: typings.protobufjs.mod.Message[T] */](`object`: StringDictionary[Any]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Creates a plain object from a message of this type. Also converts values to other types if specified.
    * @param message Message instance
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject[T /* <: typings.protobufjs.mod.Message[T] */](message: T): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject[T /* <: typings.protobufjs.mod.Message[T] */](message: T, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a message of this type.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
