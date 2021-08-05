package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusSummarizeBlockRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockRequest")
@js.native
/**
  * Constructs a new ConsensusSummarizeBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusSummarizeBlockRequest ()
  extends typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest {
  def this(properties: IConsensusSummarizeBlockRequest) = this()
}
/* static members */
object ConsensusSummarizeBlockRequest {
  
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSummarizeBlockRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusSummarizeBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSummarizeBlockRequest instance
    */
  inline def create(): typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest]
  inline def create(properties: IConsensusSummarizeBlockRequest): typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest]
  
  /**
    * Decodes a ConsensusSummarizeBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSummarizeBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest]
  inline def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest]
  inline def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest]
  inline def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest]
  
  /**
    * Decodes a ConsensusSummarizeBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSummarizeBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest]
  inline def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest]
  
  /**
    * Encodes the specified ConsensusSummarizeBlockRequest message. Does not implicitly {@link ConsensusSummarizeBlockRequest.verify|verify} messages.
    * @param message ConsensusSummarizeBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusSummarizeBlockRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusSummarizeBlockRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusSummarizeBlockRequest message, length delimited. Does not implicitly {@link ConsensusSummarizeBlockRequest.verify|verify} messages.
    * @param message ConsensusSummarizeBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusSummarizeBlockRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusSummarizeBlockRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusSummarizeBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSummarizeBlockRequest
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest]
  
  /**
    * Creates a plain object from a ConsensusSummarizeBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusSummarizeBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(
    message: typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusSummarizeBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
