package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse")
@js.native
/**
  * Constructs a new ConsensusSummarizeBlockResponse.
  * @param [properties] Properties to set
  */
class ConsensusSummarizeBlockResponse ()
  extends StObject
     with IConsensusSummarizeBlockResponse {
  def this(properties: IConsensusSummarizeBlockResponse) = this()
  
  /** ConsensusSummarizeBlockResponse status. */
  @JSName("status")
  var status_ConsensusSummarizeBlockResponse: Status = js.native
  
  /** ConsensusSummarizeBlockResponse summary. */
  @JSName("summary")
  var summary_ConsensusSummarizeBlockResponse: Uint8Array = js.native
  
  /**
    * Converts this ConsensusSummarizeBlockResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ConsensusSummarizeBlockResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSummarizeBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST
      extends StObject
         with Status
    /* 2 */ val BAD_REQUEST: typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.BAD_REQUEST & Double = js.native
    
    @js.native
    sealed trait BLOCK_NOT_READY
      extends StObject
         with Status
    /* 6 */ val BLOCK_NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.BLOCK_NOT_READY & Double = js.native
    
    @js.native
    sealed trait INVALID_STATE
      extends StObject
         with Status
    /* 5 */ val INVALID_STATE: typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.INVALID_STATE & Double = js.native
    
    @js.native
    sealed trait NOT_READY
      extends StObject
         with Status
    /* 4 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.NOT_READY & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR
      extends StObject
         with Status
    /* 3 */ val SERVICE_ERROR: typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.SERVICE_ERROR & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new ConsensusSummarizeBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSummarizeBlockResponse instance
    */
  @scala.inline
  def create(): ConsensusSummarizeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusSummarizeBlockResponse]
  @scala.inline
  def create(properties: IConsensusSummarizeBlockResponse): ConsensusSummarizeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusSummarizeBlockResponse]
  
  /**
    * Decodes a ConsensusSummarizeBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSummarizeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ConsensusSummarizeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusSummarizeBlockResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): ConsensusSummarizeBlockResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusSummarizeBlockResponse]
  @scala.inline
  def decode(reader: Uint8Array): ConsensusSummarizeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusSummarizeBlockResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ConsensusSummarizeBlockResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusSummarizeBlockResponse]
  
  /**
    * Decodes a ConsensusSummarizeBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSummarizeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ConsensusSummarizeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusSummarizeBlockResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ConsensusSummarizeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusSummarizeBlockResponse]
  
  /**
    * Encodes the specified ConsensusSummarizeBlockResponse message. Does not implicitly {@link ConsensusSummarizeBlockResponse.verify|verify} messages.
    * @param message ConsensusSummarizeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IConsensusSummarizeBlockResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IConsensusSummarizeBlockResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusSummarizeBlockResponse message, length delimited. Does not implicitly {@link ConsensusSummarizeBlockResponse.verify|verify} messages.
    * @param message ConsensusSummarizeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IConsensusSummarizeBlockResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IConsensusSummarizeBlockResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusSummarizeBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSummarizeBlockResponse
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusSummarizeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusSummarizeBlockResponse]
  
  /**
    * Creates a plain object from a ConsensusSummarizeBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusSummarizeBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ConsensusSummarizeBlockResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ConsensusSummarizeBlockResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ConsensusSummarizeBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
