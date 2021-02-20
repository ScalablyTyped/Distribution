package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IGossipBlockRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest")
@js.native
/**
  * Constructs a new GossipBlockRequest.
  * @param [properties] Properties to set
  */
class GossipBlockRequest ()
  extends typings.sawtoothSdk.protobufMod.GossipBlockRequest {
  def this(properties: IGossipBlockRequest) = this()
}
/* static members */
object GossipBlockRequest {
  
  /**
    * Creates a new GossipBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipBlockRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest.create")
  @js.native
  def create(properties: IGossipBlockRequest): typings.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  
  /**
    * Decodes a GossipBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  
  /**
    * Decodes a GossipBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  
  /**
    * Encodes the specified GossipBlockRequest message. Does not implicitly {@link GossipBlockRequest.verify|verify} messages.
    * @param message GossipBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest.encode")
  @js.native
  def encode(message: IGossipBlockRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest.encode")
  @js.native
  def encode(message: IGossipBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GossipBlockRequest message, length delimited. Does not implicitly {@link GossipBlockRequest.verify|verify} messages.
    * @param message GossipBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGossipBlockRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGossipBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GossipBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipBlockRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.GossipBlockRequest = js.native
  
  /**
    * Creates a plain object from a GossipBlockRequest message. Also converts values to other types if specified.
    * @param message GossipBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.GossipBlockRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.GossipBlockRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GossipBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
