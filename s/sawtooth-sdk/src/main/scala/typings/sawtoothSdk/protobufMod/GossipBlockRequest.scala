package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "GossipBlockRequest")
@js.native
/**
  * Constructs a new GossipBlockRequest.
  * @param [properties] Properties to set
  */
class GossipBlockRequest () extends IGossipBlockRequest {
  def this(properties: IGossipBlockRequest) = this()
  
  /** GossipBlockRequest blockId. */
  @JSName("blockId")
  var blockId_GossipBlockRequest: String = js.native
  
  /** GossipBlockRequest nonce. */
  @JSName("nonce")
  var nonce_GossipBlockRequest: String = js.native
  
  /** GossipBlockRequest timeToLive. */
  @JSName("timeToLive")
  var timeToLive_GossipBlockRequest: Double = js.native
  
  /**
    * Converts this GossipBlockRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "GossipBlockRequest")
@js.native
object GossipBlockRequest extends js.Object {
  
  /**
    * Creates a new GossipBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipBlockRequest instance
    */
  def create(): GossipBlockRequest = js.native
  def create(properties: IGossipBlockRequest): GossipBlockRequest = js.native
  
  /**
    * Decodes a GossipBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GossipBlockRequest = js.native
  def decode(reader: Reader, length: Double): GossipBlockRequest = js.native
  def decode(reader: Uint8Array): GossipBlockRequest = js.native
  def decode(reader: Uint8Array, length: Double): GossipBlockRequest = js.native
  
  /**
    * Decodes a GossipBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GossipBlockRequest = js.native
  def decodeDelimited(reader: Uint8Array): GossipBlockRequest = js.native
  
  /**
    * Encodes the specified GossipBlockRequest message. Does not implicitly {@link GossipBlockRequest.verify|verify} messages.
    * @param message GossipBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGossipBlockRequest): Writer = js.native
  def encode(message: IGossipBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GossipBlockRequest message, length delimited. Does not implicitly {@link GossipBlockRequest.verify|verify} messages.
    * @param message GossipBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGossipBlockRequest): Writer = js.native
  def encodeDelimited(message: IGossipBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GossipBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipBlockRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): GossipBlockRequest = js.native
  
  /**
    * Creates a plain object from a GossipBlockRequest message. Also converts values to other types if specified.
    * @param message GossipBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GossipBlockRequest): StringDictionary[js.Any] = js.native
  def toObject(message: GossipBlockRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GossipBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
