package typings.semanticDashUiDashCheckbox.SemanticUI.CheckboxSettings

import typings.semanticDashUiDashCheckbox.SemanticUI.Checkbox.ClassNameSettings
import typings.semanticDashUiDashCheckbox.SemanticUI.Checkbox.ErrorSettings
import typings.semanticDashUiDashCheckbox.SemanticUI.Checkbox.SelectorSettings
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxNumbers.`false`
import typings.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.auto
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
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
  def beforeChecked(`this`: HTMLInputElement): Unit | `false`
  /**
    * Callback before a checkbox is set to determinate. Can cancel change by returning false
    */
  def beforeDeterminate(`this`: HTMLInputElement): Unit | `false`
  /**
    * Callback before a checkbox is set to undeterminate. Can cancel change by returning false
    */
  def beforeIndeterminate(`this`: HTMLInputElement): Unit | `false`
  /**
    * Callback before a checkbox is unchecked. Can cancel change by returning false
    */
  def beforeUnchecked(`this`: HTMLInputElement): Unit | `false`
  // endregion
  // region Callbacks
  /**
    * Callback after a checkbox is either checked or unchecked.
    */
  def onChange(`this`: HTMLInputElement): Unit
  /**
    * Callback after a checkbox is checked.
    */
  def onChecked(`this`: HTMLInputElement): Unit
  /**
    * Callback after a checkbox is set to determinate.
    */
  def onDeterminate(`this`: HTMLInputElement): Unit
  /**
    * Callback after a checkbox is disabled.
    */
  def onDisable(`this`: HTMLInputElement): Unit
  /**
    * Callback after a checkbox is disabled.
    *
    * @deprecated
    */
  def onDisabled(`this`: HTMLInputElement): Unit
  /**
    * Callback after a checkbox is enabled.
    */
  def onEnable(`this`: HTMLInputElement): Unit
  /**
    * Callback after a checkbox is enabled.
    *
    * @deprecated
    */
  def onEnabled(`this`: HTMLInputElement): Unit
  /**
    * Callback after a checkbox is set to undeterminate.
    */
  def onIndeterminate(`this`: HTMLInputElement): Unit
  /**
    * Callback after a checkbox is unchecked.
    */
  def onUnchecked(`this`: HTMLInputElement): Unit
}

object _Impl {
  @scala.inline
  def apply(
    beforeChecked: HTMLInputElement => Unit | `false`,
    beforeDeterminate: HTMLInputElement => Unit | `false`,
    beforeIndeterminate: HTMLInputElement => Unit | `false`,
    beforeUnchecked: HTMLInputElement => Unit | `false`,
    className: ClassNameSettings,
    debug: Boolean,
    error: ErrorSettings,
    fireOnInit: Boolean,
    name: String,
    namespace: String,
    onChange: HTMLInputElement => Unit,
    onChecked: HTMLInputElement => Unit,
    onDeterminate: HTMLInputElement => Unit,
    onDisable: HTMLInputElement => Unit,
    onDisabled: HTMLInputElement => Unit,
    onEnable: HTMLInputElement => Unit,
    onEnabled: HTMLInputElement => Unit,
    onIndeterminate: HTMLInputElement => Unit,
    onUnchecked: HTMLInputElement => Unit,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    uncheckable: auto | Boolean,
    verbose: Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(beforeChecked = js.Any.fromFunction1(beforeChecked), beforeDeterminate = js.Any.fromFunction1(beforeDeterminate), beforeIndeterminate = js.Any.fromFunction1(beforeIndeterminate), beforeUnchecked = js.Any.fromFunction1(beforeUnchecked), className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fireOnInit = fireOnInit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onChecked = js.Any.fromFunction1(onChecked), onDeterminate = js.Any.fromFunction1(onDeterminate), onDisable = js.Any.fromFunction1(onDisable), onDisabled = js.Any.fromFunction1(onDisabled), onEnable = js.Any.fromFunction1(onEnable), onEnabled = js.Any.fromFunction1(onEnabled), onIndeterminate = js.Any.fromFunction1(onIndeterminate), onUnchecked = js.Any.fromFunction1(onUnchecked), performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], uncheckable = uncheckable.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

