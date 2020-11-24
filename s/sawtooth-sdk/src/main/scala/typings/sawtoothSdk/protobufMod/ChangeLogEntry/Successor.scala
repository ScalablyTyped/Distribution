package typings.sawtoothSdk.protobufMod.ChangeLogEntry

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Successor. */
@JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor")
@js.native
/**
  * Constructs a new Successor.
  * @param [properties] Properties to set
  */
class Successor () extends ISuccessor {
  def this(properties: ISuccessor) = this()
  
  /** Successor deletions. */
  @JSName("deletions")
  var deletions_Successor: js.Array[Uint8Array] = js.native
  
  /** Successor successor. */
  @JSName("successor")
  var successor_Successor: Uint8Array = js.native
  
  /**
    * Converts this Successor to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry.Successor")
@js.native
object Successor extends js.Object {
  
  /**
    * Creates a new Successor instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Successor instance
    */
  def create(): Successor = js.native
  def create(properties: ISuccessor): Successor = js.native
  
  /**
    * Decodes a Successor message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Successor
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Successor = js.native
  def decode(reader: Reader, length: Double): Successor = js.native
  def decode(reader: Uint8Array): Successor = js.native
  def decode(reader: Uint8Array, length: Double): Successor = js.native
  
  /**
    * Decodes a Successor message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Successor
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Successor = js.native
  def decodeDelimited(reader: Uint8Array): Successor = js.native
  
  /**
    * Encodes the specified Successor message. Does not implicitly {@link ChangeLogEntry.Successor.verify|verify} messages.
    * @param message Successor message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISuccessor): Writer = js.native
  def encode(message: ISuccessor, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Successor message, length delimited. Does not implicitly {@link ChangeLogEntry.Successor.verify|verify} messages.
    * @param message Successor message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISuccessor): Writer = js.native
  def encodeDelimited(message: ISuccessor, writer: Writer): Writer = js.native
  
  /**
    * Creates a Successor message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Successor
    */
  def fromObject(`object`: StringDictionary[js.Any]): Successor = js.native
  
  /**
    * Creates a plain object from a Successor message. Also converts values to other types if specified.
    * @param message Successor
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Successor): StringDictionary[js.Any] = js.native
  def toObject(message: Successor, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Successor message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
