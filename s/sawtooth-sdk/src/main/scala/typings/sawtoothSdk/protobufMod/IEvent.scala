package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.Event.IAttribute
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends js.Object {
  /** Event attributes */
  var attributes: js.UndefOr[js.Array[IAttribute] | Null] = js.undefined
  /** Event data */
  var data: js.UndefOr[Uint8Array | Null] = js.undefined
  /** Event eventType */
  var eventType: js.UndefOr[String | Null] = js.undefined
}

object IEvent {
  @scala.inline
  def apply(attributes: js.Array[IAttribute] = null, data: Uint8Array = null, eventType: String = null): IEvent = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (eventType != null) __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
}

