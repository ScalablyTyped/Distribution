package typings.rbx.panelBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBlockModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
}

object PanelBlockModifierProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined): PanelBlockModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelBlockModifierProps]
  }
}

