package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid")
@js.native
/**
  * Constructs a new ConsensusNotifyBlockInvalid.
  * @param [properties] Properties to set
  */
class ConsensusNotifyBlockInvalid () extends IConsensusNotifyBlockInvalid {
  def this(properties: IConsensusNotifyBlockInvalid) = this()
  
  /** ConsensusNotifyBlockInvalid blockId. */
  @JSName("blockId")
  var blockId_ConsensusNotifyBlockInvalid: Uint8Array = js.native
  
  /**
    * Converts this ConsensusNotifyBlockInvalid to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusNotifyBlockInvalid {
  
  /**
    * Creates a new ConsensusNotifyBlockInvalid instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyBlockInvalid instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid.create")
  @js.native
  def create(): ConsensusNotifyBlockInvalid = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid.create")
  @js.native
  def create(properties: IConsensusNotifyBlockInvalid): ConsensusNotifyBlockInvalid = js.native
  
  /**
    * Decodes a ConsensusNotifyBlockInvalid message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyBlockInvalid
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid.decode")
  @js.native
  def decode(reader: Reader): ConsensusNotifyBlockInvalid = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid.decode")
  @js.native
  def decode(reader: Reader, length: Double): ConsensusNotifyBlockInvalid = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid.decode")
  @js.native
  def decode(reader: Uint8Array): ConsensusNotifyBlockInvalid = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ConsensusNotifyBlockInvalid = js.native
  
  /**
    * Decodes a ConsensusNotifyBlockInvalid message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyBlockInvalid
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ConsensusNotifyBlockInvalid = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ConsensusNotifyBlockInvalid = js.native
  
  /**
    * Encodes the specified ConsensusNotifyBlockInvalid message. Does not implicitly {@link ConsensusNotifyBlockInvalid.verify|verify} messages.
    * @param message ConsensusNotifyBlockInvalid message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid.encode")
  @js.native
  def encode(message: IConsensusNotifyBlockInvalid): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid.encode")
  @js.native
  def encode(message: IConsensusNotifyBlockInvalid, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusNotifyBlockInvalid message, length delimited. Does not implicitly {@link ConsensusNotifyBlockInvalid.verify|verify} messages.
    * @param message ConsensusNotifyBlockInvalid message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusNotifyBlockInvalid): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusNotifyBlockInvalid, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusNotifyBlockInvalid message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyBlockInvalid
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusNotifyBlockInvalid = js.native
  
  /**
    * Creates a plain object from a ConsensusNotifyBlockInvalid message. Also converts values to other types if specified.
    * @param message ConsensusNotifyBlockInvalid
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid.toObject")
  @js.native
  def toObject(message: ConsensusNotifyBlockInvalid): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid.toObject")
  @js.native
  def toObject(message: ConsensusNotifyBlockInvalid, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusNotifyBlockInvalid message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockInvalid.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
