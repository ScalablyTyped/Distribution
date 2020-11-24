package typings.semanticUiCheckbox.SemanticUI.CheckboxSettings

import typings.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings
import typings.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings
import typings.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings
import typings.semanticUiCheckbox.semanticUiCheckboxBooleans.`false`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * Callback before a checkbox is checked. Can cancel change by returning false
    */
  def beforeChecked(): Unit | `false` = js.native
  
  /**
    * Callback before a checkbox is set to determinate. Can cancel change by returning false
    */
  def beforeDeterminate(): Unit | `false` = js.native
  
  /**
    * Callback before a checkbox is set to undeterminate. Can cancel change by returning false
    */
  def beforeIndeterminate(): Unit | `false` = js.native
  
  /**
    * Callback before a checkbox is unchecked. Can cancel change by returning false
    */
  def beforeUnchecked(): Unit | `false` = js.native
  
  /**
    * Class names used to determine element state
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
    * Whether callbacks for checked status should be fired on init as well as change
    *
    * @default false
    */
  var fireOnInit: Boolean = js.native
  
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
  
  // endregion
  // region Callbacks
  /**
    * Callback after a checkbox is either checked or unchecked.
    */
  def onChange(): Unit = js.native
  
  /**
    * Callback after a checkbox is checked.
    */
  def onChecked(): Unit = js.native
  
  /**
    * Callback after a checkbox is set to determinate.
    */
  def onDeterminate(): Unit = js.native
  
  /**
    * Callback after a checkbox is disabled.
    */
  def onDisable(): Unit = js.native
  
  /**
    * Callback after a checkbox is disabled.
    *
    * @deprecated
    */
  def onDisabled(): Unit = js.native
  
  /**
    * Callback after a checkbox is enabled.
    */
  def onEnable(): Unit = js.native
  
  /**
    * Callback after a checkbox is enabled.
    *
    * @deprecated
    */
  def onEnabled(): Unit = js.native
  
  /**
    * Callback after a checkbox is set to undeterminate.
    */
  def onIndeterminate(): Unit = js.native
  
  /**
    * Callback after a checkbox is unchecked.
    */
  def onUnchecked(): Unit = js.native
  
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  
  // endregion
  // region DOM Settings
  /**
    * Selectors used to find parts of a module
    */
  var selector: SelectorSettings = js.native
  
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  
  // region Behavior
  /**
    * Setting to true/false will determine whether an input will allow no selection. Auto will set disallow this behavior only for radio boxes
    *
    * @default 'auto'
    */
  var uncheckable: auto | Boolean = js.native
  
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
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
    def setBeforeChecked(value: () => Unit | `false`): Self = this.set("beforeChecked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeDeterminate(value: () => Unit | `false`): Self = this.set("beforeDeterminate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeIndeterminate(value: () => Unit | `false`): Self = this.set("beforeIndeterminate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeUnchecked(value: () => Unit | `false`): Self = this.set("beforeUnchecked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFireOnInit(value: Boolean): Self = this.set("fireOnInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnChecked(value: () => Unit): Self = this.set("onChecked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDeterminate(value: () => Unit): Self = this.set("onDeterminate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDisable(value: () => Unit): Self = this.set("onDisable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDisabled(value: () => Unit): Self = this.set("onDisabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEnable(value: () => Unit): Self = this.set("onEnable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEnabled(value: () => Unit): Self = this.set("onEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnIndeterminate(value: () => Unit): Self = this.set("onIndeterminate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnUnchecked(value: () => Unit): Self = this.set("onUnchecked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckable(value: auto | Boolean): Self = this.set("uncheckable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
}
