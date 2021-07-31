package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusStateEntry")
@js.native
/**
  * Constructs a new ConsensusStateEntry.
  * @param [properties] Properties to set
  */
class ConsensusStateEntry ()
  extends StObject
     with IConsensusStateEntry {
  def this(properties: IConsensusStateEntry) = this()
  
  /** ConsensusStateEntry address. */
  @JSName("address")
  var address_ConsensusStateEntry: String = js.native
  
  /** ConsensusStateEntry data. */
  @JSName("data")
  var data_ConsensusStateEntry: Uint8Array = js.native
  
  /**
    * Converts this ConsensusStateEntry to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusStateEntry {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusStateEntry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusStateEntry instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusStateEntry instance
    */
  @scala.inline
  def create(): ConsensusStateEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusStateEntry]
  @scala.inline
  def create(properties: IConsensusStateEntry): ConsensusStateEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusStateEntry]
  
  /**
    * Decodes a ConsensusStateEntry message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusStateEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ConsensusStateEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusStateEntry]
  @scala.inline
  def decode(reader: Reader, length: Double): ConsensusStateEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusStateEntry]
  @scala.inline
  def decode(reader: Uint8Array): ConsensusStateEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusStateEntry]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ConsensusStateEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusStateEntry]
  
  /**
    * Decodes a ConsensusStateEntry message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusStateEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ConsensusStateEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusStateEntry]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ConsensusStateEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusStateEntry]
  
  /**
    * Encodes the specified ConsensusStateEntry message. Does not implicitly {@link ConsensusStateEntry.verify|verify} messages.
    * @param message ConsensusStateEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IConsensusStateEntry): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IConsensusStateEntry, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusStateEntry message, length delimited. Does not implicitly {@link ConsensusStateEntry.verify|verify} messages.
    * @param message ConsensusStateEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IConsensusStateEntry): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IConsensusStateEntry, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusStateEntry message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusStateEntry
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusStateEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusStateEntry]
  
  /**
    * Creates a plain object from a ConsensusStateEntry message. Also converts values to other types if specified.
    * @param message ConsensusStateEntry
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ConsensusStateEntry): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ConsensusStateEntry, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusStateEntry message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
