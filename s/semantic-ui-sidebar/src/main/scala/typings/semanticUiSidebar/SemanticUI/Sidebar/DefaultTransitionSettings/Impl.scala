package typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  var computer: ComputerSettings = js.native
  var mobile: MobileSettings = js.native
}

object Impl {
  @scala.inline
  def apply(computer: ComputerSettings, mobile: MobileSettings): Impl = {
    val __obj = js.Dynamic.literal(computer = computer.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def setComputer(value: ComputerSettings): Self = this.set("computer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMobile(value: MobileSettings): Self = this.set("mobile", value.asInstanceOf[js.Any])
  }
  
}

