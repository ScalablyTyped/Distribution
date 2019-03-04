package typings
package reactDashSortableDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreCollapsed extends js.Object {
  var ignoreCollapsed: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IgnoreCollapsed {
  @scala.inline
  def apply(ignoreCollapsed: js.UndefOr[scala.Boolean] = js.undefined): Anon_IgnoreCollapsed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed)
    __obj.asInstanceOf[Anon_IgnoreCollapsed]
  }
}

