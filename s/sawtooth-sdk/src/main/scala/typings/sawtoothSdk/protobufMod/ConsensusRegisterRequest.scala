package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest")
@js.native
/**
  * Constructs a new ConsensusRegisterRequest.
  * @param [properties] Properties to set
  */
class ConsensusRegisterRequest ()
  extends StObject
     with IConsensusRegisterRequest {
  def this(properties: IConsensusRegisterRequest) = this()
  
  /** ConsensusRegisterRequest name. */
  @JSName("name")
  var name_ConsensusRegisterRequest: String = js.native
  
  /**
    * Converts this ConsensusRegisterRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ConsensusRegisterRequest version. */
  @JSName("version")
  var version_ConsensusRegisterRequest: String = js.native
}
/* static members */
object ConsensusRegisterRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusRegisterRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusRegisterRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusRegisterRequest instance
    */
  inline def create(): ConsensusRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusRegisterRequest]
  inline def create(properties: IConsensusRegisterRequest): ConsensusRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusRegisterRequest]
  
  /**
    * Decodes a ConsensusRegisterRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusRegisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ConsensusRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusRegisterRequest]
  inline def decode(reader: Reader, length: Double): ConsensusRegisterRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusRegisterRequest]
  inline def decode(reader: Uint8Array): ConsensusRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusRegisterRequest]
  inline def decode(reader: Uint8Array, length: Double): ConsensusRegisterRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusRegisterRequest]
  
  /**
    * Decodes a ConsensusRegisterRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusRegisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ConsensusRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusRegisterRequest]
  inline def decodeDelimited(reader: Uint8Array): ConsensusRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusRegisterRequest]
  
  /**
    * Encodes the specified ConsensusRegisterRequest message. Does not implicitly {@link ConsensusRegisterRequest.verify|verify} messages.
    * @param message ConsensusRegisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusRegisterRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusRegisterRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusRegisterRequest message, length delimited. Does not implicitly {@link ConsensusRegisterRequest.verify|verify} messages.
    * @param message ConsensusRegisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusRegisterRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusRegisterRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusRegisterRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusRegisterRequest
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): ConsensusRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusRegisterRequest]
  
  /**
    * Creates a plain object from a ConsensusRegisterRequest message. Also converts values to other types if specified.
    * @param message ConsensusRegisterRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ConsensusRegisterRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ConsensusRegisterRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusRegisterRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
