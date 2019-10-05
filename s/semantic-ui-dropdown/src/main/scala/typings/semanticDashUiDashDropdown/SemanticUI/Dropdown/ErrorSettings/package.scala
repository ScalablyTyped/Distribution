package typings.semanticDashUiDashDropdown.SemanticUI.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettings {
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.action
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.alreadySetup
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.labels
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.method
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.noTransition
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, action | alreadySetup | labels | method | noTransition]) with (Partial[Pick[_Impl, action | alreadySetup | labels | method | noTransition]])
}
