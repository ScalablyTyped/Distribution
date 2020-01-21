package typings.reactBreadcrumbsDynamic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbsProviderProps extends js.Object {
  var shouldBreadcrumbsUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object BreadcrumbsProviderProps {
  @scala.inline
  def apply(shouldBreadcrumbsUpdate: /* repeated */ js.Any => _ = null): BreadcrumbsProviderProps = {
    val __obj = js.Dynamic.literal()
    if (shouldBreadcrumbsUpdate != null) __obj.updateDynamic("shouldBreadcrumbsUpdate")(js.Any.fromFunction1(shouldBreadcrumbsUpdate))
    __obj.asInstanceOf[BreadcrumbsProviderProps]
  }
}

