package typings.semanticUiCheckbox

import typings.semanticUiCheckbox.SemanticUI.Checkbox
import typings.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings
import typings.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings
import typings.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings
import typings.semanticUiCheckbox.SemanticUI.CheckboxSettings
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def checkbox(): JQuery
  def checkbox(
    behavior: setting,
    name: beforeChecked,
    value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
  ): JQuery
  def checkbox(behavior: setting, name: beforeChecked, value: Unit): js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
  def checkbox(
    behavior: setting,
    name: beforeDeterminate,
    value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
  ): JQuery
  def checkbox(behavior: setting, name: beforeDeterminate, value: Unit): js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
  def checkbox(
    behavior: setting,
    name: beforeIndeterminate,
    value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
  ): JQuery
  def checkbox(behavior: setting, name: beforeIndeterminate, value: Unit): js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
  def checkbox(
    behavior: setting,
    name: beforeUnchecked,
    value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
  ): JQuery
  def checkbox(behavior: setting, name: beforeUnchecked, value: Unit): js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
  def checkbox(behavior: setting, name: className, value: Unit): ClassNameSettings
  def checkbox(behavior: setting, name: className, value: ClassNameSettings): JQuery
  def checkbox(behavior: setting, name: debug, value: Boolean): JQuery
  def checkbox(behavior: setting, name: debug, value: Unit): Boolean
  def checkbox(behavior: setting, name: error, value: Unit): ErrorSettings
  def checkbox(behavior: setting, name: error, value: ErrorSettings): JQuery
  def checkbox(behavior: setting, name: fireOnInit, value: Boolean): JQuery
  def checkbox(behavior: setting, name: fireOnInit, value: Unit): Boolean
  def checkbox(behavior: setting, name: namespace, value: String): JQuery
  def checkbox(behavior: setting, name: namespace, value: Unit): String
  def checkbox(behavior: setting, name: name, value: String): JQuery
  def checkbox(behavior: setting, name: name, value: Unit): String
  def checkbox(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery
  def checkbox(behavior: setting, name: onChange, value: Unit): js.ThisFunction0[/* this */ HTMLInputElement, Unit]
  def checkbox(behavior: setting, name: onChecked, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery
  def checkbox(behavior: setting, name: onChecked, value: Unit): js.ThisFunction0[/* this */ HTMLInputElement, Unit]
  def checkbox(behavior: setting, name: onDeterminate, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery
  def checkbox(behavior: setting, name: onDeterminate, value: Unit): js.ThisFunction0[/* this */ HTMLInputElement, Unit]
  def checkbox(behavior: setting, name: onDisabled, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery
  def checkbox(behavior: setting, name: onDisabled, value: Unit): js.ThisFunction0[/* this */ HTMLInputElement, Unit]
  def checkbox(behavior: setting, name: onDisable, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery
  def checkbox(behavior: setting, name: onDisable, value: Unit): js.ThisFunction0[/* this */ HTMLInputElement, Unit]
  def checkbox(behavior: setting, name: onEnabled, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery
  def checkbox(behavior: setting, name: onEnabled, value: Unit): js.ThisFunction0[/* this */ HTMLInputElement, Unit]
  def checkbox(behavior: setting, name: onEnable, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery
  def checkbox(behavior: setting, name: onEnable, value: Unit): js.ThisFunction0[/* this */ HTMLInputElement, Unit]
  def checkbox(
    behavior: setting,
    name: onIndeterminate,
    value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]
  ): JQuery
  def checkbox(behavior: setting, name: onIndeterminate, value: Unit): js.ThisFunction0[/* this */ HTMLInputElement, Unit]
  def checkbox(behavior: setting, name: onUnchecked, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery
  def checkbox(behavior: setting, name: onUnchecked, value: Unit): js.ThisFunction0[/* this */ HTMLInputElement, Unit]
  def checkbox(behavior: setting, name: performance, value: Boolean): JQuery
  def checkbox(behavior: setting, name: performance, value: Unit): Boolean
  def checkbox(behavior: setting, name: selector, value: Unit): SelectorSettings
  def checkbox(behavior: setting, name: selector, value: SelectorSettings): JQuery
  def checkbox(behavior: setting, name: silent, value: Boolean): JQuery
  def checkbox(behavior: setting, name: silent, value: Unit): Boolean
  def checkbox(behavior: setting, name: uncheckable, value: Boolean): JQuery
  def checkbox(behavior: setting, name: uncheckable, value: Unit): auto | Boolean
  def checkbox(behavior: setting, name: uncheckable, value: auto): JQuery
  def checkbox(behavior: setting, name: verbose, value: Boolean): JQuery
  def checkbox(behavior: setting, name: verbose, value: Unit): Boolean
  def checkbox(settings: CheckboxSettings): JQuery
  @JSName("checkbox")
  var checkbox_Original: Checkbox
  /**
    * Attach checkbox events to another element
    */
  @JSName("checkbox")
  def checkbox_attachevents(behavior: `attach events`, selector: String): JQuery
  @JSName("checkbox")
  def checkbox_attachevents(behavior: `attach events`, selector: String, event: String): JQuery
  @JSName("checkbox")
  def checkbox_attachevents(behavior: `attach events`, selector: JQuery): JQuery
  @JSName("checkbox")
  def checkbox_attachevents(behavior: `attach events`, selector: JQuery, event: String): JQuery
  /**
    * Returns whether element is able to be changed
    */
  @JSName("checkbox")
  def checkbox_canchange(behavior: `can change`): Boolean
  /**
    * Returns whether element is able to be unchecked
    */
  @JSName("checkbox")
  def checkbox_canuncheck(behavior: `can uncheck`): Boolean
  /**
    * Set a checkbox state to checked
    */
  @JSName("checkbox")
  def checkbox_check(behavior: check): JQuery
  @JSName("checkbox")
  def checkbox_destroy(behavior: destroy): JQuery
  /**
    * Set as determinate checkbox
    */
  @JSName("checkbox")
  def checkbox_determinate(behavior: determinate): JQuery
  /**
    * Enable interaction with a checkbox
    */
  @JSName("checkbox")
  def checkbox_enable(behavior: enable): JQuery
  /**
    * Set as indeterminate checkbox
    */
  @JSName("checkbox")
  def checkbox_indeterminate(behavior: indeterminate): JQuery
  /**
    * Returns whether element is currently checked
    */
  @JSName("checkbox")
  def checkbox_ischecked(behavior: `is checked`): Boolean
  /**
    * Returns whether element is radio selection
    */
  @JSName("checkbox")
  def checkbox_isradio(behavior: `is radio`): Boolean
  /**
    * Returns whether element is not checked
    */
  @JSName("checkbox")
  def checkbox_isunchecked(behavior: `is unchecked`): Boolean
  /**
    * Set a checkbox state to checked without callbacks
    */
  @JSName("checkbox")
  def checkbox_setchecked(behavior: `set checked`): JQuery
  /**
    * Set as determinate checkbox without callbacks
    */
  @JSName("checkbox")
  def checkbox_setdeterminate(behavior: `set determinate`): JQuery
  /**
    * Disable interaction with a checkbox without callbacks
    */
  @JSName("checkbox")
  def checkbox_setdisabled(behavior: `set disabled`): JQuery
  /**
    * Enable interaction with a checkbox without callbacks
    */
  @JSName("checkbox")
  def checkbox_setenabled(behavior: `set enabled`): JQuery
  /**
    * Set as indeterminate checkbox without callbacks
    */
  @JSName("checkbox")
  def checkbox_setindeterminate(behavior: `set indeterminate`): JQuery
  @JSName("checkbox")
  def checkbox_setting(behavior: setting, value: CheckboxSettings): JQuery
  /**
    * Set a checkbox state to unchecked without callbacks
    */
  @JSName("checkbox")
  def checkbox_setunchecked(behavior: `set unchecked`): JQuery
  /**
    * Returns whether element can be checked (checking if already checked or `beforeChecked` would cancel)
    */
  @JSName("checkbox")
  def checkbox_shouldallowcheck(behavior: `should allow check`): Boolean
  /**
    * Returns whether element can be determinate (checking if already determinate or `beforeDeterminate` would cancel)
    */
  @JSName("checkbox")
  def checkbox_shouldallowdeterminate(behavior: `should allow determinate`): Boolean
  /**
    * Returns whether element can be indeterminate (checking if already indeterminate or `beforeIndeterminate` would cancel)
    */
  @JSName("checkbox")
  def checkbox_shouldallowindeterminate(behavior: `should allow indeterminate`): Boolean
  /**
    * Returns whether element can be unchecked (checking if already unchecked or `beforeUnchecked` would cancel)
    */
  @JSName("checkbox")
  def checkbox_shouldallowuncheck(behavior: `should allow uncheck`): Boolean
  /**
    * Switches a checkbox from current state
    */
  @JSName("checkbox")
  def checkbox_toggle(behavior: toggle): JQuery
  /**
    * Set a checkbox state to unchecked
    */
  @JSName("checkbox")
  def checkbox_uncheck(behavior: uncheck): JQuery
}
object JQuery {
  
  @scala.inline
  def apply(checkbox: Checkbox): JQuery = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckbox(value: Checkbox): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
  }
}
