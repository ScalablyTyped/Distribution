package typings.sawtoothSdk.protobufMod.ClientStatusGetResponse

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Peer. */
@JSImport("sawtooth-sdk/protobuf", "ClientStatusGetResponse.Peer")
@js.native
/**
  * Constructs a new Peer.
  * @param [properties] Properties to set
  */
class Peer () extends IPeer {
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
/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientStatusGetResponse.Peer")
@js.native
object Peer extends js.Object {
  
  /**
    * Creates a new Peer instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Peer instance
    */
  def create(): Peer = js.native
  def create(properties: IPeer): Peer = js.native
  
  /**
    * Decodes a Peer message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Peer
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Peer = js.native
  def decode(reader: Reader, length: Double): Peer = js.native
  def decode(reader: Uint8Array): Peer = js.native
  def decode(reader: Uint8Array, length: Double): Peer = js.native
  
  /**
    * Decodes a Peer message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Peer
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Peer = js.native
  def decodeDelimited(reader: Uint8Array): Peer = js.native
  
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
  def fromObject(`object`: StringDictionary[js.Any]): Peer = js.native
  
  /**
    * Creates a plain object from a Peer message. Also converts values to other types if specified.
    * @param message Peer
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Peer): StringDictionary[js.Any] = js.native
  def toObject(message: Peer, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Peer message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
