package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse")
@js.native
/**
  * Constructs a new ClientBatchListResponse.
  * @param [properties] Properties to set
  */
class ClientBatchListResponse () extends IClientBatchListResponse {
  def this(properties: IClientBatchListResponse) = this()
  
  /** ClientBatchListResponse batches. */
  @JSName("batches")
  var batches_ClientBatchListResponse: js.Array[IBatch] = js.native
  
  /** ClientBatchListResponse headId. */
  @JSName("headId")
  var headId_ClientBatchListResponse: String = js.native
  
  /** ClientBatchListResponse status. */
  @JSName("status")
  var status_ClientBatchListResponse: Status = js.native
  
  /**
    * Converts this ClientBatchListResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientBatchListResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR extends Status
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.INTERNAL_ERROR with Double = js.native
    
    @js.native
    sealed trait INVALID_ID extends Status
    /* 8 */ val INVALID_ID: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.INVALID_ID with Double = js.native
    
    @js.native
    sealed trait INVALID_PAGING extends Status
    /* 6 */ val INVALID_PAGING: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.INVALID_PAGING with Double = js.native
    
    @js.native
    sealed trait INVALID_SORT extends Status
    /* 7 */ val INVALID_SORT: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.INVALID_SORT with Double = js.native
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 3 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.NOT_READY with Double = js.native
    
    @js.native
    sealed trait NO_RESOURCE extends Status
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.NO_RESOURCE with Double = js.native
    
    @js.native
    sealed trait NO_ROOT extends Status
    /* 4 */ val NO_ROOT: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.NO_ROOT with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ClientBatchListResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchListResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.create")
  @js.native
  def create(): ClientBatchListResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.create")
  @js.native
  def create(properties: IClientBatchListResponse): ClientBatchListResponse = js.native
  
  /**
    * Decodes a ClientBatchListResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.decode")
  @js.native
  def decode(reader: Reader): ClientBatchListResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientBatchListResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ClientBatchListResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ClientBatchListResponse = js.native
  
  /**
    * Decodes a ClientBatchListResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientBatchListResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ClientBatchListResponse = js.native
  
  /**
    * Encodes the specified ClientBatchListResponse message. Does not implicitly {@link ClientBatchListResponse.verify|verify} messages.
    * @param message ClientBatchListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.encode")
  @js.native
  def encode(message: IClientBatchListResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.encode")
  @js.native
  def encode(message: IClientBatchListResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBatchListResponse message, length delimited. Does not implicitly {@link ClientBatchListResponse.verify|verify} messages.
    * @param message ClientBatchListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBatchListResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBatchListResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBatchListResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchListResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientBatchListResponse = js.native
  
  /**
    * Creates a plain object from a ClientBatchListResponse message. Also converts values to other types if specified.
    * @param message ClientBatchListResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.toObject")
  @js.native
  def toObject(message: ClientBatchListResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.toObject")
  @js.native
  def toObject(message: ClientBatchListResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBatchListResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
