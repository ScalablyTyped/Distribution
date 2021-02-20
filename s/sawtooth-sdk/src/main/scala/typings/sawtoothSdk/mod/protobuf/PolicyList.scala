package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IPolicyList
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.PolicyList")
@js.native
/**
  * Constructs a new PolicyList.
  * @param [properties] Properties to set
  */
class PolicyList ()
  extends typings.sawtoothSdk.protobufMod.PolicyList {
  def this(properties: IPolicyList) = this()
}
/* static members */
object PolicyList {
  
  /**
    * Creates a new PolicyList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PolicyList instance
    */
  @JSImport("sawtooth-sdk", "protobuf.PolicyList.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.PolicyList = js.native
  @JSImport("sawtooth-sdk", "protobuf.PolicyList.create")
  @js.native
  def create(properties: IPolicyList): typings.sawtoothSdk.protobufMod.PolicyList = js.native
  
  /**
    * Decodes a PolicyList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PolicyList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.PolicyList.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.PolicyList = js.native
  @JSImport("sawtooth-sdk", "protobuf.PolicyList.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.PolicyList = js.native
  @JSImport("sawtooth-sdk", "protobuf.PolicyList.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.PolicyList = js.native
  @JSImport("sawtooth-sdk", "protobuf.PolicyList.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.PolicyList = js.native
  
  /**
    * Decodes a PolicyList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PolicyList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.PolicyList.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.PolicyList = js.native
  @JSImport("sawtooth-sdk", "protobuf.PolicyList.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.PolicyList = js.native
  
  /**
    * Encodes the specified PolicyList message. Does not implicitly {@link PolicyList.verify|verify} messages.
    * @param message PolicyList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.PolicyList.encode")
  @js.native
  def encode(message: IPolicyList): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.PolicyList.encode")
  @js.native
  def encode(message: IPolicyList, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PolicyList message, length delimited. Does not implicitly {@link PolicyList.verify|verify} messages.
    * @param message PolicyList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.PolicyList.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPolicyList): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.PolicyList.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPolicyList, writer: Writer): Writer = js.native
  
  /**
    * Creates a PolicyList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PolicyList
    */
  @JSImport("sawtooth-sdk", "protobuf.PolicyList.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.PolicyList = js.native
  
  /**
    * Creates a plain object from a PolicyList message. Also converts values to other types if specified.
    * @param message PolicyList
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.PolicyList.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.PolicyList): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.PolicyList.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.PolicyList, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PolicyList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.PolicyList.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
