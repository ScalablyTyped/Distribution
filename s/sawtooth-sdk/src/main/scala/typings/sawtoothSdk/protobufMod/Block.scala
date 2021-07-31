package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "Block")
@js.native
/**
  * Constructs a new Block.
  * @param [properties] Properties to set
  */
class Block ()
  extends StObject
     with IBlock {
  def this(properties: IBlock) = this()
  
  /** Block batches. */
  @JSName("batches")
  var batches_Block: js.Array[IBatch] = js.native
  
  /** Block headerSignature. */
  @JSName("headerSignature")
  var headerSignature_Block: String = js.native
  
  /** Block header. */
  @JSName("header")
  var header_Block: Uint8Array = js.native
  
  /**
    * Converts this Block to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object Block {
  
  @JSImport("sawtooth-sdk/protobuf", "Block")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Block instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Block instance
    */
  @scala.inline
  def create(): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Block]
  @scala.inline
  def create(properties: IBlock): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Block]
  
  /**
    * Decodes a Block message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Block
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Block]
  @scala.inline
  def decode(reader: Reader, length: Double): Block = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Block]
  @scala.inline
  def decode(reader: Uint8Array): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Block]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): Block = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Block]
  
  /**
    * Decodes a Block message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Block
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Block]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Block]
  
  /**
    * Encodes the specified Block message. Does not implicitly {@link Block.verify|verify} messages.
    * @param message Block message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IBlock): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IBlock, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Block message, length delimited. Does not implicitly {@link Block.verify|verify} messages.
    * @param message Block message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IBlock): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IBlock, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Block message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Block
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Block]
  
  /**
    * Creates a plain object from a Block message. Also converts values to other types if specified.
    * @param message Block
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: Block): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: Block, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Block message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
