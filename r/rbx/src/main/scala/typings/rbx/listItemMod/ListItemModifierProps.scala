package typings.rbx.listItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
}

object ListItemModifierProps {
  @scala.inline
  def apply(): ListItemModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemModifierProps]
  }
  @scala.inline
  implicit class ListItemModifierPropsOps[Self <: ListItemModifierProps] (val x: Self) extends AnyVal {
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

