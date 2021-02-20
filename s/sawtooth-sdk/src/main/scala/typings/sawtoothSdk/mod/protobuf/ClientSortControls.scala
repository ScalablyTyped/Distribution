package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IClientSortControls
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientSortControls")
@js.native
/**
  * Constructs a new ClientSortControls.
  * @param [properties] Properties to set
  */
class ClientSortControls ()
  extends typings.sawtoothSdk.protobufMod.ClientSortControls {
  def this(properties: IClientSortControls) = this()
}
/* static members */
object ClientSortControls {
  
  /**
    * Creates a new ClientSortControls instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientSortControls instance
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientSortControls.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.ClientSortControls = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientSortControls.create")
  @js.native
  def create(properties: IClientSortControls): typings.sawtoothSdk.protobufMod.ClientSortControls = js.native
  
  /**
    * Decodes a ClientSortControls message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientSortControls
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientSortControls.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientSortControls = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientSortControls.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientSortControls = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientSortControls.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientSortControls = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientSortControls.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientSortControls = js.native
  
  /**
    * Decodes a ClientSortControls message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientSortControls
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientSortControls.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientSortControls = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientSortControls.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientSortControls = js.native
  
  /**
    * Encodes the specified ClientSortControls message. Does not implicitly {@link ClientSortControls.verify|verify} messages.
    * @param message ClientSortControls message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientSortControls.encode")
  @js.native
  def encode(message: IClientSortControls): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientSortControls.encode")
  @js.native
  def encode(message: IClientSortControls, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientSortControls message, length delimited. Does not implicitly {@link ClientSortControls.verify|verify} messages.
    * @param message ClientSortControls message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientSortControls.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientSortControls): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientSortControls.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientSortControls, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientSortControls message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientSortControls
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientSortControls.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientSortControls = js.native
  
  /**
    * Creates a plain object from a ClientSortControls message. Also converts values to other types if specified.
    * @param message ClientSortControls
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientSortControls.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientSortControls): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.ClientSortControls.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientSortControls, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientSortControls message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.ClientSortControls.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
