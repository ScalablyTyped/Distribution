package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientEventsSubscribeRequest extends js.Object {
  /** ClientEventsSubscribeRequest lastKnownBlockIds */
  var lastKnownBlockIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** ClientEventsSubscribeRequest subscriptions */
  var subscriptions: js.UndefOr[js.Array[IEventSubscription] | Null] = js.undefined
}

object IClientEventsSubscribeRequest {
  @scala.inline
  def apply(lastKnownBlockIds: js.Array[String] = null, subscriptions: js.Array[IEventSubscription] = null): IClientEventsSubscribeRequest = {
    val __obj = js.Dynamic.literal()
    if (lastKnownBlockIds != null) __obj.updateDynamic("lastKnownBlockIds")(lastKnownBlockIds.asInstanceOf[js.Any])
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientEventsSubscribeRequest]
  }
}

