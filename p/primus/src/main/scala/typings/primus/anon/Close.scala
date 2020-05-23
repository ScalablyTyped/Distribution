package typings.primus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Close extends js.Object {
  var close: js.UndefOr[Boolean] = js.undefined
  var reconnect: Boolean
  var timeout: Double
}

object Close {
  @scala.inline
  def apply(reconnect: Boolean, timeout: Double, close: js.UndefOr[Boolean] = js.undefined): Close = {
    val __obj = js.Dynamic.literal(reconnect = reconnect.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
}

