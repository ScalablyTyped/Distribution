package typings.semanticDashUiDashTab.SemanticUI.Tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.parent
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.tabs
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, tabs | parent]) with (Partial[Pick[_Impl, tabs | parent]])
}
