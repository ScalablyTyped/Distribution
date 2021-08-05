package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage")
@js.native
/**
  * Constructs a new ConsensusPeerMessage.
  * @param [properties] Properties to set
  */
class ConsensusPeerMessage ()
  extends StObject
     with IConsensusPeerMessage {
  def this(properties: IConsensusPeerMessage) = this()
  
  /** ConsensusPeerMessage content. */
  @JSName("content")
  var content_ConsensusPeerMessage: Uint8Array = js.native
  
  /** ConsensusPeerMessage messageType. */
  @JSName("messageType")
  var messageType_ConsensusPeerMessage: String = js.native
  
  /** ConsensusPeerMessage name. */
  @JSName("name")
  var name_ConsensusPeerMessage: String = js.native
  
  /**
    * Converts this ConsensusPeerMessage to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ConsensusPeerMessage version. */
  @JSName("version")
  var version_ConsensusPeerMessage: String = js.native
}
/* static members */
object ConsensusPeerMessage {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusPeerMessage")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusPeerMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusPeerMessage instance
    */
  inline def create(): ConsensusPeerMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusPeerMessage]
  inline def create(properties: IConsensusPeerMessage): ConsensusPeerMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusPeerMessage]
  
  /**
    * Decodes a ConsensusPeerMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusPeerMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ConsensusPeerMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusPeerMessage]
  inline def decode(reader: Reader, length: Double): ConsensusPeerMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusPeerMessage]
  inline def decode(reader: Uint8Array): ConsensusPeerMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusPeerMessage]
  inline def decode(reader: Uint8Array, length: Double): ConsensusPeerMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusPeerMessage]
  
  /**
    * Decodes a ConsensusPeerMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusPeerMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ConsensusPeerMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusPeerMessage]
  inline def decodeDelimited(reader: Uint8Array): ConsensusPeerMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusPeerMessage]
  
  /**
    * Encodes the specified ConsensusPeerMessage message. Does not implicitly {@link ConsensusPeerMessage.verify|verify} messages.
    * @param message ConsensusPeerMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusPeerMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusPeerMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusPeerMessage message, length delimited. Does not implicitly {@link ConsensusPeerMessage.verify|verify} messages.
    * @param message ConsensusPeerMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusPeerMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusPeerMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusPeerMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusPeerMessage
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): ConsensusPeerMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusPeerMessage]
  
  /**
    * Creates a plain object from a ConsensusPeerMessage message. Also converts values to other types if specified.
    * @param message ConsensusPeerMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ConsensusPeerMessage): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ConsensusPeerMessage, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusPeerMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
