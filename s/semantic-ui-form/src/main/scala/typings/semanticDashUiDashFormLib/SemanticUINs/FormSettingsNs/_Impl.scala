package typings
package semanticDashUiDashFormLib.SemanticUINs.FormSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * Class names used to attach style to state
    */
  var className: semanticDashUiDashFormLib.SemanticUINs.FormNs.ClassNameSettings
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  var defaults: /* import warning: ImportType.apply Failed type conversion: {indexed, indexed} */ js.Any
  /**
    * Delay from last typed letter to validate a field when using on: change or when revalidating a field.
    *
    * @default true
    */
  var delay: scala.Boolean
  /**
    * Animation speed for inline prompt
    *
    * @default 150
    */
  var duration: scala.Double
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashFormLib.SemanticUINs.FormNs.ErrorSettings
  var fields: /* import warning: ImportType.apply Failed type conversion: {indexed, indexed} */ js.Any
  /**
    * Adds inline error on field validation error
    *
    * @default false
    */
  var `inline`: scala.Boolean
  // region Form Settings
  /**
    * Adds keyboard shortcuts for enter and escape keys to submit form and blur fields respectively
    *
    * @default true
    */
  var keyboardShortcuts: scala.Boolean
  /**
    * HTML5 metadata attributes
    */
  var metadata: semanticDashUiDashFormLib.SemanticUINs.FormNs.MetadataSettings
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
    * Event used to trigger validation. Can be either submit, blur or change.
    *
    * @default 'submit'
    */
  var on: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.submit | semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.blur | semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.change
  /**
    * Show console.table output with performance metrics
    */
  var performance: scala.Boolean
  var prompt: semanticDashUiDashFormLib.SemanticUINs.FormNs.PromptSettings
  /**
    * If set to true will revalidate fields with errors on input change
    *
    * @default true
    */
  var revalidate: scala.Boolean
  // endregion
  // region Rules
  var rules: /* import warning: ImportType.apply Failed type conversion: {indexed, indexed} */ js.Any
  // endregion
  // region DOM Settings
  /**
    * Selectors used to match functionality to DOM
    */
  var selector: semanticDashUiDashFormLib.SemanticUINs.FormNs.SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  // endregion
  // region Templates
  var templates: semanticDashUiDashFormLib.SemanticUINs.FormNs.TemplatesSettings
  // endregion
  // region Form Prompts
  var text: semanticDashUiDashFormLib.SemanticUINs.FormNs.TextSettings
  /**
    * Named transition to use when animating validation errors. Fade and slide down are available without including ui transitions
    *
    * @default 'scale'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: java.lang.String
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  /**
    * Callback if any form field is invalid
    */
  def onFailure(`this`: semanticDashUiDashFormLib.JQuery, formErrors: js.Array[java.lang.String], fields: js.Any): scala.Unit
  /**
    * Callback on each invalid field
    */
  def onInvalid(`this`: semanticDashUiDashFormLib.JQuery): scala.Unit
  /**
    * Callback if a form is all valid
    */
  def onSuccess(
    `this`: semanticDashUiDashFormLib.JQuery,
    event: jqueryLib.JQueryNs.TriggeredEvent[stdLib.HTMLElement, _, _, _],
    fields: js.Any
  ): scala.Unit
  // endregion
  // region Callbacks
  /**
    * Callback on each valid field
    */
  def onValid(`this`: semanticDashUiDashFormLib.JQuery): scala.Unit
}

