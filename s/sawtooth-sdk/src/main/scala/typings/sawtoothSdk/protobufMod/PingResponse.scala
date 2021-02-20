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

@JSImport("sawtooth-sdk/protobuf", "PingResponse")
@js.native
/**
  * Constructs a new PingResponse.
  * @param [properties] Properties to set
  */
class PingResponse () extends IPingResponse {
  def this(properties: IPingResponse) = this()
  
  /**
    * Converts this PingResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object PingResponse {
  
  /**
    * Creates a new PingResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PingResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "PingResponse.create")
  @js.native
  def create(): PingResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "PingResponse.create")
  @js.native
  def create(properties: IPingResponse): PingResponse = js.native
  
  /**
    * Decodes a PingResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "PingResponse.decode")
  @js.native
  def decode(reader: Reader): PingResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "PingResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): PingResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "PingResponse.decode")
  @js.native
  def decode(reader: Uint8Array): PingResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "PingResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): PingResponse = js.native
  
  /**
    * Decodes a PingResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "PingResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): PingResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "PingResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): PingResponse = js.native
  
  /**
    * Encodes the specified PingResponse message. Does not implicitly {@link PingResponse.verify|verify} messages.
    * @param message PingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "PingResponse.encode")
  @js.native
  def encode(message: IPingResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "PingResponse.encode")
  @js.native
  def encode(message: IPingResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PingResponse message, length delimited. Does not implicitly {@link PingResponse.verify|verify} messages.
    * @param message PingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "PingResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPingResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "PingResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPingResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a PingResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PingResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "PingResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): PingResponse = js.native
  
  /**
    * Creates a plain object from a PingResponse message. Also converts values to other types if specified.
    * @param message PingResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "PingResponse.toObject")
  @js.native
  def toObject(message: PingResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "PingResponse.toObject")
  @js.native
  def toObject(message: PingResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PingResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "PingResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
