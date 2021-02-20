package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusCancelBlockRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest")
@js.native
/**
  * Constructs a new ConsensusCancelBlockRequest.
  * @param [properties] Properties to set
  */
class ConsensusCancelBlockRequest ()
  extends typings.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest {
  def this(properties: IConsensusCancelBlockRequest) = this()
}
/* static members */
object ConsensusCancelBlockRequest {
  
  /**
    * Creates a new ConsensusCancelBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCancelBlockRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest.create")
  @js.native
  def create(properties: IConsensusCancelBlockRequest): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  
  /**
    * Decodes a ConsensusCancelBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCancelBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  
  /**
    * Decodes a ConsensusCancelBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCancelBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  
  /**
    * Encodes the specified ConsensusCancelBlockRequest message. Does not implicitly {@link ConsensusCancelBlockRequest.verify|verify} messages.
    * @param message ConsensusCancelBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest.encode")
  @js.native
  def encode(message: IConsensusCancelBlockRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest.encode")
  @js.native
  def encode(message: IConsensusCancelBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusCancelBlockRequest message, length delimited. Does not implicitly {@link ConsensusCancelBlockRequest.verify|verify} messages.
    * @param message ConsensusCancelBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusCancelBlockRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IConsensusCancelBlockRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusCancelBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCancelBlockRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusCancelBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusCancelBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusCancelBlockRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusCancelBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ConsensusCancelBlockRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
