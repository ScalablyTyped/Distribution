package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusNotifyPeerDisconnected
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyPeerDisconnected")
@js.native
/**
  * Constructs a new ConsensusNotifyPeerDisconnected.
  * @param [properties] Properties to set
  */
class ConsensusNotifyPeerDisconnected ()
  extends typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected {
  def this(properties: IConsensusNotifyPeerDisconnected) = this()
}
/* static members */
object ConsensusNotifyPeerDisconnected {
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusNotifyPeerDisconnected")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusNotifyPeerDisconnected instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyPeerDisconnected instance
    */
  @scala.inline
  def create(): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected]
  @scala.inline
  def create(properties: IConsensusNotifyPeerDisconnected): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected]
  
  /**
    * Decodes a ConsensusNotifyPeerDisconnected message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyPeerDisconnected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected]
  @scala.inline
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected]
  
  /**
    * Decodes a ConsensusNotifyPeerDisconnected message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyPeerDisconnected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected]
  
  /**
    * Encodes the specified ConsensusNotifyPeerDisconnected message. Does not implicitly {@link ConsensusNotifyPeerDisconnected.verify|verify} messages.
    * @param message ConsensusNotifyPeerDisconnected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IConsensusNotifyPeerDisconnected): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IConsensusNotifyPeerDisconnected, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusNotifyPeerDisconnected message, length delimited. Does not implicitly {@link ConsensusNotifyPeerDisconnected.verify|verify} messages.
    * @param message ConsensusNotifyPeerDisconnected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IConsensusNotifyPeerDisconnected): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IConsensusNotifyPeerDisconnected, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusNotifyPeerDisconnected message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyPeerDisconnected
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected]
  
  /**
    * Creates a plain object from a ConsensusNotifyPeerDisconnected message. Also converts values to other types if specified.
    * @param message ConsensusNotifyPeerDisconnected
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(
    message: typings.sawtoothSdk.protobufMod.ConsensusNotifyPeerDisconnected,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusNotifyPeerDisconnected message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
