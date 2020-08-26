package typings.reactBootstrap.tabContainerMod

import typings.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabContainerProps extends HTMLAttributes[TabContainer] {
  var activeKey: js.UndefOr[js.Any] = js.native
  var defaultActiveKey: js.UndefOr[js.Any] = js.native
  var generateChildId: js.UndefOr[js.Function2[/* eventKey */ js.Any, /* type */ js.Any, String]] = js.native
}

object TabContainerProps {
  @scala.inline
  def apply(): TabContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabContainerProps]
  }
  @scala.inline
  implicit class TabContainerPropsOps[Self <: TabContainerProps] (val x: Self) extends AnyVal {
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
    def setActiveKey(value: js.Any): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
    @scala.inline
    def setDefaultActiveKey(value: js.Any): Self = this.set("defaultActiveKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultActiveKey: Self = this.set("defaultActiveKey", js.undefined)
    @scala.inline
    def setGenerateChildId(value: (/* eventKey */ js.Any, /* type */ js.Any) => String): Self = this.set("generateChildId", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGenerateChildId: Self = this.set("generateChildId", js.undefined)
  }
  
}

