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
  def apply(eventType: String = null, filters: js.Array[IEventFilter] = null): IEventSubscription = {
    val __obj = js.Dynamic.literal()
    if (eventType != null) __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventSubscription]
  }
}

