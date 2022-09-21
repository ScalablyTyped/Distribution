package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest")
@js.native
/**
  * Constructs a new ConsensusInitializeBlockRequest.
  * @param [properties] Properties to set
  */
open class ConsensusInitializeBlockRequest ()
  extends StObject
     with IConsensusInitializeBlockRequest {
  def this(properties: IConsensusInitializeBlockRequest) = this()
  
  /** ConsensusInitializeBlockRequest previousId. */
  @JSName("previousId")
  var previousId_ConsensusInitializeBlockRequest: js.typedarray.Uint8Array = js.native
  
  /**
    * Converts this ConsensusInitializeBlockRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ConsensusInitializeBlockRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusInitializeBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusInitializeBlockRequest instance
    */
  inline def create(): ConsensusInitializeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusInitializeBlockRequest]
  inline def create(properties: IConsensusInitializeBlockRequest): ConsensusInitializeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusInitializeBlockRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ConsensusInitializeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusInitializeBlockRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusInitializeBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusInitializeBlockRequest]
  /**
    * Decodes a ConsensusInitializeBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusInitializeBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ConsensusInitializeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusInitializeBlockRequest]
  inline def decode(reader: Reader, length: Double): ConsensusInitializeBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusInitializeBlockRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusInitializeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusInitializeBlockRequest]
  /**
    * Decodes a ConsensusInitializeBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusInitializeBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ConsensusInitializeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusInitializeBlockRequest]
  
  /**
    * Encodes the specified ConsensusInitializeBlockRequest message. Does not implicitly {@link ConsensusInitializeBlockRequest.verify|verify} messages.
    * @param message ConsensusInitializeBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusInitializeBlockRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusInitializeBlockRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusInitializeBlockRequest message, length delimited. Does not implicitly {@link ConsensusInitializeBlockRequest.verify|verify} messages.
    * @param message ConsensusInitializeBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusInitializeBlockRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusInitializeBlockRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusInitializeBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusInitializeBlockRequest
    */
  inline def fromObject(`object`: StringDictionary[Any]): ConsensusInitializeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusInitializeBlockRequest]
  
  /**
    * Creates a plain object from a ConsensusInitializeBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusInitializeBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ConsensusInitializeBlockRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ConsensusInitializeBlockRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ConsensusInitializeBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
