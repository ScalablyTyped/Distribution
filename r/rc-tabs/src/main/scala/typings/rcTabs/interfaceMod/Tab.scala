package typings.rcTabs.interfaceMod

import typings.rcTabs.tabPaneMod.TabPaneProps
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tab extends TabPaneProps {
  var key: String = js.native
  var node: ReactElement = js.native
}

object Tab {
  @scala.inline
  def apply(key: String, node: ReactElement): Tab = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
  @scala.inline
  implicit class TabOps[Self <: Tab] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: ReactElement): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

