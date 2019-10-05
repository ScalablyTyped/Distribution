package typings.semanticDashUiDashSidebar.SemanticUI.Sidebar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettings {
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.method
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.movedSidebar
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.notFound
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.overlay
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.pusher
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, method | pusher | movedSidebar | overlay | notFound]) with (Partial[Pick[_Impl, method | pusher | movedSidebar | overlay | notFound]])
}
