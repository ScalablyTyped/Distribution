package typings
package semanticDashUiDashProgressLib.SemanticUINs.ProgressSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  // region Progress Settings
  /**
    * Whether success state should automatically trigger when progress completes
    *
    * @default true
    */
  var autoSuccess: scala.Boolean
  /**
    * Class names used to attach style to state
    */
  var className: semanticDashUiDashProgressLib.SemanticUINs.ProgressNs.ClassNameSettings
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashProgressLib.SemanticUINs.ProgressNs.ErrorSettings
  /**
    * Can be set to either to display progress as percent or ratio. Matches up to corresponding text template with the same name.
    *
    * @default 'percent'
    */
  var label: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.percent | semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.ratio
  /**
    * When set to true, values that calculate to above 100% or below 0% will be adjusted.
    * When set to false, inappropriate values will produce an error.
    *
    * @default true
    */
  var limitValues: scala.Boolean
  /**
    * DOM metadata used by module
    */
  var metadata: semanticDashUiDashProgressLib.SemanticUINs.ProgressNs.MetadataSettings
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
  /**
    * Decimal point precision for calculated progress
    *
    * @default 1
    */
  var precision: scala.Double
  /**
    * When incrementing without value, sets range for random increment value
    */
  var random: semanticDashUiDashProgressLib.SemanticUINs.ProgressNs.RandomSettings
  /**
    * Regular expressions used by module
    */
  var regExp: semanticDashUiDashProgressLib.SemanticUINs.ProgressNs.RegExpSettings
  /**
    * Selectors used by module
    */
  var selector: semanticDashUiDashProgressLib.SemanticUINs.ProgressNs.SelectorSettings
  /**
    * Whether progress should automatically show activity when incremented
    *
    * @default true
    */
  var showActivity: scala.Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  // endregion
  // region DOM Settings
  /**
    * Text content for each state, uses simple templating with {percent}, {value}, {total}
    */
  var text: semanticDashUiDashProgressLib.SemanticUINs.ProgressNs.TextSettings
  /**
    * Setting a total value will make each call to increment get closer to this total (i.e. 1/20, 2/20 etc)
    *
    * @default false
    */
  var total: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibNumbers.`false` | scala.Double
  /**
    * Sets current value, when total is specified, this is used to calculate a ratio of the total, with percent this should be the overall percent
    *
    * @default false
    */
  var value: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibNumbers.`false` | scala.Double
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  /**
    * Callback on active state
    */
  def onActive(`this`: semanticDashUiDashProgressLib.JQuery, value: scala.Double, total: scala.Double): scala.Unit
  // endregion
  // region Callbacks
  /**
    * Callback on percentage change
    */
  def onChange(
    `this`: semanticDashUiDashProgressLib.JQuery,
    percent: scala.Double,
    value: scala.Double,
    total: scala.Double
  ): scala.Unit
  /**
    * Callback on error state
    */
  def onError(`this`: semanticDashUiDashProgressLib.JQuery, value: scala.Double, total: scala.Double): scala.Unit
  /**
    * Callback on success state
    */
  def onSuccess(`this`: semanticDashUiDashProgressLib.JQuery, total: scala.Double): scala.Unit
  /**
    * Callback on warning state
    */
  def onWarning(`this`: semanticDashUiDashProgressLib.JQuery, value: scala.Double, total: scala.Double): scala.Unit
}

