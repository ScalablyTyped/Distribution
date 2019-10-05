package typings.semanticDashUiDashTab.SemanticUI.Tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.active
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.loading
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, loading | active]) with (Partial[Pick[_Impl, loading | active]])
}
