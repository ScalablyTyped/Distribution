package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusStateEntry
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry")
@js.native
/**
  * Constructs a new ConsensusStateEntry.
  * @param [properties] Properties to set
  */
class ConsensusStateEntry ()
  extends typings.sawtoothSdk.protobufMod.ConsensusStateEntry {
  def this(properties: IConsensusStateEntry) = this()
}
/* static members */
object ConsensusStateEntry {
  
  /**
    * Creates a new ConsensusStateEntry instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusStateEntry instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ConsensusStateEntry = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry.create")
  @js.native
  def create(properties: IConsensusStateEntry): typings.sawtoothSdk.protobufMod.ConsensusStateEntry = js.native
  
  /**
    * Decodes a ConsensusStateEntry message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusStateEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusStateEntry = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusStateEntry = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusStateEntry = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusStateEntry = js.native
  
  /**
    * Decodes a ConsensusStateEntry message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusStateEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusStateEntry = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusStateEntry = js.native
  
  /**
    * Encodes the specified ConsensusStateEntry message. Does not implicitly {@link ConsensusStateEntry.verify|verify} messages.
    * @param message ConsensusStateEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry.encode")
  @js.native
  def encode(message: IConsensusStateEntry): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry.encode")
  @js.native
  def encode(message: IConsensusStateEntry, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusStateEntry message, length delimited. Does not implicitly {@link ConsensusStateEntry.verify|verify} messages.
    * @param message ConsensusStateEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusStateEntry): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusStateEntry, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusStateEntry message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusStateEntry
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusStateEntry = js.native
  
  /**
    * Creates a plain object from a ConsensusStateEntry message. Also converts values to other types if specified.
    * @param message ConsensusStateEntry
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusStateEntry): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusStateEntry, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusStateEntry message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusStateEntry.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
