package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IStateChangeList
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.StateChangeList")
@js.native
/**
  * Constructs a new StateChangeList.
  * @param [properties] Properties to set
  */
class StateChangeList ()
  extends typings.sawtoothSdk.protobufMod.StateChangeList {
  def this(properties: IStateChangeList) = this()
}
/* static members */
object StateChangeList {
  
  /**
    * Creates a new StateChangeList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StateChangeList instance
    */
  @JSImport("sawtooth-sdk", "protobuf.StateChangeList.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.StateChangeList = js.native
  @JSImport("sawtooth-sdk", "protobuf.StateChangeList.create")
  @js.native
  def create(properties: IStateChangeList): typings.sawtoothSdk.protobufMod.StateChangeList = js.native
  
  /**
    * Decodes a StateChangeList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StateChangeList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.StateChangeList.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.StateChangeList = js.native
  @JSImport("sawtooth-sdk", "protobuf.StateChangeList.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.StateChangeList = js.native
  @JSImport("sawtooth-sdk", "protobuf.StateChangeList.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.StateChangeList = js.native
  @JSImport("sawtooth-sdk", "protobuf.StateChangeList.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.StateChangeList = js.native
  
  /**
    * Decodes a StateChangeList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StateChangeList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.StateChangeList.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.StateChangeList = js.native
  @JSImport("sawtooth-sdk", "protobuf.StateChangeList.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.StateChangeList = js.native
  
  /**
    * Encodes the specified StateChangeList message. Does not implicitly {@link StateChangeList.verify|verify} messages.
    * @param message StateChangeList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.StateChangeList.encode")
  @js.native
  def encode(message: IStateChangeList): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.StateChangeList.encode")
  @js.native
  def encode(message: IStateChangeList, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StateChangeList message, length delimited. Does not implicitly {@link StateChangeList.verify|verify} messages.
    * @param message StateChangeList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.StateChangeList.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStateChangeList): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.StateChangeList.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStateChangeList, writer: Writer): Writer = js.native
  
  /**
    * Creates a StateChangeList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StateChangeList
    */
  @JSImport("sawtooth-sdk", "protobuf.StateChangeList.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.StateChangeList = js.native
  
  /**
    * Creates a plain object from a StateChangeList message. Also converts values to other types if specified.
    * @param message StateChangeList
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.StateChangeList.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.StateChangeList): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.StateChangeList.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.StateChangeList, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StateChangeList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.StateChangeList.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
