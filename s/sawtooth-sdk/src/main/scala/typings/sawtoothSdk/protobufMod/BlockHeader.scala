package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "BlockHeader")
@js.native
/**
  * Constructs a new BlockHeader.
  * @param [properties] Properties to set
  */
class BlockHeader ()
  extends StObject
     with IBlockHeader {
  def this(properties: IBlockHeader) = this()
  
  /** BlockHeader batchIds. */
  @JSName("batchIds")
  var batchIds_BlockHeader: js.Array[String] = js.native
  
  /** BlockHeader blockNum. */
  @JSName("blockNum")
  var blockNum_BlockHeader: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  
  /** BlockHeader consensus. */
  @JSName("consensus")
  var consensus_BlockHeader: Uint8Array = js.native
  
  /** BlockHeader previousBlockId. */
  @JSName("previousBlockId")
  var previousBlockId_BlockHeader: String = js.native
  
  /** BlockHeader signerPublicKey. */
  @JSName("signerPublicKey")
  var signerPublicKey_BlockHeader: String = js.native
  
  /** BlockHeader stateRootHash. */
  @JSName("stateRootHash")
  var stateRootHash_BlockHeader: String = js.native
  
  /**
    * Converts this BlockHeader to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object BlockHeader {
  
  @JSImport("sawtooth-sdk/protobuf", "BlockHeader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BlockHeader instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BlockHeader instance
    */
  @scala.inline
  def create(): BlockHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BlockHeader]
  @scala.inline
  def create(properties: IBlockHeader): BlockHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BlockHeader]
  
  /**
    * Decodes a BlockHeader message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BlockHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): BlockHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BlockHeader]
  @scala.inline
  def decode(reader: Reader, length: Double): BlockHeader = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BlockHeader]
  @scala.inline
  def decode(reader: Uint8Array): BlockHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BlockHeader]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): BlockHeader = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BlockHeader]
  
  /**
    * Decodes a BlockHeader message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BlockHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): BlockHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BlockHeader]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): BlockHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BlockHeader]
  
  /**
    * Encodes the specified BlockHeader message. Does not implicitly {@link BlockHeader.verify|verify} messages.
    * @param message BlockHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IBlockHeader): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IBlockHeader, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BlockHeader message, length delimited. Does not implicitly {@link BlockHeader.verify|verify} messages.
    * @param message BlockHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IBlockHeader): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IBlockHeader, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BlockHeader message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BlockHeader
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): BlockHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BlockHeader]
  
  /**
    * Creates a plain object from a BlockHeader message. Also converts values to other types if specified.
    * @param message BlockHeader
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: BlockHeader): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: BlockHeader, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a BlockHeader message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
