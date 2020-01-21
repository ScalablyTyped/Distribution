package typings.reactRouterNavigationCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var key: String
  var onIndexChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
}

object AnonIndex {
  @scala.inline
  def apply(key: String, onIndexChange: /* index */ Double => Unit = null): AnonIndex = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (onIndexChange != null) __obj.updateDynamic("onIndexChange")(js.Any.fromFunction1(onIndexChange))
    __obj.asInstanceOf[AnonIndex]
  }
}

