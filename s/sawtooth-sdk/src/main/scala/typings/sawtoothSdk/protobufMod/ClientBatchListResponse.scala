package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse")
@js.native
/**
  * Constructs a new ClientBatchListResponse.
  * @param [properties] Properties to set
  */
class ClientBatchListResponse ()
  extends StObject
     with IClientBatchListResponse {
  def this(properties: IClientBatchListResponse) = this()
  
  /** ClientBatchListResponse batches. */
  @JSName("batches")
  var batches_ClientBatchListResponse: js.Array[IBatch] = js.native
  
  /** ClientBatchListResponse headId. */
  @JSName("headId")
  var headId_ClientBatchListResponse: String = js.native
  
  /** ClientBatchListResponse status. */
  @JSName("status")
  var status_ClientBatchListResponse: Status = js.native
  
  /**
    * Converts this ClientBatchListResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientBatchListResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends StObject
         with Status
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.INTERNAL_ERROR & Double = js.native
    
    @js.native
    sealed trait INVALID_ID
      extends StObject
         with Status
    /* 8 */ val INVALID_ID: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.INVALID_ID & Double = js.native
    
    @js.native
    sealed trait INVALID_PAGING
      extends StObject
         with Status
    /* 6 */ val INVALID_PAGING: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.INVALID_PAGING & Double = js.native
    
    @js.native
    sealed trait INVALID_SORT
      extends StObject
         with Status
    /* 7 */ val INVALID_SORT: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.INVALID_SORT & Double = js.native
    
    @js.native
    sealed trait NOT_READY
      extends StObject
         with Status
    /* 3 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.NOT_READY & Double = js.native
    
    @js.native
    sealed trait NO_RESOURCE
      extends StObject
         with Status
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.NO_RESOURCE & Double = js.native
    
    @js.native
    sealed trait NO_ROOT
      extends StObject
         with Status
    /* 4 */ val NO_ROOT: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.NO_ROOT & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new ClientBatchListResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchListResponse instance
    */
  inline def create(): ClientBatchListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientBatchListResponse]
  inline def create(properties: IClientBatchListResponse): ClientBatchListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientBatchListResponse]
  
  /**
    * Decodes a ClientBatchListResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientBatchListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchListResponse]
  inline def decode(reader: Reader, length: Double): ClientBatchListResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBatchListResponse]
  inline def decode(reader: Uint8Array): ClientBatchListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchListResponse]
  inline def decode(reader: Uint8Array, length: Double): ClientBatchListResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBatchListResponse]
  
  /**
    * Decodes a ClientBatchListResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientBatchListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchListResponse]
  inline def decodeDelimited(reader: Uint8Array): ClientBatchListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchListResponse]
  
  /**
    * Encodes the specified ClientBatchListResponse message. Does not implicitly {@link ClientBatchListResponse.verify|verify} messages.
    * @param message ClientBatchListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientBatchListResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientBatchListResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientBatchListResponse message, length delimited. Does not implicitly {@link ClientBatchListResponse.verify|verify} messages.
    * @param message ClientBatchListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientBatchListResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientBatchListResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientBatchListResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchListResponse
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): ClientBatchListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientBatchListResponse]
  
  /**
    * Creates a plain object from a ClientBatchListResponse message. Also converts values to other types if specified.
    * @param message ClientBatchListResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientBatchListResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ClientBatchListResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientBatchListResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
