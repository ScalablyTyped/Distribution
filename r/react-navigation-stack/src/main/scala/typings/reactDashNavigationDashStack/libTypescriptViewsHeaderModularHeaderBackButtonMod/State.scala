package typings.reactDashNavigationDashStack.libTypescriptViewsHeaderModularHeaderBackButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var initialTextWidth: js.UndefOr[Double] = js.undefined
}

object State {
  @scala.inline
  def apply(initialTextWidth: Int | Double = null): State = {
    val __obj = js.Dynamic.literal()
    if (initialTextWidth != null) __obj.updateDynamic("initialTextWidth")(initialTextWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

