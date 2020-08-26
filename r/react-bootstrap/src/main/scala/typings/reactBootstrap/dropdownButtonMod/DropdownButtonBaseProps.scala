package typings.reactBootstrap.dropdownButtonMod

import typings.react.mod.ReactNode
import typings.reactBootstrap.dropdownMod.DropdownBaseProps
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownButtonBaseProps extends DropdownBaseProps {
  var block: js.UndefOr[Boolean] = js.native
  var bsSize: js.UndefOr[Sizes] = js.native
  var bsStyle: js.UndefOr[String | Null] = js.native
  var navItem: js.UndefOr[Boolean] = js.native
  var noCaret: js.UndefOr[Boolean] = js.native
  var title: ReactNode = js.native
}

object DropdownButtonBaseProps {
  @scala.inline
  def apply(id: String): DropdownButtonBaseProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownButtonBaseProps]
  }
  @scala.inline
  implicit class DropdownButtonBasePropsOps[Self <: DropdownButtonBaseProps] (val x: Self) extends AnyVal {
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
    def setBlock(value: Boolean): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    @scala.inline
    def setBsSize(value: Sizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    @scala.inline
    def setBsStyle(value: String): Self = this.set("bsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsStyle: Self = this.set("bsStyle", js.undefined)
    @scala.inline
    def setBsStyleNull: Self = this.set("bsStyle", null)
    @scala.inline
    def setNavItem(value: Boolean): Self = this.set("navItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavItem: Self = this.set("navItem", js.undefined)
    @scala.inline
    def setNoCaret(value: Boolean): Self = this.set("noCaret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoCaret: Self = this.set("noCaret", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

