package typings.rbx.listItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
}

object ListItemModifierProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined): ListItemModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemModifierProps]
  }
}

