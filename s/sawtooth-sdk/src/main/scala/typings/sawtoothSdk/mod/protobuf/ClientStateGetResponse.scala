package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientStateGetResponse
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse")
@js.native
/**
  * Constructs a new ClientStateGetResponse.
  * @param [properties] Properties to set
  */
class ClientStateGetResponse ()
  extends typings.sawtoothSdk.protobufMod.ClientStateGetResponse {
  def this(properties: IClientStateGetResponse) = this()
}
/* static members */
object ClientStateGetResponse {
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status with Double] = js.native
    
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.INTERNAL_ERROR with Double = js.native
    
    /* 6 */ val INVALID_ADDRESS: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.INVALID_ADDRESS with Double = js.native
    
    /* 7 */ val INVALID_ROOT: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.INVALID_ROOT with Double = js.native
    
    /* 3 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.NOT_READY with Double = js.native
    
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.NO_RESOURCE with Double = js.native
    
    /* 4 */ val NO_ROOT: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.NO_ROOT with Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ClientStateGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStateGetResponse instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.create")
  @js.native
  def create(properties: IClientStateGetResponse): typings.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  
  /**
    * Decodes a ClientStateGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  
  /**
    * Decodes a ClientStateGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  
  /**
    * Encodes the specified ClientStateGetResponse message. Does not implicitly {@link ClientStateGetResponse.verify|verify} messages.
    * @param message ClientStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.encode")
  @js.native
  def encode(message: IClientStateGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.encode")
  @js.native
  def encode(message: IClientStateGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientStateGetResponse message, length delimited. Does not implicitly {@link ClientStateGetResponse.verify|verify} messages.
    * @param message ClientStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientStateGetResponse): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientStateGetResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientStateGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStateGetResponse
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientStateGetResponse = js.native
  
  /**
    * Creates a plain object from a ClientStateGetResponse message. Also converts values to other types if specified.
    * @param message ClientStateGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientStateGetResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientStateGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientStateGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientStateGetResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
