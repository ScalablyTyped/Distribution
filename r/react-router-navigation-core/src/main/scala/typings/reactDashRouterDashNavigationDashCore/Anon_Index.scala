package typings.reactDashRouterDashNavigationDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var key: String
  var onIndexChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply(key: String, onIndexChange: /* index */ Double => Unit = null): Anon_Index = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (onIndexChange != null) __obj.updateDynamic("onIndexChange")(js.Any.fromFunction1(onIndexChange))
    __obj.asInstanceOf[Anon_Index]
  }
}

