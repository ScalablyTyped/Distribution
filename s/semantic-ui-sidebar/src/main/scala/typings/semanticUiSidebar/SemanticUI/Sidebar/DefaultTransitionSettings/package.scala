package typings.semanticUiSidebar.SemanticUI.Sidebar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DefaultTransitionSettings {
  type ComputerSettings = typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings.Param
  type MobileSettings = typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings.Param
  type Param = (typings.std.Pick[
    typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.Impl, 
    typings.semanticUiSidebar.semanticUiSidebarStrings.computer | typings.semanticUiSidebar.semanticUiSidebarStrings.mobile
  ]) with (typings.std.Partial[
    typings.std.Pick[
      typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.Impl, 
      typings.semanticUiSidebar.semanticUiSidebarStrings.computer | typings.semanticUiSidebar.semanticUiSidebarStrings.mobile
    ]
  ])
}
