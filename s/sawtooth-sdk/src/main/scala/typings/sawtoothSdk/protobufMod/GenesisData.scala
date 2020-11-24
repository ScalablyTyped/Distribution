package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "GenesisData")
@js.native
/**
  * Constructs a new GenesisData.
  * @param [properties] Properties to set
  */
class GenesisData () extends IGenesisData {
  def this(properties: IGenesisData) = this()
  
  /** GenesisData batches. */
  @JSName("batches")
  var batches_GenesisData: js.Array[IBatch] = js.native
  
  /**
    * Converts this GenesisData to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "GenesisData")
@js.native
object GenesisData extends js.Object {
  
  /**
    * Creates a new GenesisData instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GenesisData instance
    */
  def create(): GenesisData = js.native
  def create(properties: IGenesisData): GenesisData = js.native
  
  /**
    * Decodes a GenesisData message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GenesisData
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GenesisData = js.native
  def decode(reader: Reader, length: Double): GenesisData = js.native
  def decode(reader: Uint8Array): GenesisData = js.native
  def decode(reader: Uint8Array, length: Double): GenesisData = js.native
  
  /**
    * Decodes a GenesisData message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GenesisData
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GenesisData = js.native
  def decodeDelimited(reader: Uint8Array): GenesisData = js.native
  
  /**
    * Encodes the specified GenesisData message. Does not implicitly {@link GenesisData.verify|verify} messages.
    * @param message GenesisData message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGenesisData): Writer = js.native
  def encode(message: IGenesisData, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GenesisData message, length delimited. Does not implicitly {@link GenesisData.verify|verify} messages.
    * @param message GenesisData message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGenesisData): Writer = js.native
  def encodeDelimited(message: IGenesisData, writer: Writer): Writer = js.native
  
  /**
    * Creates a GenesisData message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GenesisData
    */
  def fromObject(`object`: StringDictionary[js.Any]): GenesisData = js.native
  
  /**
    * Creates a plain object from a GenesisData message. Also converts values to other types if specified.
    * @param message GenesisData
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GenesisData): StringDictionary[js.Any] = js.native
  def toObject(message: GenesisData, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GenesisData message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
