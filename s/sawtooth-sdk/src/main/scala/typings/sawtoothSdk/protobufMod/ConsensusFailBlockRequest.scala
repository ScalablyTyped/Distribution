package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest")
@js.native
/**
  * Constructs a new ConsensusFailBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusFailBlockRequest ()
  extends StObject
     with IConsensusFailBlockRequest {
  def this(properties: IConsensusFailBlockRequest) = this()
  
  /** ConsensusFailBlockRequest blockId. */
  @JSName("blockId")
  var blockId_ConsensusFailBlockRequest: Uint8Array = js.native
  
  /**
    * Converts this ConsensusFailBlockRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusFailBlockRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFailBlockRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusFailBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusFailBlockRequest instance
    */
  @scala.inline
  def create(): ConsensusFailBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusFailBlockRequest]
  @scala.inline
  def create(properties: IConsensusFailBlockRequest): ConsensusFailBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusFailBlockRequest]
  
  /**
    * Decodes a ConsensusFailBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusFailBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ConsensusFailBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusFailBlockRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): ConsensusFailBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusFailBlockRequest]
  @scala.inline
  def decode(reader: Uint8Array): ConsensusFailBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusFailBlockRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ConsensusFailBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusFailBlockRequest]
  
  /**
    * Decodes a ConsensusFailBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusFailBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ConsensusFailBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusFailBlockRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ConsensusFailBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusFailBlockRequest]
  
  /**
    * Encodes the specified ConsensusFailBlockRequest message. Does not implicitly {@link ConsensusFailBlockRequest.verify|verify} messages.
    * @param message ConsensusFailBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IConsensusFailBlockRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IConsensusFailBlockRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusFailBlockRequest message, length delimited. Does not implicitly {@link ConsensusFailBlockRequest.verify|verify} messages.
    * @param message ConsensusFailBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IConsensusFailBlockRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IConsensusFailBlockRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusFailBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusFailBlockRequest
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusFailBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusFailBlockRequest]
  
  /**
    * Creates a plain object from a ConsensusFailBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusFailBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ConsensusFailBlockRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ConsensusFailBlockRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusFailBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
