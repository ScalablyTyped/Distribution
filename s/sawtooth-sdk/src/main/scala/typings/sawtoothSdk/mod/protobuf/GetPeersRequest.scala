package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IGetPeersRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.GetPeersRequest")
@js.native
/**
  * Constructs a new GetPeersRequest.
  * @param [properties] Properties to set
  */
class GetPeersRequest ()
  extends typings.sawtoothSdk.protobufMod.GetPeersRequest {
  def this(properties: IGetPeersRequest) = this()
}
/* static members */
object GetPeersRequest {
  
  /**
    * Creates a new GetPeersRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetPeersRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.GetPeersRequest.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.GetPeersRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GetPeersRequest.create")
  @js.native
  def create(properties: IGetPeersRequest): typings.sawtoothSdk.protobufMod.GetPeersRequest = js.native
  
  /**
    * Decodes a GetPeersRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetPeersRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GetPeersRequest.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.GetPeersRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GetPeersRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.GetPeersRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GetPeersRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GetPeersRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GetPeersRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.GetPeersRequest = js.native
  
  /**
    * Decodes a GetPeersRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetPeersRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GetPeersRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.GetPeersRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.GetPeersRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GetPeersRequest = js.native
  
  /**
    * Encodes the specified GetPeersRequest message. Does not implicitly {@link GetPeersRequest.verify|verify} messages.
    * @param message GetPeersRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GetPeersRequest.encode")
  @js.native
  def encode(message: IGetPeersRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GetPeersRequest.encode")
  @js.native
  def encode(message: IGetPeersRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetPeersRequest message, length delimited. Does not implicitly {@link GetPeersRequest.verify|verify} messages.
    * @param message GetPeersRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GetPeersRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetPeersRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GetPeersRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetPeersRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetPeersRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetPeersRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.GetPeersRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.GetPeersRequest = js.native
  
  /**
    * Creates a plain object from a GetPeersRequest message. Also converts values to other types if specified.
    * @param message GetPeersRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.GetPeersRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.GetPeersRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.GetPeersRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.GetPeersRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GetPeersRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.GetPeersRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
