package typings.reactMdl.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any]
     with CustomRenderedComponent {
  var active: js.UndefOr[Boolean] = js.native
  var cssPrefix: js.UndefOr[String] = js.native
  var onTabClick: js.UndefOr[js.Function1[/* tabId */ Double, _]] = js.native
  var tabId: js.UndefOr[Double] = js.native
}

object TabProps {
  @scala.inline
  def apply(): TabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabProps]
  }
  @scala.inline
  implicit class TabPropsOps[Self <: TabProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCssPrefix(value: String): Self = this.set("cssPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssPrefix: Self = this.set("cssPrefix", js.undefined)
    @scala.inline
    def setOnTabClick(value: /* tabId */ Double => _): Self = this.set("onTabClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTabClick: Self = this.set("onTabClick", js.undefined)
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
  }
  
}

