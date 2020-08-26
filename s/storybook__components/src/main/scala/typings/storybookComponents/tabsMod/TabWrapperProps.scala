package typings.storybookComponents.tabsMod

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabWrapperProps extends js.Object {
  var active: Boolean = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var render: js.UndefOr[js.Function0[Element]] = js.native
}

object TabWrapperProps {
  @scala.inline
  def apply(active: Boolean): TabWrapperProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabWrapperProps]
  }
  @scala.inline
  implicit class TabWrapperPropsOps[Self <: TabWrapperProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setRender(value: () => Element): Self = this.set("render", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
  
}

