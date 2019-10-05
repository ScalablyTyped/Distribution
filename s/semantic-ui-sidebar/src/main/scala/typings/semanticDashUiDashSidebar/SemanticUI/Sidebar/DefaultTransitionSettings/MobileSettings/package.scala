package typings.semanticDashUiDashSidebar.SemanticUI.Sidebar.DefaultTransitionSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MobileSettings {
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.bottom
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.left
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.right
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.top
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    typings.semanticDashUiDashSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings._Impl, 
    left | right | top | bottom
  ]) with (Partial[
    Pick[
      typings.semanticDashUiDashSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings._Impl, 
      left | right | top | bottom
    ]
  ])
}
