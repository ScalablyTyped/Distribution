package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusSettingsEntry
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry")
@js.native
/**
  * Constructs a new ConsensusSettingsEntry.
  * @param [properties] Properties to set
  */
class ConsensusSettingsEntry ()
  extends typings.sawtoothSdk.protobufMod.ConsensusSettingsEntry {
  def this(properties: IConsensusSettingsEntry) = this()
}
/* static members */
object ConsensusSettingsEntry {
  
  /**
    * Creates a new ConsensusSettingsEntry instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSettingsEntry instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ConsensusSettingsEntry = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry.create")
  @js.native
  def create(properties: IConsensusSettingsEntry): typings.sawtoothSdk.protobufMod.ConsensusSettingsEntry = js.native
  
  /**
    * Decodes a ConsensusSettingsEntry message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSettingsEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusSettingsEntry = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusSettingsEntry = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusSettingsEntry = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusSettingsEntry = js.native
  
  /**
    * Decodes a ConsensusSettingsEntry message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSettingsEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusSettingsEntry = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusSettingsEntry = js.native
  
  /**
    * Encodes the specified ConsensusSettingsEntry message. Does not implicitly {@link ConsensusSettingsEntry.verify|verify} messages.
    * @param message ConsensusSettingsEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry.encode")
  @js.native
  def encode(message: IConsensusSettingsEntry): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry.encode")
  @js.native
  def encode(message: IConsensusSettingsEntry, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusSettingsEntry message, length delimited. Does not implicitly {@link ConsensusSettingsEntry.verify|verify} messages.
    * @param message ConsensusSettingsEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusSettingsEntry): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusSettingsEntry, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusSettingsEntry message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSettingsEntry
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusSettingsEntry = js.native
  
  /**
    * Creates a plain object from a ConsensusSettingsEntry message. Also converts values to other types if specified.
    * @param message ConsensusSettingsEntry
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusSettingsEntry): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusSettingsEntry, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusSettingsEntry message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsEntry.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
