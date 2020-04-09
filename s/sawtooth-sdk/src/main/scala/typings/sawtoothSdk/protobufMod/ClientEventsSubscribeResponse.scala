package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ClientEventsSubscribeResponse")
@js.native
/**
  * Constructs a new ClientEventsSubscribeResponse.
  * @param [properties] Properties to set
  */
class ClientEventsSubscribeResponse () extends IClientEventsSubscribeResponse {
  def this(properties: IClientEventsSubscribeResponse) = this()
  /** ClientEventsSubscribeResponse responseMessage. */
  @JSName("responseMessage")
  var responseMessage_ClientEventsSubscribeResponse: String = js.native
  /** ClientEventsSubscribeResponse status. */
  @JSName("status")
  var status_ClientEventsSubscribeResponse: Status = js.native
  /**
    * Converts this ClientEventsSubscribeResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientEventsSubscribeResponse")
@js.native
object ClientEventsSubscribeResponse extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  /**
    * Creates a new ClientEventsSubscribeResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientEventsSubscribeResponse instance
    */
  def create(): ClientEventsSubscribeResponse = js.native
  def create(properties: IClientEventsSubscribeResponse): ClientEventsSubscribeResponse = js.native
  /**
    * Decodes a ClientEventsSubscribeResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientEventsSubscribeResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ClientEventsSubscribeResponse = js.native
  def decode(reader: Reader, length: Double): ClientEventsSubscribeResponse = js.native
  def decode(reader: Uint8Array): ClientEventsSubscribeResponse = js.native
  def decode(reader: Uint8Array, length: Double): ClientEventsSubscribeResponse = js.native
  /**
    * Decodes a ClientEventsSubscribeResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientEventsSubscribeResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ClientEventsSubscribeResponse = js.native
  def decodeDelimited(reader: Uint8Array): ClientEventsSubscribeResponse = js.native
  /**
    * Encodes the specified ClientEventsSubscribeResponse message. Does not implicitly {@link ClientEventsSubscribeResponse.verify|verify} messages.
    * @param message ClientEventsSubscribeResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientEventsSubscribeResponse): Writer = js.native
  def encode(message: IClientEventsSubscribeResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientEventsSubscribeResponse message, length delimited. Does not implicitly {@link ClientEventsSubscribeResponse.verify|verify} messages.
    * @param message ClientEventsSubscribeResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientEventsSubscribeResponse): Writer = js.native
  def encodeDelimited(message: IClientEventsSubscribeResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ClientEventsSubscribeResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientEventsSubscribeResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ClientEventsSubscribeResponse = js.native
  /**
    * Creates a plain object from a ClientEventsSubscribeResponse message. Also converts values to other types if specified.
    * @param message ClientEventsSubscribeResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ClientEventsSubscribeResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ClientEventsSubscribeResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientEventsSubscribeResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    @js.native
    sealed trait INVALID_FILTER extends Status
    
    @js.native
    sealed trait OK extends Status
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    
    @js.native
    sealed trait UNKNOWN_BLOCK extends Status
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    /* 2 */ @js.native
    object INVALID_FILTER extends TopLevel[INVALID_FILTER with Double]
    
    /* 1 */ @js.native
    object OK extends TopLevel[OK with Double]
    
    /* 0 */ @js.native
    object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
    
    /* 3 */ @js.native
    object UNKNOWN_BLOCK extends TopLevel[UNKNOWN_BLOCK with Double]
    
  }
  
}

