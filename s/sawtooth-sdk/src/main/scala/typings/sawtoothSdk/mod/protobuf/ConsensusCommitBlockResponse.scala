package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusCommitBlockResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse")
@js.native
/**
  * Constructs a new ConsensusCommitBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusCommitBlockResponse ()
  extends typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse {
  def this(properties: IConsensusCommitBlockResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusCommitBlockResponse")
@js.native
object ConsensusCommitBlockResponse extends js.Object {
  /**
    * Creates a new ConsensusCommitBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCommitBlockResponse instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  def create(properties: IConsensusCommitBlockResponse): typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  /**
    * Decodes a ConsensusCommitBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCommitBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  /**
    * Decodes a ConsensusCommitBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCommitBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  /**
    * Encodes the specified ConsensusCommitBlockResponse message. Does not implicitly {@link ConsensusCommitBlockResponse.verify|verify} messages.
    * @param message ConsensusCommitBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusCommitBlockResponse): Writer = js.native
  def encode(message: IConsensusCommitBlockResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusCommitBlockResponse message, length delimited. Does not implicitly {@link ConsensusCommitBlockResponse.verify|verify} messages.
    * @param message ConsensusCommitBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusCommitBlockResponse): Writer = js.native
  def encodeDelimited(message: IConsensusCommitBlockResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusCommitBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCommitBlockResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse = js.native
  /**
    * Creates a plain object from a ConsensusCommitBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusCommitBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusCommitBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.BAD_REQUEST with Double = js.native
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.NOT_READY with Double = js.native
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.OK with Double = js.native
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.SERVICE_ERROR with Double = js.native
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.STATUS_UNSET with Double = js.native
    /* 5 */ val UNKNOWN_BLOCK: typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status.UNKNOWN_BLOCK with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status with Double] = js.native
  }
  
}

