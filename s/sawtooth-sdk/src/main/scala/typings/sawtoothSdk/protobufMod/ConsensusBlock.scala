package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusBlock")
@js.native
/**
  * Constructs a new ConsensusBlock.
  * @param [properties] Properties to set
  */
class ConsensusBlock ()
  extends StObject
     with IConsensusBlock {
  def this(properties: IConsensusBlock) = this()
  
  /** ConsensusBlock blockId. */
  @JSName("blockId")
  var blockId_ConsensusBlock: Uint8Array = js.native
  
  /** ConsensusBlock blockNum. */
  @JSName("blockNum")
  var blockNum_ConsensusBlock: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  
  /** ConsensusBlock payload. */
  @JSName("payload")
  var payload_ConsensusBlock: Uint8Array = js.native
  
  /** ConsensusBlock previousId. */
  @JSName("previousId")
  var previousId_ConsensusBlock: Uint8Array = js.native
  
  /** ConsensusBlock signerId. */
  @JSName("signerId")
  var signerId_ConsensusBlock: Uint8Array = js.native
  
  /** ConsensusBlock summary. */
  @JSName("summary")
  var summary_ConsensusBlock: Uint8Array = js.native
  
  /**
    * Converts this ConsensusBlock to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusBlock {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlock")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusBlock instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBlock instance
    */
  @scala.inline
  def create(): ConsensusBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusBlock]
  @scala.inline
  def create(properties: IConsensusBlock): ConsensusBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusBlock]
  
  /**
    * Decodes a ConsensusBlock message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBlock
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ConsensusBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusBlock]
  @scala.inline
  def decode(reader: Reader, length: Double): ConsensusBlock = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusBlock]
  @scala.inline
  def decode(reader: Uint8Array): ConsensusBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusBlock]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ConsensusBlock = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusBlock]
  
  /**
    * Decodes a ConsensusBlock message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBlock
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ConsensusBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusBlock]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ConsensusBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusBlock]
  
  /**
    * Encodes the specified ConsensusBlock message. Does not implicitly {@link ConsensusBlock.verify|verify} messages.
    * @param message ConsensusBlock message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IConsensusBlock): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IConsensusBlock, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusBlock message, length delimited. Does not implicitly {@link ConsensusBlock.verify|verify} messages.
    * @param message ConsensusBlock message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IConsensusBlock): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IConsensusBlock, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusBlock message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusBlock
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusBlock]
  
  /**
    * Creates a plain object from a ConsensusBlock message. Also converts values to other types if specified.
    * @param message ConsensusBlock
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ConsensusBlock): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ConsensusBlock, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusBlock message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
