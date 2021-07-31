package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusChainHeadGetRequest")
@js.native
/**
  * Constructs a new ConsensusChainHeadGetRequest.
  * @param [properties] Properties to set
  */
class ConsensusChainHeadGetRequest ()
  extends StObject
     with IConsensusChainHeadGetRequest {
  def this(properties: IConsensusChainHeadGetRequest) = this()
  
  /**
    * Converts this ConsensusChainHeadGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusChainHeadGetRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusChainHeadGetRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusChainHeadGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusChainHeadGetRequest instance
    */
  @scala.inline
  def create(): ConsensusChainHeadGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusChainHeadGetRequest]
  @scala.inline
  def create(properties: IConsensusChainHeadGetRequest): ConsensusChainHeadGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusChainHeadGetRequest]
  
  /**
    * Decodes a ConsensusChainHeadGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusChainHeadGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ConsensusChainHeadGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusChainHeadGetRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): ConsensusChainHeadGetRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusChainHeadGetRequest]
  @scala.inline
  def decode(reader: Uint8Array): ConsensusChainHeadGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusChainHeadGetRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ConsensusChainHeadGetRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusChainHeadGetRequest]
  
  /**
    * Decodes a ConsensusChainHeadGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusChainHeadGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ConsensusChainHeadGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusChainHeadGetRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ConsensusChainHeadGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusChainHeadGetRequest]
  
  /**
    * Encodes the specified ConsensusChainHeadGetRequest message. Does not implicitly {@link ConsensusChainHeadGetRequest.verify|verify} messages.
    * @param message ConsensusChainHeadGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IConsensusChainHeadGetRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IConsensusChainHeadGetRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusChainHeadGetRequest message, length delimited. Does not implicitly {@link ConsensusChainHeadGetRequest.verify|verify} messages.
    * @param message ConsensusChainHeadGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IConsensusChainHeadGetRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IConsensusChainHeadGetRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusChainHeadGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusChainHeadGetRequest
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusChainHeadGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusChainHeadGetRequest]
  
  /**
    * Creates a plain object from a ConsensusChainHeadGetRequest message. Also converts values to other types if specified.
    * @param message ConsensusChainHeadGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ConsensusChainHeadGetRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ConsensusChainHeadGetRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusChainHeadGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
