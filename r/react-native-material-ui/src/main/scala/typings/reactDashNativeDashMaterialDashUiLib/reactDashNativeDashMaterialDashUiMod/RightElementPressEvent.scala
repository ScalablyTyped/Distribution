package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RightElementPressEvent extends js.Object {
  var action: java.lang.String
  var index: scala.Double
  var result: js.UndefOr[js.Any] = js.undefined
}

object RightElementPressEvent {
  @scala.inline
  def apply(action: java.lang.String, index: scala.Double, result: js.Any = null): RightElementPressEvent = {
    val __obj = js.Dynamic.literal(action = action, index = index)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[RightElementPressEvent]
  }
}

