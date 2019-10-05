package typings.semanticDashUiDashDropdown.SemanticUI.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MetadataSettings {
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.defaultText
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.defaultValue
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.placeholderText
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.text
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.value
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, defaultText | defaultValue | placeholderText | text | value]) with (Partial[Pick[_Impl, defaultText | defaultValue | placeholderText | text | value]])
}
