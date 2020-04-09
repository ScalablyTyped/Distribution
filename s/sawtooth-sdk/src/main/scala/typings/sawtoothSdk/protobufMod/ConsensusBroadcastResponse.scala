package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastResponse")
@js.native
/**
  * Constructs a new ConsensusBroadcastResponse.
  * @param [properties] Properties to set
  */
class ConsensusBroadcastResponse () extends IConsensusBroadcastResponse {
  def this(properties: IConsensusBroadcastResponse) = this()
  /** ConsensusBroadcastResponse status. */
  @JSName("status")
  var status_ConsensusBroadcastResponse: Status = js.native
  /**
    * Converts this ConsensusBroadcastResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusBroadcastResponse")
@js.native
object ConsensusBroadcastResponse extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  /**
    * Creates a new ConsensusBroadcastResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBroadcastResponse instance
    */
  def create(): ConsensusBroadcastResponse = js.native
  def create(properties: IConsensusBroadcastResponse): ConsensusBroadcastResponse = js.native
  /**
    * Decodes a ConsensusBroadcastResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBroadcastResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusBroadcastResponse = js.native
  def decode(reader: Reader, length: Double): ConsensusBroadcastResponse = js.native
  def decode(reader: Uint8Array): ConsensusBroadcastResponse = js.native
  def decode(reader: Uint8Array, length: Double): ConsensusBroadcastResponse = js.native
  /**
    * Decodes a ConsensusBroadcastResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBroadcastResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusBroadcastResponse = js.native
  def decodeDelimited(reader: Uint8Array): ConsensusBroadcastResponse = js.native
  /**
    * Encodes the specified ConsensusBroadcastResponse message. Does not implicitly {@link ConsensusBroadcastResponse.verify|verify} messages.
    * @param message ConsensusBroadcastResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusBroadcastResponse): Writer = js.native
  def encode(message: IConsensusBroadcastResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusBroadcastResponse message, length delimited. Does not implicitly {@link ConsensusBroadcastResponse.verify|verify} messages.
    * @param message ConsensusBroadcastResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusBroadcastResponse): Writer = js.native
  def encodeDelimited(message: IConsensusBroadcastResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusBroadcastResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusBroadcastResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusBroadcastResponse = js.native
  /**
    * Creates a plain object from a ConsensusBroadcastResponse message. Also converts values to other types if specified.
    * @param message ConsensusBroadcastResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusBroadcastResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusBroadcastResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusBroadcastResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    @js.native
    sealed trait BAD_REQUEST extends Status
    
    @js.native
    sealed trait NOT_READY extends Status
    
    @js.native
    sealed trait OK extends Status
    
    @js.native
    sealed trait SERVICE_ERROR extends Status
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    /* 2 */ @js.native
    object BAD_REQUEST extends TopLevel[BAD_REQUEST with Double]
    
    /* 4 */ @js.native
    object NOT_READY extends TopLevel[NOT_READY with Double]
    
    /* 1 */ @js.native
    object OK extends TopLevel[OK with Double]
    
    /* 3 */ @js.native
    object SERVICE_ERROR extends TopLevel[SERVICE_ERROR with Double]
    
    /* 0 */ @js.native
    object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
    
  }
  
}

