package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.GossipMessage.ContentType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "GossipMessage")
@js.native
/**
  * Constructs a new GossipMessage.
  * @param [properties] Properties to set
  */
class GossipMessage () extends IGossipMessage {
  def this(properties: IGossipMessage) = this()
  
  /** GossipMessage contentType. */
  @JSName("contentType")
  var contentType_GossipMessage: ContentType = js.native
  
  /** GossipMessage content. */
  @JSName("content")
  var content_GossipMessage: Uint8Array = js.native
  
  /** GossipMessage timeToLive. */
  @JSName("timeToLive")
  var timeToLive_GossipMessage: Double = js.native
  
  /**
    * Converts this GossipMessage to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "GossipMessage")
@js.native
object GossipMessage extends js.Object {
  
  /**
    * Creates a new GossipMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipMessage instance
    */
  def create(): GossipMessage = js.native
  def create(properties: IGossipMessage): GossipMessage = js.native
  
  /**
    * Decodes a GossipMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GossipMessage = js.native
  def decode(reader: Reader, length: Double): GossipMessage = js.native
  def decode(reader: Uint8Array): GossipMessage = js.native
  def decode(reader: Uint8Array, length: Double): GossipMessage = js.native
  
  /**
    * Decodes a GossipMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GossipMessage = js.native
  def decodeDelimited(reader: Uint8Array): GossipMessage = js.native
  
  /**
    * Encodes the specified GossipMessage message. Does not implicitly {@link GossipMessage.verify|verify} messages.
    * @param message GossipMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGossipMessage): Writer = js.native
  def encode(message: IGossipMessage, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GossipMessage message, length delimited. Does not implicitly {@link GossipMessage.verify|verify} messages.
    * @param message GossipMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGossipMessage): Writer = js.native
  def encodeDelimited(message: IGossipMessage, writer: Writer): Writer = js.native
  
  /**
    * Creates a GossipMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipMessage
    */
  def fromObject(`object`: StringDictionary[js.Any]): GossipMessage = js.native
  
  /**
    * Creates a plain object from a GossipMessage message. Also converts values to other types if specified.
    * @param message GossipMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GossipMessage): StringDictionary[js.Any] = js.native
  def toObject(message: GossipMessage, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GossipMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  @js.native
  sealed trait ContentType extends js.Object
  /** ContentType enum. */
  @js.native
  object ContentType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
    
    @js.native
    sealed trait BATCH extends ContentType
    /* 2 */ @js.native
    object BATCH extends TopLevel[BATCH with Double]
    
    @js.native
    sealed trait BLOCK extends ContentType
    /* 1 */ @js.native
    object BLOCK extends TopLevel[BLOCK with Double]
    
    @js.native
    sealed trait CONTENT_TYPE_UNSET extends ContentType
    /* 0 */ @js.native
    object CONTENT_TYPE_UNSET extends TopLevel[CONTENT_TYPE_UNSET with Double]
  }
}
