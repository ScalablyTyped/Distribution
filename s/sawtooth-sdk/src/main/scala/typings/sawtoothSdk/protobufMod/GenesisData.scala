package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "GenesisData")
@js.native
/**
  * Constructs a new GenesisData.
  * @param [properties] Properties to set
  */
class GenesisData ()
  extends StObject
     with IGenesisData {
  def this(properties: IGenesisData) = this()
  
  /** GenesisData batches. */
  @JSName("batches")
  var batches_GenesisData: js.Array[IBatch] = js.native
  
  /**
    * Converts this GenesisData to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object GenesisData {
  
  @JSImport("sawtooth-sdk/protobuf", "GenesisData")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GenesisData instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GenesisData instance
    */
  @scala.inline
  def create(): GenesisData = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GenesisData]
  @scala.inline
  def create(properties: IGenesisData): GenesisData = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GenesisData]
  
  /**
    * Decodes a GenesisData message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GenesisData
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): GenesisData = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GenesisData]
  @scala.inline
  def decode(reader: Reader, length: Double): GenesisData = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GenesisData]
  @scala.inline
  def decode(reader: Uint8Array): GenesisData = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GenesisData]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): GenesisData = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GenesisData]
  
  /**
    * Decodes a GenesisData message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GenesisData
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): GenesisData = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GenesisData]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): GenesisData = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GenesisData]
  
  /**
    * Encodes the specified GenesisData message. Does not implicitly {@link GenesisData.verify|verify} messages.
    * @param message GenesisData message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IGenesisData): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IGenesisData, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GenesisData message, length delimited. Does not implicitly {@link GenesisData.verify|verify} messages.
    * @param message GenesisData message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IGenesisData): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IGenesisData, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GenesisData message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GenesisData
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): GenesisData = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GenesisData]
  
  /**
    * Creates a plain object from a GenesisData message. Also converts values to other types if specified.
    * @param message GenesisData
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: GenesisData): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: GenesisData, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a GenesisData message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
