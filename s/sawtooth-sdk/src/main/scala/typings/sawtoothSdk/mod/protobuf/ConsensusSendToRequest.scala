package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusSendToRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest")
@js.native
/**
  * Constructs a new ConsensusSendToRequest.
  * @param [properties] Properties to set
  */
class ConsensusSendToRequest ()
  extends typings.sawtoothSdk.protobufMod.ConsensusSendToRequest {
  def this(properties: IConsensusSendToRequest) = this()
}
/* static members */
object ConsensusSendToRequest {
  
  /**
    * Creates a new ConsensusSendToRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSendToRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ConsensusSendToRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest.create")
  @js.native
  def create(properties: IConsensusSendToRequest): typings.sawtoothSdk.protobufMod.ConsensusSendToRequest = js.native
  
  /**
    * Decodes a ConsensusSendToRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSendToRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusSendToRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusSendToRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusSendToRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusSendToRequest = js.native
  
  /**
    * Decodes a ConsensusSendToRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSendToRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusSendToRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusSendToRequest = js.native
  
  /**
    * Encodes the specified ConsensusSendToRequest message. Does not implicitly {@link ConsensusSendToRequest.verify|verify} messages.
    * @param message ConsensusSendToRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest.encode")
  @js.native
  def encode(message: IConsensusSendToRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest.encode")
  @js.native
  def encode(message: IConsensusSendToRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusSendToRequest message, length delimited. Does not implicitly {@link ConsensusSendToRequest.verify|verify} messages.
    * @param message ConsensusSendToRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusSendToRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusSendToRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusSendToRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSendToRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusSendToRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusSendToRequest message. Also converts values to other types if specified.
    * @param message ConsensusSendToRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusSendToRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusSendToRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusSendToRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusSendToRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
