package typings.semanticUiForm.SemanticUI.FormSettings

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery.TriggeredEvent
import typings.semanticUiForm.SemanticUI.Form.ClassNameSettings
import typings.semanticUiForm.SemanticUI.Form.ErrorSettings
import typings.semanticUiForm.SemanticUI.Form.Field
import typings.semanticUiForm.SemanticUI.Form.MetadataSettings
import typings.semanticUiForm.SemanticUI.Form.PromptSettings
import typings.semanticUiForm.SemanticUI.Form.SelectorSettings
import typings.semanticUiForm.SemanticUI.Form.TemplatesSettings
import typings.semanticUiForm.SemanticUI.Form.TextSettings
import typings.semanticUiForm.semanticUiFormStrings.blur
import typings.semanticUiForm.semanticUiFormStrings.change
import typings.semanticUiForm.semanticUiFormStrings.submit
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings = js.native
  
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  
  var defaults: StringDictionary[Field] = js.native
  
  /**
    * Delay from last typed letter to validate a field when using on: change or when revalidating a field.
    *
    * @default true
    */
  var delay: Boolean = js.native
  
  /**
    * Animation speed for inline prompt
    *
    * @default 150
    */
  var duration: Double = js.native
  
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  
  var fields: StringDictionary[String | js.Array[String] | Field] = js.native
  
  /**
    * Adds inline error on field validation error
    *
    * @default false
    */
  var `inline`: Boolean = js.native
  
  // region Form Settings
  /**
    * Adds keyboard shortcuts for enter and escape keys to submit form and blur fields respectively
    *
    * @default true
    */
  var keyboardShortcuts: Boolean = js.native
  
  /**
    * HTML5 metadata attributes
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
    * Event used to trigger validation. Can be either submit, blur or change.
    *
    * @default 'submit'
    */
  var on: submit | blur | change = js.native
  
  /**
    * Callback if any form field is invalid
    */
  def onFailure(formErrors: js.Array[String], fields: js.Any): Unit = js.native
  
  /**
    * Callback on each invalid field
    */
  def onInvalid(): Unit = js.native
  
  /**
    * Callback if a form is all valid
    */
  def onSuccess(event: TriggeredEvent[HTMLElement, _, _, _], fields: js.Any): Unit = js.native
  
  // endregion
  // region Callbacks
  /**
    * Callback on each valid field
    */
  def onValid(): Unit = js.native
  
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  
  var prompt: PromptSettings = js.native
  
  /**
    * If set to true will revalidate fields with errors on input change
    *
    * @default true
    */
  var revalidate: Boolean = js.native
  
  // endregion
  // region Rules
  var rules: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]] = js.native
  
  // endregion
  // region DOM Settings
  /**
    * Selectors used to match functionality to DOM
    */
  var selector: SelectorSettings = js.native
  
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  
  // endregion
  // region Templates
  var templates: TemplatesSettings = js.native
  
  // endregion
  // region Form Prompts
  var text: TextSettings = js.native
  
  /**
    * Named transition to use when animating validation errors. Fade and slide down are available without including ui transitions
    *
    * @default 'scale'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: String = js.native
  
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
}
object Impl {
  
  @scala.inline
  def apply(
    className: ClassNameSettings,
    debug: Boolean,
    defaults: StringDictionary[Field],
    delay: Boolean,
    duration: Double,
    error: ErrorSettings,
    fields: StringDictionary[String | js.Array[String] | Field],
    `inline`: Boolean,
    keyboardShortcuts: Boolean,
    metadata: MetadataSettings,
    name: String,
    namespace: String,
    on: submit | blur | change,
    onFailure: (js.Array[String], js.Any) => Unit,
    onInvalid: () => Unit,
    onSuccess: (TriggeredEvent[HTMLElement, _, _, _], js.Any) => Unit,
    onValid: () => Unit,
    performance: Boolean,
    prompt: PromptSettings,
    revalidate: Boolean,
    rules: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]],
    selector: SelectorSettings,
    silent: Boolean,
    templates: TemplatesSettings,
    text: TextSettings,
    transition: String,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onFailure = js.Any.fromFunction2(onFailure), onInvalid = js.Any.fromFunction0(onInvalid), onSuccess = js.Any.fromFunction2(onSuccess), onValid = js.Any.fromFunction0(onValid), performance = performance.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], revalidate = revalidate.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
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
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaults(value: StringDictionary[Field]): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Boolean): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: StringDictionary[String | js.Array[String] | Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardShortcuts(value: Boolean): Self = this.set("keyboardShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn(value: submit | blur | change): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFailure(value: (js.Array[String], js.Any) => Unit): Self = this.set("onFailure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnInvalid(value: () => Unit): Self = this.set("onInvalid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSuccess(value: (TriggeredEvent[HTMLElement, _, _, _], js.Any) => Unit): Self = this.set("onSuccess", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnValid(value: () => Unit): Self = this.set("onValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrompt(value: PromptSettings): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevalidate(value: Boolean): Self = this.set("revalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplates(value: TemplatesSettings): Self = this.set("templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: TextSettings): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
}
