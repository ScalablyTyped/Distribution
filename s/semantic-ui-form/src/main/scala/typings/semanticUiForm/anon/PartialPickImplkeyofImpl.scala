package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery.TriggeredEvent
import typings.semanticUiForm.JQuery
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
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  var className: js.UndefOr[ClassNameSettings] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var defaults: js.UndefOr[StringDictionary[Field]] = js.native
  var delay: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var error: js.UndefOr[ErrorSettings] = js.native
  var fields: js.UndefOr[StringDictionary[String | js.Array[String] | Field]] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var keyboardShortcuts: js.UndefOr[Boolean] = js.native
  var metadata: js.UndefOr[MetadataSettings] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var on: js.UndefOr[submit | blur | change] = js.native
  var onFailure: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit]
  ] = js.native
  var onInvalid: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onSuccess: js.UndefOr[
    js.ThisFunction2[
      /* this */ JQuery, 
      /* event */ TriggeredEvent[HTMLElement, _, _, _], 
      /* fields */ js.Any, 
      Unit
    ]
  ] = js.native
  var onValid: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var performance: js.UndefOr[Boolean] = js.native
  var prompt: js.UndefOr[PromptSettings] = js.native
  var revalidate: js.UndefOr[Boolean] = js.native
  var rules: js.UndefOr[
    StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]]
  ] = js.native
  var selector: js.UndefOr[SelectorSettings] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var templates: js.UndefOr[TemplatesSettings] = js.native
  var text: js.UndefOr[TextSettings] = js.native
  var transition: js.UndefOr[String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
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
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDefaults(value: StringDictionary[Field]): Self = this.set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    @scala.inline
    def setDelay(value: Boolean): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFields(value: StringDictionary[String | js.Array[String] | Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setKeyboardShortcuts(value: Boolean): Self = this.set("keyboardShortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardShortcuts: Self = this.set("keyboardShortcuts", js.undefined)
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setOn(value: submit | blur | change): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setOnFailure(
      value: js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit]
    ): Self = this.set("onFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    @scala.inline
    def setOnInvalid(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onInvalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    @scala.inline
    def setOnSuccess(
      value: js.ThisFunction2[
          /* this */ JQuery, 
          /* event */ TriggeredEvent[HTMLElement, _, _, _], 
          /* fields */ js.Any, 
          Unit
        ]
    ): Self = this.set("onSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    @scala.inline
    def setOnValid(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onValid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnValid: Self = this.set("onValid", js.undefined)
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    @scala.inline
    def setPrompt(value: PromptSettings): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    @scala.inline
    def setRevalidate(value: Boolean): Self = this.set("revalidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevalidate: Self = this.set("revalidate", js.undefined)
    @scala.inline
    def setRules(value: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setTemplates(value: TemplatesSettings): Self = this.set("templates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
    @scala.inline
    def setText(value: TextSettings): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

