package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse")
@js.native
/**
  * Constructs a new ClientBatchGetResponse.
  * @param [properties] Properties to set
  */
class ClientBatchGetResponse () extends IClientBatchGetResponse {
  def this(properties: IClientBatchGetResponse) = this()
  
  /** ClientBatchGetResponse status. */
  @JSName("status")
  var status_ClientBatchGetResponse: Status = js.native
  
  /**
    * Converts this ClientBatchGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientBatchGetResponse {
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR extends Status
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status.INTERNAL_ERROR with Double = js.native
    
    @js.native
    sealed trait INVALID_ID extends Status
    /* 8 */ val INVALID_ID: typings.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status.INVALID_ID with Double = js.native
    
    @js.native
    sealed trait NO_RESOURCE extends Status
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status.NO_RESOURCE with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ClientBatchGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchGetResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.create")
  @js.native
  def create(): ClientBatchGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.create")
  @js.native
  def create(properties: IClientBatchGetResponse): ClientBatchGetResponse = js.native
  
  /**
    * Decodes a ClientBatchGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.decode")
  @js.native
  def decode(reader: Reader): ClientBatchGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientBatchGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ClientBatchGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ClientBatchGetResponse = js.native
  
  /**
    * Decodes a ClientBatchGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientBatchGetResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ClientBatchGetResponse = js.native
  
  /**
    * Encodes the specified ClientBatchGetResponse message. Does not implicitly {@link ClientBatchGetResponse.verify|verify} messages.
    * @param message ClientBatchGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.encode")
  @js.native
  def encode(message: IClientBatchGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.encode")
  @js.native
  def encode(message: IClientBatchGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBatchGetResponse message, length delimited. Does not implicitly {@link ClientBatchGetResponse.verify|verify} messages.
    * @param message ClientBatchGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBatchGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBatchGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBatchGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchGetResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientBatchGetResponse = js.native
  
  /**
    * Creates a plain object from a ClientBatchGetResponse message. Also converts values to other types if specified.
    * @param message ClientBatchGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.toObject")
  @js.native
  def toObject(message: ClientBatchGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.toObject")
  @js.native
  def toObject(message: ClientBatchGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBatchGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
