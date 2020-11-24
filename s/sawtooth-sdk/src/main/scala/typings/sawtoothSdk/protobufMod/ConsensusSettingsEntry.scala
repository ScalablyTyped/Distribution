package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsEntry")
@js.native
/**
  * Constructs a new ConsensusSettingsEntry.
  * @param [properties] Properties to set
  */
class ConsensusSettingsEntry () extends IConsensusSettingsEntry {
  def this(properties: IConsensusSettingsEntry) = this()
  
  /** ConsensusSettingsEntry key. */
  @JSName("key")
  var key_ConsensusSettingsEntry: String = js.native
  
  /**
    * Converts this ConsensusSettingsEntry to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ConsensusSettingsEntry value. */
  @JSName("value")
  var value_ConsensusSettingsEntry: String = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsEntry")
@js.native
object ConsensusSettingsEntry extends js.Object {
  
  /**
    * Creates a new ConsensusSettingsEntry instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSettingsEntry instance
    */
  def create(): ConsensusSettingsEntry = js.native
  def create(properties: IConsensusSettingsEntry): ConsensusSettingsEntry = js.native
  
  /**
    * Decodes a ConsensusSettingsEntry message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSettingsEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusSettingsEntry = js.native
  def decode(reader: Reader, length: Double): ConsensusSettingsEntry = js.native
  def decode(reader: Uint8Array): ConsensusSettingsEntry = js.native
  def decode(reader: Uint8Array, length: Double): ConsensusSettingsEntry = js.native
  
  /**
    * Decodes a ConsensusSettingsEntry message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSettingsEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusSettingsEntry = js.native
  def decodeDelimited(reader: Uint8Array): ConsensusSettingsEntry = js.native
  
  /**
    * Encodes the specified ConsensusSettingsEntry message. Does not implicitly {@link ConsensusSettingsEntry.verify|verify} messages.
    * @param message ConsensusSettingsEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusSettingsEntry): Writer = js.native
  def encode(message: IConsensusSettingsEntry, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusSettingsEntry message, length delimited. Does not implicitly {@link ConsensusSettingsEntry.verify|verify} messages.
    * @param message ConsensusSettingsEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusSettingsEntry): Writer = js.native
  def encodeDelimited(message: IConsensusSettingsEntry, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusSettingsEntry message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSettingsEntry
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusSettingsEntry = js.native
  
  /**
    * Creates a plain object from a ConsensusSettingsEntry message. Also converts values to other types if specified.
    * @param message ConsensusSettingsEntry
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusSettingsEntry): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusSettingsEntry, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusSettingsEntry message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
