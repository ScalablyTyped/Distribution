package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage")
@js.native
/**
  * Constructs a new GossipConsensusMessage.
  * @param [properties] Properties to set
  */
class GossipConsensusMessage ()
  extends StObject
     with IGossipConsensusMessage {
  def this(properties: IGossipConsensusMessage) = this()
  
  /** GossipConsensusMessage message. */
  @JSName("message")
  var message_GossipConsensusMessage: Uint8Array = js.native
  
  /** GossipConsensusMessage senderId. */
  @JSName("senderId")
  var senderId_GossipConsensusMessage: Uint8Array = js.native
  
  /** GossipConsensusMessage timeToLive. */
  @JSName("timeToLive")
  var timeToLive_GossipConsensusMessage: Double = js.native
  
  /**
    * Converts this GossipConsensusMessage to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object GossipConsensusMessage {
  
  @JSImport("sawtooth-sdk/protobuf", "GossipConsensusMessage")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GossipConsensusMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipConsensusMessage instance
    */
  @scala.inline
  def create(): GossipConsensusMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GossipConsensusMessage]
  @scala.inline
  def create(properties: IGossipConsensusMessage): GossipConsensusMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GossipConsensusMessage]
  
  /**
    * Decodes a GossipConsensusMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipConsensusMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): GossipConsensusMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipConsensusMessage]
  @scala.inline
  def decode(reader: Reader, length: Double): GossipConsensusMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GossipConsensusMessage]
  @scala.inline
  def decode(reader: Uint8Array): GossipConsensusMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipConsensusMessage]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): GossipConsensusMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GossipConsensusMessage]
  
  /**
    * Decodes a GossipConsensusMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipConsensusMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): GossipConsensusMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipConsensusMessage]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): GossipConsensusMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipConsensusMessage]
  
  /**
    * Encodes the specified GossipConsensusMessage message. Does not implicitly {@link GossipConsensusMessage.verify|verify} messages.
    * @param message GossipConsensusMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IGossipConsensusMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IGossipConsensusMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GossipConsensusMessage message, length delimited. Does not implicitly {@link GossipConsensusMessage.verify|verify} messages.
    * @param message GossipConsensusMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IGossipConsensusMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IGossipConsensusMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GossipConsensusMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipConsensusMessage
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): GossipConsensusMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GossipConsensusMessage]
  
  /**
    * Creates a plain object from a GossipConsensusMessage message. Also converts values to other types if specified.
    * @param message GossipConsensusMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: GossipConsensusMessage): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: GossipConsensusMessage, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a GossipConsensusMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
