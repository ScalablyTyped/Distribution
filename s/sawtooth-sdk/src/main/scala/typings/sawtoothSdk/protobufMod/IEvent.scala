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
  def apply(
    attributes: js.UndefOr[Null | js.Array[IAttribute]] = js.undefined,
    data: js.UndefOr[Null | Uint8Array] = js.undefined,
    eventType: js.UndefOr[Null | String] = js.undefined
  ): IEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attributes)) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(eventType)) __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
}

