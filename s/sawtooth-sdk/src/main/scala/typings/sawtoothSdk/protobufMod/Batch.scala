package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "Batch")
@js.native
/**
  * Constructs a new Batch.
  * @param [properties] Properties to set
  */
class Batch ()
  extends StObject
     with IBatch {
  def this(properties: IBatch) = this()
  
  /** Batch headerSignature. */
  @JSName("headerSignature")
  var headerSignature_Batch: String = js.native
  
  /** Batch header. */
  @JSName("header")
  var header_Batch: Uint8Array = js.native
  
  /**
    * Converts this Batch to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** Batch trace. */
  @JSName("trace")
  var trace_Batch: Boolean = js.native
  
  /** Batch transactions. */
  @JSName("transactions")
  var transactions_Batch: js.Array[ITransaction] = js.native
}
/* static members */
object Batch {
  
  @JSImport("sawtooth-sdk/protobuf", "Batch")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Batch instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Batch instance
    */
  @scala.inline
  def create(): Batch = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Batch]
  @scala.inline
  def create(properties: IBatch): Batch = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Batch]
  
  /**
    * Decodes a Batch message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Batch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): Batch = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Batch]
  @scala.inline
  def decode(reader: Reader, length: Double): Batch = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Batch]
  @scala.inline
  def decode(reader: Uint8Array): Batch = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Batch]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): Batch = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Batch]
  
  /**
    * Decodes a Batch message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Batch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): Batch = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Batch]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): Batch = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Batch]
  
  /**
    * Encodes the specified Batch message. Does not implicitly {@link Batch.verify|verify} messages.
    * @param message Batch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IBatch): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IBatch, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Batch message, length delimited. Does not implicitly {@link Batch.verify|verify} messages.
    * @param message Batch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IBatch): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IBatch, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Batch message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Batch
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): Batch = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Batch]
  
  /**
    * Creates a plain object from a Batch message. Also converts values to other types if specified.
    * @param message Batch
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: Batch): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: Batch, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Batch message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
