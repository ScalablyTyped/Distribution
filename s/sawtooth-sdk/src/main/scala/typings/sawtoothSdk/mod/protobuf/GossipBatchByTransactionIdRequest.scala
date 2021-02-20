package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IGossipBatchByTransactionIdRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest")
@js.native
/**
  * Constructs a new GossipBatchByTransactionIdRequest.
  * @param [properties] Properties to set
  */
class GossipBatchByTransactionIdRequest ()
  extends typings.sawtoothSdk.protobufMod.GossipBatchByTransactionIdRequest {
  def this(properties: IGossipBatchByTransactionIdRequest) = this()
}
/* static members */
object GossipBatchByTransactionIdRequest {
  
  /**
    * Creates a new GossipBatchByTransactionIdRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipBatchByTransactionIdRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.GossipBatchByTransactionIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest.create")
  @js.native
  def create(properties: IGossipBatchByTransactionIdRequest): typings.sawtoothSdk.protobufMod.GossipBatchByTransactionIdRequest = js.native
  
  /**
    * Decodes a GossipBatchByTransactionIdRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipBatchByTransactionIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.GossipBatchByTransactionIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.GossipBatchByTransactionIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GossipBatchByTransactionIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.GossipBatchByTransactionIdRequest = js.native
  
  /**
    * Decodes a GossipBatchByTransactionIdRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipBatchByTransactionIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.GossipBatchByTransactionIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GossipBatchByTransactionIdRequest = js.native
  
  /**
    * Encodes the specified GossipBatchByTransactionIdRequest message. Does not implicitly {@link GossipBatchByTransactionIdRequest.verify|verify} messages.
    * @param message GossipBatchByTransactionIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest.encode")
  @js.native
  def encode(message: IGossipBatchByTransactionIdRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest.encode")
  @js.native
  def encode(message: IGossipBatchByTransactionIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GossipBatchByTransactionIdRequest message, length delimited. Does not implicitly {@link GossipBatchByTransactionIdRequest.verify|verify} messages.
    * @param message GossipBatchByTransactionIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGossipBatchByTransactionIdRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGossipBatchByTransactionIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GossipBatchByTransactionIdRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipBatchByTransactionIdRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.GossipBatchByTransactionIdRequest = js.native
  
  /**
    * Creates a plain object from a GossipBatchByTransactionIdRequest message. Also converts values to other types if specified.
    * @param message GossipBatchByTransactionIdRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.GossipBatchByTransactionIdRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest.toObject")
  @js.native
  def toObject(
    message: typings.sawtoothSdk.protobufMod.GossipBatchByTransactionIdRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GossipBatchByTransactionIdRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByTransactionIdRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
