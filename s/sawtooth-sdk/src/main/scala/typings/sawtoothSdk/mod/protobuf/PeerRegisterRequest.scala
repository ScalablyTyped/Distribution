package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IPeerRegisterRequest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.PeerRegisterRequest")
@js.native
/**
  * Constructs a new PeerRegisterRequest.
  * @param [properties] Properties to set
  */
class PeerRegisterRequest ()
  extends typings.sawtoothSdk.protobufMod.PeerRegisterRequest {
  def this(properties: IPeerRegisterRequest) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.PeerRegisterRequest")
@js.native
object PeerRegisterRequest extends js.Object {
  /**
    * Creates a new PeerRegisterRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PeerRegisterRequest instance
    */
  def create(): typings.sawtoothSdk.protobufMod.PeerRegisterRequest = js.native
  def create(properties: IPeerRegisterRequest): typings.sawtoothSdk.protobufMod.PeerRegisterRequest = js.native
  /**
    * Decodes a PeerRegisterRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PeerRegisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.PeerRegisterRequest = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.PeerRegisterRequest = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.PeerRegisterRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.PeerRegisterRequest = js.native
  /**
    * Decodes a PeerRegisterRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PeerRegisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.PeerRegisterRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.PeerRegisterRequest = js.native
  /**
    * Encodes the specified PeerRegisterRequest message. Does not implicitly {@link PeerRegisterRequest.verify|verify} messages.
    * @param message PeerRegisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPeerRegisterRequest): Writer = js.native
  def encode(message: IPeerRegisterRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified PeerRegisterRequest message, length delimited. Does not implicitly {@link PeerRegisterRequest.verify|verify} messages.
    * @param message PeerRegisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPeerRegisterRequest): Writer = js.native
  def encodeDelimited(message: IPeerRegisterRequest, writer: Writer): Writer = js.native
  /**
    * Creates a PeerRegisterRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PeerRegisterRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.PeerRegisterRequest = js.native
  /**
    * Creates a plain object from a PeerRegisterRequest message. Also converts values to other types if specified.
    * @param message PeerRegisterRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.PeerRegisterRequest): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.PeerRegisterRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a PeerRegisterRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

