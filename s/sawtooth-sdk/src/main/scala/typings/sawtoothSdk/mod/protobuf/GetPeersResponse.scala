package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IGetPeersResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.GetPeersResponse")
@js.native
/**
  * Constructs a new GetPeersResponse.
  * @param [properties] Properties to set
  */
class GetPeersResponse ()
  extends typings.sawtoothSdk.protobufMod.GetPeersResponse {
  def this(properties: IGetPeersResponse) = this()
}
/* static members */
object GetPeersResponse {
  
  /**
    * Creates a new GetPeersResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetPeersResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.GetPeersResponse.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.GetPeersResponse.create")
  @js.native
  def create(properties: IGetPeersResponse): typings.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  
  /**
    * Decodes a GetPeersResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetPeersResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GetPeersResponse.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.GetPeersResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.GetPeersResponse.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.GetPeersResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  
  /**
    * Decodes a GetPeersResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetPeersResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GetPeersResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.GetPeersResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  
  /**
    * Encodes the specified GetPeersResponse message. Does not implicitly {@link GetPeersResponse.verify|verify} messages.
    * @param message GetPeersResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GetPeersResponse.encode")
  @js.native
  def encode(message: IGetPeersResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GetPeersResponse.encode")
  @js.native
  def encode(message: IGetPeersResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetPeersResponse message, length delimited. Does not implicitly {@link GetPeersResponse.verify|verify} messages.
    * @param message GetPeersResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GetPeersResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetPeersResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GetPeersResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetPeersResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetPeersResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetPeersResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.GetPeersResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.GetPeersResponse = js.native
  
  /**
    * Creates a plain object from a GetPeersResponse message. Also converts values to other types if specified.
    * @param message GetPeersResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.GetPeersResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.GetPeersResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.GetPeersResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.GetPeersResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GetPeersResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.GetPeersResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
