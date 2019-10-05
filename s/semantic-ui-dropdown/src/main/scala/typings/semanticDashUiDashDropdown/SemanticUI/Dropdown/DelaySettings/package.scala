package typings.semanticDashUiDashDropdown.SemanticUI.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DelaySettings {
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.hide
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.search
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.show
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.touch
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, hide | show | search | touch]) with (Partial[Pick[_Impl, hide | show | search | touch]])
}
