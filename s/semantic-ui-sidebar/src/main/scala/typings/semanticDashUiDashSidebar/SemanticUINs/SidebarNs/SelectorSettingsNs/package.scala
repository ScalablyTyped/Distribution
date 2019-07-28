package typings.semanticDashUiDashSidebar.SemanticUINs.SidebarNs

import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.fixed
import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.omitted
import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.pusher
import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.sidebar
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettingsNs {
  type Param = (Pick[_Impl, fixed | omitted | pusher | sidebar]) with (Partial[Pick[_Impl, fixed | omitted | pusher | sidebar]])
}
