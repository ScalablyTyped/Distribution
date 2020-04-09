package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusRegisterRequest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterRequest")
@js.native
/**
  * Constructs a new ConsensusRegisterRequest.
  * @param [properties] Properties to set
  */
class ConsensusRegisterRequest ()
  extends typings.sawtoothSdk.protobufMod.ConsensusRegisterRequest {
  def this(properties: IConsensusRegisterRequest) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusRegisterRequest")
@js.native
object ConsensusRegisterRequest extends js.Object {
  /**
    * Creates a new ConsensusRegisterRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusRegisterRequest instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ConsensusRegisterRequest = js.native
  def create(properties: IConsensusRegisterRequest): typings.sawtoothSdk.protobufMod.ConsensusRegisterRequest = js.native
  /**
    * Decodes a ConsensusRegisterRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusRegisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusRegisterRequest = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusRegisterRequest = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusRegisterRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusRegisterRequest = js.native
  /**
    * Decodes a ConsensusRegisterRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusRegisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusRegisterRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusRegisterRequest = js.native
  /**
    * Encodes the specified ConsensusRegisterRequest message. Does not implicitly {@link ConsensusRegisterRequest.verify|verify} messages.
    * @param message ConsensusRegisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusRegisterRequest): Writer = js.native
  def encode(message: IConsensusRegisterRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusRegisterRequest message, length delimited. Does not implicitly {@link ConsensusRegisterRequest.verify|verify} messages.
    * @param message ConsensusRegisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusRegisterRequest): Writer = js.native
  def encodeDelimited(message: IConsensusRegisterRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusRegisterRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusRegisterRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusRegisterRequest = js.native
  /**
    * Creates a plain object from a ConsensusRegisterRequest message. Also converts values to other types if specified.
    * @param message ConsensusRegisterRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusRegisterRequest): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusRegisterRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusRegisterRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

