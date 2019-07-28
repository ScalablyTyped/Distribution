package typings.semanticDashUiDashForm.SemanticUINs.FormSettingsNs

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryNs.TriggeredEvent
import typings.semanticDashUiDashForm.JQuery
import typings.semanticDashUiDashForm.SemanticUINs.FormNs.ClassNameSettings
import typings.semanticDashUiDashForm.SemanticUINs.FormNs.ErrorSettings
import typings.semanticDashUiDashForm.SemanticUINs.FormNs.Field
import typings.semanticDashUiDashForm.SemanticUINs.FormNs.MetadataSettings
import typings.semanticDashUiDashForm.SemanticUINs.FormNs.PromptSettings
import typings.semanticDashUiDashForm.SemanticUINs.FormNs.SelectorSettings
import typings.semanticDashUiDashForm.SemanticUINs.FormNs.TemplatesSettings
import typings.semanticDashUiDashForm.SemanticUINs.FormNs.TextSettings
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.blur
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.change
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.submit
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings
  /**
    * Debug output to console
    */
  var debug: Boolean
  var defaults: StringDictionary[Field]
  /**
    * Delay from last typed letter to validate a field when using on: change or when revalidating a field.
    *
    * @default true
    */
  var delay: Boolean
  /**
    * Animation speed for inline prompt
    *
    * @default 150
    */
  var duration: Double
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  var fields: StringDictionary[String | js.Array[String] | Field]
  /**
    * Adds inline error on field validation error
    *
    * @default false
    */
  var `inline`: Boolean
  // region Form Settings
  /**
    * Adds keyboard shortcuts for enter and escape keys to submit form and blur fields respectively
    *
    * @default true
    */
  var keyboardShortcuts: Boolean
  /**
    * HTML5 metadata attributes
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
    * Event used to trigger validation. Can be either submit, blur or change.
    *
    * @default 'submit'
    */
  var on: submit | blur | change
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  var prompt: PromptSettings
  /**
    * If set to true will revalidate fields with errors on input change
    *
    * @default true
    */
  var revalidate: Boolean
  // endregion
  // region Rules
  var rules: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]]
  // endregion
  // region DOM Settings
  /**
    * Selectors used to match functionality to DOM
    */
  var selector: SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  // endregion
  // region Templates
  var templates: TemplatesSettings
  // endregion
  // region Form Prompts
  var text: TextSettings
  /**
    * Named transition to use when animating validation errors. Fade and slide down are available without including ui transitions
    *
    * @default 'scale'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: String
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * Callback if any form field is invalid
    */
  def onFailure(`this`: JQuery, formErrors: js.Array[String], fields: js.Any): Unit
  /**
    * Callback on each invalid field
    */
  def onInvalid(`this`: JQuery): Unit
  /**
    * Callback if a form is all valid
    */
  def onSuccess(`this`: JQuery, event: TriggeredEvent[HTMLElement, _, _, _], fields: js.Any): Unit
  // endregion
  // region Callbacks
  /**
    * Callback on each valid field
    */
  def onValid(`this`: JQuery): Unit
}

object _Impl {
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
    onFailure: (JQuery, js.Array[String], js.Any) => Unit,
    onInvalid: JQuery => Unit,
    onSuccess: (JQuery, TriggeredEvent[HTMLElement, _, _, _], js.Any) => Unit,
    onValid: JQuery => Unit,
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
  ): _Impl = {
    val __obj = js.Dynamic.literal(className = className, debug = debug, defaults = defaults, delay = delay, duration = duration, error = error, fields = fields, keyboardShortcuts = keyboardShortcuts, metadata = metadata, name = name, namespace = namespace, on = on.asInstanceOf[js.Any], onFailure = js.Any.fromFunction3(onFailure), onInvalid = js.Any.fromFunction1(onInvalid), onSuccess = js.Any.fromFunction3(onSuccess), onValid = js.Any.fromFunction1(onValid), performance = performance, prompt = prompt, revalidate = revalidate, rules = rules, selector = selector, silent = silent, templates = templates, text = text, transition = transition, verbose = verbose)
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[_Impl]
  }
}

