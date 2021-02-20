package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITpProcessRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TpProcessRequest")
@js.native
/**
  * Constructs a new TpProcessRequest.
  * @param [properties] Properties to set
  */
class TpProcessRequest ()
  extends typings.sawtoothSdk.protobufMod.TpProcessRequest {
  def this(properties: ITpProcessRequest) = this()
}
/* static members */
object TpProcessRequest {
  
  /**
    * Creates a new TpProcessRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpProcessRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessRequest.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpProcessRequest.create")
  @js.native
  def create(properties: ITpProcessRequest): typings.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  
  /**
    * Decodes a TpProcessRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpProcessRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessRequest.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpProcessRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpProcessRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpProcessRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  
  /**
    * Decodes a TpProcessRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpProcessRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpProcessRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  
  /**
    * Encodes the specified TpProcessRequest message. Does not implicitly {@link TpProcessRequest.verify|verify} messages.
    * @param message TpProcessRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessRequest.encode")
  @js.native
  def encode(message: ITpProcessRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpProcessRequest.encode")
  @js.native
  def encode(message: ITpProcessRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpProcessRequest message, length delimited. Does not implicitly {@link TpProcessRequest.verify|verify} messages.
    * @param message TpProcessRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpProcessRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpProcessRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpProcessRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpProcessRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpProcessRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TpProcessRequest = js.native
  
  /**
    * Creates a plain object from a TpProcessRequest message. Also converts values to other types if specified.
    * @param message TpProcessRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpProcessRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpProcessRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpProcessRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpProcessRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.TpProcessRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
