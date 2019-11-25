package typings.semanticDashUiDashProgress.SemanticUI.ProgressSettings

import typings.semanticDashUiDashProgress.JQuery
import typings.semanticDashUiDashProgress.SemanticUI.Progress.ClassNameSettings
import typings.semanticDashUiDashProgress.SemanticUI.Progress.ErrorSettings
import typings.semanticDashUiDashProgress.SemanticUI.Progress.MetadataSettings
import typings.semanticDashUiDashProgress.SemanticUI.Progress.RandomSettings
import typings.semanticDashUiDashProgress.SemanticUI.Progress.RegExpSettings
import typings.semanticDashUiDashProgress.SemanticUI.Progress.SelectorSettings
import typings.semanticDashUiDashProgress.SemanticUI.Progress.TextSettings
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressNumbers.`false`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.percent
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.ratio
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
  var autoSuccess: Boolean
  /**
    * Class names used to attach style to state
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
    * Can be set to either to display progress as percent or ratio. Matches up to corresponding text template with the same name.
    *
    * @default 'percent'
    */
  var label: percent | ratio
  /**
    * When set to true, values that calculate to above 100% or below 0% will be adjusted.
    * When set to false, inappropriate values will produce an error.
    *
    * @default true
    */
  var limitValues: Boolean
  /**
    * DOM metadata used by module
    */
  var metadata: MetadataSettings
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
  /**
    * Decimal point precision for calculated progress
    *
    * @default 1
    */
  var precision: Double
  /**
    * When incrementing without value, sets range for random increment value
    */
  var random: RandomSettings
  /**
    * Regular expressions used by module
    */
  var regExp: RegExpSettings
  /**
    * Selectors used by module
    */
  var selector: SelectorSettings
  /**
    * Whether progress should automatically show activity when incremented
    *
    * @default true
    */
  var showActivity: Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  // endregion
  // region DOM Settings
  /**
    * Text content for each state, uses simple templating with {percent}, {value}, {total}
    */
  var text: TextSettings
  /**
    * Setting a total value will make each call to increment get closer to this total (i.e. 1/20, 2/20 etc)
    *
    * @default false
    */
  var total: `false` | Double
  /**
    * Sets current value, when total is specified, this is used to calculate a ratio of the total, with percent this should be the overall percent
    *
    * @default false
    */
  var value: `false` | Double
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * Callback on active state
    */
  def onActive(`this`: JQuery, value: Double, total: Double): Unit
  // endregion
  // region Callbacks
  /**
    * Callback on percentage change
    */
  def onChange(`this`: JQuery, percent: Double, value: Double, total: Double): Unit
  /**
    * Callback on error state
    */
  def onError(`this`: JQuery, value: Double, total: Double): Unit
  /**
    * Callback on success state
    */
  def onSuccess(`this`: JQuery, total: Double): Unit
  /**
    * Callback on warning state
    */
  def onWarning(`this`: JQuery, value: Double, total: Double): Unit
}

object _Impl {
  @scala.inline
  def apply(
    autoSuccess: Boolean,
    className: ClassNameSettings,
    debug: Boolean,
    error: ErrorSettings,
    label: percent | ratio,
    limitValues: Boolean,
    metadata: MetadataSettings,
    name: String,
    namespace: String,
    onActive: (JQuery, Double, Double) => Unit,
    onChange: (JQuery, Double, Double, Double) => Unit,
    onError: (JQuery, Double, Double) => Unit,
    onSuccess: (JQuery, Double) => Unit,
    onWarning: (JQuery, Double, Double) => Unit,
    performance: Boolean,
    precision: Double,
    random: RandomSettings,
    regExp: RegExpSettings,
    selector: SelectorSettings,
    showActivity: Boolean,
    silent: Boolean,
    text: TextSettings,
    total: `false` | Double,
    value: `false` | Double,
    verbose: Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(autoSuccess = autoSuccess.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], limitValues = limitValues.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onActive = js.Any.fromFunction3(onActive), onChange = js.Any.fromFunction4(onChange), onError = js.Any.fromFunction3(onError), onSuccess = js.Any.fromFunction2(onSuccess), onWarning = js.Any.fromFunction3(onWarning), performance = performance.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], showActivity = showActivity.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

