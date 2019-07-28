package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RightElementPressEvent extends js.Object {
  var action: String
  var index: Double
  var result: js.UndefOr[js.Any] = js.undefined
}

object RightElementPressEvent {
  @scala.inline
  def apply(action: String, index: Double, result: js.Any = null): RightElementPressEvent = {
    val __obj = js.Dynamic.literal(action = action, index = index)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[RightElementPressEvent]
  }
}

