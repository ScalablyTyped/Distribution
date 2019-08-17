package typings.semanticDashUiDashTab.SemanticUINs.TabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettingsNs {
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.api
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.method
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.missingTab
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.noContent
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.path
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.recursion
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.state
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, api | method | missingTab | noContent | path | recursion | state]) with (Partial[Pick[_Impl, api | method | missingTab | noContent | path | recursion | state]])
}
