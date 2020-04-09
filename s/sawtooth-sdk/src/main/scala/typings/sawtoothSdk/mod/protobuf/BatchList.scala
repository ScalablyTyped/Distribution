package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IBatchList
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.BatchList")
@js.native
/**
  * Constructs a new BatchList.
  * @param [properties] Properties to set
  */
class BatchList ()
  extends typings.sawtoothSdk.protobufMod.BatchList {
  def this(properties: IBatchList) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.BatchList")
@js.native
object BatchList extends js.Object {
  /**
    * Creates a new BatchList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchList instance
    */
  def create(): typings.sawtoothSdk.protobufMod.BatchList = js.native
  def create(properties: IBatchList): typings.sawtoothSdk.protobufMod.BatchList = js.native
  /**
    * Decodes a BatchList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.BatchList = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.BatchList = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.BatchList = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.BatchList = js.native
  /**
    * Decodes a BatchList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.BatchList = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.BatchList = js.native
  /**
    * Encodes the specified BatchList message. Does not implicitly {@link BatchList.verify|verify} messages.
    * @param message BatchList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBatchList): Writer = js.native
  def encode(message: IBatchList, writer: Writer): Writer = js.native
  /**
    * Encodes the specified BatchList message, length delimited. Does not implicitly {@link BatchList.verify|verify} messages.
    * @param message BatchList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBatchList): Writer = js.native
  def encodeDelimited(message: IBatchList, writer: Writer): Writer = js.native
  /**
    * Creates a BatchList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchList
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.BatchList = js.native
  /**
    * Creates a plain object from a BatchList message. Also converts values to other types if specified.
    * @param message BatchList
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.BatchList): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.BatchList, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a BatchList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

