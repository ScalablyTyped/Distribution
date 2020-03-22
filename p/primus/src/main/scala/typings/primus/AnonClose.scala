package typings.primus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClose extends js.Object {
  var close: js.UndefOr[Boolean] = js.undefined
  var reconnect: Boolean
  var timeout: Double
}

object AnonClose {
  @scala.inline
  def apply(reconnect: Boolean, timeout: Double, close: js.UndefOr[Boolean] = js.undefined): AnonClose = {
    val __obj = js.Dynamic.literal(reconnect = reconnect.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClose]
  }
}

