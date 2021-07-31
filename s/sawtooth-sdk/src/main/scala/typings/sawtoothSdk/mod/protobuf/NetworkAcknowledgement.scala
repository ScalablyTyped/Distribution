package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.INetworkAcknowledgement
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.NetworkAcknowledgement")
@js.native
/**
  * Constructs a new NetworkAcknowledgement.
  * @param [properties] Properties to set
  */
class NetworkAcknowledgement ()
  extends typings.sawtoothSdk.protobufMod.NetworkAcknowledgement {
  def this(properties: INetworkAcknowledgement) = this()
}
/* static members */
object NetworkAcknowledgement {
  
  @JSImport("sawtooth-sdk", "protobuf.NetworkAcknowledgement")
  @js.native
  val ^ : js.Any = js.native
  
  /** Status enum. */
  @JSImport("sawtooth-sdk", "protobuf.NetworkAcknowledgement.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sawtoothSdk.protobufMod.NetworkAcknowledgement.Status & Double] = js.native
    
    /* 2 */ val ERROR: typings.sawtoothSdk.protobufMod.NetworkAcknowledgement.Status.ERROR & Double = js.native
    
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.NetworkAcknowledgement.Status.OK & Double = js.native
    
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.NetworkAcknowledgement.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new NetworkAcknowledgement instance using the specified properties.
    * @param [properties] Properties to set
    * @returns NetworkAcknowledgement instance
    */
  @scala.inline
  def create(): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.sawtoothSdk.protobufMod.NetworkAcknowledgement]
  @scala.inline
  def create(properties: INetworkAcknowledgement): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.NetworkAcknowledgement]
  
  /**
    * Decodes a NetworkAcknowledgement message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns NetworkAcknowledgement
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.NetworkAcknowledgement]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.NetworkAcknowledgement]
  @scala.inline
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.NetworkAcknowledgement]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.sawtoothSdk.protobufMod.NetworkAcknowledgement]
  
  /**
    * Decodes a NetworkAcknowledgement message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns NetworkAcknowledgement
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.NetworkAcknowledgement]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.NetworkAcknowledgement]
  
  /**
    * Encodes the specified NetworkAcknowledgement message. Does not implicitly {@link NetworkAcknowledgement.verify|verify} messages.
    * @param message NetworkAcknowledgement message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: INetworkAcknowledgement): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: INetworkAcknowledgement, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified NetworkAcknowledgement message, length delimited. Does not implicitly {@link NetworkAcknowledgement.verify|verify} messages.
    * @param message NetworkAcknowledgement message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: INetworkAcknowledgement): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: INetworkAcknowledgement, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a NetworkAcknowledgement message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns NetworkAcknowledgement
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.NetworkAcknowledgement = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sawtoothSdk.protobufMod.NetworkAcknowledgement]
  
  /**
    * Creates a plain object from a NetworkAcknowledgement message. Also converts values to other types if specified.
    * @param message NetworkAcknowledgement
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: typings.sawtoothSdk.protobufMod.NetworkAcknowledgement): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: typings.sawtoothSdk.protobufMod.NetworkAcknowledgement, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a NetworkAcknowledgement message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
