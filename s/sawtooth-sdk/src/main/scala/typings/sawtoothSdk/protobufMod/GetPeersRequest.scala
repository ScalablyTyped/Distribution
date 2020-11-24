package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "GetPeersRequest")
@js.native
/**
  * Constructs a new GetPeersRequest.
  * @param [properties] Properties to set
  */
class GetPeersRequest () extends IGetPeersRequest {
  def this(properties: IGetPeersRequest) = this()
  
  /**
    * Converts this GetPeersRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "GetPeersRequest")
@js.native
object GetPeersRequest extends js.Object {
  
  /**
    * Creates a new GetPeersRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetPeersRequest instance
    */
  def create(): GetPeersRequest = js.native
  def create(properties: IGetPeersRequest): GetPeersRequest = js.native
  
  /**
    * Decodes a GetPeersRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetPeersRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GetPeersRequest = js.native
  def decode(reader: Reader, length: Double): GetPeersRequest = js.native
  def decode(reader: Uint8Array): GetPeersRequest = js.native
  def decode(reader: Uint8Array, length: Double): GetPeersRequest = js.native
  
  /**
    * Decodes a GetPeersRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetPeersRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GetPeersRequest = js.native
  def decodeDelimited(reader: Uint8Array): GetPeersRequest = js.native
  
  /**
    * Encodes the specified GetPeersRequest message. Does not implicitly {@link GetPeersRequest.verify|verify} messages.
    * @param message GetPeersRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGetPeersRequest): Writer = js.native
  def encode(message: IGetPeersRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetPeersRequest message, length delimited. Does not implicitly {@link GetPeersRequest.verify|verify} messages.
    * @param message GetPeersRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGetPeersRequest): Writer = js.native
  def encodeDelimited(message: IGetPeersRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetPeersRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetPeersRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): GetPeersRequest = js.native
  
  /**
    * Creates a plain object from a GetPeersRequest message. Also converts values to other types if specified.
    * @param message GetPeersRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GetPeersRequest): StringDictionary[js.Any] = js.native
  def toObject(message: GetPeersRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GetPeersRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
