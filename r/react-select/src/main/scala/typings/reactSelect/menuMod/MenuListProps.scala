package typings.reactSelect.menuMod

import typings.react.mod.ReactNode
import typings.reactSelect.typesMod.InnerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuListProps extends js.Object {
  /** The children to be rendered. */
  var children: ReactNode = js.native
  /** Inner ref to DOM Node */
  var innerRef: InnerRef = js.native
}

object MenuListProps {
  @scala.inline
  def apply(): MenuListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuListProps]
  }
  @scala.inline
  implicit class MenuListPropsOps[Self <: MenuListProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: InnerRef): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
  }
  
}

