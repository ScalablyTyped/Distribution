package typings
package semanticDashUiDashCheckboxLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checkbox extends js.Object {
  var settings: CheckboxSettings = js.native
  def apply(): semanticDashUiDashCheckboxLib.JQuery = js.native
  /**
           * Attach checkbox events to another element
           */
  def apply(
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`attach events`,
    selector: java.lang.String
  ): semanticDashUiDashCheckboxLib.JQuery = js.native
  /**
           * Attach checkbox events to another element
           */
  def apply(
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`attach events`,
    selector: java.lang.String,
    event: java.lang.String
  ): semanticDashUiDashCheckboxLib.JQuery = js.native
  /**
           * Attach checkbox events to another element
           */
  def apply(
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`attach events`,
    selector: semanticDashUiDashCheckboxLib.JQuery
  ): semanticDashUiDashCheckboxLib.JQuery = js.native
  /**
           * Attach checkbox events to another element
           */
  def apply(
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`attach events`,
    selector: semanticDashUiDashCheckboxLib.JQuery,
    event: java.lang.String
  ): semanticDashUiDashCheckboxLib.JQuery = js.native
  /**
           * Returns whether element is able to be changed
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`can change`): scala.Boolean = js.native
  /**
           * Returns whether element is able to be unchecked
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`can uncheck`): scala.Boolean = js.native
  /**
           * Returns whether element is currently checked
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`is checked`): scala.Boolean = js.native
  /**
           * Returns whether element is radio selection
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`is radio`): scala.Boolean = js.native
  /**
           * Returns whether element is not checked
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`is unchecked`): scala.Boolean = js.native
  /**
           * Set a checkbox state to checked without callbacks
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`set checked`): semanticDashUiDashCheckboxLib.JQuery = js.native
  /**
           * Set as determinate checkbox without callbacks
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`set determinate`): semanticDashUiDashCheckboxLib.JQuery = js.native
  /**
           * Disable interaction with a checkbox without callbacks
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`set disabled`): semanticDashUiDashCheckboxLib.JQuery = js.native
  /**
           * Enable interaction with a checkbox without callbacks
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`set enabled`): semanticDashUiDashCheckboxLib.JQuery = js.native
  /**
           * Set as indeterminate checkbox without callbacks
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`set indeterminate`): semanticDashUiDashCheckboxLib.JQuery = js.native
  /**
           * Set a checkbox state to unchecked without callbacks
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`set unchecked`): semanticDashUiDashCheckboxLib.JQuery = js.native
  /**
           * Returns whether element can be checked (checking if already checked or `beforeChecked` would cancel)
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`should allow check`): scala.Boolean = js.native
  /**
           * Returns whether element can be determinate (checking if already determinate or `beforeDeterminate` would cancel)
           */
  def apply(
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`should allow determinate`
  ): scala.Boolean = js.native
  /**
           * Returns whether element can be indeterminate (checking if already indeterminate or `beforeIndeterminate` would cancel)
           */
  def apply(
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`should allow indeterminate`
  ): scala.Boolean = js.native
  /**
           * Returns whether element can be unchecked (checking if already unchecked or `beforeUnchecked` would cancel)
           */
  def apply(
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.`should allow uncheck`
  ): scala.Boolean = js.native
  /**
           * Set a checkbox state to checked
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.check): semanticDashUiDashCheckboxLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.destroy): semanticDashUiDashCheckboxLib.JQuery = js.native
  /**
           * Set as determinate checkbox
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.determinate): semanticDashUiDashCheckboxLib.JQuery = js.native
  /**
           * Enable interaction with a checkbox
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.enable): semanticDashUiDashCheckboxLib.JQuery = js.native
  /**
           * Set as indeterminate checkbox
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.indeterminate): semanticDashUiDashCheckboxLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.setting,
    value: CheckboxSettings
  ): semanticDashUiDashCheckboxLib.JQuery = js.native
  /**
           * Switches a checkbox from current state
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.toggle): semanticDashUiDashCheckboxLib.JQuery = js.native
  /**
           * Set a checkbox state to unchecked
           */
  def apply(behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.uncheck): semanticDashUiDashCheckboxLib.JQuery = js.native
  def apply(settings: CheckboxSettings): semanticDashUiDashCheckboxLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.setting, name: K): js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.setting,
    name: K,
    value: js.Any
  ): semanticDashUiDashCheckboxLib.JQuery = js.native
}

