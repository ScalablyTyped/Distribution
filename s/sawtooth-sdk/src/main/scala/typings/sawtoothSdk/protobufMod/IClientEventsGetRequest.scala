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
  def apply(
    blockIds: js.UndefOr[Null | js.Array[String]] = js.undefined,
    subscriptions: js.UndefOr[Null | js.Array[IEventSubscription]] = js.undefined
  ): IClientEventsGetRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockIds)) __obj.updateDynamic("blockIds")(blockIds.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriptions)) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientEventsGetRequest]
  }
}

