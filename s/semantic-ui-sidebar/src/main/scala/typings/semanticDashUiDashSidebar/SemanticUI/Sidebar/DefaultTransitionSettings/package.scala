package typings.semanticDashUiDashSidebar.SemanticUI.Sidebar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DefaultTransitionSettings {
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.computer
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.mobile
  import typings.std.Partial
  import typings.std.Pick

  type ComputerSettings = typings.semanticDashUiDashSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings.Param
  type MobileSettings = typings.semanticDashUiDashSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings.Param
  type Param = (Pick[_Impl, computer | mobile]) with (Partial[Pick[_Impl, computer | mobile]])
}
