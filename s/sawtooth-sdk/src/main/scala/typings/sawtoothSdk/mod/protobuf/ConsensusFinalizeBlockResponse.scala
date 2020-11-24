package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusFinalizeBlockResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse")
@js.native
/**
  * Constructs a new ConsensusFinalizeBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusFinalizeBlockResponse ()
  extends typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse {
  def this(properties: IConsensusFinalizeBlockResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusFinalizeBlockResponse")
@js.native
object ConsensusFinalizeBlockResponse extends js.Object {
  
  /**
    * Creates a new ConsensusFinalizeBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusFinalizeBlockResponse instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  def create(properties: IConsensusFinalizeBlockResponse): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  
  /**
    * Decodes a ConsensusFinalizeBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusFinalizeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  
  /**
    * Decodes a ConsensusFinalizeBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusFinalizeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  
  /**
    * Encodes the specified ConsensusFinalizeBlockResponse message. Does not implicitly {@link ConsensusFinalizeBlockResponse.verify|verify} messages.
    * @param message ConsensusFinalizeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusFinalizeBlockResponse): Writer = js.native
  def encode(message: IConsensusFinalizeBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusFinalizeBlockResponse message, length delimited. Does not implicitly {@link ConsensusFinalizeBlockResponse.verify|verify} messages.
    * @param message ConsensusFinalizeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusFinalizeBlockResponse): Writer = js.native
  def encodeDelimited(message: IConsensusFinalizeBlockResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusFinalizeBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusFinalizeBlockResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse = js.native
  
  /**
    * Creates a plain object from a ConsensusFinalizeBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusFinalizeBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusFinalizeBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status with Double
      ] = js.native
    
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.BAD_REQUEST with Double = js.native
    
    /* 6 */ val BLOCK_NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.BLOCK_NOT_READY with Double = js.native
    
    /* 5 */ val INVALID_STATE: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.INVALID_STATE with Double = js.native
    
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.NOT_READY with Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.OK with Double = js.native
    
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.SERVICE_ERROR with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.STATUS_UNSET with Double = js.native
  }
}
