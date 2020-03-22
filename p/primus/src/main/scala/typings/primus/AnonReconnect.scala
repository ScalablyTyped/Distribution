package typings.primus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReconnect extends js.Object {
  var reconnect: js.UndefOr[Boolean] = js.undefined
}

object AnonReconnect {
  @scala.inline
  def apply(reconnect: js.UndefOr[Boolean] = js.undefined): AnonReconnect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reconnect)) __obj.updateDynamic("reconnect")(reconnect.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReconnect]
  }
}

