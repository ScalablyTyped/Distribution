package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IGossipBlockResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse")
@js.native
/**
  * Constructs a new GossipBlockResponse.
  * @param [properties] Properties to set
  */
class GossipBlockResponse ()
  extends typings.sawtoothSdk.protobufMod.GossipBlockResponse {
  def this(properties: IGossipBlockResponse) = this()
}
/* static members */
object GossipBlockResponse {
  
  /**
    * Creates a new GossipBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipBlockResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse.create")
  @js.native
  def create(properties: IGossipBlockResponse): typings.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  
  /**
    * Decodes a GossipBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  
  /**
    * Decodes a GossipBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  
  /**
    * Encodes the specified GossipBlockResponse message. Does not implicitly {@link GossipBlockResponse.verify|verify} messages.
    * @param message GossipBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse.encode")
  @js.native
  def encode(message: IGossipBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse.encode")
  @js.native
  def encode(message: IGossipBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GossipBlockResponse message, length delimited. Does not implicitly {@link GossipBlockResponse.verify|verify} messages.
    * @param message GossipBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGossipBlockResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGossipBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a GossipBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipBlockResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.GossipBlockResponse = js.native
  
  /**
    * Creates a plain object from a GossipBlockResponse message. Also converts values to other types if specified.
    * @param message GossipBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.GossipBlockResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.GossipBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GossipBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.GossipBlockResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
