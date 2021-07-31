package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBlockListRequest")
@js.native
/**
  * Constructs a new ClientBlockListRequest.
  * @param [properties] Properties to set
  */
class ClientBlockListRequest ()
  extends StObject
     with IClientBlockListRequest {
  def this(properties: IClientBlockListRequest) = this()
  
  /** ClientBlockListRequest blockIds. */
  @JSName("blockIds")
  var blockIds_ClientBlockListRequest: js.Array[String] = js.native
  
  /** ClientBlockListRequest headId. */
  @JSName("headId")
  var headId_ClientBlockListRequest: String = js.native
  
  /** ClientBlockListRequest sorting. */
  @JSName("sorting")
  var sorting_ClientBlockListRequest: js.Array[IClientSortControls] = js.native
  
  /**
    * Converts this ClientBlockListRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientBlockListRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockListRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientBlockListRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockListRequest instance
    */
  @scala.inline
  def create(): ClientBlockListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientBlockListRequest]
  @scala.inline
  def create(properties: IClientBlockListRequest): ClientBlockListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientBlockListRequest]
  
  /**
    * Decodes a ClientBlockListRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ClientBlockListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockListRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): ClientBlockListRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBlockListRequest]
  @scala.inline
  def decode(reader: Uint8Array): ClientBlockListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockListRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ClientBlockListRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBlockListRequest]
  
  /**
    * Decodes a ClientBlockListRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ClientBlockListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockListRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ClientBlockListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockListRequest]
  
  /**
    * Encodes the specified ClientBlockListRequest message. Does not implicitly {@link ClientBlockListRequest.verify|verify} messages.
    * @param message ClientBlockListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IClientBlockListRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IClientBlockListRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientBlockListRequest message, length delimited. Does not implicitly {@link ClientBlockListRequest.verify|verify} messages.
    * @param message ClientBlockListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IClientBlockListRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IClientBlockListRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientBlockListRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockListRequest
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ClientBlockListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientBlockListRequest]
  
  /**
    * Creates a plain object from a ClientBlockListRequest message. Also converts values to other types if specified.
    * @param message ClientBlockListRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ClientBlockListRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ClientBlockListRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientBlockListRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
