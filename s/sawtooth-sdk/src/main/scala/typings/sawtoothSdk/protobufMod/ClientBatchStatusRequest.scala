package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusRequest")
@js.native
/**
  * Constructs a new ClientBatchStatusRequest.
  * @param [properties] Properties to set
  */
class ClientBatchStatusRequest ()
  extends StObject
     with IClientBatchStatusRequest {
  def this(properties: IClientBatchStatusRequest) = this()
  
  /** ClientBatchStatusRequest batchIds. */
  @JSName("batchIds")
  var batchIds_ClientBatchStatusRequest: js.Array[String] = js.native
  
  /** ClientBatchStatusRequest timeout. */
  @JSName("timeout")
  var timeout_ClientBatchStatusRequest: Double = js.native
  
  /**
    * Converts this ClientBatchStatusRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ClientBatchStatusRequest wait. */
  @JSName("wait")
  var wait_FClientBatchStatusRequest: Boolean = js.native
}
/* static members */
object ClientBatchStatusRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatusRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientBatchStatusRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchStatusRequest instance
    */
  @scala.inline
  def create(): ClientBatchStatusRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientBatchStatusRequest]
  @scala.inline
  def create(properties: IClientBatchStatusRequest): ClientBatchStatusRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientBatchStatusRequest]
  
  /**
    * Decodes a ClientBatchStatusRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchStatusRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ClientBatchStatusRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchStatusRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): ClientBatchStatusRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBatchStatusRequest]
  @scala.inline
  def decode(reader: Uint8Array): ClientBatchStatusRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchStatusRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ClientBatchStatusRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBatchStatusRequest]
  
  /**
    * Decodes a ClientBatchStatusRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchStatusRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ClientBatchStatusRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchStatusRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ClientBatchStatusRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchStatusRequest]
  
  /**
    * Encodes the specified ClientBatchStatusRequest message. Does not implicitly {@link ClientBatchStatusRequest.verify|verify} messages.
    * @param message ClientBatchStatusRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IClientBatchStatusRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IClientBatchStatusRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientBatchStatusRequest message, length delimited. Does not implicitly {@link ClientBatchStatusRequest.verify|verify} messages.
    * @param message ClientBatchStatusRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IClientBatchStatusRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IClientBatchStatusRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientBatchStatusRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchStatusRequest
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ClientBatchStatusRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientBatchStatusRequest]
  
  /**
    * Creates a plain object from a ClientBatchStatusRequest message. Also converts values to other types if specified.
    * @param message ClientBatchStatusRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ClientBatchStatusRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ClientBatchStatusRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientBatchStatusRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
