package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockResponse")
@js.native
/**
  * Constructs a new ConsensusIgnoreBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusIgnoreBlockResponse ()
  extends StObject
     with IConsensusIgnoreBlockResponse {
  def this(properties: IConsensusIgnoreBlockResponse) = this()
  
  /** ConsensusIgnoreBlockResponse status. */
  @JSName("status")
  var status_ConsensusIgnoreBlockResponse: Status = js.native
  
  /**
    * Converts this ConsensusIgnoreBlockResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusIgnoreBlockResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST
      extends StObject
         with Status
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.BAD_REQUEST & Double = js.native
    
    @js.native
    sealed trait NOT_READY
      extends StObject
         with Status
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.NOT_READY & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR
      extends StObject
         with Status
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.SERVICE_ERROR & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.STATUS_UNSET & Double = js.native
    
    @js.native
    sealed trait UNKNOWN_BLOCK
      extends StObject
         with Status
    /* 5 */ val UNKNOWN_BLOCK: typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.UNKNOWN_BLOCK & Double = js.native
  }
  
  /**
    * Creates a new ConsensusIgnoreBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusIgnoreBlockResponse instance
    */
  @scala.inline
  def create(): ConsensusIgnoreBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusIgnoreBlockResponse]
  @scala.inline
  def create(properties: IConsensusIgnoreBlockResponse): ConsensusIgnoreBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockResponse]
  
  /**
    * Decodes a ConsensusIgnoreBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusIgnoreBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ConsensusIgnoreBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): ConsensusIgnoreBlockResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusIgnoreBlockResponse]
  @scala.inline
  def decode(reader: Uint8Array): ConsensusIgnoreBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ConsensusIgnoreBlockResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusIgnoreBlockResponse]
  
  /**
    * Decodes a ConsensusIgnoreBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusIgnoreBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ConsensusIgnoreBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ConsensusIgnoreBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockResponse]
  
  /**
    * Encodes the specified ConsensusIgnoreBlockResponse message. Does not implicitly {@link ConsensusIgnoreBlockResponse.verify|verify} messages.
    * @param message ConsensusIgnoreBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IConsensusIgnoreBlockResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IConsensusIgnoreBlockResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusIgnoreBlockResponse message, length delimited. Does not implicitly {@link ConsensusIgnoreBlockResponse.verify|verify} messages.
    * @param message ConsensusIgnoreBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IConsensusIgnoreBlockResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IConsensusIgnoreBlockResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusIgnoreBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusIgnoreBlockResponse
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusIgnoreBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockResponse]
  
  /**
    * Creates a plain object from a ConsensusIgnoreBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusIgnoreBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ConsensusIgnoreBlockResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ConsensusIgnoreBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusIgnoreBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
