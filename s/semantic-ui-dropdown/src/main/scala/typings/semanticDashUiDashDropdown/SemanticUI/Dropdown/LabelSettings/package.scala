package typings.semanticDashUiDashDropdown.SemanticUI.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object LabelSettings {
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.duration
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.transition
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.variation
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, transition | duration | variation]) with (Partial[Pick[_Impl, transition | duration | variation]])
}
