package typings.reactMdl.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
  var fixedDrawer: js.UndefOr[Boolean] = js.native
  var fixedHeader: js.UndefOr[Boolean] = js.native
  var fixedTabs: js.UndefOr[Boolean] = js.native
}

object LayoutProps {
  @scala.inline
  def apply(): LayoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutProps]
  }
  @scala.inline
  implicit class LayoutPropsOps[Self <: LayoutProps] (val x: Self) extends AnyVal {
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
    def setFixedDrawer(value: Boolean): Self = this.set("fixedDrawer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedDrawer: Self = this.set("fixedDrawer", js.undefined)
    @scala.inline
    def setFixedHeader(value: Boolean): Self = this.set("fixedHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedHeader: Self = this.set("fixedHeader", js.undefined)
    @scala.inline
    def setFixedTabs(value: Boolean): Self = this.set("fixedTabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedTabs: Self = this.set("fixedTabs", js.undefined)
  }
  
}

