package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "StateChangeList")
@js.native
/**
  * Constructs a new StateChangeList.
  * @param [properties] Properties to set
  */
class StateChangeList ()
  extends StObject
     with IStateChangeList {
  def this(properties: IStateChangeList) = this()
  
  /** StateChangeList stateChanges. */
  @JSName("stateChanges")
  var stateChanges_StateChangeList: js.Array[IStateChange] = js.native
  
  /**
    * Converts this StateChangeList to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object StateChangeList {
  
  @JSImport("sawtooth-sdk/protobuf", "StateChangeList")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new StateChangeList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StateChangeList instance
    */
  inline def create(): StateChangeList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[StateChangeList]
  inline def create(properties: IStateChangeList): StateChangeList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[StateChangeList]
  
  /**
    * Decodes a StateChangeList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StateChangeList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): StateChangeList = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StateChangeList]
  inline def decode(reader: Reader, length: Double): StateChangeList = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StateChangeList]
  inline def decode(reader: Uint8Array): StateChangeList = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StateChangeList]
  inline def decode(reader: Uint8Array, length: Double): StateChangeList = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StateChangeList]
  
  /**
    * Decodes a StateChangeList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StateChangeList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): StateChangeList = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StateChangeList]
  inline def decodeDelimited(reader: Uint8Array): StateChangeList = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StateChangeList]
  
  /**
    * Encodes the specified StateChangeList message. Does not implicitly {@link StateChangeList.verify|verify} messages.
    * @param message StateChangeList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IStateChangeList): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IStateChangeList, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified StateChangeList message, length delimited. Does not implicitly {@link StateChangeList.verify|verify} messages.
    * @param message StateChangeList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IStateChangeList): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IStateChangeList, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a StateChangeList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StateChangeList
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): StateChangeList = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StateChangeList]
  
  /**
    * Creates a plain object from a StateChangeList message. Also converts values to other types if specified.
    * @param message StateChangeList
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: StateChangeList): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: StateChangeList, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a StateChangeList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
