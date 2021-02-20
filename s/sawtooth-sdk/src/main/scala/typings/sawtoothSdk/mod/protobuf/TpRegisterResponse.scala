package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITpRegisterResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse")
@js.native
/**
  * Constructs a new TpRegisterResponse.
  * @param [properties] Properties to set
  */
class TpRegisterResponse ()
  extends typings.sawtoothSdk.protobufMod.TpRegisterResponse {
  def this(properties: ITpRegisterResponse) = this()
}
/* static members */
object TpRegisterResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.TpRegisterResponse.Status with Double] = js.native
    
    /* 2 */ val ERROR: typings.sawtoothSdk.protobufMod.TpRegisterResponse.Status.ERROR with Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.TpRegisterResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.TpRegisterResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new TpRegisterResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpRegisterResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.create")
  @js.native
  def create(properties: ITpRegisterResponse): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  
  /**
    * Decodes a TpRegisterResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  
  /**
    * Decodes a TpRegisterResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  
  /**
    * Encodes the specified TpRegisterResponse message. Does not implicitly {@link TpRegisterResponse.verify|verify} messages.
    * @param message TpRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.encode")
  @js.native
  def encode(message: ITpRegisterResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.encode")
  @js.native
  def encode(message: ITpRegisterResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpRegisterResponse message, length delimited. Does not implicitly {@link TpRegisterResponse.verify|verify} messages.
    * @param message TpRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpRegisterResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpRegisterResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpRegisterResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpRegisterResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TpRegisterResponse = js.native
  
  /**
    * Creates a plain object from a TpRegisterResponse message. Also converts values to other types if specified.
    * @param message TpRegisterResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpRegisterResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpRegisterResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpRegisterResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.TpRegisterResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
