package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.INetworkAcknowledgement
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.NetworkAcknowledgement")
@js.native
/**
  * Constructs a new NetworkAcknowledgement.
  * @param [properties] Properties to set
  */
class NetworkAcknowledgement ()
  extends typings.sawtoothSdk.protobufMod.NetworkAcknowledgement {
  def this(properties: INetworkAcknowledgement) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.NetworkAcknowledgement")
@js.native
object NetworkAcknowledgement extends js.Object {
  /**
    * Creates a new NetworkAcknowledgement instance using the specified properties.
    * @param [properties] Properties to set
    * @returns NetworkAcknowledgement instance
    */
  def create(): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = js.native
  def create(properties: INetworkAcknowledgement): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = js.native
  /**
    * Decodes a NetworkAcknowledgement message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns NetworkAcknowledgement
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = js.native
  /**
    * Decodes a NetworkAcknowledgement message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns NetworkAcknowledgement
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = js.native
  /**
    * Encodes the specified NetworkAcknowledgement message. Does not implicitly {@link NetworkAcknowledgement.verify|verify} messages.
    * @param message NetworkAcknowledgement message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: INetworkAcknowledgement): Writer = js.native
  def encode(message: INetworkAcknowledgement, writer: Writer): Writer = js.native
  /**
    * Encodes the specified NetworkAcknowledgement message, length delimited. Does not implicitly {@link NetworkAcknowledgement.verify|verify} messages.
    * @param message NetworkAcknowledgement message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: INetworkAcknowledgement): Writer = js.native
  def encodeDelimited(message: INetworkAcknowledgement, writer: Writer): Writer = js.native
  /**
    * Creates a NetworkAcknowledgement message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns NetworkAcknowledgement
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = js.native
  /**
    * Creates a plain object from a NetworkAcknowledgement message. Also converts values to other types if specified.
    * @param message NetworkAcknowledgement
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.NetworkAcknowledgement): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.NetworkAcknowledgement, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a NetworkAcknowledgement message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val ERROR: typings.sawtoothSdk.protobufMod.NetworkAcknowledgement.Status.ERROR with Double = js.native
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.NetworkAcknowledgement.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.NetworkAcknowledgement.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.NetworkAcknowledgement.Status with Double] = js.native
  }
  
}

