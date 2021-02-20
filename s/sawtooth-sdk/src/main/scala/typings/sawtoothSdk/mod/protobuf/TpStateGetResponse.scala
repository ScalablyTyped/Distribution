package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITpStateGetResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse")
@js.native
/**
  * Constructs a new TpStateGetResponse.
  * @param [properties] Properties to set
  */
class TpStateGetResponse ()
  extends typings.sawtoothSdk.protobufMod.TpStateGetResponse {
  def this(properties: ITpStateGetResponse) = this()
}
/* static members */
object TpStateGetResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.TpStateGetResponse.Status with Double] = js.native
    
    /* 2 */ val AUTHORIZATION_ERROR: typings.sawtoothSdk.protobufMod.TpStateGetResponse.Status.AUTHORIZATION_ERROR with Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpStateGetResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpStateGetResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new TpStateGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateGetResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.create")
  @js.native
  def create(properties: ITpStateGetResponse): typings.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  
  /**
    * Decodes a TpStateGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  
  /**
    * Decodes a TpStateGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  
  /**
    * Encodes the specified TpStateGetResponse message. Does not implicitly {@link TpStateGetResponse.verify|verify} messages.
    * @param message TpStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.encode")
  @js.native
  def encode(message: ITpStateGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.encode")
  @js.native
  def encode(message: ITpStateGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpStateGetResponse message, length delimited. Does not implicitly {@link TpStateGetResponse.verify|verify} messages.
    * @param message TpStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpStateGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateGetResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TpStateGetResponse = js.native
  
  /**
    * Creates a plain object from a TpStateGetResponse message. Also converts values to other types if specified.
    * @param message TpStateGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpStateGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpStateGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpStateGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
