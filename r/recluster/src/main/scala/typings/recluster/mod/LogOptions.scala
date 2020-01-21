package typings.recluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogOptions extends js.Object {
  var respawns: js.UndefOr[Boolean] = js.undefined
}

object LogOptions {
  @scala.inline
  def apply(respawns: js.UndefOr[Boolean] = js.undefined): LogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(respawns)) __obj.updateDynamic("respawns")(respawns.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogOptions]
  }
}

