package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse")
@js.native
/**
  * Constructs a new ClientBatchStatusResponse.
  * @param [properties] Properties to set
  */
class ClientBatchStatusResponse () extends IClientBatchStatusResponse {
  def this(properties: IClientBatchStatusResponse) = this()
  
  /** ClientBatchStatusResponse batchStatuses. */
  @JSName("batchStatuses")
  var batchStatuses_ClientBatchStatusResponse: js.Array[IClientBatchStatus] = js.native
  
  /** ClientBatchStatusResponse status. */
  @JSName("status")
  var status_ClientBatchStatusResponse: Status = js.native
  
  /**
    * Converts this ClientBatchStatusResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientBatchStatusResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR extends Status
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status.INTERNAL_ERROR with Double = js.native
    
    @js.native
    sealed trait INVALID_ID extends Status
    /* 8 */ val INVALID_ID: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status.INVALID_ID with Double = js.native
    
    @js.native
    sealed trait NO_RESOURCE extends Status
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status.NO_RESOURCE with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ClientBatchStatusResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchStatusResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.create")
  @js.native
  def create(): ClientBatchStatusResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.create")
  @js.native
  def create(properties: IClientBatchStatusResponse): ClientBatchStatusResponse = js.native
  
  /**
    * Decodes a ClientBatchStatusResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchStatusResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.decode")
  @js.native
  def decode(reader: Reader): ClientBatchStatusResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientBatchStatusResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ClientBatchStatusResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ClientBatchStatusResponse = js.native
  
  /**
    * Decodes a ClientBatchStatusResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchStatusResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientBatchStatusResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ClientBatchStatusResponse = js.native
  
  /**
    * Encodes the specified ClientBatchStatusResponse message. Does not implicitly {@link ClientBatchStatusResponse.verify|verify} messages.
    * @param message ClientBatchStatusResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.encode")
  @js.native
  def encode(message: IClientBatchStatusResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.encode")
  @js.native
  def encode(message: IClientBatchStatusResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBatchStatusResponse message, length delimited. Does not implicitly {@link ClientBatchStatusResponse.verify|verify} messages.
    * @param message ClientBatchStatusResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBatchStatusResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBatchStatusResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBatchStatusResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchStatusResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientBatchStatusResponse = js.native
  
  /**
    * Creates a plain object from a ClientBatchStatusResponse message. Also converts values to other types if specified.
    * @param message ClientBatchStatusResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.toObject")
  @js.native
  def toObject(message: ClientBatchStatusResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.toObject")
  @js.native
  def toObject(message: ClientBatchStatusResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBatchStatusResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
