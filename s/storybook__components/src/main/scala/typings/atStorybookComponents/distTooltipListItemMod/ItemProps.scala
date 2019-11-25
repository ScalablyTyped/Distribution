package typings.atStorybookComponents.distTooltipListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
}

object ItemProps {
  @scala.inline
  def apply(disabled: js.UndefOr[Boolean] = js.undefined): ItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemProps]
  }
}

