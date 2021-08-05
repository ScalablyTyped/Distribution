package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockRequest")
@js.native
/**
  * Constructs a new ConsensusFinalizeBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusFinalizeBlockRequest ()
  extends StObject
     with IConsensusFinalizeBlockRequest {
  def this(properties: IConsensusFinalizeBlockRequest) = this()
  
  /** ConsensusFinalizeBlockRequest data. */
  @JSName("data")
  var data_ConsensusFinalizeBlockRequest: Uint8Array = js.native
  
  /**
    * Converts this ConsensusFinalizeBlockRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusFinalizeBlockRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusFinalizeBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusFinalizeBlockRequest instance
    */
  inline def create(): ConsensusFinalizeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusFinalizeBlockRequest]
  inline def create(properties: IConsensusFinalizeBlockRequest): ConsensusFinalizeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusFinalizeBlockRequest]
  
  /**
    * Decodes a ConsensusFinalizeBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusFinalizeBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ConsensusFinalizeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusFinalizeBlockRequest]
  inline def decode(reader: Reader, length: Double): ConsensusFinalizeBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusFinalizeBlockRequest]
  inline def decode(reader: Uint8Array): ConsensusFinalizeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusFinalizeBlockRequest]
  inline def decode(reader: Uint8Array, length: Double): ConsensusFinalizeBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusFinalizeBlockRequest]
  
  /**
    * Decodes a ConsensusFinalizeBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusFinalizeBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ConsensusFinalizeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusFinalizeBlockRequest]
  inline def decodeDelimited(reader: Uint8Array): ConsensusFinalizeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusFinalizeBlockRequest]
  
  /**
    * Encodes the specified ConsensusFinalizeBlockRequest message. Does not implicitly {@link ConsensusFinalizeBlockRequest.verify|verify} messages.
    * @param message ConsensusFinalizeBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusFinalizeBlockRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusFinalizeBlockRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusFinalizeBlockRequest message, length delimited. Does not implicitly {@link ConsensusFinalizeBlockRequest.verify|verify} messages.
    * @param message ConsensusFinalizeBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusFinalizeBlockRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusFinalizeBlockRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusFinalizeBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusFinalizeBlockRequest
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): ConsensusFinalizeBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusFinalizeBlockRequest]
  
  /**
    * Creates a plain object from a ConsensusFinalizeBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusFinalizeBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ConsensusFinalizeBlockRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ConsensusFinalizeBlockRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusFinalizeBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
