package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITransactionHeader
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("sawtooth-sdk", "protobuf.TransactionHeader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TransactionHeader instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TransactionHeader instance
    */
  @scala.inline
  def create(): typings.sawtoothSdk.protobufMod.TransactionHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.sawtoothSdk.protobufMod.TransactionHeader]
  @scala.inline
  def create(properties: ITransactionHeader): typings.sawtoothSdk.protobufMod.TransactionHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TransactionHeader]
  
  /**
    * Decodes a TransactionHeader message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TransactionHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TransactionHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TransactionHeader]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TransactionHeader = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.TransactionHeader]
  @scala.inline
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TransactionHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TransactionHeader]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TransactionHeader = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.TransactionHeader]
  
  /**
    * Decodes a TransactionHeader message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TransactionHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TransactionHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TransactionHeader]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TransactionHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TransactionHeader]
  
  /**
    * Encodes the specified TransactionHeader message. Does not implicitly {@link TransactionHeader.verify|verify} messages.
    * @param message TransactionHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: ITransactionHeader): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ITransactionHeader, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TransactionHeader message, length delimited. Does not implicitly {@link TransactionHeader.verify|verify} messages.
    * @param message TransactionHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: ITransactionHeader): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ITransactionHeader, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TransactionHeader message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TransactionHeader
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TransactionHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.TransactionHeader]
  
  /**
    * Creates a plain object from a TransactionHeader message. Also converts values to other types if specified.
    * @param message TransactionHeader
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: typings.sawtoothSdk.protobufMod.TransactionHeader): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: typings.sawtoothSdk.protobufMod.TransactionHeader, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TransactionHeader message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
