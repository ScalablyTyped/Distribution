package typings.sawtoothSdk.protobufMod.ClientBatchStatus

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an InvalidTransaction. */
@JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction")
@js.native
/**
  * Constructs a new InvalidTransaction.
  * @param [properties] Properties to set
  */
class InvalidTransaction () extends IInvalidTransaction {
  def this(properties: IInvalidTransaction) = this()
  
  /** InvalidTransaction extendedData. */
  @JSName("extendedData")
  var extendedData_InvalidTransaction: Uint8Array = js.native
  
  /** InvalidTransaction message. */
  @JSName("message")
  var message_InvalidTransaction: String = js.native
  
  /**
    * Converts this InvalidTransaction to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** InvalidTransaction transactionId. */
  @JSName("transactionId")
  var transactionId_InvalidTransaction: String = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction")
@js.native
object InvalidTransaction extends js.Object {
  
  /**
    * Creates a new InvalidTransaction instance using the specified properties.
    * @param [properties] Properties to set
    * @returns InvalidTransaction instance
    */
  def create(): InvalidTransaction = js.native
  def create(properties: IInvalidTransaction): InvalidTransaction = js.native
  
  /**
    * Decodes an InvalidTransaction message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns InvalidTransaction
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): InvalidTransaction = js.native
  def decode(reader: Reader, length: Double): InvalidTransaction = js.native
  def decode(reader: Uint8Array): InvalidTransaction = js.native
  def decode(reader: Uint8Array, length: Double): InvalidTransaction = js.native
  
  /**
    * Decodes an InvalidTransaction message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns InvalidTransaction
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): InvalidTransaction = js.native
  def decodeDelimited(reader: Uint8Array): InvalidTransaction = js.native
  
  /**
    * Encodes the specified InvalidTransaction message. Does not implicitly {@link ClientBatchStatus.InvalidTransaction.verify|verify} messages.
    * @param message InvalidTransaction message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IInvalidTransaction): Writer = js.native
  def encode(message: IInvalidTransaction, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified InvalidTransaction message, length delimited. Does not implicitly {@link ClientBatchStatus.InvalidTransaction.verify|verify} messages.
    * @param message InvalidTransaction message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IInvalidTransaction): Writer = js.native
  def encodeDelimited(message: IInvalidTransaction, writer: Writer): Writer = js.native
  
  /**
    * Creates an InvalidTransaction message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns InvalidTransaction
    */
  def fromObject(`object`: StringDictionary[js.Any]): InvalidTransaction = js.native
  
  /**
    * Creates a plain object from an InvalidTransaction message. Also converts values to other types if specified.
    * @param message InvalidTransaction
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: InvalidTransaction): StringDictionary[js.Any] = js.native
  def toObject(message: InvalidTransaction, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an InvalidTransaction message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
