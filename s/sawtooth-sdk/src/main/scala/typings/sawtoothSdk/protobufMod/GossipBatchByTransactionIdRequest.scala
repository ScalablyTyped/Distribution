package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "GossipBatchByTransactionIdRequest")
@js.native
/**
  * Constructs a new GossipBatchByTransactionIdRequest.
  * @param [properties] Properties to set
  */
class GossipBatchByTransactionIdRequest () extends IGossipBatchByTransactionIdRequest {
  def this(properties: IGossipBatchByTransactionIdRequest) = this()
  /** GossipBatchByTransactionIdRequest ids. */
  @JSName("ids")
  var ids_GossipBatchByTransactionIdRequest: js.Array[String] = js.native
  /** GossipBatchByTransactionIdRequest nonce. */
  @JSName("nonce")
  var nonce_GossipBatchByTransactionIdRequest: String = js.native
  /** GossipBatchByTransactionIdRequest timeToLive. */
  @JSName("timeToLive")
  var timeToLive_GossipBatchByTransactionIdRequest: Double = js.native
  /**
    * Converts this GossipBatchByTransactionIdRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "GossipBatchByTransactionIdRequest")
@js.native
object GossipBatchByTransactionIdRequest extends js.Object {
  /**
    * Creates a new GossipBatchByTransactionIdRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipBatchByTransactionIdRequest instance
    */
  def create(): GossipBatchByTransactionIdRequest = js.native
  def create(properties: IGossipBatchByTransactionIdRequest): GossipBatchByTransactionIdRequest = js.native
  /**
    * Decodes a GossipBatchByTransactionIdRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipBatchByTransactionIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GossipBatchByTransactionIdRequest = js.native
  def decode(reader: Reader, length: Double): GossipBatchByTransactionIdRequest = js.native
  def decode(reader: Uint8Array): GossipBatchByTransactionIdRequest = js.native
  def decode(reader: Uint8Array, length: Double): GossipBatchByTransactionIdRequest = js.native
  /**
    * Decodes a GossipBatchByTransactionIdRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipBatchByTransactionIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GossipBatchByTransactionIdRequest = js.native
  def decodeDelimited(reader: Uint8Array): GossipBatchByTransactionIdRequest = js.native
  /**
    * Encodes the specified GossipBatchByTransactionIdRequest message. Does not implicitly {@link GossipBatchByTransactionIdRequest.verify|verify} messages.
    * @param message GossipBatchByTransactionIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGossipBatchByTransactionIdRequest): Writer = js.native
  def encode(message: IGossipBatchByTransactionIdRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GossipBatchByTransactionIdRequest message, length delimited. Does not implicitly {@link GossipBatchByTransactionIdRequest.verify|verify} messages.
    * @param message GossipBatchByTransactionIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGossipBatchByTransactionIdRequest): Writer = js.native
  def encodeDelimited(message: IGossipBatchByTransactionIdRequest, writer: Writer): Writer = js.native
  /**
    * Creates a GossipBatchByTransactionIdRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipBatchByTransactionIdRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): GossipBatchByTransactionIdRequest = js.native
  /**
    * Creates a plain object from a GossipBatchByTransactionIdRequest message. Also converts values to other types if specified.
    * @param message GossipBatchByTransactionIdRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GossipBatchByTransactionIdRequest): StringDictionary[js.Any] = js.native
  def toObject(message: GossipBatchByTransactionIdRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GossipBatchByTransactionIdRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

