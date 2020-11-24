package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientBatchListResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBatchListResponse")
@js.native
/**
  * Constructs a new ClientBatchListResponse.
  * @param [properties] Properties to set
  */
class ClientBatchListResponse ()
  extends typings.sawtoothSdk.protobufMod.ClientBatchListResponse {
  def this(properties: IClientBatchListResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientBatchListResponse")
@js.native
object ClientBatchListResponse extends js.Object {
  
  /**
    * Creates a new ClientBatchListResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchListResponse instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  def create(properties: IClientBatchListResponse): typings.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  
  /**
    * Decodes a ClientBatchListResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  
  /**
    * Decodes a ClientBatchListResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  
  /**
    * Encodes the specified ClientBatchListResponse message. Does not implicitly {@link ClientBatchListResponse.verify|verify} messages.
    * @param message ClientBatchListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBatchListResponse): Writer = js.native
  def encode(message: IClientBatchListResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBatchListResponse message, length delimited. Does not implicitly {@link ClientBatchListResponse.verify|verify} messages.
    * @param message ClientBatchListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBatchListResponse): Writer = js.native
  def encodeDelimited(message: IClientBatchListResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBatchListResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchListResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientBatchListResponse = js.native
  
  /**
    * Creates a plain object from a ClientBatchListResponse message. Also converts values to other types if specified.
    * @param message ClientBatchListResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBatchListResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBatchListResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBatchListResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status with Double] = js.native
    
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.INTERNAL_ERROR with Double = js.native
    
    /* 8 */ val INVALID_ID: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.INVALID_ID with Double = js.native
    
    /* 6 */ val INVALID_PAGING: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.INVALID_PAGING with Double = js.native
    
    /* 7 */ val INVALID_SORT: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.INVALID_SORT with Double = js.native
    
    /* 3 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.NOT_READY with Double = js.native
    
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.NO_RESOURCE with Double = js.native
    
    /* 4 */ val NO_ROOT: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.NO_ROOT with Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.STATUS_UNSET with Double = js.native
  }
}
