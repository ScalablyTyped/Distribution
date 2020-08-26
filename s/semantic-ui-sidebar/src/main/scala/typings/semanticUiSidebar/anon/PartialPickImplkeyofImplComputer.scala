package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplComputer extends js.Object {
  var computer: js.UndefOr[ComputerSettings] = js.native
  var mobile: js.UndefOr[MobileSettings] = js.native
}

object PartialPickImplkeyofImplComputer {
  @scala.inline
  def apply(): PartialPickImplkeyofImplComputer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplComputer]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplComputerOps[Self <: PartialPickImplkeyofImplComputer] (val x: Self) extends AnyVal {
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
    def deleteComputer: Self = this.set("computer", js.undefined)
    @scala.inline
    def setMobile(value: MobileSettings): Self = this.set("mobile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
  }
  
}

