package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksRequest")
@js.native
/**
  * Constructs a new ConsensusCheckBlocksRequest.
  * @param [properties] Properties to set
  */
class ConsensusCheckBlocksRequest ()
  extends StObject
     with IConsensusCheckBlocksRequest {
  def this(properties: IConsensusCheckBlocksRequest) = this()
  
  /** ConsensusCheckBlocksRequest blockIds. */
  @JSName("blockIds")
  var blockIds_ConsensusCheckBlocksRequest: js.Array[Uint8Array] = js.native
  
  /**
    * Converts this ConsensusCheckBlocksRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusCheckBlocksRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCheckBlocksRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusCheckBlocksRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCheckBlocksRequest instance
    */
  inline def create(): ConsensusCheckBlocksRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusCheckBlocksRequest]
  inline def create(properties: IConsensusCheckBlocksRequest): ConsensusCheckBlocksRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusCheckBlocksRequest]
  
  /**
    * Decodes a ConsensusCheckBlocksRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCheckBlocksRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ConsensusCheckBlocksRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusCheckBlocksRequest]
  inline def decode(reader: Reader, length: Double): ConsensusCheckBlocksRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusCheckBlocksRequest]
  inline def decode(reader: Uint8Array): ConsensusCheckBlocksRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusCheckBlocksRequest]
  inline def decode(reader: Uint8Array, length: Double): ConsensusCheckBlocksRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusCheckBlocksRequest]
  
  /**
    * Decodes a ConsensusCheckBlocksRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCheckBlocksRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ConsensusCheckBlocksRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusCheckBlocksRequest]
  inline def decodeDelimited(reader: Uint8Array): ConsensusCheckBlocksRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusCheckBlocksRequest]
  
  /**
    * Encodes the specified ConsensusCheckBlocksRequest message. Does not implicitly {@link ConsensusCheckBlocksRequest.verify|verify} messages.
    * @param message ConsensusCheckBlocksRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusCheckBlocksRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusCheckBlocksRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusCheckBlocksRequest message, length delimited. Does not implicitly {@link ConsensusCheckBlocksRequest.verify|verify} messages.
    * @param message ConsensusCheckBlocksRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusCheckBlocksRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusCheckBlocksRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusCheckBlocksRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCheckBlocksRequest
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): ConsensusCheckBlocksRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusCheckBlocksRequest]
  
  /**
    * Creates a plain object from a ConsensusCheckBlocksRequest message. Also converts values to other types if specified.
    * @param message ConsensusCheckBlocksRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ConsensusCheckBlocksRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ConsensusCheckBlocksRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusCheckBlocksRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
