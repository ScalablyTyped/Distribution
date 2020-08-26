package typings.reactNavigationDrawer.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerLabelProps extends js.Object {
  var focused: Boolean = js.native
  var tintColor: js.UndefOr[String] = js.native
}

object DrawerLabelProps {
  @scala.inline
  def apply(focused: Boolean): DrawerLabelProps = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLabelProps]
  }
  @scala.inline
  implicit class DrawerLabelPropsOps[Self <: DrawerLabelProps] (val x: Self) extends AnyVal {
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
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
  }
  
}

