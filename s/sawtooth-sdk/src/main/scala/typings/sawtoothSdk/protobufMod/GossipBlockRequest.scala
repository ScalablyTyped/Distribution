package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "GossipBlockRequest")
@js.native
/**
  * Constructs a new GossipBlockRequest.
  * @param [properties] Properties to set
  */
class GossipBlockRequest ()
  extends StObject
     with IGossipBlockRequest {
  def this(properties: IGossipBlockRequest) = this()
  
  /** GossipBlockRequest blockId. */
  @JSName("blockId")
  var blockId_GossipBlockRequest: String = js.native
  
  /** GossipBlockRequest nonce. */
  @JSName("nonce")
  var nonce_GossipBlockRequest: String = js.native
  
  /** GossipBlockRequest timeToLive. */
  @JSName("timeToLive")
  var timeToLive_GossipBlockRequest: Double = js.native
  
  /**
    * Converts this GossipBlockRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object GossipBlockRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "GossipBlockRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GossipBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipBlockRequest instance
    */
  inline def create(): GossipBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GossipBlockRequest]
  inline def create(properties: IGossipBlockRequest): GossipBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GossipBlockRequest]
  
  /**
    * Decodes a GossipBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): GossipBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipBlockRequest]
  inline def decode(reader: Reader, length: Double): GossipBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GossipBlockRequest]
  inline def decode(reader: Uint8Array): GossipBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipBlockRequest]
  inline def decode(reader: Uint8Array, length: Double): GossipBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GossipBlockRequest]
  
  /**
    * Decodes a GossipBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): GossipBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipBlockRequest]
  inline def decodeDelimited(reader: Uint8Array): GossipBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipBlockRequest]
  
  /**
    * Encodes the specified GossipBlockRequest message. Does not implicitly {@link GossipBlockRequest.verify|verify} messages.
    * @param message GossipBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IGossipBlockRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGossipBlockRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GossipBlockRequest message, length delimited. Does not implicitly {@link GossipBlockRequest.verify|verify} messages.
    * @param message GossipBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IGossipBlockRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGossipBlockRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GossipBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipBlockRequest
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): GossipBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GossipBlockRequest]
  
  /**
    * Creates a plain object from a GossipBlockRequest message. Also converts values to other types if specified.
    * @param message GossipBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: GossipBlockRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: GossipBlockRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a GossipBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
