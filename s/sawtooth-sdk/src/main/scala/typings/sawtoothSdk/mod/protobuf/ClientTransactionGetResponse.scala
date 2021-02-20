package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientTransactionGetResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse")
@js.native
/**
  * Constructs a new ClientTransactionGetResponse.
  * @param [properties] Properties to set
  */
class ClientTransactionGetResponse ()
  extends typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse {
  def this(properties: IClientTransactionGetResponse) = this()
}
/* static members */
object ClientTransactionGetResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status with Double] = js.native
    
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.INTERNAL_ERROR with Double = js.native
    
    /* 8 */ val INVALID_ID: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.INVALID_ID with Double = js.native
    
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.NO_RESOURCE with Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ClientTransactionGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientTransactionGetResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.create")
  @js.native
  def create(properties: IClientTransactionGetResponse): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  
  /**
    * Decodes a ClientTransactionGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientTransactionGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  
  /**
    * Decodes a ClientTransactionGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientTransactionGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  
  /**
    * Encodes the specified ClientTransactionGetResponse message. Does not implicitly {@link ClientTransactionGetResponse.verify|verify} messages.
    * @param message ClientTransactionGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.encode")
  @js.native
  def encode(message: IClientTransactionGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.encode")
  @js.native
  def encode(message: IClientTransactionGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientTransactionGetResponse message, length delimited. Does not implicitly {@link ClientTransactionGetResponse.verify|verify} messages.
    * @param message ClientTransactionGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientTransactionGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientTransactionGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientTransactionGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientTransactionGetResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse = js.native
  
  /**
    * Creates a plain object from a ClientTransactionGetResponse message. Also converts values to other types if specified.
    * @param message ClientTransactionGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientTransactionGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientTransactionGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
