package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IGossipBatchByBatchIdRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest")
@js.native
/**
  * Constructs a new GossipBatchByBatchIdRequest.
  * @param [properties] Properties to set
  */
class GossipBatchByBatchIdRequest ()
  extends typings.sawtoothSdk.protobufMod.GossipBatchByBatchIdRequest {
  def this(properties: IGossipBatchByBatchIdRequest) = this()
}
/* static members */
object GossipBatchByBatchIdRequest {
  
  /**
    * Creates a new GossipBatchByBatchIdRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipBatchByBatchIdRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.GossipBatchByBatchIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest.create")
  @js.native
  def create(properties: IGossipBatchByBatchIdRequest): typings.sawtoothSdk.protobufMod.GossipBatchByBatchIdRequest = js.native
  
  /**
    * Decodes a GossipBatchByBatchIdRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipBatchByBatchIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.GossipBatchByBatchIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.GossipBatchByBatchIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GossipBatchByBatchIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.GossipBatchByBatchIdRequest = js.native
  
  /**
    * Decodes a GossipBatchByBatchIdRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipBatchByBatchIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.GossipBatchByBatchIdRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GossipBatchByBatchIdRequest = js.native
  
  /**
    * Encodes the specified GossipBatchByBatchIdRequest message. Does not implicitly {@link GossipBatchByBatchIdRequest.verify|verify} messages.
    * @param message GossipBatchByBatchIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest.encode")
  @js.native
  def encode(message: IGossipBatchByBatchIdRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest.encode")
  @js.native
  def encode(message: IGossipBatchByBatchIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GossipBatchByBatchIdRequest message, length delimited. Does not implicitly {@link GossipBatchByBatchIdRequest.verify|verify} messages.
    * @param message GossipBatchByBatchIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGossipBatchByBatchIdRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGossipBatchByBatchIdRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GossipBatchByBatchIdRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipBatchByBatchIdRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.GossipBatchByBatchIdRequest = js.native
  
  /**
    * Creates a plain object from a GossipBatchByBatchIdRequest message. Also converts values to other types if specified.
    * @param message GossipBatchByBatchIdRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.GossipBatchByBatchIdRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.GossipBatchByBatchIdRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GossipBatchByBatchIdRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBatchByBatchIdRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
