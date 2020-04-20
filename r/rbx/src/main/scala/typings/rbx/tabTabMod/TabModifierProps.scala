package typings.rbx.tabTabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
}

object TabModifierProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined): TabModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabModifierProps]
  }
}

