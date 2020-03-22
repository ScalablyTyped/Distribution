package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/panel/components/tabs/components/tab.js
trait PanelTabsTabModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
}

object PanelTabsTabModifierProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined): PanelTabsTabModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelTabsTabModifierProps]
  }
}

