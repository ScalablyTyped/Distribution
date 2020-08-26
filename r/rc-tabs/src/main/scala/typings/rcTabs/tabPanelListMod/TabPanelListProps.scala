package typings.rcTabs.tabPanelListMod

import typings.rcTabs.interfaceMod.AnimatedConfig
import typings.rcTabs.interfaceMod.TabPosition
import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabPanelListProps extends js.Object {
  var activeKey: Key = js.native
  var animated: js.UndefOr[AnimatedConfig] = js.native
  var destroyInactiveTabPane: js.UndefOr[Boolean] = js.native
  var id: String = js.native
  var rtl: Boolean = js.native
  var tabPosition: js.UndefOr[TabPosition] = js.native
}

object TabPanelListProps {
  @scala.inline
  def apply(activeKey: Key, id: String, rtl: Boolean): TabPanelListProps = {
    val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabPanelListProps]
  }
  @scala.inline
  implicit class TabPanelListPropsOps[Self <: TabPanelListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveKey(value: Key): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimated(value: AnimatedConfig): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setDestroyInactiveTabPane(value: Boolean): Self = this.set("destroyInactiveTabPane", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyInactiveTabPane: Self = this.set("destroyInactiveTabPane", js.undefined)
    @scala.inline
    def setTabPosition(value: TabPosition): Self = this.set("tabPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabPosition: Self = this.set("tabPosition", js.undefined)
  }
  
}

