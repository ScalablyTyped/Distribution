package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "GossipBatchByBatchIdRequest")
@js.native
/**
  * Constructs a new GossipBatchByBatchIdRequest.
  * @param [properties] Properties to set
  */
class GossipBatchByBatchIdRequest ()
  extends StObject
     with IGossipBatchByBatchIdRequest {
  def this(properties: IGossipBatchByBatchIdRequest) = this()
  
  /** GossipBatchByBatchIdRequest id. */
  @JSName("id")
  var id_GossipBatchByBatchIdRequest: String = js.native
  
  /** GossipBatchByBatchIdRequest nonce. */
  @JSName("nonce")
  var nonce_GossipBatchByBatchIdRequest: String = js.native
  
  /** GossipBatchByBatchIdRequest timeToLive. */
  @JSName("timeToLive")
  var timeToLive_GossipBatchByBatchIdRequest: Double = js.native
  
  /**
    * Converts this GossipBatchByBatchIdRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object GossipBatchByBatchIdRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchByBatchIdRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GossipBatchByBatchIdRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipBatchByBatchIdRequest instance
    */
  inline def create(): GossipBatchByBatchIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GossipBatchByBatchIdRequest]
  inline def create(properties: IGossipBatchByBatchIdRequest): GossipBatchByBatchIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GossipBatchByBatchIdRequest]
  
  /**
    * Decodes a GossipBatchByBatchIdRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipBatchByBatchIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): GossipBatchByBatchIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipBatchByBatchIdRequest]
  inline def decode(reader: Reader, length: Double): GossipBatchByBatchIdRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GossipBatchByBatchIdRequest]
  inline def decode(reader: Uint8Array): GossipBatchByBatchIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipBatchByBatchIdRequest]
  inline def decode(reader: Uint8Array, length: Double): GossipBatchByBatchIdRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GossipBatchByBatchIdRequest]
  
  /**
    * Decodes a GossipBatchByBatchIdRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipBatchByBatchIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): GossipBatchByBatchIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipBatchByBatchIdRequest]
  inline def decodeDelimited(reader: Uint8Array): GossipBatchByBatchIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipBatchByBatchIdRequest]
  
  /**
    * Encodes the specified GossipBatchByBatchIdRequest message. Does not implicitly {@link GossipBatchByBatchIdRequest.verify|verify} messages.
    * @param message GossipBatchByBatchIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IGossipBatchByBatchIdRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGossipBatchByBatchIdRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GossipBatchByBatchIdRequest message, length delimited. Does not implicitly {@link GossipBatchByBatchIdRequest.verify|verify} messages.
    * @param message GossipBatchByBatchIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IGossipBatchByBatchIdRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGossipBatchByBatchIdRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GossipBatchByBatchIdRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipBatchByBatchIdRequest
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): GossipBatchByBatchIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GossipBatchByBatchIdRequest]
  
  /**
    * Creates a plain object from a GossipBatchByBatchIdRequest message. Also converts values to other types if specified.
    * @param message GossipBatchByBatchIdRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: GossipBatchByBatchIdRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: GossipBatchByBatchIdRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a GossipBatchByBatchIdRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
