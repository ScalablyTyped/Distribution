package typings.semanticUiCheckbox

import typings.semanticUiCheckbox.SemanticUI.Checkbox
import typings.semanticUiCheckbox.SemanticUI.CheckboxSettings
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def checkbox(): JQuery
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
  @JSName("checkbox")
  def checkbox_setting[K /* <: /* keyof semantic-ui-checkbox.SemanticUI.CheckboxSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("checkbox")
  def checkbox_setting[K /* <: /* keyof semantic-ui-checkbox.SemanticUI.CheckboxSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl[K] */ js.Any
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
  
  inline def apply(checkbox: Checkbox): JQuery = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    inline def setCheckbox(value: Checkbox): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
  }
}
