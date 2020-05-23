package typings.primus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reconnect extends js.Object {
  var reconnect: js.UndefOr[Boolean] = js.undefined
}

object Reconnect {
  @scala.inline
  def apply(reconnect: js.UndefOr[Boolean] = js.undefined): Reconnect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reconnect)) __obj.updateDynamic("reconnect")(reconnect.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reconnect]
  }
}

