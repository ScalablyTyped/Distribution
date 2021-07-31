package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "Role")
@js.native
/**
  * Constructs a new Role.
  * @param [properties] Properties to set
  */
class Role ()
  extends StObject
     with IRole {
  def this(properties: IRole) = this()
  
  /** Role name. */
  @JSName("name")
  var name_Role: String = js.native
  
  /** Role policyName. */
  @JSName("policyName")
  var policyName_Role: String = js.native
  
  /**
    * Converts this Role to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object Role {
  
  @JSImport("sawtooth-sdk/protobuf", "Role")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Role instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Role instance
    */
  @scala.inline
  def create(): Role = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Role]
  @scala.inline
  def create(properties: IRole): Role = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Role]
  
  /**
    * Decodes a Role message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Role
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): Role = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Role]
  @scala.inline
  def decode(reader: Reader, length: Double): Role = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Role]
  @scala.inline
  def decode(reader: Uint8Array): Role = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Role]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): Role = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Role]
  
  /**
    * Decodes a Role message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Role
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): Role = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Role]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): Role = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Role]
  
  /**
    * Encodes the specified Role message. Does not implicitly {@link Role.verify|verify} messages.
    * @param message Role message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IRole): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IRole, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Role message, length delimited. Does not implicitly {@link Role.verify|verify} messages.
    * @param message Role message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IRole): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IRole, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Role message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Role
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): Role = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Role]
  
  /**
    * Creates a plain object from a Role message. Also converts values to other types if specified.
    * @param message Role
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: Role): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: Role, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Role message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
