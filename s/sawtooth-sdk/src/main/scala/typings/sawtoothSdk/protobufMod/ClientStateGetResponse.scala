package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
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
object ClientStateGetResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR extends Status
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.INTERNAL_ERROR with Double = js.native
    
    @js.native
    sealed trait INVALID_ADDRESS extends Status
    /* 6 */ val INVALID_ADDRESS: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.INVALID_ADDRESS with Double = js.native
    
    @js.native
    sealed trait INVALID_ROOT extends Status
    /* 7 */ val INVALID_ROOT: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.INVALID_ROOT with Double = js.native
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 3 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.NOT_READY with Double = js.native
    
    @js.native
    sealed trait NO_RESOURCE extends Status
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.NO_RESOURCE with Double = js.native
    
    @js.native
    sealed trait NO_ROOT extends Status
    /* 4 */ val NO_ROOT: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.NO_ROOT with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ClientStateGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStateGetResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.create")
  @js.native
  def create(): ClientStateGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.create")
  @js.native
  def create(properties: IClientStateGetResponse): ClientStateGetResponse = js.native
  
  /**
    * Decodes a ClientStateGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.decode")
  @js.native
  def decode(reader: Reader): ClientStateGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientStateGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ClientStateGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ClientStateGetResponse = js.native
  
  /**
    * Decodes a ClientStateGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientStateGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ClientStateGetResponse = js.native
  
  /**
    * Encodes the specified ClientStateGetResponse message. Does not implicitly {@link ClientStateGetResponse.verify|verify} messages.
    * @param message ClientStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.encode")
  @js.native
  def encode(message: IClientStateGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.encode")
  @js.native
  def encode(message: IClientStateGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientStateGetResponse message, length delimited. Does not implicitly {@link ClientStateGetResponse.verify|verify} messages.
    * @param message ClientStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientStateGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientStateGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientStateGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStateGetResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientStateGetResponse = js.native
  
  /**
    * Creates a plain object from a ClientStateGetResponse message. Also converts values to other types if specified.
    * @param message ClientStateGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.toObject")
  @js.native
  def toObject(message: ClientStateGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.toObject")
  @js.native
  def toObject(message: ClientStateGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientStateGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
