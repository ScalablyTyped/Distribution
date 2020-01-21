package typings.reactDates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocused extends js.Object {
  var focused: Boolean | Null
}

object AnonFocused {
  @scala.inline
  def apply(focused: js.UndefOr[Boolean] = js.undefined): AnonFocused = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocused]
  }
}

