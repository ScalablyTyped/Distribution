package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusSettingsGetResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetResponse")
@js.native
/**
  * Constructs a new ConsensusSettingsGetResponse.
  * @param [properties] Properties to set
  */
class ConsensusSettingsGetResponse ()
  extends typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse {
  def this(properties: IConsensusSettingsGetResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetResponse")
@js.native
object ConsensusSettingsGetResponse extends js.Object {
  /**
    * Creates a new ConsensusSettingsGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSettingsGetResponse instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  def create(properties: IConsensusSettingsGetResponse): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  /**
    * Decodes a ConsensusSettingsGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSettingsGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  /**
    * Decodes a ConsensusSettingsGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSettingsGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  /**
    * Encodes the specified ConsensusSettingsGetResponse message. Does not implicitly {@link ConsensusSettingsGetResponse.verify|verify} messages.
    * @param message ConsensusSettingsGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusSettingsGetResponse): Writer = js.native
  def encode(message: IConsensusSettingsGetResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusSettingsGetResponse message, length delimited. Does not implicitly {@link ConsensusSettingsGetResponse.verify|verify} messages.
    * @param message ConsensusSettingsGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusSettingsGetResponse): Writer = js.native
  def encodeDelimited(message: IConsensusSettingsGetResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusSettingsGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSettingsGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse = js.native
  /**
    * Creates a plain object from a ConsensusSettingsGetResponse message. Also converts values to other types if specified.
    * @param message ConsensusSettingsGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusSettingsGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.BAD_REQUEST with Double = js.native
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.NOT_READY with Double = js.native
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.OK with Double = js.native
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.SERVICE_ERROR with Double = js.native
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.STATUS_UNSET with Double = js.native
    /* 5 */ val UNKNOWN_BLOCK: typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.UNKNOWN_BLOCK with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status with Double] = js.native
  }
  
}

