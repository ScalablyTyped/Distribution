package typings.semanticDashUiDashDropdown.SemanticUI.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.addition
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.dropdown
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.icon
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.input
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.item
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.label
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.menu
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.menuIcon
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.message
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.remove
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.search
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.siblingLabel
  import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.text
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    addition | dropdown | icon | input | item | label | remove | siblingLabel | menu | message | menuIcon | search | text
  ]) with (Partial[
    Pick[
      _Impl, 
      addition | dropdown | icon | input | item | label | remove | siblingLabel | menu | message | menuIcon | search | text
    ]
  ])
}
