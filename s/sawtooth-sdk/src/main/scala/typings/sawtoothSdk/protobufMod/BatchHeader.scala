package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "BatchHeader")
@js.native
/**
  * Constructs a new BatchHeader.
  * @param [properties] Properties to set
  */
class BatchHeader () extends IBatchHeader {
  def this(properties: IBatchHeader) = this()
  
  /** BatchHeader signerPublicKey. */
  @JSName("signerPublicKey")
  var signerPublicKey_BatchHeader: String = js.native
  
  /**
    * Converts this BatchHeader to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** BatchHeader transactionIds. */
  @JSName("transactionIds")
  var transactionIds_BatchHeader: js.Array[String] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "BatchHeader")
@js.native
object BatchHeader extends js.Object {
  
  /**
    * Creates a new BatchHeader instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchHeader instance
    */
  def create(): BatchHeader = js.native
  def create(properties: IBatchHeader): BatchHeader = js.native
  
  /**
    * Decodes a BatchHeader message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): BatchHeader = js.native
  def decode(reader: Reader, length: Double): BatchHeader = js.native
  def decode(reader: Uint8Array): BatchHeader = js.native
  def decode(reader: Uint8Array, length: Double): BatchHeader = js.native
  
  /**
    * Decodes a BatchHeader message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): BatchHeader = js.native
  def decodeDelimited(reader: Uint8Array): BatchHeader = js.native
  
  /**
    * Encodes the specified BatchHeader message. Does not implicitly {@link BatchHeader.verify|verify} messages.
    * @param message BatchHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBatchHeader): Writer = js.native
  def encode(message: IBatchHeader, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified BatchHeader message, length delimited. Does not implicitly {@link BatchHeader.verify|verify} messages.
    * @param message BatchHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBatchHeader): Writer = js.native
  def encodeDelimited(message: IBatchHeader, writer: Writer): Writer = js.native
  
  /**
    * Creates a BatchHeader message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchHeader
    */
  def fromObject(`object`: StringDictionary[js.Any]): BatchHeader = js.native
  
  /**
    * Creates a plain object from a BatchHeader message. Also converts values to other types if specified.
    * @param message BatchHeader
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: BatchHeader): StringDictionary[js.Any] = js.native
  def toObject(message: BatchHeader, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a BatchHeader message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
