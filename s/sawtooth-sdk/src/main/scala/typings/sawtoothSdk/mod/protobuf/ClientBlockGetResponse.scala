package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientBlockGetResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse")
@js.native
/**
  * Constructs a new ClientBlockGetResponse.
  * @param [properties] Properties to set
  */
class ClientBlockGetResponse ()
  extends typings.sawtoothSdk.protobufMod.ClientBlockGetResponse {
  def this(properties: IClientBlockGetResponse) = this()
}
/* static members */
object ClientBlockGetResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ClientBlockGetResponse.Status with Double] = js.native
    
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientBlockGetResponse.Status.INTERNAL_ERROR with Double = js.native
    
    /* 8 */ val INVALID_ID: typings.sawtoothSdk.protobufMod.ClientBlockGetResponse.Status.INVALID_ID with Double = js.native
    
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientBlockGetResponse.Status.NO_RESOURCE with Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientBlockGetResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientBlockGetResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ClientBlockGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ClientBlockGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.create")
  @js.native
  def create(properties: IClientBlockGetResponse): typings.sawtoothSdk.protobufMod.ClientBlockGetResponse = js.native
  
  /**
    * Decodes a ClientBlockGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBlockGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientBlockGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBlockGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientBlockGetResponse = js.native
  
  /**
    * Decodes a ClientBlockGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientBlockGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientBlockGetResponse = js.native
  
  /**
    * Encodes the specified ClientBlockGetResponse message. Does not implicitly {@link ClientBlockGetResponse.verify|verify} messages.
    * @param message ClientBlockGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.encode")
  @js.native
  def encode(message: IClientBlockGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.encode")
  @js.native
  def encode(message: IClientBlockGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBlockGetResponse message, length delimited. Does not implicitly {@link ClientBlockGetResponse.verify|verify} messages.
    * @param message ClientBlockGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBlockGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBlockGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientBlockGetResponse = js.native
  
  /**
    * Creates a plain object from a ClientBlockGetResponse message. Also converts values to other types if specified.
    * @param message ClientBlockGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBlockGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientBlockGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBlockGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientBlockGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
