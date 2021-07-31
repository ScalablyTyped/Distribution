package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse")
@js.native
/**
  * Constructs a new ClientTransactionGetResponse.
  * @param [properties] Properties to set
  */
class ClientTransactionGetResponse ()
  extends StObject
     with IClientTransactionGetResponse {
  def this(properties: IClientTransactionGetResponse) = this()
  
  /** ClientTransactionGetResponse status. */
  @JSName("status")
  var status_ClientTransactionGetResponse: Status = js.native
  
  /**
    * Converts this ClientTransactionGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientTransactionGetResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends StObject
         with Status
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.INTERNAL_ERROR & Double = js.native
    
    @js.native
    sealed trait INVALID_ID
      extends StObject
         with Status
    /* 8 */ val INVALID_ID: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.INVALID_ID & Double = js.native
    
    @js.native
    sealed trait NO_RESOURCE
      extends StObject
         with Status
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.NO_RESOURCE & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new ClientTransactionGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientTransactionGetResponse instance
    */
  @scala.inline
  def create(): ClientTransactionGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientTransactionGetResponse]
  @scala.inline
  def create(properties: IClientTransactionGetResponse): ClientTransactionGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientTransactionGetResponse]
  
  /**
    * Decodes a ClientTransactionGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientTransactionGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ClientTransactionGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientTransactionGetResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): ClientTransactionGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientTransactionGetResponse]
  @scala.inline
  def decode(reader: Uint8Array): ClientTransactionGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientTransactionGetResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ClientTransactionGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientTransactionGetResponse]
  
  /**
    * Decodes a ClientTransactionGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientTransactionGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ClientTransactionGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientTransactionGetResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ClientTransactionGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientTransactionGetResponse]
  
  /**
    * Encodes the specified ClientTransactionGetResponse message. Does not implicitly {@link ClientTransactionGetResponse.verify|verify} messages.
    * @param message ClientTransactionGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IClientTransactionGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IClientTransactionGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientTransactionGetResponse message, length delimited. Does not implicitly {@link ClientTransactionGetResponse.verify|verify} messages.
    * @param message ClientTransactionGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IClientTransactionGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IClientTransactionGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientTransactionGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientTransactionGetResponse
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ClientTransactionGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientTransactionGetResponse]
  
  /**
    * Creates a plain object from a ClientTransactionGetResponse message. Also converts values to other types if specified.
    * @param message ClientTransactionGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ClientTransactionGetResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ClientTransactionGetResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientTransactionGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
