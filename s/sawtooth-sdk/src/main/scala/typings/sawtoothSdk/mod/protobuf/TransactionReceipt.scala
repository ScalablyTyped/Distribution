package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITransactionReceipt
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TransactionReceipt")
@js.native
/**
  * Constructs a new TransactionReceipt.
  * @param [properties] Properties to set
  */
class TransactionReceipt ()
  extends typings.sawtoothSdk.protobufMod.TransactionReceipt {
  def this(properties: ITransactionReceipt) = this()
}
/* static members */
object TransactionReceipt {
  
  /**
    * Creates a new TransactionReceipt instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TransactionReceipt instance
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.create")
  @js.native
  def create(properties: ITransactionReceipt): typings.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  
  /**
    * Decodes a TransactionReceipt message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TransactionReceipt
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  
  /**
    * Decodes a TransactionReceipt message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TransactionReceipt
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  
  /**
    * Encodes the specified TransactionReceipt message. Does not implicitly {@link TransactionReceipt.verify|verify} messages.
    * @param message TransactionReceipt message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.encode")
  @js.native
  def encode(message: ITransactionReceipt): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.encode")
  @js.native
  def encode(message: ITransactionReceipt, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TransactionReceipt message, length delimited. Does not implicitly {@link TransactionReceipt.verify|verify} messages.
    * @param message TransactionReceipt message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITransactionReceipt): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITransactionReceipt, writer: Writer): Writer = js.native
  
  /**
    * Creates a TransactionReceipt message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TransactionReceipt
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TransactionReceipt = js.native
  
  /**
    * Creates a plain object from a TransactionReceipt message. Also converts values to other types if specified.
    * @param message TransactionReceipt
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TransactionReceipt): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TransactionReceipt, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TransactionReceipt message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.TransactionReceipt.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
