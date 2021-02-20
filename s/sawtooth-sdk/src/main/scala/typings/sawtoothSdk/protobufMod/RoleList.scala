package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "RoleList")
@js.native
/**
  * Constructs a new RoleList.
  * @param [properties] Properties to set
  */
class RoleList () extends IRoleList {
  def this(properties: IRoleList) = this()
  
  /** RoleList roles. */
  @JSName("roles")
  var roles_RoleList: js.Array[IRole] = js.native
  
  /**
    * Converts this RoleList to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object RoleList {
  
  /**
    * Creates a new RoleList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RoleList instance
    */
  @JSImport("sawtooth-sdk/protobuf", "RoleList.create")
  @js.native
  def create(): RoleList = js.native
  @JSImport("sawtooth-sdk/protobuf", "RoleList.create")
  @js.native
  def create(properties: IRoleList): RoleList = js.native
  
  /**
    * Decodes a RoleList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RoleList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "RoleList.decode")
  @js.native
  def decode(reader: Reader): RoleList = js.native
  @JSImport("sawtooth-sdk/protobuf", "RoleList.decode")
  @js.native
  def decode(reader: Reader, length: Double): RoleList = js.native
  @JSImport("sawtooth-sdk/protobuf", "RoleList.decode")
  @js.native
  def decode(reader: Uint8Array): RoleList = js.native
  @JSImport("sawtooth-sdk/protobuf", "RoleList.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): RoleList = js.native
  
  /**
    * Decodes a RoleList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RoleList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "RoleList.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): RoleList = js.native
  @JSImport("sawtooth-sdk/protobuf", "RoleList.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): RoleList = js.native
  
  /**
    * Encodes the specified RoleList message. Does not implicitly {@link RoleList.verify|verify} messages.
    * @param message RoleList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "RoleList.encode")
  @js.native
  def encode(message: IRoleList): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "RoleList.encode")
  @js.native
  def encode(message: IRoleList, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified RoleList message, length delimited. Does not implicitly {@link RoleList.verify|verify} messages.
    * @param message RoleList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "RoleList.encodeDelimited")
  @js.native
  def encodeDelimited(message: IRoleList): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "RoleList.encodeDelimited")
  @js.native
  def encodeDelimited(message: IRoleList, writer: Writer): Writer = js.native
  
  /**
    * Creates a RoleList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RoleList
    */
  @JSImport("sawtooth-sdk/protobuf", "RoleList.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): RoleList = js.native
  
  /**
    * Creates a plain object from a RoleList message. Also converts values to other types if specified.
    * @param message RoleList
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "RoleList.toObject")
  @js.native
  def toObject(message: RoleList): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "RoleList.toObject")
  @js.native
  def toObject(message: RoleList, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a RoleList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "RoleList.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
