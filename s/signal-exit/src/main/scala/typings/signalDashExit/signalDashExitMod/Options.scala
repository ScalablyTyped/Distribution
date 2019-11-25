package typings.signalDashExit.signalDashExitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var alwaysLast: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(alwaysLast: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysLast)) __obj.updateDynamic("alwaysLast")(alwaysLast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

