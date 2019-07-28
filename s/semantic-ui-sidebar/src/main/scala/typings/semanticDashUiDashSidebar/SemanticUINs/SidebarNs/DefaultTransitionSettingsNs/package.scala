package typings.semanticDashUiDashSidebar.SemanticUINs.SidebarNs

import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.computer
import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.mobile
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DefaultTransitionSettingsNs {
  type ComputerSettings = typings.semanticDashUiDashSidebar.SemanticUINs.SidebarNs.DefaultTransitionSettingsNs.ComputerSettingsNs.Param
  type MobileSettings = typings.semanticDashUiDashSidebar.SemanticUINs.SidebarNs.DefaultTransitionSettingsNs.MobileSettingsNs.Param
  type Param = (Pick[_Impl, computer | mobile]) with (Partial[Pick[_Impl, computer | mobile]])
}
