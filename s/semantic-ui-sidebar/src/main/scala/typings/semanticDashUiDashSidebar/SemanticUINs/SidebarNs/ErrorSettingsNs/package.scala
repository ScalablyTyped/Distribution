package typings.semanticDashUiDashSidebar.SemanticUINs.SidebarNs

import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.method
import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.movedSidebar
import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.notFound
import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.overlay
import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.pusher
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettingsNs {
  type Param = (Pick[_Impl, method | pusher | movedSidebar | overlay | notFound]) with (Partial[Pick[_Impl, method | pusher | movedSidebar | overlay | notFound]])
}
