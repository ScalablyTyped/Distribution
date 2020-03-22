package typings.semanticUiCheckbox.SemanticUI

import typings.semanticUiCheckbox.JQuery
import typings.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings
import typings.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings
import typings.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings
import typings.semanticUiCheckbox.semanticUiCheckboxBooleans.`false`
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
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.auto
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.beforeChecked
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.beforeDeterminate
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.beforeIndeterminate
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.beforeUnchecked
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.check
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.className
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.debug
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.destroy
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.determinate
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.enable
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.error
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.fireOnInit
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.indeterminate
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.name
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.namespace
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.onChange
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.onChecked
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.onDeterminate
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.onDisable
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.onDisabled
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.onEnable
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.onEnabled
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.onIndeterminate
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.onUnchecked
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.performance
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.selector
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.setting
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.silent
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.toggle
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.uncheck
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.uncheckable
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.verbose
import typings.std.HTMLInputElement
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
  def apply(behavior: setting, name: beforeChecked): js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`] = js.native
  def apply(
    behavior: setting,
    name: beforeChecked,
    value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
  ): JQuery = js.native
  def apply(behavior: setting, name: beforeDeterminate): js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`] = js.native
  def apply(
    behavior: setting,
    name: beforeDeterminate,
    value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
  ): JQuery = js.native
  def apply(behavior: setting, name: beforeIndeterminate): js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`] = js.native
  def apply(
    behavior: setting,
    name: beforeIndeterminate,
    value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
  ): JQuery = js.native
  def apply(behavior: setting, name: beforeUnchecked): js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`] = js.native
  def apply(
    behavior: setting,
    name: beforeUnchecked,
    value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
  ): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: fireOnInit): Boolean = js.native
  def apply(behavior: setting, name: fireOnInit, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onChange): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def apply(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onChecked): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def apply(behavior: setting, name: onChecked, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onDeterminate): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def apply(behavior: setting, name: onDeterminate, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onDisable): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def apply(behavior: setting, name: onDisabled): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def apply(behavior: setting, name: onDisabled, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onDisable, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onEnable): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def apply(behavior: setting, name: onEnabled): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def apply(behavior: setting, name: onEnabled, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onEnable, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onIndeterminate): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def apply(
    behavior: setting,
    name: onIndeterminate,
    value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onUnchecked): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def apply(behavior: setting, name: onUnchecked, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: uncheckable): auto | Boolean = js.native
  def apply(behavior: setting, name: uncheckable, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: uncheckable, value: auto): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
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
}

