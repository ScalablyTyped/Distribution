package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusIgnoreBlockResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse")
@js.native
/**
  * Constructs a new ConsensusIgnoreBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusIgnoreBlockResponse ()
  extends typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse {
  def this(properties: IConsensusIgnoreBlockResponse) = this()
}
/* static members */
object ConsensusIgnoreBlockResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status with Double] = js.native
    
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.BAD_REQUEST with Double = js.native
    
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.NOT_READY with Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.OK with Double = js.native
    
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.SERVICE_ERROR with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.STATUS_UNSET with Double = js.native
    
    /* 5 */ val UNKNOWN_BLOCK: typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.UNKNOWN_BLOCK with Double = js.native
  }
  
  /**
    * Creates a new ConsensusIgnoreBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusIgnoreBlockResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.create")
  @js.native
  def create(properties: IConsensusIgnoreBlockResponse): typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse = js.native
  
  /**
    * Decodes a ConsensusIgnoreBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusIgnoreBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse = js.native
  
  /**
    * Decodes a ConsensusIgnoreBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusIgnoreBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse = js.native
  
  /**
    * Encodes the specified ConsensusIgnoreBlockResponse message. Does not implicitly {@link ConsensusIgnoreBlockResponse.verify|verify} messages.
    * @param message ConsensusIgnoreBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.encode")
  @js.native
  def encode(message: IConsensusIgnoreBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.encode")
  @js.native
  def encode(message: IConsensusIgnoreBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusIgnoreBlockResponse message, length delimited. Does not implicitly {@link ConsensusIgnoreBlockResponse.verify|verify} messages.
    * @param message ConsensusIgnoreBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusIgnoreBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusIgnoreBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusIgnoreBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusIgnoreBlockResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusIgnoreBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusIgnoreBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusIgnoreBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusIgnoreBlockResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
