package typings.storybookAddonA11y.tabsMod

import typings.storybookAddonA11y.anon.Items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsProps extends js.Object {
  var tabs: js.Array[Items] = js.native
}

object TabsProps {
  @scala.inline
  def apply(tabs: js.Array[Items]): TabsProps = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
  @scala.inline
  implicit class TabsPropsOps[Self <: TabsProps] (val x: Self) extends AnyVal {
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
    def setTabsVarargs(value: Items*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[Items]): Self = this.set("tabs", value.asInstanceOf[js.Any])
  }
  
}

