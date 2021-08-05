package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.GossipMessage.ContentType
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "GossipMessage")
@js.native
/**
  * Constructs a new GossipMessage.
  * @param [properties] Properties to set
  */
class GossipMessage ()
  extends StObject
     with IGossipMessage {
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
object GossipMessage {
  
  @JSImport("sawtooth-sdk/protobuf", "GossipMessage")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ContentType extends StObject
  /** ContentType enum. */
  @JSImport("sawtooth-sdk/protobuf", "GossipMessage.ContentType")
  @js.native
  object ContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContentType & Double] = js.native
    
    @js.native
    sealed trait BATCH
      extends StObject
         with ContentType
    /* 2 */ val BATCH: typings.sawtoothSdk.protobufMod.GossipMessage.ContentType.BATCH & Double = js.native
    
    @js.native
    sealed trait BLOCK
      extends StObject
         with ContentType
    /* 1 */ val BLOCK: typings.sawtoothSdk.protobufMod.GossipMessage.ContentType.BLOCK & Double = js.native
    
    @js.native
    sealed trait CONTENT_TYPE_UNSET
      extends StObject
         with ContentType
    /* 0 */ val CONTENT_TYPE_UNSET: typings.sawtoothSdk.protobufMod.GossipMessage.ContentType.CONTENT_TYPE_UNSET & Double = js.native
  }
  
  /**
    * Creates a new GossipMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipMessage instance
    */
  inline def create(): GossipMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GossipMessage]
  inline def create(properties: IGossipMessage): GossipMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GossipMessage]
  
  /**
    * Decodes a GossipMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): GossipMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipMessage]
  inline def decode(reader: Reader, length: Double): GossipMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GossipMessage]
  inline def decode(reader: Uint8Array): GossipMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipMessage]
  inline def decode(reader: Uint8Array, length: Double): GossipMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GossipMessage]
  
  /**
    * Decodes a GossipMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): GossipMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipMessage]
  inline def decodeDelimited(reader: Uint8Array): GossipMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipMessage]
  
  /**
    * Encodes the specified GossipMessage message. Does not implicitly {@link GossipMessage.verify|verify} messages.
    * @param message GossipMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IGossipMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGossipMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GossipMessage message, length delimited. Does not implicitly {@link GossipMessage.verify|verify} messages.
    * @param message GossipMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IGossipMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGossipMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GossipMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipMessage
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): GossipMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GossipMessage]
  
  /**
    * Creates a plain object from a GossipMessage message. Also converts values to other types if specified.
    * @param message GossipMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: GossipMessage): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: GossipMessage, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a GossipMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
