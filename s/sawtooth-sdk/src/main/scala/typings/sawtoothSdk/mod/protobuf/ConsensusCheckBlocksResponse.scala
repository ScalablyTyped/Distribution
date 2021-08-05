package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusCheckBlocksResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusCheckBlocksResponse")
@js.native
/**
  * Constructs a new ConsensusCheckBlocksResponse.
  * @param [properties] Properties to set
  */
class ConsensusCheckBlocksResponse ()
  extends typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse {
  def this(properties: IConsensusCheckBlocksResponse) = this()
}
/* static members */
object ConsensusCheckBlocksResponse {
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCheckBlocksResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCheckBlocksResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status & Double] = js.native
    
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.BAD_REQUEST & Double = js.native
    
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.NOT_READY & Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.OK & Double = js.native
    
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.SERVICE_ERROR & Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.STATUS_UNSET & Double = js.native
    
    /* 5 */ val UNKNOWN_BLOCK: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.UNKNOWN_BLOCK & Double = js.native
  }
  
  /**
    * Creates a new ConsensusCheckBlocksResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCheckBlocksResponse instance
    */
  inline def create(): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse]
  inline def create(properties: IConsensusCheckBlocksResponse): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse]
  
  /**
    * Decodes a ConsensusCheckBlocksResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCheckBlocksResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse]
  inline def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse]
  inline def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse]
  inline def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse]
  
  /**
    * Decodes a ConsensusCheckBlocksResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCheckBlocksResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse]
  inline def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse]
  
  /**
    * Encodes the specified ConsensusCheckBlocksResponse message. Does not implicitly {@link ConsensusCheckBlocksResponse.verify|verify} messages.
    * @param message ConsensusCheckBlocksResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusCheckBlocksResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusCheckBlocksResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusCheckBlocksResponse message, length delimited. Does not implicitly {@link ConsensusCheckBlocksResponse.verify|verify} messages.
    * @param message ConsensusCheckBlocksResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusCheckBlocksResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusCheckBlocksResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusCheckBlocksResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCheckBlocksResponse
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse]
  
  /**
    * Creates a plain object from a ConsensusCheckBlocksResponse message. Also converts values to other types if specified.
    * @param message ConsensusCheckBlocksResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusCheckBlocksResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
