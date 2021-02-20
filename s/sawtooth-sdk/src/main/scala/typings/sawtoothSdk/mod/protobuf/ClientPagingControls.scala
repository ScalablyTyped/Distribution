package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientPagingControls
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientPagingControls")
@js.native
/**
  * Constructs a new ClientPagingControls.
  * @param [properties] Properties to set
  */
class ClientPagingControls ()
  extends typings.sawtoothSdk.protobufMod.ClientPagingControls {
  def this(properties: IClientPagingControls) = this()
}
/* static members */
object ClientPagingControls {
  
  /**
    * Creates a new ClientPagingControls instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientPagingControls instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingControls.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ClientPagingControls = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingControls.create")
  @js.native
  def create(properties: IClientPagingControls): typings.sawtoothSdk.protobufMod.ClientPagingControls = js.native
  
  /**
    * Decodes a ClientPagingControls message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientPagingControls
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingControls.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientPagingControls = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingControls.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientPagingControls = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingControls.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientPagingControls = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingControls.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientPagingControls = js.native
  
  /**
    * Decodes a ClientPagingControls message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientPagingControls
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingControls.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientPagingControls = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingControls.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientPagingControls = js.native
  
  /**
    * Encodes the specified ClientPagingControls message. Does not implicitly {@link ClientPagingControls.verify|verify} messages.
    * @param message ClientPagingControls message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingControls.encode")
  @js.native
  def encode(message: IClientPagingControls): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingControls.encode")
  @js.native
  def encode(message: IClientPagingControls, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientPagingControls message, length delimited. Does not implicitly {@link ClientPagingControls.verify|verify} messages.
    * @param message ClientPagingControls message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingControls.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientPagingControls): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingControls.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientPagingControls, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientPagingControls message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientPagingControls
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingControls.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientPagingControls = js.native
  
  /**
    * Creates a plain object from a ClientPagingControls message. Also converts values to other types if specified.
    * @param message ClientPagingControls
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingControls.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientPagingControls): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingControls.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientPagingControls, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientPagingControls message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientPagingControls.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
