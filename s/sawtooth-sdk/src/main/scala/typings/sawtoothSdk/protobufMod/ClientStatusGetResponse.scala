package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.IPeer
import typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientStatusGetResponse")
@js.native
/**
  * Constructs a new ClientStatusGetResponse.
  * @param [properties] Properties to set
  */
class ClientStatusGetResponse ()
  extends StObject
     with IClientStatusGetResponse {
  def this(properties: IClientStatusGetResponse) = this()
  
  /** ClientStatusGetResponse endpoint. */
  @JSName("endpoint")
  var endpoint_ClientStatusGetResponse: String = js.native
  
  /** ClientStatusGetResponse peers. */
  @JSName("peers")
  var peers_ClientStatusGetResponse: js.Array[IPeer] = js.native
  
  /** ClientStatusGetResponse status. */
  @JSName("status")
  var status_ClientStatusGetResponse: Status = js.native
  
  /**
    * Converts this ClientStatusGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientStatusGetResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientStatusGetResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a Peer. */
  @JSImport("sawtooth-sdk/protobuf", "ClientStatusGetResponse.Peer")
  @js.native
  /**
    * Constructs a new Peer.
    * @param [properties] Properties to set
    */
  class Peer ()
    extends StObject
       with IPeer {
    def this(properties: IPeer) = this()
    
    /** Peer endpoint. */
    @JSName("endpoint")
    var endpoint_Peer: String = js.native
    
    /**
      * Converts this Peer to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Peer {
    
    @JSImport("sawtooth-sdk/protobuf", "ClientStatusGetResponse.Peer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Peer instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Peer instance
      */
    /* static member */
    @scala.inline
    def create(): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Peer]
    @scala.inline
    def create(properties: IPeer): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Peer]
    
    /**
      * Decodes a Peer message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Peer
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Peer]
    @scala.inline
    def decode(reader: Reader, length: Double): Peer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Peer]
    @scala.inline
    def decode(reader: Uint8Array): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Peer]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): Peer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Peer]
    
    /**
      * Decodes a Peer message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Peer
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Peer]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Peer]
    
    /**
      * Encodes the specified Peer message. Does not implicitly {@link ClientStatusGetResponse.Peer.verify|verify} messages.
      * @param message Peer message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IPeer): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IPeer, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Peer message, length delimited. Does not implicitly {@link ClientStatusGetResponse.Peer.verify|verify} messages.
      * @param message Peer message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IPeer): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IPeer, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Peer message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Peer
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Peer]
    
    /**
      * Creates a plain object from a Peer message. Also converts values to other types if specified.
      * @param message Peer
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: Peer): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: Peer, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a Peer message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientStatusGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with Status
    /* 2 */ val ERROR: typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Status.ERROR & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new ClientStatusGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStatusGetResponse instance
    */
  @scala.inline
  def create(): ClientStatusGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientStatusGetResponse]
  @scala.inline
  def create(properties: IClientStatusGetResponse): ClientStatusGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientStatusGetResponse]
  
  /**
    * Decodes a ClientStatusGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStatusGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): ClientStatusGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStatusGetResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): ClientStatusGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientStatusGetResponse]
  @scala.inline
  def decode(reader: Uint8Array): ClientStatusGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStatusGetResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ClientStatusGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientStatusGetResponse]
  
  /**
    * Decodes a ClientStatusGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStatusGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): ClientStatusGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStatusGetResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ClientStatusGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStatusGetResponse]
  
  /**
    * Encodes the specified ClientStatusGetResponse message. Does not implicitly {@link ClientStatusGetResponse.verify|verify} messages.
    * @param message ClientStatusGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IClientStatusGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IClientStatusGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientStatusGetResponse message, length delimited. Does not implicitly {@link ClientStatusGetResponse.verify|verify} messages.
    * @param message ClientStatusGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IClientStatusGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IClientStatusGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientStatusGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStatusGetResponse
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ClientStatusGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientStatusGetResponse]
  
  /**
    * Creates a plain object from a ClientStatusGetResponse message. Also converts values to other types if specified.
    * @param message ClientStatusGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: ClientStatusGetResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ClientStatusGetResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ClientStatusGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a Peer. */
  trait IPeer extends StObject {
    
    /** Peer endpoint */
    var endpoint: js.UndefOr[String | Null] = js.undefined
  }
  object IPeer {
    
    @scala.inline
    def apply(): IPeer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPeer]
    }
    
    @scala.inline
    implicit class IPeerMutableBuilder[Self <: IPeer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointNull: Self = StObject.set(x, "endpoint", null)
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    }
  }
}
