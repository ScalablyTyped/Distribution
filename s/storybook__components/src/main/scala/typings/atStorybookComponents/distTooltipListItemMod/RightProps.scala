package typings.atStorybookComponents.distTooltipListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RightProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
}

object RightProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined): RightProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    __obj.asInstanceOf[RightProps]
  }
}

