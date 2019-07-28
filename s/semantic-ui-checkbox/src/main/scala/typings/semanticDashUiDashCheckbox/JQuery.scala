package typings.semanticDashUiDashCheckbox

import typings.semanticDashUiDashCheckbox.SemanticUINs.Checkbox
import typings.semanticDashUiDashCheckbox.SemanticUINs.CheckboxSettings
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.`attach events`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.`can change`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.`can uncheck`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.`is checked`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.`is radio`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.`is unchecked`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.`set checked`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.`set determinate`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.`set disabled`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.`set enabled`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.`set indeterminate`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.`set unchecked`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.`should allow check`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.`should allow determinate`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.`should allow indeterminate`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.`should allow uncheck`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.check
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.destroy
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.determinate
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.enable
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.indeterminate
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.setting
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.toggle
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.uncheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("checkbox")
  var checkbox_Original: Checkbox = js.native
  def checkbox(): JQuery = js.native
  def checkbox(settings: CheckboxSettings): JQuery = js.native
  /**
    * Attach checkbox events to another element
    */
  @JSName("checkbox")
  def checkbox_attachevents(behavior: `attach events`, selector: String): JQuery = js.native
  @JSName("checkbox")
  def checkbox_attachevents(behavior: `attach events`, selector: String, event: String): JQuery = js.native
  @JSName("checkbox")
  def checkbox_attachevents(behavior: `attach events`, selector: JQuery): JQuery = js.native
  @JSName("checkbox")
  def checkbox_attachevents(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
  /**
    * Returns whether element is able to be changed
    */
  @JSName("checkbox")
  def checkbox_canchange(behavior: `can change`): Boolean = js.native
  /**
    * Returns whether element is able to be unchecked
    */
  @JSName("checkbox")
  def checkbox_canuncheck(behavior: `can uncheck`): Boolean = js.native
  /**
    * Set a checkbox state to checked
    */
  @JSName("checkbox")
  def checkbox_check(behavior: check): JQuery = js.native
  @JSName("checkbox")
  def checkbox_destroy(behavior: destroy): JQuery = js.native
  /**
    * Set as determinate checkbox
    */
  @JSName("checkbox")
  def checkbox_determinate(behavior: determinate): JQuery = js.native
  /**
    * Enable interaction with a checkbox
    */
  @JSName("checkbox")
  def checkbox_enable(behavior: enable): JQuery = js.native
  /**
    * Set as indeterminate checkbox
    */
  @JSName("checkbox")
  def checkbox_indeterminate(behavior: indeterminate): JQuery = js.native
  /**
    * Returns whether element is currently checked
    */
  @JSName("checkbox")
  def checkbox_ischecked(behavior: `is checked`): Boolean = js.native
  /**
    * Returns whether element is radio selection
    */
  @JSName("checkbox")
  def checkbox_isradio(behavior: `is radio`): Boolean = js.native
  /**
    * Returns whether element is not checked
    */
  @JSName("checkbox")
  def checkbox_isunchecked(behavior: `is unchecked`): Boolean = js.native
  /**
    * Set a checkbox state to checked without callbacks
    */
  @JSName("checkbox")
  def checkbox_setchecked(behavior: `set checked`): JQuery = js.native
  /**
    * Set as determinate checkbox without callbacks
    */
  @JSName("checkbox")
  def checkbox_setdeterminate(behavior: `set determinate`): JQuery = js.native
  /**
    * Disable interaction with a checkbox without callbacks
    */
  @JSName("checkbox")
  def checkbox_setdisabled(behavior: `set disabled`): JQuery = js.native
  /**
    * Enable interaction with a checkbox without callbacks
    */
  @JSName("checkbox")
  def checkbox_setenabled(behavior: `set enabled`): JQuery = js.native
  /**
    * Set as indeterminate checkbox without callbacks
    */
  @JSName("checkbox")
  def checkbox_setindeterminate(behavior: `set indeterminate`): JQuery = js.native
  @JSName("checkbox")
  def checkbox_setting(behavior: setting, value: CheckboxSettings): JQuery = js.native
  @JSName("checkbox")
  def checkbox_setting[K /* <: String */](behavior: setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl[K] */ js.Any = js.native
  @JSName("checkbox")
  def checkbox_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Set a checkbox state to unchecked without callbacks
    */
  @JSName("checkbox")
  def checkbox_setunchecked(behavior: `set unchecked`): JQuery = js.native
  /**
    * Returns whether element can be checked (checking if already checked or `beforeChecked` would cancel)
    */
  @JSName("checkbox")
  def checkbox_shouldallowcheck(behavior: `should allow check`): Boolean = js.native
  /**
    * Returns whether element can be determinate (checking if already determinate or `beforeDeterminate` would cancel)
    */
  @JSName("checkbox")
  def checkbox_shouldallowdeterminate(behavior: `should allow determinate`): Boolean = js.native
  /**
    * Returns whether element can be indeterminate (checking if already indeterminate or `beforeIndeterminate` would cancel)
    */
  @JSName("checkbox")
  def checkbox_shouldallowindeterminate(behavior: `should allow indeterminate`): Boolean = js.native
  /**
    * Returns whether element can be unchecked (checking if already unchecked or `beforeUnchecked` would cancel)
    */
  @JSName("checkbox")
  def checkbox_shouldallowuncheck(behavior: `should allow uncheck`): Boolean = js.native
  /**
    * Switches a checkbox from current state
    */
  @JSName("checkbox")
  def checkbox_toggle(behavior: toggle): JQuery = js.native
  /**
    * Set a checkbox state to unchecked
    */
  @JSName("checkbox")
  def checkbox_uncheck(behavior: uncheck): JQuery = js.native
}

