package typings.atStorybookComponents.distTooltipListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CenterTextProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
}

object CenterTextProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined, disabled: js.UndefOr[Boolean] = js.undefined): CenterTextProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[CenterTextProps]
  }
}

