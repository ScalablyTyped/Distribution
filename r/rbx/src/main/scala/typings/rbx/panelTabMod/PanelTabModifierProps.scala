package typings.rbx.panelTabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelTabModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
}

object PanelTabModifierProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined): PanelTabModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelTabModifierProps]
  }
}

