package typings.reactNativeScrollableTabView.anon

import typings.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabLabel extends js.Object {
  var tabLabel: ReactChild = js.native
}

object TabLabel {
  @scala.inline
  def apply(tabLabel: ReactChild): TabLabel = {
    val __obj = js.Dynamic.literal(tabLabel = tabLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabLabel]
  }
  @scala.inline
  implicit class TabLabelOps[Self <: TabLabel] (val x: Self) extends AnyVal {
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
    def setTabLabel(value: ReactChild): Self = this.set("tabLabel", value.asInstanceOf[js.Any])
  }
  
}

