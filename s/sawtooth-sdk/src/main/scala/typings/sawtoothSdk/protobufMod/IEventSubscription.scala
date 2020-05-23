package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventSubscription extends js.Object {
  /** EventSubscription eventType */
  var eventType: js.UndefOr[String | Null] = js.undefined
  /** EventSubscription filters */
  var filters: js.UndefOr[js.Array[IEventFilter] | Null] = js.undefined
}

object IEventSubscription {
  @scala.inline
  def apply(
    eventType: js.UndefOr[Null | String] = js.undefined,
    filters: js.UndefOr[Null | js.Array[IEventFilter]] = js.undefined
  ): IEventSubscription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(eventType)) __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    if (!js.isUndefined(filters)) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventSubscription]
  }
}

