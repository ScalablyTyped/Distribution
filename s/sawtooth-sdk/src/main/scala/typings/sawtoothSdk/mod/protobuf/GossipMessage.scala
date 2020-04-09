package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IGossipMessage
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.GossipMessage")
@js.native
/**
  * Constructs a new GossipMessage.
  * @param [properties] Properties to set
  */
class GossipMessage ()
  extends typings.sawtoothSdk.protobufMod.GossipMessage {
  def this(properties: IGossipMessage) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.GossipMessage")
@js.native
object GossipMessage extends js.Object {
  /**
    * Creates a new GossipMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipMessage instance
    */
  def create(): typings.sawtoothSdk.protobufMod.GossipMessage = js.native
  def create(properties: IGossipMessage): typings.sawtoothSdk.protobufMod.GossipMessage = js.native
  /**
    * Decodes a GossipMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.GossipMessage = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.GossipMessage = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GossipMessage = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.GossipMessage = js.native
  /**
    * Decodes a GossipMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.GossipMessage = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GossipMessage = js.native
  /**
    * Encodes the specified GossipMessage message. Does not implicitly {@link GossipMessage.verify|verify} messages.
    * @param message GossipMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGossipMessage): Writer = js.native
  def encode(message: IGossipMessage, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GossipMessage message, length delimited. Does not implicitly {@link GossipMessage.verify|verify} messages.
    * @param message GossipMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGossipMessage): Writer = js.native
  def encodeDelimited(message: IGossipMessage, writer: Writer): Writer = js.native
  /**
    * Creates a GossipMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipMessage
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.GossipMessage = js.native
  /**
    * Creates a plain object from a GossipMessage message. Also converts values to other types if specified.
    * @param message GossipMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.GossipMessage): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.GossipMessage, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GossipMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** ContentType enum. */
  @js.native
  object ContentType extends js.Object {
    /* 2 */ val BATCH: typings.sawtoothSdk.protobufMod.GossipMessage.ContentType.BATCH with Double = js.native
    /* 1 */ val BLOCK: typings.sawtoothSdk.protobufMod.GossipMessage.ContentType.BLOCK with Double = js.native
    /* 0 */ val CONTENT_TYPE_UNSET: typings.sawtoothSdk.protobufMod.GossipMessage.ContentType.CONTENT_TYPE_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.GossipMessage.ContentType with Double] = js.native
  }
  
}

