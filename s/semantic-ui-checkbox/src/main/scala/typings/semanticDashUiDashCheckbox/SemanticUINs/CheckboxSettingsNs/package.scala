package typings.semanticDashUiDashCheckbox.SemanticUINs

import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.beforeChecked
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.beforeDeterminate
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.beforeIndeterminate
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.beforeUnchecked
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.className
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.debug
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.error
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.fireOnInit
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.name
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.namespace
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onChange
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onChecked
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onDeterminate
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onDisable
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onDisabled
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onEnable
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onEnabled
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onIndeterminate
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onUnchecked
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.performance
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.selector
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.silent
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.uncheckable
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.verbose
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CheckboxSettingsNs {
  type Param = (Pick[
    _Impl, 
    uncheckable | fireOnInit | onChange | onChecked | onIndeterminate | onDeterminate | onUnchecked | beforeChecked | beforeIndeterminate | beforeDeterminate | beforeUnchecked | onEnable | onDisable | onEnabled | onDisabled | selector | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      uncheckable | fireOnInit | selector | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
