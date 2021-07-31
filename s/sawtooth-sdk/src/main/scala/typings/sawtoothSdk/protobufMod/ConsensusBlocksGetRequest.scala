package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest")
@js.native
/**
  * Constructs a new ConsensusBlocksGetRequest.
  * @param [properties] Properties to set
  */
class ConsensusBlocksGetRequest ()
  extends StObject
     with IConsensusBlocksGetRequest {
  def this(properties: IConsensusBlocksGetRequest) = this()
  
  /** ConsensusBlocksGetRequest blockIds. */
  @JSName("blockIds")
  var blockIds_ConsensusBlocksGetRequest: js.Array[Uint8Array] = js.native
  
  /**
    * Converts this ConsensusBlocksGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusBlocksGetRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusBlocksGetRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusBlocksGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBlocksGetRequest instance
    */
  @scala.inline
  def create(): ConsensusBlocksGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusBlocksGetRequest]
  @scala.inline
  def create(properties: IConsensusBlocksGetRequest): ConsensusBlocksGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusBlocksGetRequest]
  
  /**
    * Decodes a ConsensusBlocksGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBlocksGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ConsensusBlocksGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusBlocksGetRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): ConsensusBlocksGetRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusBlocksGetRequest]
  @scala.inline
  def decode(reader: Uint8Array): ConsensusBlocksGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusBlocksGetRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ConsensusBlocksGetRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusBlocksGetRequest]
  
  /**
    * Decodes a ConsensusBlocksGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBlocksGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ConsensusBlocksGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusBlocksGetRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ConsensusBlocksGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusBlocksGetRequest]
  
  /**
    * Encodes the specified ConsensusBlocksGetRequest message. Does not implicitly {@link ConsensusBlocksGetRequest.verify|verify} messages.
    * @param message ConsensusBlocksGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IConsensusBlocksGetRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IConsensusBlocksGetRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusBlocksGetRequest message, length delimited. Does not implicitly {@link ConsensusBlocksGetRequest.verify|verify} messages.
    * @param message ConsensusBlocksGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IConsensusBlocksGetRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IConsensusBlocksGetRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusBlocksGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusBlocksGetRequest
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusBlocksGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusBlocksGetRequest]
  
  /**
    * Creates a plain object from a ConsensusBlocksGetRequest message. Also converts values to other types if specified.
    * @param message ConsensusBlocksGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ConsensusBlocksGetRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ConsensusBlocksGetRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusBlocksGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
