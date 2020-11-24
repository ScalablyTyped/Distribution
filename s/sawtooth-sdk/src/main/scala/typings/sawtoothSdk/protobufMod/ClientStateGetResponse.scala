package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse")
@js.native
/**
  * Constructs a new ClientStateGetResponse.
  * @param [properties] Properties to set
  */
class ClientStateGetResponse () extends IClientStateGetResponse {
  def this(properties: IClientStateGetResponse) = this()
  
  /** ClientStateGetResponse stateRoot. */
  @JSName("stateRoot")
  var stateRoot_ClientStateGetResponse: String = js.native
  
  /** ClientStateGetResponse status. */
  @JSName("status")
  var status_ClientStateGetResponse: Status = js.native
  
  /**
    * Converts this ClientStateGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ClientStateGetResponse value. */
  @JSName("value")
  var value_ClientStateGetResponse: Uint8Array = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse")
@js.native
object ClientStateGetResponse extends js.Object {
  
  /**
    * Creates a new ClientStateGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStateGetResponse instance
    */
  def create(): ClientStateGetResponse = js.native
  def create(properties: IClientStateGetResponse): ClientStateGetResponse = js.native
  
  /**
    * Decodes a ClientStateGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ClientStateGetResponse = js.native
  def decode(reader: Reader, length: Double): ClientStateGetResponse = js.native
  def decode(reader: Uint8Array): ClientStateGetResponse = js.native
  def decode(reader: Uint8Array, length: Double): ClientStateGetResponse = js.native
  
  /**
    * Decodes a ClientStateGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ClientStateGetResponse = js.native
  def decodeDelimited(reader: Uint8Array): ClientStateGetResponse = js.native
  
  /**
    * Encodes the specified ClientStateGetResponse message. Does not implicitly {@link ClientStateGetResponse.verify|verify} messages.
    * @param message ClientStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientStateGetResponse): Writer = js.native
  def encode(message: IClientStateGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientStateGetResponse message, length delimited. Does not implicitly {@link ClientStateGetResponse.verify|verify} messages.
    * @param message ClientStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientStateGetResponse): Writer = js.native
  def encodeDelimited(message: IClientStateGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientStateGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStateGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ClientStateGetResponse = js.native
  
  /**
    * Creates a plain object from a ClientStateGetResponse message. Also converts values to other types if specified.
    * @param message ClientStateGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ClientStateGetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ClientStateGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientStateGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  @js.native
  sealed trait Status extends js.Object
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR extends Status
    /* 2 */ @js.native
    object INTERNAL_ERROR extends TopLevel[INTERNAL_ERROR with Double]
    
    @js.native
    sealed trait INVALID_ADDRESS extends Status
    /* 6 */ @js.native
    object INVALID_ADDRESS extends TopLevel[INVALID_ADDRESS with Double]
    
    @js.native
    sealed trait INVALID_ROOT extends Status
    /* 7 */ @js.native
    object INVALID_ROOT extends TopLevel[INVALID_ROOT with Double]
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 3 */ @js.native
    object NOT_READY extends TopLevel[NOT_READY with Double]
    
    @js.native
    sealed trait NO_RESOURCE extends Status
    /* 5 */ @js.native
    object NO_RESOURCE extends TopLevel[NO_RESOURCE with Double]
    
    @js.native
    sealed trait NO_ROOT extends Status
    /* 4 */ @js.native
    object NO_ROOT extends TopLevel[NO_ROOT with Double]
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ @js.native
    object OK extends TopLevel[OK with Double]
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ @js.native
    object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
  }
}
