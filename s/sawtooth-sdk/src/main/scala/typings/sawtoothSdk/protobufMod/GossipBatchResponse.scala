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

@JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse")
@js.native
/**
  * Constructs a new GossipBatchResponse.
  * @param [properties] Properties to set
  */
class GossipBatchResponse () extends IGossipBatchResponse {
  def this(properties: IGossipBatchResponse) = this()
  
  /** GossipBatchResponse content. */
  @JSName("content")
  var content_GossipBatchResponse: Uint8Array = js.native
  
  /**
    * Converts this GossipBatchResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object GossipBatchResponse {
  
  /**
    * Creates a new GossipBatchResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipBatchResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse.create")
  @js.native
  def create(): GossipBatchResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse.create")
  @js.native
  def create(properties: IGossipBatchResponse): GossipBatchResponse = js.native
  
  /**
    * Decodes a GossipBatchResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipBatchResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse.decode")
  @js.native
  def decode(reader: Reader): GossipBatchResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): GossipBatchResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse.decode")
  @js.native
  def decode(reader: Uint8Array): GossipBatchResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): GossipBatchResponse = js.native
  
  /**
    * Decodes a GossipBatchResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipBatchResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): GossipBatchResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): GossipBatchResponse = js.native
  
  /**
    * Encodes the specified GossipBatchResponse message. Does not implicitly {@link GossipBatchResponse.verify|verify} messages.
    * @param message GossipBatchResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse.encode")
  @js.native
  def encode(message: IGossipBatchResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse.encode")
  @js.native
  def encode(message: IGossipBatchResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GossipBatchResponse message, length delimited. Does not implicitly {@link GossipBatchResponse.verify|verify} messages.
    * @param message GossipBatchResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGossipBatchResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGossipBatchResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a GossipBatchResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipBatchResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): GossipBatchResponse = js.native
  
  /**
    * Creates a plain object from a GossipBatchResponse message. Also converts values to other types if specified.
    * @param message GossipBatchResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse.toObject")
  @js.native
  def toObject(message: GossipBatchResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse.toObject")
  @js.native
  def toObject(message: GossipBatchResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GossipBatchResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
