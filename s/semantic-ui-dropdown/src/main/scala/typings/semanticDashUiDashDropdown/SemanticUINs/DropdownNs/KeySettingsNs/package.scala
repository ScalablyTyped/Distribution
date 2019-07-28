package typings.semanticDashUiDashDropdown.SemanticUINs.DropdownNs

import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.backspace
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.deleteKey
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.delimiter
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.downArrow
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.enter
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.escape
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.leftArrow
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.pageDown
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.pageUp
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.rightArrow
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.upArrow
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KeySettingsNs {
  type Param = (Pick[
    _Impl, 
    backspace | delimiter | deleteKey | enter | escape | pageUp | pageDown | leftArrow | upArrow | rightArrow | downArrow
  ]) with (Partial[
    Pick[
      _Impl, 
      backspace | delimiter | deleteKey | enter | escape | pageUp | pageDown | leftArrow | upArrow | rightArrow | downArrow
    ]
  ])
}
