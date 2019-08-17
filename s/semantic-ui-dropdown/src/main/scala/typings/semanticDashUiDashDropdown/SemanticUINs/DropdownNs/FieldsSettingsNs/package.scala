package typings.semanticDashUiDashDropdown.SemanticUINs.DropdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FieldsSettingsNs {
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.name
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.remoteValues
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.value
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.values
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, remoteValues | values | name | value]) with (Partial[Pick[_Impl, remoteValues | values | name | value]])
}
