package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.Transaction")
@js.native
/**
  * Constructs a new Transaction.
  * @param [properties] Properties to set
  */
open class Transaction ()
  extends typings.sawtoothSdk.protobufMod.Transaction {
  def this(properties: ITransaction) = this()
}
/* static members */
object Transaction {
  
  @JSImport("sawtooth-sdk", "protobuf.Transaction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Transaction instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Transaction instance
    */
  inline def create(): typings.sawtoothSdk.protobufMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.sawtoothSdk.protobufMod.Transaction]
  inline def create(properties: ITransaction): typings.sawtoothSdk.protobufMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.Transaction]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.sawtoothSdk.protobufMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.Transaction]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.Transaction]
  /**
    * Decodes a Transaction message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Transaction
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typings.sawtoothSdk.protobufMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.Transaction]
  inline def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.Transaction]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.sawtoothSdk.protobufMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.Transaction]
  /**
    * Decodes a Transaction message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Transaction
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.Transaction]
  
  /**
    * Encodes the specified Transaction message. Does not implicitly {@link Transaction.verify|verify} messages.
    * @param message Transaction message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: ITransaction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITransaction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Transaction message, length delimited. Does not implicitly {@link Transaction.verify|verify} messages.
    * @param message Transaction message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: ITransaction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITransaction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Transaction message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Transaction
    */
  inline def fromObject(`object`: StringDictionary[Any]): typings.sawtoothSdk.protobufMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.Transaction]
  
  /**
    * Creates a plain object from a Transaction message. Also converts values to other types if specified.
    * @param message Transaction
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typings.sawtoothSdk.protobufMod.Transaction): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: typings.sawtoothSdk.protobufMod.Transaction, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Transaction message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
