package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "PolicyList")
@js.native
/**
  * Constructs a new PolicyList.
  * @param [properties] Properties to set
  */
class PolicyList () extends IPolicyList {
  def this(properties: IPolicyList) = this()
  /** PolicyList policies. */
  @JSName("policies")
  var policies_PolicyList: js.Array[IPolicy] = js.native
  /**
    * Converts this PolicyList to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "PolicyList")
@js.native
object PolicyList extends js.Object {
  /**
    * Creates a new PolicyList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PolicyList instance
    */
  def create(): PolicyList = js.native
  def create(properties: IPolicyList): PolicyList = js.native
  /**
    * Decodes a PolicyList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PolicyList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): PolicyList = js.native
  def decode(reader: Reader, length: Double): PolicyList = js.native
  def decode(reader: Uint8Array): PolicyList = js.native
  def decode(reader: Uint8Array, length: Double): PolicyList = js.native
  /**
    * Decodes a PolicyList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PolicyList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): PolicyList = js.native
  def decodeDelimited(reader: Uint8Array): PolicyList = js.native
  /**
    * Encodes the specified PolicyList message. Does not implicitly {@link PolicyList.verify|verify} messages.
    * @param message PolicyList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPolicyList): Writer = js.native
  def encode(message: IPolicyList, writer: Writer): Writer = js.native
  /**
    * Encodes the specified PolicyList message, length delimited. Does not implicitly {@link PolicyList.verify|verify} messages.
    * @param message PolicyList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPolicyList): Writer = js.native
  def encodeDelimited(message: IPolicyList, writer: Writer): Writer = js.native
  /**
    * Creates a PolicyList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PolicyList
    */
  def fromObject(`object`: StringDictionary[js.Any]): PolicyList = js.native
  /**
    * Creates a plain object from a PolicyList message. Also converts values to other types if specified.
    * @param message PolicyList
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: PolicyList): StringDictionary[js.Any] = js.native
  def toObject(message: PolicyList, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a PolicyList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

