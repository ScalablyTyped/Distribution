package typings.semanticUiCheckbox.SemanticUI

import typings.semanticUiCheckbox.JQuery
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`attach events`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`can change`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`can uncheck`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`is checked`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`is radio`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`is unchecked`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`set checked`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`set determinate`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`set disabled`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`set enabled`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`set indeterminate`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`set unchecked`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow check`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow determinate`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow indeterminate`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow uncheck`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.check
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.destroy
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.determinate
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.enable
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.indeterminate
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.setting
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.toggle
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.uncheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checkbox_ extends js.Object {
  var settings: CheckboxSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Attach checkbox events to another element
    */
  def apply(behavior: `attach events`, selector: String): JQuery = js.native
  def apply(behavior: `attach events`, selector: String, event: String): JQuery = js.native
  def apply(behavior: `attach events`, selector: JQuery): JQuery = js.native
  def apply(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
  /**
    * Returns whether element is able to be changed
    */
  def apply(behavior: `can change`): Boolean = js.native
  /**
    * Returns whether element is able to be unchecked
    */
  def apply(behavior: `can uncheck`): Boolean = js.native
  /**
    * Returns whether element is currently checked
    */
  def apply(behavior: `is checked`): Boolean = js.native
  /**
    * Returns whether element is radio selection
    */
  def apply(behavior: `is radio`): Boolean = js.native
  /**
    * Returns whether element is not checked
    */
  def apply(behavior: `is unchecked`): Boolean = js.native
  /**
    * Set a checkbox state to checked without callbacks
    */
  def apply(behavior: `set checked`): JQuery = js.native
  /**
    * Set as determinate checkbox without callbacks
    */
  def apply(behavior: `set determinate`): JQuery = js.native
  /**
    * Disable interaction with a checkbox without callbacks
    */
  def apply(behavior: `set disabled`): JQuery = js.native
  /**
    * Enable interaction with a checkbox without callbacks
    */
  def apply(behavior: `set enabled`): JQuery = js.native
  /**
    * Set as indeterminate checkbox without callbacks
    */
  def apply(behavior: `set indeterminate`): JQuery = js.native
  /**
    * Set a checkbox state to unchecked without callbacks
    */
  def apply(behavior: `set unchecked`): JQuery = js.native
  /**
    * Returns whether element can be checked (checking if already checked or `beforeChecked` would cancel)
    */
  def apply(behavior: `should allow check`): Boolean = js.native
  /**
    * Returns whether element can be determinate (checking if already determinate or `beforeDeterminate` would cancel)
    */
  def apply(behavior: `should allow determinate`): Boolean = js.native
  /**
    * Returns whether element can be indeterminate (checking if already indeterminate or `beforeIndeterminate` would cancel)
    */
  def apply(behavior: `should allow indeterminate`): Boolean = js.native
  /**
    * Returns whether element can be unchecked (checking if already unchecked or `beforeUnchecked` would cancel)
    */
  def apply(behavior: `should allow uncheck`): Boolean = js.native
  /**
    * Set a checkbox state to checked
    */
  def apply(behavior: check): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Set as determinate checkbox
    */
  def apply(behavior: determinate): JQuery = js.native
  /**
    * Enable interaction with a checkbox
    */
  def apply(behavior: enable): JQuery = js.native
  /**
    * Set as indeterminate checkbox
    */
  def apply(behavior: indeterminate): JQuery = js.native
  def apply(behavior: setting, value: CheckboxSettings): JQuery = js.native
  /**
    * Switches a checkbox from current state
    */
  def apply(behavior: toggle): JQuery = js.native
  /**
    * Set a checkbox state to unchecked
    */
  def apply(behavior: uncheck): JQuery = js.native
  def apply(settings: CheckboxSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

