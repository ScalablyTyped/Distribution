package typings.reactBootstrapTypeahead.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.li
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseMenuItemProps
  extends AllHTMLAttributes[li]
     with ClassAttributes[li] {
  var active: js.UndefOr[Boolean] = js.native
}

object BaseMenuItemProps {
  @scala.inline
  def apply(): BaseMenuItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseMenuItemProps]
  }
  @scala.inline
  implicit class BaseMenuItemPropsOps[Self <: BaseMenuItemProps] (val x: Self) extends AnyVal {
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
  }
  
}

