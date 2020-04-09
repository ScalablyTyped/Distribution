package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientEventsGetRequest extends js.Object {
  /** ClientEventsGetRequest blockIds */
  var blockIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** ClientEventsGetRequest subscriptions */
  var subscriptions: js.UndefOr[js.Array[IEventSubscription] | Null] = js.undefined
}

object IClientEventsGetRequest {
  @scala.inline
  def apply(blockIds: js.Array[String] = null, subscriptions: js.Array[IEventSubscription] = null): IClientEventsGetRequest = {
    val __obj = js.Dynamic.literal()
    if (blockIds != null) __obj.updateDynamic("blockIds")(blockIds.asInstanceOf[js.Any])
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientEventsGetRequest]
  }
}

