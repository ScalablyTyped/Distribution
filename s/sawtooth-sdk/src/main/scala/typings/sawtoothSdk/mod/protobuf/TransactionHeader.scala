package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITransactionHeader
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TransactionHeader")
@js.native
/**
  * Constructs a new TransactionHeader.
  * @param [properties] Properties to set
  */
class TransactionHeader ()
  extends typings.sawtoothSdk.protobufMod.TransactionHeader {
  def this(properties: ITransactionHeader) = this()
}
/* static members */
object TransactionHeader {
  
  /**
    * Creates a new TransactionHeader instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TransactionHeader instance
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader.create")
  @js.native
  def create(properties: ITransactionHeader): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  
  /**
    * Decodes a TransactionHeader message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TransactionHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  
  /**
    * Decodes a TransactionHeader message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TransactionHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  
  /**
    * Encodes the specified TransactionHeader message. Does not implicitly {@link TransactionHeader.verify|verify} messages.
    * @param message TransactionHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader.encode")
  @js.native
  def encode(message: ITransactionHeader): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader.encode")
  @js.native
  def encode(message: ITransactionHeader, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TransactionHeader message, length delimited. Does not implicitly {@link TransactionHeader.verify|verify} messages.
    * @param message TransactionHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITransactionHeader): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITransactionHeader, writer: Writer): Writer = js.native
  
  /**
    * Creates a TransactionHeader message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TransactionHeader
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  
  /**
    * Creates a plain object from a TransactionHeader message. Also converts values to other types if specified.
    * @param message TransactionHeader
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TransactionHeader): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TransactionHeader, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TransactionHeader message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
