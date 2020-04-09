package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusBroadcastResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ConsensusBroadcastResponse")
@js.native
/**
  * Constructs a new ConsensusBroadcastResponse.
  * @param [properties] Properties to set
  */
class ConsensusBroadcastResponse ()
  extends typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse {
  def this(properties: IConsensusBroadcastResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusBroadcastResponse")
@js.native
object ConsensusBroadcastResponse extends js.Object {
  /**
    * Creates a new ConsensusBroadcastResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBroadcastResponse instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  def create(properties: IConsensusBroadcastResponse): typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  /**
    * Decodes a ConsensusBroadcastResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBroadcastResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  /**
    * Decodes a ConsensusBroadcastResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBroadcastResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  /**
    * Encodes the specified ConsensusBroadcastResponse message. Does not implicitly {@link ConsensusBroadcastResponse.verify|verify} messages.
    * @param message ConsensusBroadcastResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusBroadcastResponse): Writer = js.native
  def encode(message: IConsensusBroadcastResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusBroadcastResponse message, length delimited. Does not implicitly {@link ConsensusBroadcastResponse.verify|verify} messages.
    * @param message ConsensusBroadcastResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusBroadcastResponse): Writer = js.native
  def encodeDelimited(message: IConsensusBroadcastResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusBroadcastResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusBroadcastResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse = js.native
  /**
    * Creates a plain object from a ConsensusBroadcastResponse message. Also converts values to other types if specified.
    * @param message ConsensusBroadcastResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusBroadcastResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status.BAD_REQUEST with Double = js.native
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status.NOT_READY with Double = js.native
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status.OK with Double = js.native
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status.SERVICE_ERROR with Double = js.native
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status with Double] = js.native
  }
  
}

