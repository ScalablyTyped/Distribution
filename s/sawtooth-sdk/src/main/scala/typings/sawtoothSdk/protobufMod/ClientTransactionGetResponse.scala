package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object ClientTransactionGetResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR extends Status
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.INTERNAL_ERROR with Double = js.native
    
    @js.native
    sealed trait INVALID_ID extends Status
    /* 8 */ val INVALID_ID: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.INVALID_ID with Double = js.native
    
    @js.native
    sealed trait NO_RESOURCE extends Status
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.NO_RESOURCE with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ClientTransactionGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientTransactionGetResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.create")
  @js.native
  def create(): ClientTransactionGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.create")
  @js.native
  def create(properties: IClientTransactionGetResponse): ClientTransactionGetResponse = js.native
  
  /**
    * Decodes a ClientTransactionGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientTransactionGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.decode")
  @js.native
  def decode(reader: Reader): ClientTransactionGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientTransactionGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ClientTransactionGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ClientTransactionGetResponse = js.native
  
  /**
    * Decodes a ClientTransactionGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientTransactionGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientTransactionGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ClientTransactionGetResponse = js.native
  
  /**
    * Encodes the specified ClientTransactionGetResponse message. Does not implicitly {@link ClientTransactionGetResponse.verify|verify} messages.
    * @param message ClientTransactionGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.encode")
  @js.native
  def encode(message: IClientTransactionGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.encode")
  @js.native
  def encode(message: IClientTransactionGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientTransactionGetResponse message, length delimited. Does not implicitly {@link ClientTransactionGetResponse.verify|verify} messages.
    * @param message ClientTransactionGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientTransactionGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientTransactionGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientTransactionGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientTransactionGetResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientTransactionGetResponse = js.native
  
  /**
    * Creates a plain object from a ClientTransactionGetResponse message. Also converts values to other types if specified.
    * @param message ClientTransactionGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.toObject")
  @js.native
  def toObject(message: ClientTransactionGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.toObject")
  @js.native
  def toObject(message: ClientTransactionGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientTransactionGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
