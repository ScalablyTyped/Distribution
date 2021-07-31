package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse")
@js.native
/**
  * Constructs a new ClientStateGetResponse.
  * @param [properties] Properties to set
  */
class ClientStateGetResponse ()
  extends StObject
     with IClientStateGetResponse {
  def this(properties: IClientStateGetResponse) = this()
  
  /** ClientStateGetResponse stateRoot. */
  @JSName("stateRoot")
  var stateRoot_ClientStateGetResponse: String = js.native
  
  /** ClientStateGetResponse status. */
  @JSName("status")
  var status_ClientStateGetResponse: Status = js.native
  
  /**
    * Converts this ClientStateGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ClientStateGetResponse value. */
  @JSName("value")
  var value_ClientStateGetResponse: Uint8Array = js.native
}
/* static members */
object ClientStateGetResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends StObject
         with Status
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.INTERNAL_ERROR & Double = js.native
    
    @js.native
    sealed trait INVALID_ADDRESS
      extends StObject
         with Status
    /* 6 */ val INVALID_ADDRESS: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.INVALID_ADDRESS & Double = js.native
    
    @js.native
    sealed trait INVALID_ROOT
      extends StObject
         with Status
    /* 7 */ val INVALID_ROOT: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.INVALID_ROOT & Double = js.native
    
    @js.native
    sealed trait NOT_READY
      extends StObject
         with Status
    /* 3 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.NOT_READY & Double = js.native
    
    @js.native
    sealed trait NO_RESOURCE
      extends StObject
         with Status
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.NO_RESOURCE & Double = js.native
    
    @js.native
    sealed trait NO_ROOT
      extends StObject
         with Status
    /* 4 */ val NO_ROOT: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.NO_ROOT & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new ClientStateGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStateGetResponse instance
    */
  @scala.inline
  def create(): ClientStateGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientStateGetResponse]
  @scala.inline
  def create(properties: IClientStateGetResponse): ClientStateGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientStateGetResponse]
  
  /**
    * Decodes a ClientStateGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ClientStateGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStateGetResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): ClientStateGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientStateGetResponse]
  @scala.inline
  def decode(reader: Uint8Array): ClientStateGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStateGetResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ClientStateGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientStateGetResponse]
  
  /**
    * Decodes a ClientStateGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStateGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ClientStateGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStateGetResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ClientStateGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStateGetResponse]
  
  /**
    * Encodes the specified ClientStateGetResponse message. Does not implicitly {@link ClientStateGetResponse.verify|verify} messages.
    * @param message ClientStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IClientStateGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IClientStateGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientStateGetResponse message, length delimited. Does not implicitly {@link ClientStateGetResponse.verify|verify} messages.
    * @param message ClientStateGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IClientStateGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IClientStateGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientStateGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStateGetResponse
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ClientStateGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientStateGetResponse]
  
  /**
    * Creates a plain object from a ClientStateGetResponse message. Also converts values to other types if specified.
    * @param message ClientStateGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ClientStateGetResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ClientStateGetResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientStateGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
