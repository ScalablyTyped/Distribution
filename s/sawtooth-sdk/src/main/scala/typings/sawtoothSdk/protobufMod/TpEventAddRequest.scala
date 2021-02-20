package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest")
@js.native
/**
  * Constructs a new TpEventAddRequest.
  * @param [properties] Properties to set
  */
class TpEventAddRequest () extends ITpEventAddRequest {
  def this(properties: ITpEventAddRequest) = this()
  
  /** TpEventAddRequest contextId. */
  @JSName("contextId")
  var contextId_TpEventAddRequest: String = js.native
  
  /**
    * Converts this TpEventAddRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TpEventAddRequest {
  
  /**
    * Creates a new TpEventAddRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpEventAddRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest.create")
  @js.native
  def create(): TpEventAddRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest.create")
  @js.native
  def create(properties: ITpEventAddRequest): TpEventAddRequest = js.native
  
  /**
    * Decodes a TpEventAddRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpEventAddRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest.decode")
  @js.native
  def decode(reader: Reader): TpEventAddRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): TpEventAddRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest.decode")
  @js.native
  def decode(reader: Uint8Array): TpEventAddRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): TpEventAddRequest = js.native
  
  /**
    * Decodes a TpEventAddRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpEventAddRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TpEventAddRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): TpEventAddRequest = js.native
  
  /**
    * Encodes the specified TpEventAddRequest message. Does not implicitly {@link TpEventAddRequest.verify|verify} messages.
    * @param message TpEventAddRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest.encode")
  @js.native
  def encode(message: ITpEventAddRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest.encode")
  @js.native
  def encode(message: ITpEventAddRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpEventAddRequest message, length delimited. Does not implicitly {@link TpEventAddRequest.verify|verify} messages.
    * @param message TpEventAddRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpEventAddRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpEventAddRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpEventAddRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpEventAddRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TpEventAddRequest = js.native
  
  /**
    * Creates a plain object from a TpEventAddRequest message. Also converts values to other types if specified.
    * @param message TpEventAddRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest.toObject")
  @js.native
  def toObject(message: TpEventAddRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest.toObject")
  @js.native
  def toObject(message: TpEventAddRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpEventAddRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "TpEventAddRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
