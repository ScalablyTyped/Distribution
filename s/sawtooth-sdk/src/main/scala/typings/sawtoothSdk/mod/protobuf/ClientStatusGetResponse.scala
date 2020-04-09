package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.IPeer
import typings.sawtoothSdk.protobufMod.IClientStatusGetResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ClientStatusGetResponse")
@js.native
/**
  * Constructs a new ClientStatusGetResponse.
  * @param [properties] Properties to set
  */
class ClientStatusGetResponse ()
  extends typings.sawtoothSdk.protobufMod.ClientStatusGetResponse {
  def this(properties: IClientStatusGetResponse) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientStatusGetResponse")
@js.native
object ClientStatusGetResponse extends js.Object {
  /** Represents a Peer. */
  @js.native
  /**
    * Constructs a new Peer.
    * @param [properties] Properties to set
    */
  class Peer ()
    extends typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Peer {
    def this(properties: IPeer) = this()
  }
  
  /**
    * Creates a new ClientStatusGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStatusGetResponse instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  def create(properties: IClientStatusGetResponse): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  /**
    * Decodes a ClientStatusGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStatusGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  /**
    * Decodes a ClientStatusGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStatusGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  /**
    * Encodes the specified ClientStatusGetResponse message. Does not implicitly {@link ClientStatusGetResponse.verify|verify} messages.
    * @param message ClientStatusGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientStatusGetResponse): Writer = js.native
  def encode(message: IClientStatusGetResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientStatusGetResponse message, length delimited. Does not implicitly {@link ClientStatusGetResponse.verify|verify} messages.
    * @param message ClientStatusGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientStatusGetResponse): Writer = js.native
  def encodeDelimited(message: IClientStatusGetResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ClientStatusGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStatusGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse = js.native
  /**
    * Creates a plain object from a ClientStatusGetResponse message. Also converts values to other types if specified.
    * @param message ClientStatusGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientStatusGetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ClientStatusGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientStatusGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /* static members */
  @js.native
  object Peer extends js.Object {
    /**
      * Creates a new Peer instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Peer instance
      */
    def create(): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Peer = js.native
    def create(properties: IPeer): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Peer = js.native
    /**
      * Decodes a Peer message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Peer
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Peer = js.native
    def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Peer = js.native
    def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Peer = js.native
    def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Peer = js.native
    /**
      * Decodes a Peer message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Peer
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Peer = js.native
    def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Peer = js.native
    /**
      * Encodes the specified Peer message. Does not implicitly {@link ClientStatusGetResponse.Peer.verify|verify} messages.
      * @param message Peer message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IPeer): Writer = js.native
    def encode(message: IPeer, writer: Writer): Writer = js.native
    /**
      * Encodes the specified Peer message, length delimited. Does not implicitly {@link ClientStatusGetResponse.Peer.verify|verify} messages.
      * @param message Peer message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IPeer): Writer = js.native
    def encodeDelimited(message: IPeer, writer: Writer): Writer = js.native
    /**
      * Creates a Peer message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Peer
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Peer = js.native
    /**
      * Creates a plain object from a Peer message. Also converts values to other types if specified.
      * @param message Peer
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Peer): StringDictionary[js.Any] = js.native
    def toObject(message: typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Peer, options: IConversionOptions): StringDictionary[js.Any] = js.native
    /**
      * Verifies a Peer message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    /* 2 */ val ERROR: typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Status.ERROR with Double = js.native
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Status.OK with Double = js.native
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Status.STATUS_UNSET with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Status with Double] = js.native
  }
  
}

