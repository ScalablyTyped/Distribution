package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.sawtoothSdk.protobufMod.ChangeLogEntry.ISuccessor
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ChangeLogEntry")
@js.native
/**
  * Constructs a new ChangeLogEntry.
  * @param [properties] Properties to set
  */
class ChangeLogEntry_ () extends IChangeLogEntry {
  def this(properties: IChangeLogEntry) = this()
  
  /** ChangeLogEntry additions. */
  @JSName("additions")
  var additions_ChangeLogEntry_ : js.Array[Uint8Array] = js.native
  
  /** ChangeLogEntry parent. */
  @JSName("parent")
  var parent_ChangeLogEntry_ : Uint8Array = js.native
  
  /** ChangeLogEntry successors. */
  @JSName("successors")
  var successors_ChangeLogEntry_ : js.Array[ISuccessor] = js.native
  
  /**
    * Converts this ChangeLogEntry to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
