package typings.roxDashBrowser.roxDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoxFlagOptions extends js.Object {
  var freeze: js.UndefOr[RoxFlagFreezeLevel] = js.undefined
}

object RoxFlagOptions {
  @scala.inline
  def apply(freeze: RoxFlagFreezeLevel = null): RoxFlagOptions = {
    val __obj = js.Dynamic.literal()
    if (freeze != null) __obj.updateDynamic("freeze")(freeze.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoxFlagOptions]
  }
}

