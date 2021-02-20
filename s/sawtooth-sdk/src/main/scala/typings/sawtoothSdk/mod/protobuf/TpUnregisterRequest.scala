package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITpUnregisterRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest")
@js.native
/**
  * Constructs a new TpUnregisterRequest.
  * @param [properties] Properties to set
  */
class TpUnregisterRequest ()
  extends typings.sawtoothSdk.protobufMod.TpUnregisterRequest {
  def this(properties: ITpUnregisterRequest) = this()
}
/* static members */
object TpUnregisterRequest {
  
  /**
    * Creates a new TpUnregisterRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpUnregisterRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.TpUnregisterRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest.create")
  @js.native
  def create(properties: ITpUnregisterRequest): typings.sawtoothSdk.protobufMod.TpUnregisterRequest = js.native
  
  /**
    * Decodes a TpUnregisterRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpUnregisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TpUnregisterRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TpUnregisterRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpUnregisterRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TpUnregisterRequest = js.native
  
  /**
    * Decodes a TpUnregisterRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpUnregisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TpUnregisterRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpUnregisterRequest = js.native
  
  /**
    * Encodes the specified TpUnregisterRequest message. Does not implicitly {@link TpUnregisterRequest.verify|verify} messages.
    * @param message TpUnregisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest.encode")
  @js.native
  def encode(message: ITpUnregisterRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest.encode")
  @js.native
  def encode(message: ITpUnregisterRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpUnregisterRequest message, length delimited. Does not implicitly {@link TpUnregisterRequest.verify|verify} messages.
    * @param message TpUnregisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpUnregisterRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpUnregisterRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpUnregisterRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpUnregisterRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TpUnregisterRequest = js.native
  
  /**
    * Creates a plain object from a TpUnregisterRequest message. Also converts values to other types if specified.
    * @param message TpUnregisterRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpUnregisterRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpUnregisterRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpUnregisterRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.TpUnregisterRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
