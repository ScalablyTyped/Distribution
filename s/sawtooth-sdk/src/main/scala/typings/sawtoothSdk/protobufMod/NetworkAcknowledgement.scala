package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.NetworkAcknowledgement.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "NetworkAcknowledgement")
@js.native
/**
  * Constructs a new NetworkAcknowledgement.
  * @param [properties] Properties to set
  */
class NetworkAcknowledgement () extends INetworkAcknowledgement {
  def this(properties: INetworkAcknowledgement) = this()
  /** NetworkAcknowledgement status. */
  @JSName("status")
  var status_NetworkAcknowledgement: Status = js.native
  /**
    * Converts this NetworkAcknowledgement to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "NetworkAcknowledgement")
@js.native
object NetworkAcknowledgement extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  /**
    * Creates a new NetworkAcknowledgement instance using the specified properties.
    * @param [properties] Properties to set
    * @returns NetworkAcknowledgement instance
    */
  def create(): NetworkAcknowledgement = js.native
  def create(properties: INetworkAcknowledgement): NetworkAcknowledgement = js.native
  /**
    * Decodes a NetworkAcknowledgement message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns NetworkAcknowledgement
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): NetworkAcknowledgement = js.native
  def decode(reader: Reader, length: Double): NetworkAcknowledgement = js.native
  def decode(reader: Uint8Array): NetworkAcknowledgement = js.native
  def decode(reader: Uint8Array, length: Double): NetworkAcknowledgement = js.native
  /**
    * Decodes a NetworkAcknowledgement message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns NetworkAcknowledgement
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): NetworkAcknowledgement = js.native
  def decodeDelimited(reader: Uint8Array): NetworkAcknowledgement = js.native
  /**
    * Encodes the specified NetworkAcknowledgement message. Does not implicitly {@link NetworkAcknowledgement.verify|verify} messages.
    * @param message NetworkAcknowledgement message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: INetworkAcknowledgement): Writer = js.native
  def encode(message: INetworkAcknowledgement, writer: Writer): Writer = js.native
  /**
    * Encodes the specified NetworkAcknowledgement message, length delimited. Does not implicitly {@link NetworkAcknowledgement.verify|verify} messages.
    * @param message NetworkAcknowledgement message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: INetworkAcknowledgement): Writer = js.native
  def encodeDelimited(message: INetworkAcknowledgement, writer: Writer): Writer = js.native
  /**
    * Creates a NetworkAcknowledgement message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns NetworkAcknowledgement
    */
  def fromObject(`object`: StringDictionary[js.Any]): NetworkAcknowledgement = js.native
  /**
    * Creates a plain object from a NetworkAcknowledgement message. Also converts values to other types if specified.
    * @param message NetworkAcknowledgement
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: NetworkAcknowledgement): StringDictionary[js.Any] = js.native
  def toObject(message: NetworkAcknowledgement, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a NetworkAcknowledgement message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    @js.native
    sealed trait ERROR extends Status
    
    @js.native
    sealed trait OK extends Status
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    /* 2 */ @js.native
    object ERROR extends TopLevel[ERROR with Double]
    
    /* 1 */ @js.native
    object OK extends TopLevel[OK with Double]
    
    /* 0 */ @js.native
    object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
    
  }
  
}

