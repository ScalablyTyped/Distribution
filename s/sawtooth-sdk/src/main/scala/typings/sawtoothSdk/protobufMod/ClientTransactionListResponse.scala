package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse")
@js.native
/**
  * Constructs a new ClientTransactionListResponse.
  * @param [properties] Properties to set
  */
class ClientTransactionListResponse () extends IClientTransactionListResponse {
  def this(properties: IClientTransactionListResponse) = this()
  
  /** ClientTransactionListResponse headId. */
  @JSName("headId")
  var headId_ClientTransactionListResponse: String = js.native
  
  /** ClientTransactionListResponse status. */
  @JSName("status")
  var status_ClientTransactionListResponse: Status = js.native
  
  /**
    * Converts this ClientTransactionListResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ClientTransactionListResponse transactions. */
  @JSName("transactions")
  var transactions_ClientTransactionListResponse: js.Array[ITransaction] = js.native
}
/* static members */
object ClientTransactionListResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR extends Status
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.INTERNAL_ERROR with Double = js.native
    
    @js.native
    sealed trait INVALID_ID extends Status
    /* 8 */ val INVALID_ID: typings.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.INVALID_ID with Double = js.native
    
    @js.native
    sealed trait INVALID_PAGING extends Status
    /* 6 */ val INVALID_PAGING: typings.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.INVALID_PAGING with Double = js.native
    
    @js.native
    sealed trait INVALID_SORT extends Status
    /* 7 */ val INVALID_SORT: typings.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.INVALID_SORT with Double = js.native
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 3 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.NOT_READY with Double = js.native
    
    @js.native
    sealed trait NO_RESOURCE extends Status
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.NO_RESOURCE with Double = js.native
    
    @js.native
    sealed trait NO_ROOT extends Status
    /* 4 */ val NO_ROOT: typings.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.NO_ROOT with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ClientTransactionListResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientTransactionListResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.create")
  @js.native
  def create(): ClientTransactionListResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.create")
  @js.native
  def create(properties: IClientTransactionListResponse): ClientTransactionListResponse = js.native
  
  /**
    * Decodes a ClientTransactionListResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientTransactionListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.decode")
  @js.native
  def decode(reader: Reader): ClientTransactionListResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientTransactionListResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ClientTransactionListResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ClientTransactionListResponse = js.native
  
  /**
    * Decodes a ClientTransactionListResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientTransactionListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientTransactionListResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ClientTransactionListResponse = js.native
  
  /**
    * Encodes the specified ClientTransactionListResponse message. Does not implicitly {@link ClientTransactionListResponse.verify|verify} messages.
    * @param message ClientTransactionListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.encode")
  @js.native
  def encode(message: IClientTransactionListResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.encode")
  @js.native
  def encode(message: IClientTransactionListResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientTransactionListResponse message, length delimited. Does not implicitly {@link ClientTransactionListResponse.verify|verify} messages.
    * @param message ClientTransactionListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientTransactionListResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientTransactionListResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientTransactionListResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientTransactionListResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientTransactionListResponse = js.native
  
  /**
    * Creates a plain object from a ClientTransactionListResponse message. Also converts values to other types if specified.
    * @param message ClientTransactionListResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.toObject")
  @js.native
  def toObject(message: ClientTransactionListResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.toObject")
  @js.native
  def toObject(message: ClientTransactionListResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientTransactionListResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
