package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockNew")
@js.native
/**
  * Constructs a new ConsensusNotifyBlockNew.
  * @param [properties] Properties to set
  */
class ConsensusNotifyBlockNew ()
  extends StObject
     with IConsensusNotifyBlockNew {
  def this(properties: IConsensusNotifyBlockNew) = this()
  
  /**
    * Converts this ConsensusNotifyBlockNew to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusNotifyBlockNew {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockNew")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusNotifyBlockNew instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyBlockNew instance
    */
  @scala.inline
  def create(): ConsensusNotifyBlockNew = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusNotifyBlockNew]
  @scala.inline
  def create(properties: IConsensusNotifyBlockNew): ConsensusNotifyBlockNew = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyBlockNew]
  
  /**
    * Decodes a ConsensusNotifyBlockNew message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyBlockNew
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ConsensusNotifyBlockNew = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyBlockNew]
  @scala.inline
  def decode(reader: Reader, length: Double): ConsensusNotifyBlockNew = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusNotifyBlockNew]
  @scala.inline
  def decode(reader: Uint8Array): ConsensusNotifyBlockNew = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyBlockNew]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ConsensusNotifyBlockNew = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusNotifyBlockNew]
  
  /**
    * Decodes a ConsensusNotifyBlockNew message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyBlockNew
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ConsensusNotifyBlockNew = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyBlockNew]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ConsensusNotifyBlockNew = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyBlockNew]
  
  /**
    * Encodes the specified ConsensusNotifyBlockNew message. Does not implicitly {@link ConsensusNotifyBlockNew.verify|verify} messages.
    * @param message ConsensusNotifyBlockNew message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IConsensusNotifyBlockNew): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IConsensusNotifyBlockNew, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusNotifyBlockNew message, length delimited. Does not implicitly {@link ConsensusNotifyBlockNew.verify|verify} messages.
    * @param message ConsensusNotifyBlockNew message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IConsensusNotifyBlockNew): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IConsensusNotifyBlockNew, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusNotifyBlockNew message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyBlockNew
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusNotifyBlockNew = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyBlockNew]
  
  /**
    * Creates a plain object from a ConsensusNotifyBlockNew message. Also converts values to other types if specified.
    * @param message ConsensusNotifyBlockNew
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ConsensusNotifyBlockNew): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ConsensusNotifyBlockNew, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusNotifyBlockNew message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
