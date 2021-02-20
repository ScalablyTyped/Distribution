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

@JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest")
@js.native
/**
  * Constructs a new PeerUnregisterRequest.
  * @param [properties] Properties to set
  */
class PeerUnregisterRequest () extends IPeerUnregisterRequest {
  def this(properties: IPeerUnregisterRequest) = this()
  
  /**
    * Converts this PeerUnregisterRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object PeerUnregisterRequest {
  
  /**
    * Creates a new PeerUnregisterRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PeerUnregisterRequest instance
    */
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest.create")
  @js.native
  def create(): PeerUnregisterRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest.create")
  @js.native
  def create(properties: IPeerUnregisterRequest): PeerUnregisterRequest = js.native
  
  /**
    * Decodes a PeerUnregisterRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PeerUnregisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest.decode")
  @js.native
  def decode(reader: Reader): PeerUnregisterRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): PeerUnregisterRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest.decode")
  @js.native
  def decode(reader: Uint8Array): PeerUnregisterRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): PeerUnregisterRequest = js.native
  
  /**
    * Decodes a PeerUnregisterRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PeerUnregisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): PeerUnregisterRequest = js.native
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): PeerUnregisterRequest = js.native
  
  /**
    * Encodes the specified PeerUnregisterRequest message. Does not implicitly {@link PeerUnregisterRequest.verify|verify} messages.
    * @param message PeerUnregisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest.encode")
  @js.native
  def encode(message: IPeerUnregisterRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest.encode")
  @js.native
  def encode(message: IPeerUnregisterRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PeerUnregisterRequest message, length delimited. Does not implicitly {@link PeerUnregisterRequest.verify|verify} messages.
    * @param message PeerUnregisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPeerUnregisterRequest): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPeerUnregisterRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a PeerUnregisterRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PeerUnregisterRequest
    */
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): PeerUnregisterRequest = js.native
  
  /**
    * Creates a plain object from a PeerUnregisterRequest message. Also converts values to other types if specified.
    * @param message PeerUnregisterRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest.toObject")
  @js.native
  def toObject(message: PeerUnregisterRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest.toObject")
  @js.native
  def toObject(message: PeerUnregisterRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PeerUnregisterRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
