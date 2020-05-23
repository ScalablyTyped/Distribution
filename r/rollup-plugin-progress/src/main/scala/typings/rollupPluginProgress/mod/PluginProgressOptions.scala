package typings.rollupPluginProgress.mod

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
    if (!js.isUndefined(clearLine)) __obj.updateDynamic("clearLine")(clearLine.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginProgressOptions]
  }
}

