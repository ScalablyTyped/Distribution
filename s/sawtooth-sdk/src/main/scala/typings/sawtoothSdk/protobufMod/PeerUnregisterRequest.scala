package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest")
@js.native
/**
  * Constructs a new PeerUnregisterRequest.
  * @param [properties] Properties to set
  */
class PeerUnregisterRequest ()
  extends StObject
     with IPeerUnregisterRequest {
  def this(properties: IPeerUnregisterRequest) = this()
  
  /**
    * Converts this PeerUnregisterRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object PeerUnregisterRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PeerUnregisterRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PeerUnregisterRequest instance
    */
  @scala.inline
  def create(): PeerUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PeerUnregisterRequest]
  @scala.inline
  def create(properties: IPeerUnregisterRequest): PeerUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PeerUnregisterRequest]
  
  /**
    * Decodes a PeerUnregisterRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PeerUnregisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): PeerUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PeerUnregisterRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): PeerUnregisterRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PeerUnregisterRequest]
  @scala.inline
  def decode(reader: Uint8Array): PeerUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PeerUnregisterRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): PeerUnregisterRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PeerUnregisterRequest]
  
  /**
    * Decodes a PeerUnregisterRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PeerUnregisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): PeerUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PeerUnregisterRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): PeerUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PeerUnregisterRequest]
  
  /**
    * Encodes the specified PeerUnregisterRequest message. Does not implicitly {@link PeerUnregisterRequest.verify|verify} messages.
    * @param message PeerUnregisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IPeerUnregisterRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IPeerUnregisterRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PeerUnregisterRequest message, length delimited. Does not implicitly {@link PeerUnregisterRequest.verify|verify} messages.
    * @param message PeerUnregisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IPeerUnregisterRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IPeerUnregisterRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PeerUnregisterRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PeerUnregisterRequest
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): PeerUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PeerUnregisterRequest]
  
  /**
    * Creates a plain object from a PeerUnregisterRequest message. Also converts values to other types if specified.
    * @param message PeerUnregisterRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: PeerUnregisterRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: PeerUnregisterRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a PeerUnregisterRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
