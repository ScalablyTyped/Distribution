package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.TpRegisterResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse")
@js.native
/**
  * Constructs a new TpRegisterResponse.
  * @param [properties] Properties to set
  */
class TpRegisterResponse () extends ITpRegisterResponse {
  def this(properties: ITpRegisterResponse) = this()
  /** TpRegisterResponse status. */
  @JSName("status")
  var status_TpRegisterResponse: Status = js.native
  /**
    * Converts this TpRegisterResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "TpRegisterResponse")
@js.native
object TpRegisterResponse extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  /**
    * Creates a new TpRegisterResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpRegisterResponse instance
    */
  def create(): TpRegisterResponse = js.native
  def create(properties: ITpRegisterResponse): TpRegisterResponse = js.native
  /**
    * Decodes a TpRegisterResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TpRegisterResponse = js.native
  def decode(reader: Reader, length: Double): TpRegisterResponse = js.native
  def decode(reader: Uint8Array): TpRegisterResponse = js.native
  def decode(reader: Uint8Array, length: Double): TpRegisterResponse = js.native
  /**
    * Decodes a TpRegisterResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpRegisterResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TpRegisterResponse = js.native
  def decodeDelimited(reader: Uint8Array): TpRegisterResponse = js.native
  /**
    * Encodes the specified TpRegisterResponse message. Does not implicitly {@link TpRegisterResponse.verify|verify} messages.
    * @param message TpRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpRegisterResponse): Writer = js.native
  def encode(message: ITpRegisterResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TpRegisterResponse message, length delimited. Does not implicitly {@link TpRegisterResponse.verify|verify} messages.
    * @param message TpRegisterResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpRegisterResponse): Writer = js.native
  def encodeDelimited(message: ITpRegisterResponse, writer: Writer): Writer = js.native
  /**
    * Creates a TpRegisterResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpRegisterResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): TpRegisterResponse = js.native
  /**
    * Creates a plain object from a TpRegisterResponse message. Also converts values to other types if specified.
    * @param message TpRegisterResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TpRegisterResponse): StringDictionary[js.Any] = js.native
  def toObject(message: TpRegisterResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TpRegisterResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    @js.native
    sealed trait ERROR extends Status
    
    @js.native
    sealed trait OK extends Status
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    /* 2 */ @js.native
    object ERROR extends TopLevel[ERROR with Double]
    
    /* 1 */ @js.native
    object OK extends TopLevel[OK with Double]
    
    /* 0 */ @js.native
    object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
    
  }
  
}

