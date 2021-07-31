package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "Transaction")
@js.native
/**
  * Constructs a new Transaction.
  * @param [properties] Properties to set
  */
class Transaction ()
  extends StObject
     with ITransaction {
  def this(properties: ITransaction) = this()
  
  /** Transaction headerSignature. */
  @JSName("headerSignature")
  var headerSignature_Transaction: String = js.native
  
  /** Transaction header. */
  @JSName("header")
  var header_Transaction: Uint8Array = js.native
  
  /** Transaction payload. */
  @JSName("payload")
  var payload_Transaction: Uint8Array = js.native
  
  /**
    * Converts this Transaction to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object Transaction {
  
  @JSImport("sawtooth-sdk/protobuf", "Transaction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Transaction instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Transaction instance
    */
  @scala.inline
  def create(): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Transaction]
  @scala.inline
  def create(properties: ITransaction): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  
  /**
    * Decodes a Transaction message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Transaction
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  @scala.inline
  def decode(reader: Reader, length: Double): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  @scala.inline
  def decode(reader: Uint8Array): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  
  /**
    * Decodes a Transaction message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Transaction
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  
  /**
    * Encodes the specified Transaction message. Does not implicitly {@link Transaction.verify|verify} messages.
    * @param message Transaction message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: ITransaction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ITransaction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Transaction message, length delimited. Does not implicitly {@link Transaction.verify|verify} messages.
    * @param message Transaction message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: ITransaction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ITransaction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Transaction message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Transaction
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  
  /**
    * Creates a plain object from a Transaction message. Also converts values to other types if specified.
    * @param message Transaction
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: Transaction): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: Transaction, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Transaction message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
