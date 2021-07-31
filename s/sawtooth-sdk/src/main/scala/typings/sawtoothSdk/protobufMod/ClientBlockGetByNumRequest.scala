package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest")
@js.native
/**
  * Constructs a new ClientBlockGetByNumRequest.
  * @param [properties] Properties to set
  */
class ClientBlockGetByNumRequest ()
  extends StObject
     with IClientBlockGetByNumRequest {
  def this(properties: IClientBlockGetByNumRequest) = this()
  
  /** ClientBlockGetByNumRequest blockNum. */
  @JSName("blockNum")
  var blockNum_ClientBlockGetByNumRequest: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  
  /**
    * Converts this ClientBlockGetByNumRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientBlockGetByNumRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByNumRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientBlockGetByNumRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetByNumRequest instance
    */
  @scala.inline
  def create(): ClientBlockGetByNumRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientBlockGetByNumRequest]
  @scala.inline
  def create(properties: IClientBlockGetByNumRequest): ClientBlockGetByNumRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByNumRequest]
  
  /**
    * Decodes a ClientBlockGetByNumRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetByNumRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ClientBlockGetByNumRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByNumRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): ClientBlockGetByNumRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBlockGetByNumRequest]
  @scala.inline
  def decode(reader: Uint8Array): ClientBlockGetByNumRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByNumRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ClientBlockGetByNumRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBlockGetByNumRequest]
  
  /**
    * Decodes a ClientBlockGetByNumRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetByNumRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ClientBlockGetByNumRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByNumRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ClientBlockGetByNumRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByNumRequest]
  
  /**
    * Encodes the specified ClientBlockGetByNumRequest message. Does not implicitly {@link ClientBlockGetByNumRequest.verify|verify} messages.
    * @param message ClientBlockGetByNumRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IClientBlockGetByNumRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IClientBlockGetByNumRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientBlockGetByNumRequest message, length delimited. Does not implicitly {@link ClientBlockGetByNumRequest.verify|verify} messages.
    * @param message ClientBlockGetByNumRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IClientBlockGetByNumRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IClientBlockGetByNumRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientBlockGetByNumRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetByNumRequest
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ClientBlockGetByNumRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByNumRequest]
  
  /**
    * Creates a plain object from a ClientBlockGetByNumRequest message. Also converts values to other types if specified.
    * @param message ClientBlockGetByNumRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ClientBlockGetByNumRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ClientBlockGetByNumRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientBlockGetByNumRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
