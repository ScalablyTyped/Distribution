package typings.reactOnsenui.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabbarRenderTab extends js.Object {
  var content: Element = js.native
  var tab: Element = js.native
}

object TabbarRenderTab {
  @scala.inline
  def apply(content: Element, tab: Element): TabbarRenderTab = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbarRenderTab]
  }
  @scala.inline
  implicit class TabbarRenderTabOps[Self <: TabbarRenderTab] (val x: Self) extends AnyVal {
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
    def setContent(value: Element): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setTab(value: Element): Self = this.set("tab", value.asInstanceOf[js.Any])
  }
  
}

