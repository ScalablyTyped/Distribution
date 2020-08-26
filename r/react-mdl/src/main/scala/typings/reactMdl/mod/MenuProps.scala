package typings.reactMdl.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any]
     with RippleComponent {
  var align: js.UndefOr[String] = js.native
  @JSName("target")
  var target_MenuProps: String = js.native
  var valign: js.UndefOr[String] = js.native
}

object MenuProps {
  @scala.inline
  def apply(target: String): MenuProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
  @scala.inline
  implicit class MenuPropsOps[Self <: MenuProps] (val x: Self) extends AnyVal {
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
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setValign(value: String): Self = this.set("valign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValign: Self = this.set("valign", js.undefined)
  }
  
}

