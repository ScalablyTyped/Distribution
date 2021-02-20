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

@JSImport("sawtooth-sdk/protobuf", "PingRequest")
@js.native
/**
  * Constructs a new PingRequest.
  * @param [properties] Properties to set
  */
class PingRequest () extends IPingRequest {
  def this(properties: IPingRequest) = this()
  
  /**
    * Converts this PingRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object PingRequest {
  
  /**
    * Creates a new PingRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PingRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "PingRequest.create")
  @js.native
  def create(): PingRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "PingRequest.create")
  @js.native
  def create(properties: IPingRequest): PingRequest = js.native
  
  /**
    * Decodes a PingRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PingRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "PingRequest.decode")
  @js.native
  def decode(reader: Reader): PingRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "PingRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): PingRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "PingRequest.decode")
  @js.native
  def decode(reader: Uint8Array): PingRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "PingRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): PingRequest = js.native
  
  /**
    * Decodes a PingRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PingRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "PingRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): PingRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "PingRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): PingRequest = js.native
  
  /**
    * Encodes the specified PingRequest message. Does not implicitly {@link PingRequest.verify|verify} messages.
    * @param message PingRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "PingRequest.encode")
  @js.native
  def encode(message: IPingRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "PingRequest.encode")
  @js.native
  def encode(message: IPingRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PingRequest message, length delimited. Does not implicitly {@link PingRequest.verify|verify} messages.
    * @param message PingRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "PingRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPingRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "PingRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPingRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a PingRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PingRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "PingRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): PingRequest = js.native
  
  /**
    * Creates a plain object from a PingRequest message. Also converts values to other types if specified.
    * @param message PingRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "PingRequest.toObject")
  @js.native
  def toObject(message: PingRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "PingRequest.toObject")
  @js.native
  def toObject(message: PingRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PingRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "PingRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
