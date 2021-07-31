package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "PingResponse")
@js.native
/**
  * Constructs a new PingResponse.
  * @param [properties] Properties to set
  */
class PingResponse ()
  extends StObject
     with IPingResponse {
  def this(properties: IPingResponse) = this()
  
  /**
    * Converts this PingResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object PingResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "PingResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PingResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PingResponse instance
    */
  @scala.inline
  def create(): PingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PingResponse]
  @scala.inline
  def create(properties: IPingResponse): PingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PingResponse]
  
  /**
    * Decodes a PingResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): PingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PingResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): PingResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PingResponse]
  @scala.inline
  def decode(reader: Uint8Array): PingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PingResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): PingResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PingResponse]
  
  /**
    * Decodes a PingResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PingResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): PingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PingResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): PingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PingResponse]
  
  /**
    * Encodes the specified PingResponse message. Does not implicitly {@link PingResponse.verify|verify} messages.
    * @param message PingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IPingResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IPingResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PingResponse message, length delimited. Does not implicitly {@link PingResponse.verify|verify} messages.
    * @param message PingResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IPingResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IPingResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PingResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PingResponse
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): PingResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PingResponse]
  
  /**
    * Creates a plain object from a PingResponse message. Also converts values to other types if specified.
    * @param message PingResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: PingResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: PingResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a PingResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
