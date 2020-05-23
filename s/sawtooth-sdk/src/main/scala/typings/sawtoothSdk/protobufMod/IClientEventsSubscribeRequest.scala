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
  def apply(
    lastKnownBlockIds: js.UndefOr[Null | js.Array[String]] = js.undefined,
    subscriptions: js.UndefOr[Null | js.Array[IEventSubscription]] = js.undefined
  ): IClientEventsSubscribeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lastKnownBlockIds)) __obj.updateDynamic("lastKnownBlockIds")(lastKnownBlockIds.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriptions)) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientEventsSubscribeRequest]
  }
}

