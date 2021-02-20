package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusFailBlockResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse")
@js.native
/**
  * Constructs a new ConsensusFailBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusFailBlockResponse ()
  extends typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse {
  def this(properties: IConsensusFailBlockResponse) = this()
}
/* static members */
object ConsensusFailBlockResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse.Status with Double] = js.native
    
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse.Status.BAD_REQUEST with Double = js.native
    
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse.Status.NOT_READY with Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse.Status.OK with Double = js.native
    
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse.Status.SERVICE_ERROR with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse.Status.STATUS_UNSET with Double = js.native
    
    /* 5 */ val UNKNOWN_BLOCK: typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse.Status.UNKNOWN_BLOCK with Double = js.native
  }
  
  /**
    * Creates a new ConsensusFailBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusFailBlockResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.create")
  @js.native
  def create(properties: IConsensusFailBlockResponse): typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse = js.native
  
  /**
    * Decodes a ConsensusFailBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusFailBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse = js.native
  
  /**
    * Decodes a ConsensusFailBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusFailBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse = js.native
  
  /**
    * Encodes the specified ConsensusFailBlockResponse message. Does not implicitly {@link ConsensusFailBlockResponse.verify|verify} messages.
    * @param message ConsensusFailBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.encode")
  @js.native
  def encode(message: IConsensusFailBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.encode")
  @js.native
  def encode(message: IConsensusFailBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusFailBlockResponse message, length delimited. Does not implicitly {@link ConsensusFailBlockResponse.verify|verify} messages.
    * @param message ConsensusFailBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusFailBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusFailBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusFailBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusFailBlockResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusFailBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusFailBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusFailBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusFailBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusFailBlockResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
