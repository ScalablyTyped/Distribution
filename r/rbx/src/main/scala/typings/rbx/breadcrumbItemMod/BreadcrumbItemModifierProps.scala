package typings.rbx.breadcrumbItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbItemModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
}

object BreadcrumbItemModifierProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined): BreadcrumbItemModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbItemModifierProps]
  }
}

