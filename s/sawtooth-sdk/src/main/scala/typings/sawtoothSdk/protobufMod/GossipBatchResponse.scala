package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse")
@js.native
/**
  * Constructs a new GossipBatchResponse.
  * @param [properties] Properties to set
  */
class GossipBatchResponse ()
  extends StObject
     with IGossipBatchResponse {
  def this(properties: IGossipBatchResponse) = this()
  
  /** GossipBatchResponse content. */
  @JSName("content")
  var content_GossipBatchResponse: Uint8Array = js.native
  
  /**
    * Converts this GossipBatchResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object GossipBatchResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GossipBatchResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipBatchResponse instance
    */
  @scala.inline
  def create(): GossipBatchResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GossipBatchResponse]
  @scala.inline
  def create(properties: IGossipBatchResponse): GossipBatchResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GossipBatchResponse]
  
  /**
    * Decodes a GossipBatchResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipBatchResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): GossipBatchResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipBatchResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): GossipBatchResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GossipBatchResponse]
  @scala.inline
  def decode(reader: Uint8Array): GossipBatchResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipBatchResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): GossipBatchResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GossipBatchResponse]
  
  /**
    * Decodes a GossipBatchResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipBatchResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): GossipBatchResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipBatchResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): GossipBatchResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipBatchResponse]
  
  /**
    * Encodes the specified GossipBatchResponse message. Does not implicitly {@link GossipBatchResponse.verify|verify} messages.
    * @param message GossipBatchResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IGossipBatchResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IGossipBatchResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GossipBatchResponse message, length delimited. Does not implicitly {@link GossipBatchResponse.verify|verify} messages.
    * @param message GossipBatchResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IGossipBatchResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IGossipBatchResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GossipBatchResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipBatchResponse
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): GossipBatchResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GossipBatchResponse]
  
  /**
    * Creates a plain object from a GossipBatchResponse message. Also converts values to other types if specified.
    * @param message GossipBatchResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: GossipBatchResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: GossipBatchResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a GossipBatchResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
