package typings
package reactDashBreadcrumbsDashDynamicLib.reactDashBreadcrumbsDashDynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbsProviderProps extends js.Object {
  var shouldBreadcrumbsUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object BreadcrumbsProviderProps {
  @scala.inline
  def apply(shouldBreadcrumbsUpdate: js.Function1[/* repeated */ js.Any, _] = null): BreadcrumbsProviderProps = {
    val __obj = js.Dynamic.literal()
    if (shouldBreadcrumbsUpdate != null) __obj.updateDynamic("shouldBreadcrumbsUpdate")(shouldBreadcrumbsUpdate)
    __obj.asInstanceOf[BreadcrumbsProviderProps]
  }
}

