package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITransactionHeader
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("sawtooth-sdk", "protobuf.TransactionHeader")
@js.native
object TransactionHeader extends js.Object {
  /**
    * Creates a new TransactionHeader instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TransactionHeader instance
    */
  def create(): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  def create(properties: ITransactionHeader): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  /**
    * Decodes a TransactionHeader message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TransactionHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  /**
    * Decodes a TransactionHeader message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TransactionHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  /**
    * Encodes the specified TransactionHeader message. Does not implicitly {@link TransactionHeader.verify|verify} messages.
    * @param message TransactionHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITransactionHeader): Writer = js.native
  def encode(message: ITransactionHeader, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TransactionHeader message, length delimited. Does not implicitly {@link TransactionHeader.verify|verify} messages.
    * @param message TransactionHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITransactionHeader): Writer = js.native
  def encodeDelimited(message: ITransactionHeader, writer: Writer): Writer = js.native
  /**
    * Creates a TransactionHeader message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TransactionHeader
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TransactionHeader = js.native
  /**
    * Creates a plain object from a TransactionHeader message. Also converts values to other types if specified.
    * @param message TransactionHeader
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.TransactionHeader): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TransactionHeader, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TransactionHeader message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

