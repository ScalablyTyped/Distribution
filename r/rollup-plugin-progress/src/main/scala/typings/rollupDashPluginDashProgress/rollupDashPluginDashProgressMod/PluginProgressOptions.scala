package typings.rollupDashPluginDashProgress.rollupDashPluginDashProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginProgressOptions extends js.Object {
  var clearLine: js.UndefOr[Boolean] = js.undefined
}

object PluginProgressOptions {
  @scala.inline
  def apply(clearLine: js.UndefOr[Boolean] = js.undefined): PluginProgressOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearLine)) __obj.updateDynamic("clearLine")(clearLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginProgressOptions]
  }
}

