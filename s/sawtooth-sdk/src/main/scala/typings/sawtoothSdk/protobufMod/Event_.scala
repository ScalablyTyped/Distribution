package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.sawtoothSdk.protobufMod.Event.IAttribute
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "Event")
@js.native
/**
  * Constructs a new Event.
  * @param [properties] Properties to set
  */
class Event_ () extends IEvent {
  def this(properties: IEvent) = this()
  /** Event attributes. */
  @JSName("attributes")
  var attributes_Event_ : js.Array[IAttribute] = js.native
  /** Event data. */
  @JSName("data")
  var data_Event_ : Uint8Array = js.native
  /** Event eventType. */
  @JSName("eventType")
  var eventType_Event_ : String = js.native
  /**
    * Converts this Event to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

