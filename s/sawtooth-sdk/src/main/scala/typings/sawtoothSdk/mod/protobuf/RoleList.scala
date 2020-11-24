package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IRoleList
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.RoleList")
@js.native
/**
  * Constructs a new RoleList.
  * @param [properties] Properties to set
  */
class RoleList ()
  extends typings.sawtoothSdk.protobufMod.RoleList {
  def this(properties: IRoleList) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.RoleList")
@js.native
object RoleList extends js.Object {
  
  /**
    * Creates a new RoleList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RoleList instance
    */
  def create(): typings.sawtoothSdk.protobufMod.RoleList = js.native
  def create(properties: IRoleList): typings.sawtoothSdk.protobufMod.RoleList = js.native
  
  /**
    * Decodes a RoleList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RoleList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.RoleList = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.RoleList = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.RoleList = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.RoleList = js.native
  
  /**
    * Decodes a RoleList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RoleList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.RoleList = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.RoleList = js.native
  
  /**
    * Encodes the specified RoleList message. Does not implicitly {@link RoleList.verify|verify} messages.
    * @param message RoleList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IRoleList): Writer = js.native
  def encode(message: IRoleList, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified RoleList message, length delimited. Does not implicitly {@link RoleList.verify|verify} messages.
    * @param message RoleList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IRoleList): Writer = js.native
  def encodeDelimited(message: IRoleList, writer: Writer): Writer = js.native
  
  /**
    * Creates a RoleList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RoleList
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.RoleList = js.native
  
  /**
    * Creates a plain object from a RoleList message. Also converts values to other types if specified.
    * @param message RoleList
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.RoleList): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.RoleList, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a RoleList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
