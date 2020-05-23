package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl>> */
trait PartialPickImplkeyofImplComputer extends js.Object {
  var computer: js.UndefOr[ComputerSettings] = js.undefined
  var mobile: js.UndefOr[MobileSettings] = js.undefined
}

object PartialPickImplkeyofImplComputer {
  @scala.inline
  def apply(computer: ComputerSettings = null, mobile: MobileSettings = null): PartialPickImplkeyofImplComputer = {
    val __obj = js.Dynamic.literal()
    if (computer != null) __obj.updateDynamic("computer")(computer.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplComputer]
  }
}

