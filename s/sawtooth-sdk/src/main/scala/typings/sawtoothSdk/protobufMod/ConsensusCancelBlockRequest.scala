package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest")
@js.native
/**
  * Constructs a new ConsensusCancelBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusCancelBlockRequest ()
  extends StObject
     with IConsensusCancelBlockRequest {
  def this(properties: IConsensusCancelBlockRequest) = this()
  
  /**
    * Converts this ConsensusCancelBlockRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusCancelBlockRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusCancelBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCancelBlockRequest instance
    */
  @scala.inline
  def create(): ConsensusCancelBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusCancelBlockRequest]
  @scala.inline
  def create(properties: IConsensusCancelBlockRequest): ConsensusCancelBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusCancelBlockRequest]
  
  /**
    * Decodes a ConsensusCancelBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCancelBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ConsensusCancelBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusCancelBlockRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): ConsensusCancelBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusCancelBlockRequest]
  @scala.inline
  def decode(reader: Uint8Array): ConsensusCancelBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusCancelBlockRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ConsensusCancelBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusCancelBlockRequest]
  
  /**
    * Decodes a ConsensusCancelBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCancelBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ConsensusCancelBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusCancelBlockRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ConsensusCancelBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusCancelBlockRequest]
  
  /**
    * Encodes the specified ConsensusCancelBlockRequest message. Does not implicitly {@link ConsensusCancelBlockRequest.verify|verify} messages.
    * @param message ConsensusCancelBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IConsensusCancelBlockRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IConsensusCancelBlockRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusCancelBlockRequest message, length delimited. Does not implicitly {@link ConsensusCancelBlockRequest.verify|verify} messages.
    * @param message ConsensusCancelBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IConsensusCancelBlockRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IConsensusCancelBlockRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusCancelBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCancelBlockRequest
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusCancelBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusCancelBlockRequest]
  
  /**
    * Creates a plain object from a ConsensusCancelBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusCancelBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ConsensusCancelBlockRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ConsensusCancelBlockRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusCancelBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
