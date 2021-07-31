package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TransactionList")
@js.native
/**
  * Constructs a new TransactionList.
  * @param [properties] Properties to set
  */
class TransactionList ()
  extends StObject
     with ITransactionList {
  def this(properties: ITransactionList) = this()
  
  /**
    * Converts this TransactionList to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** TransactionList transactions. */
  @JSName("transactions")
  var transactions_TransactionList: js.Array[ITransaction] = js.native
}
/* static members */
object TransactionList {
  
  @JSImport("sawtooth-sdk/protobuf", "TransactionList")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TransactionList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TransactionList instance
    */
  @scala.inline
  def create(): TransactionList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TransactionList]
  @scala.inline
  def create(properties: ITransactionList): TransactionList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TransactionList]
  
  /**
    * Decodes a TransactionList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TransactionList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): TransactionList = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TransactionList]
  @scala.inline
  def decode(reader: Reader, length: Double): TransactionList = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TransactionList]
  @scala.inline
  def decode(reader: Uint8Array): TransactionList = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TransactionList]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): TransactionList = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TransactionList]
  
  /**
    * Decodes a TransactionList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TransactionList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): TransactionList = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TransactionList]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): TransactionList = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TransactionList]
  
  /**
    * Encodes the specified TransactionList message. Does not implicitly {@link TransactionList.verify|verify} messages.
    * @param message TransactionList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: ITransactionList): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ITransactionList, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TransactionList message, length delimited. Does not implicitly {@link TransactionList.verify|verify} messages.
    * @param message TransactionList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: ITransactionList): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ITransactionList, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TransactionList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TransactionList
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): TransactionList = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TransactionList]
  
  /**
    * Creates a plain object from a TransactionList message. Also converts values to other types if specified.
    * @param message TransactionList
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: TransactionList): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: TransactionList, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TransactionList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
