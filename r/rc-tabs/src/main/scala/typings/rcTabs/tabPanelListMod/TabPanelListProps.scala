package typings.rcTabs.tabPanelListMod

import typings.rcTabs.interfaceMod.AnimatedConfig
import typings.rcTabs.interfaceMod.TabPosition
import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabPanelListProps extends js.Object {
  var activeKey: Key
  var animated: js.UndefOr[AnimatedConfig] = js.undefined
  var destroyInactiveTabPane: js.UndefOr[Boolean] = js.undefined
  var id: String
  var rtl: Boolean
  var tabPosition: js.UndefOr[TabPosition] = js.undefined
}

object TabPanelListProps {
  @scala.inline
  def apply(
    activeKey: Key,
    id: String,
    rtl: Boolean,
    animated: AnimatedConfig = null,
    destroyInactiveTabPane: js.UndefOr[Boolean] = js.undefined,
    tabPosition: TabPosition = null
  ): TabPanelListProps = {
    val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any])
    if (animated != null) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyInactiveTabPane)) __obj.updateDynamic("destroyInactiveTabPane")(destroyInactiveTabPane.get.asInstanceOf[js.Any])
    if (tabPosition != null) __obj.updateDynamic("tabPosition")(tabPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabPanelListProps]
  }
}

