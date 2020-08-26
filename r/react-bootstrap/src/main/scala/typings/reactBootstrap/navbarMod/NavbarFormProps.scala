package typings.reactBootstrap.navbarMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarFormProps
  extends AllHTMLAttributes[NavbarForm]
     with ClassAttributes[NavbarForm] {
  var componentClass: js.UndefOr[ReactType[_]] = js.native
  var pullLeft: js.UndefOr[Boolean] = js.native
  var pullRight: js.UndefOr[Boolean] = js.native
}

object NavbarFormProps {
  @scala.inline
  def apply(): NavbarFormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavbarFormProps]
  }
  @scala.inline
  implicit class NavbarFormPropsOps[Self <: NavbarFormProps] (val x: Self) extends AnyVal {
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
    def setComponentClass(value: ReactType[_]): Self = this.set("componentClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentClass: Self = this.set("componentClass", js.undefined)
    @scala.inline
    def setPullLeft(value: Boolean): Self = this.set("pullLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullLeft: Self = this.set("pullLeft", js.undefined)
    @scala.inline
    def setPullRight(value: Boolean): Self = this.set("pullRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRight: Self = this.set("pullRight", js.undefined)
  }
  
}

