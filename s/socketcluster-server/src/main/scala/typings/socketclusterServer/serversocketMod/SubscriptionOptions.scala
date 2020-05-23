package typings.socketclusterServer.serversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionOptions extends js.Object {
  var channel: String
  var data: js.UndefOr[js.Any] = js.undefined
  var waitForAuth: js.UndefOr[Boolean] = js.undefined
}

object SubscriptionOptions {
  @scala.inline
  def apply(channel: String, data: js.Any = null, waitForAuth: js.UndefOr[Boolean] = js.undefined): SubscriptionOptions = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForAuth)) __obj.updateDynamic("waitForAuth")(waitForAuth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOptions]
  }
}

