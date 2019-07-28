package typings.reactDashWidgets.libCommonPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFocus extends js.Object {
  /**
    * Pass focus to component when it mounts.
    */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
}

object AutoFocus {
  @scala.inline
  def apply(autoFocus: js.UndefOr[Boolean] = js.undefined): AutoFocus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    __obj.asInstanceOf[AutoFocus]
  }
}

