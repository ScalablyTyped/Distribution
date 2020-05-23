package typings.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeOptions extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var waitForAuth: js.UndefOr[Boolean] = js.undefined
}

object SubscribeOptions {
  @scala.inline
  def apply(
    data: js.Any = null,
    priority: js.UndefOr[Double] = js.undefined,
    waitForAuth: js.UndefOr[Boolean] = js.undefined
  ): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForAuth)) __obj.updateDynamic("waitForAuth")(waitForAuth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeOptions]
  }
}

