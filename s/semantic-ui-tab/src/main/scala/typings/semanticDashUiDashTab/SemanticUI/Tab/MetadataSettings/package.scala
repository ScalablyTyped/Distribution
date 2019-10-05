package typings.semanticDashUiDashTab.SemanticUI.Tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MetadataSettings {
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.loaded
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.promise
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.tab
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, tab | loaded | promise]) with (Partial[Pick[_Impl, tab | loaded | promise]])
}
