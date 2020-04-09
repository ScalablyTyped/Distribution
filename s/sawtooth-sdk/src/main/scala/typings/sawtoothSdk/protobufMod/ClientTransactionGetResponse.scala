package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse")
@js.native
/**
  * Constructs a new ClientTransactionGetResponse.
  * @param [properties] Properties to set
  */
class ClientTransactionGetResponse () extends IClientTransactionGetResponse {
  def this(properties: IClientTransactionGetResponse) = this()
  /** ClientTransactionGetResponse status. */
  @JSName("status")
  var status_ClientTransactionGetResponse: Status = js.native
  /**
    * Converts this ClientTransactionGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse")
@js.native
object ClientTransactionGetResponse extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  /**
    * Creates a new ClientTransactionGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientTransactionGetResponse instance
    */
  def create(): ClientTransactionGetResponse = js.native
  def create(properties: IClientTransactionGetResponse): ClientTransactionGetResponse = js.native
  /**
    * Decodes a ClientTransactionGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientTransactionGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ClientTransactionGetResponse = js.native
  def decode(reader: Reader, length: Double): ClientTransactionGetResponse = js.native
  def decode(reader: Uint8Array): ClientTransactionGetResponse = js.native
  def decode(reader: Uint8Array, length: Double): ClientTransactionGetResponse = js.native
  /**
    * Decodes a ClientTransactionGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientTransactionGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ClientTransactionGetResponse = js.native
  def decodeDelimited(reader: Uint8Array): ClientTransactionGetResponse = js.native
  /**
    * Encodes the specified ClientTransactionGetResponse message. Does not implicitly {@link ClientTransactionGetResponse.verify|verify} messages.
    * @param message ClientTransactionGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientTransactionGetResponse): Writer = js.native
  def encode(message: IClientTransactionGetResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientTransactionGetResponse message, length delimited. Does not implicitly {@link ClientTransactionGetResponse.verify|verify} messages.
    * @param message ClientTransactionGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientTransactionGetResponse): Writer = js.native
  def encodeDelimited(message: IClientTransactionGetResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ClientTransactionGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientTransactionGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ClientTransactionGetResponse = js.native
  /**
    * Creates a plain object from a ClientTransactionGetResponse message. Also converts values to other types if specified.
    * @param message ClientTransactionGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ClientTransactionGetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ClientTransactionGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientTransactionGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    @js.native
    sealed trait INTERNAL_ERROR extends Status
    
    @js.native
    sealed trait INVALID_ID extends Status
    
    @js.native
    sealed trait NO_RESOURCE extends Status
    
    @js.native
    sealed trait OK extends Status
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    /* 2 */ @js.native
    object INTERNAL_ERROR extends TopLevel[INTERNAL_ERROR with Double]
    
    /* 8 */ @js.native
    object INVALID_ID extends TopLevel[INVALID_ID with Double]
    
    /* 5 */ @js.native
    object NO_RESOURCE extends TopLevel[NO_RESOURCE with Double]
    
    /* 1 */ @js.native
    object OK extends TopLevel[OK with Double]
    
    /* 0 */ @js.native
    object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
    
  }
  
}

