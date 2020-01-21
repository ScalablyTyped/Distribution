package typings.reactNativeMaterialUi.mod

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
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightElementPressEvent]
  }
}

