package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected")
@js.native
/**
  * Constructs a new ConsensusNotifyPeerConnected.
  * @param [properties] Properties to set
  */
class ConsensusNotifyPeerConnected ()
  extends StObject
     with IConsensusNotifyPeerConnected {
  def this(properties: IConsensusNotifyPeerConnected) = this()
  
  /**
    * Converts this ConsensusNotifyPeerConnected to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusNotifyPeerConnected {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyPeerConnected")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusNotifyPeerConnected instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyPeerConnected instance
    */
  inline def create(): ConsensusNotifyPeerConnected = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusNotifyPeerConnected]
  inline def create(properties: IConsensusNotifyPeerConnected): ConsensusNotifyPeerConnected = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyPeerConnected]
  
  /**
    * Decodes a ConsensusNotifyPeerConnected message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyPeerConnected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ConsensusNotifyPeerConnected = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyPeerConnected]
  inline def decode(reader: Reader, length: Double): ConsensusNotifyPeerConnected = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusNotifyPeerConnected]
  inline def decode(reader: Uint8Array): ConsensusNotifyPeerConnected = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyPeerConnected]
  inline def decode(reader: Uint8Array, length: Double): ConsensusNotifyPeerConnected = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusNotifyPeerConnected]
  
  /**
    * Decodes a ConsensusNotifyPeerConnected message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyPeerConnected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ConsensusNotifyPeerConnected = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyPeerConnected]
  inline def decodeDelimited(reader: Uint8Array): ConsensusNotifyPeerConnected = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyPeerConnected]
  
  /**
    * Encodes the specified ConsensusNotifyPeerConnected message. Does not implicitly {@link ConsensusNotifyPeerConnected.verify|verify} messages.
    * @param message ConsensusNotifyPeerConnected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusNotifyPeerConnected): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusNotifyPeerConnected, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusNotifyPeerConnected message, length delimited. Does not implicitly {@link ConsensusNotifyPeerConnected.verify|verify} messages.
    * @param message ConsensusNotifyPeerConnected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusNotifyPeerConnected): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusNotifyPeerConnected, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusNotifyPeerConnected message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyPeerConnected
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): ConsensusNotifyPeerConnected = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyPeerConnected]
  
  /**
    * Creates a plain object from a ConsensusNotifyPeerConnected message. Also converts values to other types if specified.
    * @param message ConsensusNotifyPeerConnected
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ConsensusNotifyPeerConnected): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ConsensusNotifyPeerConnected, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusNotifyPeerConnected message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
