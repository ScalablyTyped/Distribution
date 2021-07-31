package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientBatchSubmitResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBatchSubmitResponse")
@js.native
/**
  * Constructs a new ClientBatchSubmitResponse.
  * @param [properties] Properties to set
  */
class ClientBatchSubmitResponse ()
  extends StObject
     with IClientBatchSubmitResponse {
  def this(properties: IClientBatchSubmitResponse) = this()
  
  /** ClientBatchSubmitResponse status. */
  @JSName("status")
  var status_ClientBatchSubmitResponse: Status = js.native
  
  /**
    * Converts this ClientBatchSubmitResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientBatchSubmitResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchSubmitResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchSubmitResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends StObject
         with Status
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientBatchSubmitResponse.Status.INTERNAL_ERROR & Double = js.native
    
    @js.native
    sealed trait INVALID_BATCH
      extends StObject
         with Status
    /* 3 */ val INVALID_BATCH: typings.sawtoothSdk.protobufMod.ClientBatchSubmitResponse.Status.INVALID_BATCH & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientBatchSubmitResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait QUEUE_FULL
      extends StObject
         with Status
    /* 4 */ val QUEUE_FULL: typings.sawtoothSdk.protobufMod.ClientBatchSubmitResponse.Status.QUEUE_FULL & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientBatchSubmitResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new ClientBatchSubmitResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchSubmitResponse instance
    */
  @scala.inline
  def create(): ClientBatchSubmitResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientBatchSubmitResponse]
  @scala.inline
  def create(properties: IClientBatchSubmitResponse): ClientBatchSubmitResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientBatchSubmitResponse]
  
  /**
    * Decodes a ClientBatchSubmitResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchSubmitResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ClientBatchSubmitResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchSubmitResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): ClientBatchSubmitResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBatchSubmitResponse]
  @scala.inline
  def decode(reader: Uint8Array): ClientBatchSubmitResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchSubmitResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ClientBatchSubmitResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBatchSubmitResponse]
  
  /**
    * Decodes a ClientBatchSubmitResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchSubmitResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ClientBatchSubmitResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchSubmitResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ClientBatchSubmitResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchSubmitResponse]
  
  /**
    * Encodes the specified ClientBatchSubmitResponse message. Does not implicitly {@link ClientBatchSubmitResponse.verify|verify} messages.
    * @param message ClientBatchSubmitResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IClientBatchSubmitResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IClientBatchSubmitResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientBatchSubmitResponse message, length delimited. Does not implicitly {@link ClientBatchSubmitResponse.verify|verify} messages.
    * @param message ClientBatchSubmitResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IClientBatchSubmitResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IClientBatchSubmitResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientBatchSubmitResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchSubmitResponse
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ClientBatchSubmitResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientBatchSubmitResponse]
  
  /**
    * Creates a plain object from a ClientBatchSubmitResponse message. Also converts values to other types if specified.
    * @param message ClientBatchSubmitResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ClientBatchSubmitResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ClientBatchSubmitResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientBatchSubmitResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
