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

