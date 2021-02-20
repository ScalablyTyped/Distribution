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

@JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest")
@js.native
/**
  * Constructs a new TpStateDeleteRequest.
  * @param [properties] Properties to set
  */
class TpStateDeleteRequest () extends ITpStateDeleteRequest {
  def this(properties: ITpStateDeleteRequest) = this()
  
  /** TpStateDeleteRequest addresses. */
  @JSName("addresses")
  var addresses_TpStateDeleteRequest: js.Array[String] = js.native
  
  /** TpStateDeleteRequest contextId. */
  @JSName("contextId")
  var contextId_TpStateDeleteRequest: String = js.native
  
  /**
    * Converts this TpStateDeleteRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TpStateDeleteRequest {
  
  /**
    * Creates a new TpStateDeleteRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateDeleteRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest.create")
  @js.native
  def create(): TpStateDeleteRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest.create")
  @js.native
  def create(properties: ITpStateDeleteRequest): TpStateDeleteRequest = js.native
  
  /**
    * Decodes a TpStateDeleteRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateDeleteRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest.decode")
  @js.native
  def decode(reader: Reader): TpStateDeleteRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): TpStateDeleteRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest.decode")
  @js.native
  def decode(reader: Uint8Array): TpStateDeleteRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): TpStateDeleteRequest = js.native
  
  /**
    * Decodes a TpStateDeleteRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateDeleteRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TpStateDeleteRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): TpStateDeleteRequest = js.native
  
  /**
    * Encodes the specified TpStateDeleteRequest message. Does not implicitly {@link TpStateDeleteRequest.verify|verify} messages.
    * @param message TpStateDeleteRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest.encode")
  @js.native
  def encode(message: ITpStateDeleteRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest.encode")
  @js.native
  def encode(message: ITpStateDeleteRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpStateDeleteRequest message, length delimited. Does not implicitly {@link TpStateDeleteRequest.verify|verify} messages.
    * @param message TpStateDeleteRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateDeleteRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateDeleteRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpStateDeleteRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateDeleteRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TpStateDeleteRequest = js.native
  
  /**
    * Creates a plain object from a TpStateDeleteRequest message. Also converts values to other types if specified.
    * @param message TpStateDeleteRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest.toObject")
  @js.native
  def toObject(message: TpStateDeleteRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest.toObject")
  @js.native
  def toObject(message: TpStateDeleteRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpStateDeleteRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
