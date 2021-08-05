package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.StateChange.Type
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "StateChange")
@js.native
/**
  * Constructs a new StateChange.
  * @param [properties] Properties to set
  */
class StateChange ()
  extends StObject
     with IStateChange {
  def this(properties: IStateChange) = this()
  
  /** StateChange address. */
  @JSName("address")
  var address_StateChange: String = js.native
  
  /**
    * Converts this StateChange to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** StateChange type. */
  @JSName("type")
  var type_StateChange: Type = js.native
  
  /** StateChange value. */
  @JSName("value")
  var value_StateChange: Uint8Array = js.native
}
/* static members */
object StateChange {
  
  @JSImport("sawtooth-sdk/protobuf", "StateChange")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Type extends StObject
  /** Type enum. */
  @JSImport("sawtooth-sdk/protobuf", "StateChange.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Type & Double] = js.native
    
    @js.native
    sealed trait DELETE
      extends StObject
         with Type
    /* 2 */ val DELETE: typings.sawtoothSdk.protobufMod.StateChange.Type.DELETE & Double = js.native
    
    @js.native
    sealed trait SET
      extends StObject
         with Type
    /* 1 */ val SET: typings.sawtoothSdk.protobufMod.StateChange.Type.SET & Double = js.native
    
    @js.native
    sealed trait TYPE_UNSET
      extends StObject
         with Type
    /* 0 */ val TYPE_UNSET: typings.sawtoothSdk.protobufMod.StateChange.Type.TYPE_UNSET & Double = js.native
  }
  
  /**
    * Creates a new StateChange instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StateChange instance
    */
  inline def create(): StateChange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[StateChange]
  inline def create(properties: IStateChange): StateChange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[StateChange]
  
  /**
    * Decodes a StateChange message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StateChange
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): StateChange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StateChange]
  inline def decode(reader: Reader, length: Double): StateChange = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StateChange]
  inline def decode(reader: Uint8Array): StateChange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StateChange]
  inline def decode(reader: Uint8Array, length: Double): StateChange = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StateChange]
  
  /**
    * Decodes a StateChange message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StateChange
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): StateChange = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StateChange]
  inline def decodeDelimited(reader: Uint8Array): StateChange = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StateChange]
  
  /**
    * Encodes the specified StateChange message. Does not implicitly {@link StateChange.verify|verify} messages.
    * @param message StateChange message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IStateChange): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IStateChange, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified StateChange message, length delimited. Does not implicitly {@link StateChange.verify|verify} messages.
    * @param message StateChange message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IStateChange): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IStateChange, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a StateChange message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StateChange
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): StateChange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StateChange]
  
  /**
    * Creates a plain object from a StateChange message. Also converts values to other types if specified.
    * @param message StateChange
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: StateChange): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: StateChange, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a StateChange message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
