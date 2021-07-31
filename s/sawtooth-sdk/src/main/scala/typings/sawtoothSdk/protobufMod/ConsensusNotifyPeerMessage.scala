package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage")
@js.native
/**
  * Constructs a new ConsensusNotifyPeerMessage.
  * @param [properties] Properties to set
  */
class ConsensusNotifyPeerMessage ()
  extends StObject
     with IConsensusNotifyPeerMessage {
  def this(properties: IConsensusNotifyPeerMessage) = this()
  
  /** ConsensusNotifyPeerMessage senderId. */
  @JSName("senderId")
  var senderId_ConsensusNotifyPeerMessage: Uint8Array = js.native
  
  /**
    * Converts this ConsensusNotifyPeerMessage to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusNotifyPeerMessage {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerMessage")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusNotifyPeerMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyPeerMessage instance
    */
  @scala.inline
  def create(): ConsensusNotifyPeerMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusNotifyPeerMessage]
  @scala.inline
  def create(properties: IConsensusNotifyPeerMessage): ConsensusNotifyPeerMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyPeerMessage]
  
  /**
    * Decodes a ConsensusNotifyPeerMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyPeerMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ConsensusNotifyPeerMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyPeerMessage]
  @scala.inline
  def decode(reader: Reader, length: Double): ConsensusNotifyPeerMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusNotifyPeerMessage]
  @scala.inline
  def decode(reader: Uint8Array): ConsensusNotifyPeerMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyPeerMessage]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ConsensusNotifyPeerMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusNotifyPeerMessage]
  
  /**
    * Decodes a ConsensusNotifyPeerMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyPeerMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ConsensusNotifyPeerMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyPeerMessage]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ConsensusNotifyPeerMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyPeerMessage]
  
  /**
    * Encodes the specified ConsensusNotifyPeerMessage message. Does not implicitly {@link ConsensusNotifyPeerMessage.verify|verify} messages.
    * @param message ConsensusNotifyPeerMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IConsensusNotifyPeerMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IConsensusNotifyPeerMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusNotifyPeerMessage message, length delimited. Does not implicitly {@link ConsensusNotifyPeerMessage.verify|verify} messages.
    * @param message ConsensusNotifyPeerMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IConsensusNotifyPeerMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IConsensusNotifyPeerMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusNotifyPeerMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyPeerMessage
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusNotifyPeerMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyPeerMessage]
  
  /**
    * Creates a plain object from a ConsensusNotifyPeerMessage message. Also converts values to other types if specified.
    * @param message ConsensusNotifyPeerMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ConsensusNotifyPeerMessage): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ConsensusNotifyPeerMessage, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusNotifyPeerMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
