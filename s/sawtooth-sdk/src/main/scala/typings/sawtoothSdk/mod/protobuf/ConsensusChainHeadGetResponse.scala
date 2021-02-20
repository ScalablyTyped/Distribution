package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusChainHeadGetResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse")
@js.native
/**
  * Constructs a new ConsensusChainHeadGetResponse.
  * @param [properties] Properties to set
  */
class ConsensusChainHeadGetResponse ()
  extends typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse {
  def this(properties: IConsensusChainHeadGetResponse) = this()
}
/* static members */
object ConsensusChainHeadGetResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status with Double] = js.native
    
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.BAD_REQUEST with Double = js.native
    
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.NOT_READY with Double = js.native
    
    /* 5 */ val NO_CHAIN_HEAD: typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.NO_CHAIN_HEAD with Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.OK with Double = js.native
    
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.SERVICE_ERROR with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ConsensusChainHeadGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusChainHeadGetResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.create")
  @js.native
  def create(properties: IConsensusChainHeadGetResponse): typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  
  /**
    * Decodes a ConsensusChainHeadGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusChainHeadGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  
  /**
    * Decodes a ConsensusChainHeadGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusChainHeadGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  
  /**
    * Encodes the specified ConsensusChainHeadGetResponse message. Does not implicitly {@link ConsensusChainHeadGetResponse.verify|verify} messages.
    * @param message ConsensusChainHeadGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.encode")
  @js.native
  def encode(message: IConsensusChainHeadGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.encode")
  @js.native
  def encode(message: IConsensusChainHeadGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusChainHeadGetResponse message, length delimited. Does not implicitly {@link ConsensusChainHeadGetResponse.verify|verify} messages.
    * @param message ConsensusChainHeadGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusChainHeadGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusChainHeadGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusChainHeadGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusChainHeadGetResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusChainHeadGetResponse message. Also converts values to other types if specified.
    * @param message ConsensusChainHeadGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.toObject")
  @js.native
  def toObject(
    message: typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusChainHeadGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusChainHeadGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
