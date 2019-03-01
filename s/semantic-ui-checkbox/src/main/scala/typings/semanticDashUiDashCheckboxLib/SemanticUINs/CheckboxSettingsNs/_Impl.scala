package typings
package semanticDashUiDashCheckboxLib.SemanticUINs.CheckboxSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * Class names used to determine element state
    */
  var className: semanticDashUiDashCheckboxLib.SemanticUINs.CheckboxNs.ClassNameSettings
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashCheckboxLib.SemanticUINs.CheckboxNs.ErrorSettings
  /**
    * Whether callbacks for checked status should be fired on init as well as change
    *
    * @default false
    */
  var fireOnInit: scala.Boolean
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: java.lang.String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: java.lang.String
  /**
    * Show console.table output with performance metrics
    */
  var performance: scala.Boolean
  // endregion
  // region DOM Settings
  /**
    * Selectors used to find parts of a module
    */
  var selector: semanticDashUiDashCheckboxLib.SemanticUINs.CheckboxNs.SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  // region Behavior
  /**
    * Setting to true/false will determine whether an input will allow no selection. Auto will set disallow this behavior only for radio boxes
    *
    * @default 'auto'
    */
  var uncheckable: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.auto | scala.Boolean
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  /**
    * Callback before a checkbox is checked. Can cancel change by returning false
    */
  def beforeChecked(`this`: stdLib.HTMLInputElement): scala.Unit | semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibNumbers.`false`
  /**
    * Callback before a checkbox is set to determinate. Can cancel change by returning false
    */
  def beforeDeterminate(`this`: stdLib.HTMLInputElement): scala.Unit | semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibNumbers.`false`
  /**
    * Callback before a checkbox is set to undeterminate. Can cancel change by returning false
    */
  def beforeIndeterminate(`this`: stdLib.HTMLInputElement): scala.Unit | semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibNumbers.`false`
  /**
    * Callback before a checkbox is unchecked. Can cancel change by returning false
    */
  def beforeUnchecked(`this`: stdLib.HTMLInputElement): scala.Unit | semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibNumbers.`false`
  // endregion
  // region Callbacks
  /**
    * Callback after a checkbox is either checked or unchecked.
    */
  def onChange(`this`: stdLib.HTMLInputElement): scala.Unit
  /**
    * Callback after a checkbox is checked.
    */
  def onChecked(`this`: stdLib.HTMLInputElement): scala.Unit
  /**
    * Callback after a checkbox is set to determinate.
    */
  def onDeterminate(`this`: stdLib.HTMLInputElement): scala.Unit
  /**
    * Callback after a checkbox is disabled.
    */
  def onDisable(`this`: stdLib.HTMLInputElement): scala.Unit
  /**
    * Callback after a checkbox is disabled.
    *
    * @deprecated
    */
  def onDisabled(`this`: stdLib.HTMLInputElement): scala.Unit
  /**
    * Callback after a checkbox is enabled.
    */
  def onEnable(`this`: stdLib.HTMLInputElement): scala.Unit
  /**
    * Callback after a checkbox is enabled.
    *
    * @deprecated
    */
  def onEnabled(`this`: stdLib.HTMLInputElement): scala.Unit
  /**
    * Callback after a checkbox is set to undeterminate.
    */
  def onIndeterminate(`this`: stdLib.HTMLInputElement): scala.Unit
  /**
    * Callback after a checkbox is unchecked.
    */
  def onUnchecked(`this`: stdLib.HTMLInputElement): scala.Unit
}

object _Impl {
  @scala.inline
  def apply(
    beforeChecked: js.Function1[
      stdLib.HTMLInputElement, 
      scala.Unit | semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibNumbers.`false`
    ],
    beforeDeterminate: js.Function1[
      stdLib.HTMLInputElement, 
      scala.Unit | semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibNumbers.`false`
    ],
    beforeIndeterminate: js.Function1[
      stdLib.HTMLInputElement, 
      scala.Unit | semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibNumbers.`false`
    ],
    beforeUnchecked: js.Function1[
      stdLib.HTMLInputElement, 
      scala.Unit | semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibNumbers.`false`
    ],
    className: semanticDashUiDashCheckboxLib.SemanticUINs.CheckboxNs.ClassNameSettings,
    debug: scala.Boolean,
    error: semanticDashUiDashCheckboxLib.SemanticUINs.CheckboxNs.ErrorSettings,
    fireOnInit: scala.Boolean,
    name: java.lang.String,
    namespace: java.lang.String,
    onChange: js.Function1[stdLib.HTMLInputElement, scala.Unit],
    onChecked: js.Function1[stdLib.HTMLInputElement, scala.Unit],
    onDeterminate: js.Function1[stdLib.HTMLInputElement, scala.Unit],
    onDisable: js.Function1[stdLib.HTMLInputElement, scala.Unit],
    onDisabled: js.Function1[stdLib.HTMLInputElement, scala.Unit],
    onEnable: js.Function1[stdLib.HTMLInputElement, scala.Unit],
    onEnabled: js.Function1[stdLib.HTMLInputElement, scala.Unit],
    onIndeterminate: js.Function1[stdLib.HTMLInputElement, scala.Unit],
    onUnchecked: js.Function1[stdLib.HTMLInputElement, scala.Unit],
    performance: scala.Boolean,
    selector: semanticDashUiDashCheckboxLib.SemanticUINs.CheckboxNs.SelectorSettings,
    silent: scala.Boolean,
    uncheckable: semanticDashUiDashCheckboxLib.semanticDashUiDashCheckboxLibStrings.auto | scala.Boolean,
    verbose: scala.Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeChecked")(beforeChecked)
    __obj.updateDynamic("beforeDeterminate")(beforeDeterminate)
    __obj.updateDynamic("beforeIndeterminate")(beforeIndeterminate)
    __obj.updateDynamic("beforeUnchecked")(beforeUnchecked)
    __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("fireOnInit")(fireOnInit)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("onChange")(onChange)
    __obj.updateDynamic("onChecked")(onChecked)
    __obj.updateDynamic("onDeterminate")(onDeterminate)
    __obj.updateDynamic("onDisable")(onDisable)
    __obj.updateDynamic("onDisabled")(onDisabled)
    __obj.updateDynamic("onEnable")(onEnable)
    __obj.updateDynamic("onEnabled")(onEnabled)
    __obj.updateDynamic("onIndeterminate")(onIndeterminate)
    __obj.updateDynamic("onUnchecked")(onUnchecked)
    __obj.updateDynamic("performance")(performance)
    __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.updateDynamic("silent")(silent)
    __obj.updateDynamic("uncheckable")(uncheckable.asInstanceOf[js.Any])
    __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[_Impl]
  }
}

