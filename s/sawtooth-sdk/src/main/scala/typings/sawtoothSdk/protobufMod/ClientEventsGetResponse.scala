package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientEventsGetResponse")
@js.native
/**
  * Constructs a new ClientEventsGetResponse.
  * @param [properties] Properties to set
  */
class ClientEventsGetResponse ()
  extends StObject
     with IClientEventsGetResponse {
  def this(properties: IClientEventsGetResponse) = this()
  
  /** ClientEventsGetResponse events. */
  @JSName("events")
  var events_ClientEventsGetResponse: js.Array[IEvent] = js.native
  
  /** ClientEventsGetResponse status. */
  @JSName("status")
  var status_ClientEventsGetResponse: Status = js.native
  
  /**
    * Converts this ClientEventsGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientEventsGetResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientEventsGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends StObject
         with Status
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status.INTERNAL_ERROR & Double = js.native
    
    @js.native
    sealed trait INVALID_FILTER
      extends StObject
         with Status
    /* 3 */ val INVALID_FILTER: typings.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status.INVALID_FILTER & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status.STATUS_UNSET & Double = js.native
    
    @js.native
    sealed trait UNKNOWN_BLOCK
      extends StObject
         with Status
    /* 4 */ val UNKNOWN_BLOCK: typings.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status.UNKNOWN_BLOCK & Double = js.native
  }
  
  /**
    * Creates a new ClientEventsGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientEventsGetResponse instance
    */
  @scala.inline
  def create(): ClientEventsGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientEventsGetResponse]
  @scala.inline
  def create(properties: IClientEventsGetResponse): ClientEventsGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientEventsGetResponse]
  
  /**
    * Decodes a ClientEventsGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientEventsGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ClientEventsGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientEventsGetResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): ClientEventsGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientEventsGetResponse]
  @scala.inline
  def decode(reader: Uint8Array): ClientEventsGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientEventsGetResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ClientEventsGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientEventsGetResponse]
  
  /**
    * Decodes a ClientEventsGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientEventsGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ClientEventsGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientEventsGetResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ClientEventsGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientEventsGetResponse]
  
  /**
    * Encodes the specified ClientEventsGetResponse message. Does not implicitly {@link ClientEventsGetResponse.verify|verify} messages.
    * @param message ClientEventsGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IClientEventsGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IClientEventsGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientEventsGetResponse message, length delimited. Does not implicitly {@link ClientEventsGetResponse.verify|verify} messages.
    * @param message ClientEventsGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IClientEventsGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IClientEventsGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientEventsGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientEventsGetResponse
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ClientEventsGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientEventsGetResponse]
  
  /**
    * Creates a plain object from a ClientEventsGetResponse message. Also converts values to other types if specified.
    * @param message ClientEventsGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ClientEventsGetResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ClientEventsGetResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientEventsGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
