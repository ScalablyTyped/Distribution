package typings.semanticDashUiDashSidebar.SemanticUI.Sidebar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RegExpSettings {
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.ios
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.mobile
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, ios | mobile]) with (Partial[Pick[_Impl, ios | mobile]])
}
