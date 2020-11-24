package typings.semanticUiProgress.SemanticUI.ProgressSettings

import typings.semanticUiProgress.SemanticUI.Progress.ClassNameSettings
import typings.semanticUiProgress.SemanticUI.Progress.ErrorSettings
import typings.semanticUiProgress.SemanticUI.Progress.MetadataSettings
import typings.semanticUiProgress.SemanticUI.Progress.RandomSettings
import typings.semanticUiProgress.SemanticUI.Progress.RegExpSettings
import typings.semanticUiProgress.SemanticUI.Progress.SelectorSettings
import typings.semanticUiProgress.SemanticUI.Progress.TextSettings
import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import typings.semanticUiProgress.semanticUiProgressStrings.percent
import typings.semanticUiProgress.semanticUiProgressStrings.ratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  // region Progress Settings
  /**
    * Whether success state should automatically trigger when progress completes
    *
    * @default true
    */
  var autoSuccess: Boolean = js.native
  
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings = js.native
  
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  
  /**
    * Can be set to either to display progress as percent or ratio. Matches up to corresponding text template with the same name.
    *
    * @default 'percent'
    */
  var label: percent | ratio = js.native
  
  /**
    * When set to true, values that calculate to above 100% or below 0% will be adjusted.
    * When set to false, inappropriate values will produce an error.
    *
    * @default true
    */
  var limitValues: Boolean = js.native
  
  /**
    * DOM metadata used by module
    */
  var metadata: MetadataSettings = js.native
  
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String = js.native
  
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String = js.native
  
  /**
    * Callback on active state
    */
  def onActive(value: Double, total: Double): Unit = js.native
  
  // endregion
  // region Callbacks
  /**
    * Callback on percentage change
    */
  def onChange(percent: Double, value: Double, total: Double): Unit = js.native
  
  /**
    * Callback on error state
    */
  def onError(value: Double, total: Double): Unit = js.native
  
  /**
    * Callback on success state
    */
  def onSuccess(total: Double): Unit = js.native
  
  /**
    * Callback on warning state
    */
  def onWarning(value: Double, total: Double): Unit = js.native
  
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  
  /**
    * Decimal point precision for calculated progress
    *
    * @default 1
    */
  var precision: Double = js.native
  
  /**
    * When incrementing without value, sets range for random increment value
    */
  var random: RandomSettings = js.native
  
  /**
    * Regular expressions used by module
    */
  var regExp: RegExpSettings = js.native
  
  /**
    * Selectors used by module
    */
  var selector: SelectorSettings = js.native
  
  /**
    * Whether progress should automatically show activity when incremented
    *
    * @default true
    */
  var showActivity: Boolean = js.native
  
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  
  // endregion
  // region DOM Settings
  /**
    * Text content for each state, uses simple templating with {percent}, {value}, {total}
    */
  var text: TextSettings = js.native
  
  /**
    * Setting a total value will make each call to increment get closer to this total (i.e. 1/20, 2/20 etc)
    *
    * @default false
    */
  var total: `false` | Double = js.native
  
  /**
    * Sets current value, when total is specified, this is used to calculate a ratio of the total, with percent this should be the overall percent
    *
    * @default false
    */
  var value: `false` | Double = js.native
  
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
}
object Impl {
  
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
    onActive: (Double, Double) => Unit,
    onChange: (Double, Double, Double) => Unit,
    onError: (Double, Double) => Unit,
    onSuccess: Double => Unit,
    onWarning: (Double, Double) => Unit,
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
  ): Impl = {
    val __obj = js.Dynamic.literal(autoSuccess = autoSuccess.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], limitValues = limitValues.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onActive = js.Any.fromFunction2(onActive), onChange = js.Any.fromFunction3(onChange), onError = js.Any.fromFunction2(onError), onSuccess = js.Any.fromFunction1(onSuccess), onWarning = js.Any.fromFunction2(onWarning), performance = performance.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], showActivity = showActivity.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoSuccess(value: Boolean): Self = this.set("autoSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: percent | ratio): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitValues(value: Boolean): Self = this.set("limitValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnActive(value: (Double, Double) => Unit): Self = this.set("onActive", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChange(value: (Double, Double, Double) => Unit): Self = this.set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnError(value: (Double, Double) => Unit): Self = this.set("onError", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSuccess(value: Double => Unit): Self = this.set("onSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWarning(value: (Double, Double) => Unit): Self = this.set("onWarning", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandom(value: RandomSettings): Self = this.set("random", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExp(value: RegExpSettings): Self = this.set("regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowActivity(value: Boolean): Self = this.set("showActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: TextSettings): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: `false` | Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `false` | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
}
