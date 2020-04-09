package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse")
@js.native
/**
  * Constructs a new ConsensusCancelBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusCancelBlockResponse () extends IConsensusCancelBlockResponse {
  def this(properties: IConsensusCancelBlockResponse) = this()
  /** ConsensusCancelBlockResponse status. */
  @JSName("status")
  var status_ConsensusCancelBlockResponse: Status = js.native
  /**
    * Converts this ConsensusCancelBlockResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusCancelBlockResponse")
@js.native
object ConsensusCancelBlockResponse extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  /**
    * Creates a new ConsensusCancelBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusCancelBlockResponse instance
    */
  def create(): ConsensusCancelBlockResponse = js.native
  def create(properties: IConsensusCancelBlockResponse): ConsensusCancelBlockResponse = js.native
  /**
    * Decodes a ConsensusCancelBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusCancelBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusCancelBlockResponse = js.native
  def decode(reader: Reader, length: Double): ConsensusCancelBlockResponse = js.native
  def decode(reader: Uint8Array): ConsensusCancelBlockResponse = js.native
  def decode(reader: Uint8Array, length: Double): ConsensusCancelBlockResponse = js.native
  /**
    * Decodes a ConsensusCancelBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusCancelBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusCancelBlockResponse = js.native
  def decodeDelimited(reader: Uint8Array): ConsensusCancelBlockResponse = js.native
  /**
    * Encodes the specified ConsensusCancelBlockResponse message. Does not implicitly {@link ConsensusCancelBlockResponse.verify|verify} messages.
    * @param message ConsensusCancelBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusCancelBlockResponse): Writer = js.native
  def encode(message: IConsensusCancelBlockResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusCancelBlockResponse message, length delimited. Does not implicitly {@link ConsensusCancelBlockResponse.verify|verify} messages.
    * @param message ConsensusCancelBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusCancelBlockResponse): Writer = js.native
  def encodeDelimited(message: IConsensusCancelBlockResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusCancelBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusCancelBlockResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusCancelBlockResponse = js.native
  /**
    * Creates a plain object from a ConsensusCancelBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusCancelBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusCancelBlockResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusCancelBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusCancelBlockResponse message.
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
    sealed trait INVALID_STATE extends Status
    
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
    
    /* 5 */ @js.native
    object INVALID_STATE extends TopLevel[INVALID_STATE with Double]
    
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

