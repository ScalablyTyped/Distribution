package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusCheckBlocksResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("sawtooth-sdk", "protobuf.ConsensusCheckBlocksResponse")
@js.native
object ConsensusCheckBlocksResponse extends js.Object {
  /**
    * Creates a new ConsensusCheckBlocksResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCheckBlocksResponse instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  def create(properties: IConsensusCheckBlocksResponse): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  /**
    * Decodes a ConsensusCheckBlocksResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCheckBlocksResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  /**
    * Decodes a ConsensusCheckBlocksResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCheckBlocksResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  /**
    * Encodes the specified ConsensusCheckBlocksResponse message. Does not implicitly {@link ConsensusCheckBlocksResponse.verify|verify} messages.
    * @param message ConsensusCheckBlocksResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusCheckBlocksResponse): Writer = js.native
  def encode(message: IConsensusCheckBlocksResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusCheckBlocksResponse message, length delimited. Does not implicitly {@link ConsensusCheckBlocksResponse.verify|verify} messages.
    * @param message ConsensusCheckBlocksResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusCheckBlocksResponse): Writer = js.native
  def encodeDelimited(message: IConsensusCheckBlocksResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusCheckBlocksResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCheckBlocksResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse = js.native
  /**
    * Creates a plain object from a ConsensusCheckBlocksResponse message. Also converts values to other types if specified.
    * @param message ConsensusCheckBlocksResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusCheckBlocksResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.BAD_REQUEST with Double = js.native
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.NOT_READY with Double = js.native
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.OK with Double = js.native
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.SERVICE_ERROR with Double = js.native
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.STATUS_UNSET with Double = js.native
    /* 5 */ val UNKNOWN_BLOCK: typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status.UNKNOWN_BLOCK with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status with Double] = js.native
  }
  
}

