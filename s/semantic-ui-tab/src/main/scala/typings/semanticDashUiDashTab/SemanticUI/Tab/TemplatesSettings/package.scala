package typings.semanticDashUiDashTab.SemanticUI.Tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TemplatesSettings {
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.determineTitle
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, determineTitle]) with (Partial[Pick[_Impl, String]])
}
