package typings.semanticUiForm

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery_.TriggeredEvent
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
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, keyof semantic-ui-form.SemanticUI.FormSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var defaults: js.UndefOr[StringDictionary[Field]] = js.undefined
  var delay: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var fields: js.UndefOr[StringDictionary[String | js.Array[String] | Field]] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var keyboardShortcuts: js.UndefOr[Boolean] = js.undefined
  var metadata: js.UndefOr[MetadataSettings] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var on: js.UndefOr[submit | blur | change] = js.undefined
  var onFailure: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit]
  ] = js.undefined
  var onInvalid: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onSuccess: js.UndefOr[
    js.ThisFunction2[
      /* this */ JQuery, 
      /* event */ TriggeredEvent[HTMLElement, _, _, _], 
      /* fields */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var onValid: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var prompt: js.UndefOr[PromptSettings] = js.undefined
  var revalidate: js.UndefOr[Boolean] = js.undefined
  var rules: js.UndefOr[
    StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]]
  ] = js.undefined
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var templates: js.UndefOr[TemplatesSettings] = js.undefined
  var text: js.UndefOr[TextSettings] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    className: ClassNameSettings = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    defaults: StringDictionary[Field] = null,
    delay: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    error: ErrorSettings = null,
    fields: StringDictionary[String | js.Array[String] | Field] = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    keyboardShortcuts: js.UndefOr[Boolean] = js.undefined,
    metadata: MetadataSettings = null,
    name: String = null,
    namespace: String = null,
    on: submit | blur | change = null,
    onFailure: js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit] = null,
    onInvalid: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onSuccess: js.ThisFunction2[
      /* this */ JQuery, 
      /* event */ TriggeredEvent[HTMLElement, _, _, _], 
      /* fields */ js.Any, 
      Unit
    ] = null,
    onValid: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    prompt: PromptSettings = null,
    revalidate: js.UndefOr[Boolean] = js.undefined,
    rules: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]] = null,
    selector: SelectorSettings = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    templates: TemplatesSettings = null,
    text: TextSettings = null,
    transition: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardShortcuts)) __obj.updateDynamic("keyboardShortcuts")(keyboardShortcuts.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure.asInstanceOf[js.Any])
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(onInvalid.asInstanceOf[js.Any])
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess.asInstanceOf[js.Any])
    if (onValid != null) __obj.updateDynamic("onValid")(onValid.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (!js.isUndefined(revalidate)) __obj.updateDynamic("revalidate")(revalidate.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

