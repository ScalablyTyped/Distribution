package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IGenesisData
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.GenesisData")
@js.native
/**
  * Constructs a new GenesisData.
  * @param [properties] Properties to set
  */
class GenesisData ()
  extends typings.sawtoothSdk.protobufMod.GenesisData {
  def this(properties: IGenesisData) = this()
}
/* static members */
object GenesisData {
  
  /**
    * Creates a new GenesisData instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GenesisData instance
    */
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.GenesisData = js.native
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.create")
  @js.native
  def create(properties: IGenesisData): typings.sawtoothSdk.protobufMod.GenesisData = js.native
  
  /**
    * Decodes a GenesisData message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GenesisData
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.GenesisData = js.native
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.GenesisData = js.native
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GenesisData = js.native
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.GenesisData = js.native
  
  /**
    * Decodes a GenesisData message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GenesisData
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.GenesisData = js.native
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.GenesisData = js.native
  
  /**
    * Encodes the specified GenesisData message. Does not implicitly {@link GenesisData.verify|verify} messages.
    * @param message GenesisData message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.encode")
  @js.native
  def encode(message: IGenesisData): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.encode")
  @js.native
  def encode(message: IGenesisData, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GenesisData message, length delimited. Does not implicitly {@link GenesisData.verify|verify} messages.
    * @param message GenesisData message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGenesisData): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGenesisData, writer: Writer): Writer = js.native
  
  /**
    * Creates a GenesisData message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GenesisData
    */
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.GenesisData = js.native
  
  /**
    * Creates a plain object from a GenesisData message. Also converts values to other types if specified.
    * @param message GenesisData
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.GenesisData): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.GenesisData, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GenesisData message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.GenesisData.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
