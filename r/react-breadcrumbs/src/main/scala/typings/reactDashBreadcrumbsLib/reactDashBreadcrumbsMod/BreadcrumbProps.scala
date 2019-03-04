package typings
package reactDashBreadcrumbsLib.reactDashBreadcrumbsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps extends js.Object {
  var data: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState] with reactDashBreadcrumbsLib.Anon_Title
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(
    data: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState] with reactDashBreadcrumbsLib.Anon_Title,
    hidden: js.UndefOr[scala.Boolean] = js.undefined
  ): BreadcrumbProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    __obj.asInstanceOf[BreadcrumbProps]
  }
}

