package typings
package reactDashRouterDashNavigationDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var key: java.lang.String
  var onIndexChange: js.UndefOr[js.Function1[/* index */ scala.Double, scala.Unit]] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply(key: java.lang.String, onIndexChange: /* index */ scala.Double => scala.Unit = null): Anon_Index = {
    val __obj = js.Dynamic.literal(key = key)
    if (onIndexChange != null) __obj.updateDynamic("onIndexChange")(js.Any.fromFunction1(onIndexChange))
    __obj.asInstanceOf[Anon_Index]
  }
}

