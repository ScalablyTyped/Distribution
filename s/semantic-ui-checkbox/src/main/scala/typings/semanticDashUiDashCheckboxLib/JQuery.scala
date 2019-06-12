package typings
package semanticDashUiDashCheckboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("checkbox")
  var checkbox_Original: semanticDashUiDashCheckboxLib.SemanticUINs.Checkbox = js.native
  def checkbox(): JQuery = js.native
  def checkbox(settings: semanticDashUiDashCheckboxLib.SemanticUINs.CheckboxSettings): JQuery = js.native
  /**
    * Attach checkbox events to another element
    */
  @JSName("checkbox")
  def checkbox_attachevents(
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`attach events`,
    selector: java.lang.String
  ): JQuery = js.native
  @JSName("checkbox")
  def checkbox_attachevents(
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`attach events`,
    selector: java.lang.String,
    event: java.lang.String
  ): JQuery = js.native
  @JSName("checkbox")
  def checkbox_attachevents(
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`attach events`,
    selector: JQuery
  ): JQuery = js.native
  @JSName("checkbox")
  def checkbox_attachevents(
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`attach events`,
    selector: JQuery,
    event: java.lang.String
  ): JQuery = js.native
  /**
    * Returns whether element is able to be changed
    */
  @JSName("checkbox")
  def checkbox_canchange(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`can change`): scala.Boolean = js.native
  /**
    * Returns whether element is able to be unchecked
    */
  @JSName("checkbox")
  def checkbox_canuncheck(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`can uncheck`): scala.Boolean = js.native
  /**
    * Set a checkbox state to checked
    */
  @JSName("checkbox")
  def checkbox_check(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.check): JQuery = js.native
  @JSName("checkbox")
  def checkbox_destroy(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.destroy): JQuery = js.native
  /**
    * Set as determinate checkbox
    */
  @JSName("checkbox")
  def checkbox_determinate(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.determinate): JQuery = js.native
  /**
    * Enable interaction with a checkbox
    */
  @JSName("checkbox")
  def checkbox_enable(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.enable): JQuery = js.native
  /**
    * Set as indeterminate checkbox
    */
  @JSName("checkbox")
  def checkbox_indeterminate(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.indeterminate): JQuery = js.native
  /**
    * Returns whether element is currently checked
    */
  @JSName("checkbox")
  def checkbox_ischecked(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`is checked`): scala.Boolean = js.native
  /**
    * Returns whether element is radio selection
    */
  @JSName("checkbox")
  def checkbox_isradio(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`is radio`): scala.Boolean = js.native
  /**
    * Returns whether element is not checked
    */
  @JSName("checkbox")
  def checkbox_isunchecked(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`is unchecked`): scala.Boolean = js.native
  /**
    * Set a checkbox state to checked without callbacks
    */
  @JSName("checkbox")
  def checkbox_setchecked(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`set checked`): JQuery = js.native
  /**
    * Set as determinate checkbox without callbacks
    */
  @JSName("checkbox")
  def checkbox_setdeterminate(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`set determinate`): JQuery = js.native
  /**
    * Disable interaction with a checkbox without callbacks
    */
  @JSName("checkbox")
  def checkbox_setdisabled(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`set disabled`): JQuery = js.native
  /**
    * Enable interaction with a checkbox without callbacks
    */
  @JSName("checkbox")
  def checkbox_setenabled(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`set enabled`): JQuery = js.native
  /**
    * Set as indeterminate checkbox without callbacks
    */
  @JSName("checkbox")
  def checkbox_setindeterminate(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`set indeterminate`): JQuery = js.native
  @JSName("checkbox")
  def checkbox_setting(
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.setting,
    value: semanticDashUiDashCheckboxLib.SemanticUINs.CheckboxSettings
  ): JQuery = js.native
  @JSName("checkbox")
  def checkbox_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl[K] */ js.Any = js.native
  @JSName("checkbox")
  def checkbox_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Set a checkbox state to unchecked without callbacks
    */
  @JSName("checkbox")
  def checkbox_setunchecked(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`set unchecked`): JQuery = js.native
  /**
    * Returns whether element can be checked (checking if already checked or `beforeChecked` would cancel)
    */
  @JSName("checkbox")
  def checkbox_shouldallowcheck(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`should allow check`): scala.Boolean = js.native
  /**
    * Returns whether element can be determinate (checking if already determinate or `beforeDeterminate` would cancel)
    */
  @JSName("checkbox")
  def checkbox_shouldallowdeterminate(
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`should allow determinate`
  ): scala.Boolean = js.native
  /**
    * Returns whether element can be indeterminate (checking if already indeterminate or `beforeIndeterminate` would cancel)
    */
  @JSName("checkbox")
  def checkbox_shouldallowindeterminate(
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`should allow indeterminate`
  ): scala.Boolean = js.native
  /**
    * Returns whether element can be unchecked (checking if already unchecked or `beforeUnchecked` would cancel)
    */
  @JSName("checkbox")
  def checkbox_shouldallowuncheck(
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`should allow uncheck`
  ): scala.Boolean = js.native
  /**
    * Switches a checkbox from current state
    */
  @JSName("checkbox")
  def checkbox_toggle(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.toggle): JQuery = js.native
  /**
    * Set a checkbox state to unchecked
    */
  @JSName("checkbox")
  def checkbox_uncheck(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.uncheck): JQuery = js.native
}

