package typings.semanticDashUiDashSidebar.SemanticUINs.SidebarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettingsNs {
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.active
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.animating
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.bottom
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.dimmed
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.ios
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.left
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.pushable
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.pushed
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.right
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.top
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.visible
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    active | animating | dimmed | ios | pushable | pushed | right | top | left | bottom | visible
  ]) with (Partial[
    Pick[
      _Impl, 
      active | animating | dimmed | ios | pushable | pushed | right | top | left | bottom | visible
    ]
  ])
}
