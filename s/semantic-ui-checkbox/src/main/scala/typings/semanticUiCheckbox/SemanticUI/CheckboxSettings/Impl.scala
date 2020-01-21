package typings.semanticUiCheckbox.SemanticUI.CheckboxSettings

import typings.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings
import typings.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings
import typings.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings
import typings.semanticUiCheckbox.semanticUiCheckboxBooleans.`false`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * Class names used to determine element state
    */
  var className: ClassNameSettings
  /**
    * Debug output to console
    */
  var debug: Boolean
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * Whether callbacks for checked status should be fired on init as well as change
    *
    * @default false
    */
  var fireOnInit: Boolean
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  // endregion
  // region DOM Settings
  /**
    * Selectors used to find parts of a module
    */
  var selector: SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  // region Behavior
  /**
    * Setting to true/false will determine whether an input will allow no selection. Auto will set disallow this behavior only for radio boxes
    *
    * @default 'auto'
    */
  var uncheckable: auto | Boolean
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * Callback before a checkbox is checked. Can cancel change by returning false
    */
  def beforeChecked(): Unit | `false`
  /**
    * Callback before a checkbox is set to determinate. Can cancel change by returning false
    */
  def beforeDeterminate(): Unit | `false`
  /**
    * Callback before a checkbox is set to undeterminate. Can cancel change by returning false
    */
  def beforeIndeterminate(): Unit | `false`
  /**
    * Callback before a checkbox is unchecked. Can cancel change by returning false
    */
  def beforeUnchecked(): Unit | `false`
  // endregion
  // region Callbacks
  /**
    * Callback after a checkbox is either checked or unchecked.
    */
  def onChange(): Unit
  /**
    * Callback after a checkbox is checked.
    */
  def onChecked(): Unit
  /**
    * Callback after a checkbox is set to determinate.
    */
  def onDeterminate(): Unit
  /**
    * Callback after a checkbox is disabled.
    */
  def onDisable(): Unit
  /**
    * Callback after a checkbox is disabled.
    *
    * @deprecated
    */
  def onDisabled(): Unit
  /**
    * Callback after a checkbox is enabled.
    */
  def onEnable(): Unit
  /**
    * Callback after a checkbox is enabled.
    *
    * @deprecated
    */
  def onEnabled(): Unit
  /**
    * Callback after a checkbox is set to undeterminate.
    */
  def onIndeterminate(): Unit
  /**
    * Callback after a checkbox is unchecked.
    */
  def onUnchecked(): Unit
}

object Impl {
  @scala.inline
  def apply(
    beforeChecked: () => Unit | `false`,
    beforeDeterminate: () => Unit | `false`,
    beforeIndeterminate: () => Unit | `false`,
    beforeUnchecked: () => Unit | `false`,
    className: ClassNameSettings,
    debug: Boolean,
    error: ErrorSettings,
    fireOnInit: Boolean,
    name: String,
    namespace: String,
    onChange: () => Unit,
    onChecked: () => Unit,
    onDeterminate: () => Unit,
    onDisable: () => Unit,
    onDisabled: () => Unit,
    onEnable: () => Unit,
    onEnabled: () => Unit,
    onIndeterminate: () => Unit,
    onUnchecked: () => Unit,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    uncheckable: auto | Boolean,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(beforeChecked = js.Any.fromFunction0(beforeChecked), beforeDeterminate = js.Any.fromFunction0(beforeDeterminate), beforeIndeterminate = js.Any.fromFunction0(beforeIndeterminate), beforeUnchecked = js.Any.fromFunction0(beforeUnchecked), className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fireOnInit = fireOnInit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onChecked = js.Any.fromFunction0(onChecked), onDeterminate = js.Any.fromFunction0(onDeterminate), onDisable = js.Any.fromFunction0(onDisable), onDisabled = js.Any.fromFunction0(onDisabled), onEnable = js.Any.fromFunction0(onEnable), onEnabled = js.Any.fromFunction0(onEnabled), onIndeterminate = js.Any.fromFunction0(onIndeterminate), onUnchecked = js.Any.fromFunction0(onUnchecked), performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], uncheckable = uncheckable.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

