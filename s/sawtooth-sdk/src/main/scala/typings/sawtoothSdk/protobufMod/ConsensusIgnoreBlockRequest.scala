package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest")
@js.native
/**
  * Constructs a new ConsensusIgnoreBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusIgnoreBlockRequest ()
  extends StObject
     with IConsensusIgnoreBlockRequest {
  def this(properties: IConsensusIgnoreBlockRequest) = this()
  
  /** ConsensusIgnoreBlockRequest blockId. */
  @JSName("blockId")
  var blockId_ConsensusIgnoreBlockRequest: Uint8Array = js.native
  
  /**
    * Converts this ConsensusIgnoreBlockRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusIgnoreBlockRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusIgnoreBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusIgnoreBlockRequest instance
    */
  @scala.inline
  def create(): ConsensusIgnoreBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusIgnoreBlockRequest]
  @scala.inline
  def create(properties: IConsensusIgnoreBlockRequest): ConsensusIgnoreBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockRequest]
  
  /**
    * Decodes a ConsensusIgnoreBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusIgnoreBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ConsensusIgnoreBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): ConsensusIgnoreBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusIgnoreBlockRequest]
  @scala.inline
  def decode(reader: Uint8Array): ConsensusIgnoreBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ConsensusIgnoreBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusIgnoreBlockRequest]
  
  /**
    * Decodes a ConsensusIgnoreBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusIgnoreBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ConsensusIgnoreBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ConsensusIgnoreBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockRequest]
  
  /**
    * Encodes the specified ConsensusIgnoreBlockRequest message. Does not implicitly {@link ConsensusIgnoreBlockRequest.verify|verify} messages.
    * @param message ConsensusIgnoreBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IConsensusIgnoreBlockRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IConsensusIgnoreBlockRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusIgnoreBlockRequest message, length delimited. Does not implicitly {@link ConsensusIgnoreBlockRequest.verify|verify} messages.
    * @param message ConsensusIgnoreBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IConsensusIgnoreBlockRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IConsensusIgnoreBlockRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusIgnoreBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusIgnoreBlockRequest
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusIgnoreBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockRequest]
  
  /**
    * Creates a plain object from a ConsensusIgnoreBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusIgnoreBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ConsensusIgnoreBlockRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ConsensusIgnoreBlockRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusIgnoreBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
