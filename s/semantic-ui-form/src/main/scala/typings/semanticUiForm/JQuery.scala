package typings.semanticUiForm

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery.TriggeredEvent
import typings.semanticUiForm.SemanticUI.Form
import typings.semanticUiForm.SemanticUI.Form.ClassNameSettings
import typings.semanticUiForm.SemanticUI.Form.ErrorSettings
import typings.semanticUiForm.SemanticUI.Form.Field
import typings.semanticUiForm.SemanticUI.Form.Fields
import typings.semanticUiForm.SemanticUI.Form.MetadataSettings
import typings.semanticUiForm.SemanticUI.Form.PromptSettings
import typings.semanticUiForm.SemanticUI.Form.Rule
import typings.semanticUiForm.SemanticUI.Form.Rules
import typings.semanticUiForm.SemanticUI.Form.SelectorSettings
import typings.semanticUiForm.SemanticUI.Form.TemplatesSettings
import typings.semanticUiForm.SemanticUI.Form.TextSettings
import typings.semanticUiForm.SemanticUI.FormSettings
import typings.semanticUiForm.semanticUiFormStrings.`add errors`
import typings.semanticUiForm.semanticUiFormStrings.`add field`
import typings.semanticUiForm.semanticUiFormStrings.`add fields`
import typings.semanticUiForm.semanticUiFormStrings.`add prompt`
import typings.semanticUiForm.semanticUiFormStrings.`add rule`
import typings.semanticUiForm.semanticUiFormStrings.`get change event`
import typings.semanticUiForm.semanticUiFormStrings.`get field`
import typings.semanticUiForm.semanticUiFormStrings.`get validation`
import typings.semanticUiForm.semanticUiFormStrings.`get value`
import typings.semanticUiForm.semanticUiFormStrings.`get values`
import typings.semanticUiForm.semanticUiFormStrings.`has field`
import typings.semanticUiForm.semanticUiFormStrings.`inline`
import typings.semanticUiForm.semanticUiFormStrings.`is valid`
import typings.semanticUiForm.semanticUiFormStrings.`remove field`
import typings.semanticUiForm.semanticUiFormStrings.`remove fields`
import typings.semanticUiForm.semanticUiFormStrings.`remove rule`
import typings.semanticUiForm.semanticUiFormStrings.`remove rules`
import typings.semanticUiForm.semanticUiFormStrings.`set value`
import typings.semanticUiForm.semanticUiFormStrings.`set values`
import typings.semanticUiForm.semanticUiFormStrings.`validate form`
import typings.semanticUiForm.semanticUiFormStrings.blur
import typings.semanticUiForm.semanticUiFormStrings.change
import typings.semanticUiForm.semanticUiFormStrings.className
import typings.semanticUiForm.semanticUiFormStrings.debug
import typings.semanticUiForm.semanticUiFormStrings.defaults
import typings.semanticUiForm.semanticUiFormStrings.delay
import typings.semanticUiForm.semanticUiFormStrings.destroy
import typings.semanticUiForm.semanticUiFormStrings.duration
import typings.semanticUiForm.semanticUiFormStrings.error
import typings.semanticUiForm.semanticUiFormStrings.fields
import typings.semanticUiForm.semanticUiFormStrings.keyboardShortcuts
import typings.semanticUiForm.semanticUiFormStrings.metadata
import typings.semanticUiForm.semanticUiFormStrings.name
import typings.semanticUiForm.semanticUiFormStrings.namespace
import typings.semanticUiForm.semanticUiFormStrings.on
import typings.semanticUiForm.semanticUiFormStrings.onFailure
import typings.semanticUiForm.semanticUiFormStrings.onInvalid
import typings.semanticUiForm.semanticUiFormStrings.onSuccess
import typings.semanticUiForm.semanticUiFormStrings.onValid
import typings.semanticUiForm.semanticUiFormStrings.performance
import typings.semanticUiForm.semanticUiFormStrings.prompt
import typings.semanticUiForm.semanticUiFormStrings.revalidate
import typings.semanticUiForm.semanticUiFormStrings.rules
import typings.semanticUiForm.semanticUiFormStrings.selector
import typings.semanticUiForm.semanticUiFormStrings.setting
import typings.semanticUiForm.semanticUiFormStrings.silent
import typings.semanticUiForm.semanticUiFormStrings.submit
import typings.semanticUiForm.semanticUiFormStrings.templates
import typings.semanticUiForm.semanticUiFormStrings.text
import typings.semanticUiForm.semanticUiFormStrings.transition
import typings.semanticUiForm.semanticUiFormStrings.verbose
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def form(): JQuery
  def form(behavior: setting, name: `inline`, value: Boolean): JQuery
  def form(behavior: setting, name: `inline`, value: Unit): Boolean
  def form(behavior: setting, name: className, value: Unit): ClassNameSettings
  def form(behavior: setting, name: className, value: ClassNameSettings): JQuery
  def form(behavior: setting, name: debug, value: Boolean): JQuery
  def form(behavior: setting, name: debug, value: Unit): Boolean
  def form(behavior: setting, name: defaults, value: StringDictionary[Field]): JQuery
  def form(behavior: setting, name: defaults, value: Unit): StringDictionary[Field]
  def form(behavior: setting, name: delay, value: Boolean): JQuery
  def form(behavior: setting, name: delay, value: Unit): Boolean
  def form(behavior: setting, name: duration, value: Double): JQuery
  def form(behavior: setting, name: duration, value: Unit): Double
  def form(behavior: setting, name: error, value: Unit): ErrorSettings
  def form(behavior: setting, name: error, value: ErrorSettings): JQuery
  def form(behavior: setting, name: fields, value: StringDictionary[String | js.Array[String] | Field]): JQuery
  def form(behavior: setting, name: fields, value: Unit): StringDictionary[String | js.Array[String] | Field]
  def form(behavior: setting, name: keyboardShortcuts, value: Boolean): JQuery
  def form(behavior: setting, name: keyboardShortcuts, value: Unit): Boolean
  def form(behavior: setting, name: metadata, value: Unit): MetadataSettings
  def form(behavior: setting, name: metadata, value: MetadataSettings): JQuery
  def form(behavior: setting, name: namespace, value: String): JQuery
  def form(behavior: setting, name: namespace, value: Unit): String
  def form(behavior: setting, name: name, value: String): JQuery
  def form(behavior: setting, name: name, value: Unit): String
  def form(
    behavior: setting,
    name: onFailure,
    value: js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit]
  ): JQuery
  def form(behavior: setting, name: onFailure, value: Unit): js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit]
  def form(behavior: setting, name: onInvalid, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def form(behavior: setting, name: onInvalid, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def form(
    behavior: setting,
    name: onSuccess,
    value: js.ThisFunction2[
      /* this */ JQuery, 
      /* event */ TriggeredEvent[HTMLElement, js.Any, js.Any, js.Any], 
      /* fields */ js.Any, 
      Unit
    ]
  ): JQuery
  def form(behavior: setting, name: onSuccess, value: Unit): js.ThisFunction2[
    /* this */ JQuery, 
    /* event */ TriggeredEvent[HTMLElement, js.Any, js.Any, js.Any], 
    /* fields */ js.Any, 
    Unit
  ]
  def form(behavior: setting, name: onValid, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def form(behavior: setting, name: onValid, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def form(behavior: setting, name: on, value: Unit): submit | blur | change
  def form(behavior: setting, name: on, value: blur): JQuery
  def form(behavior: setting, name: on, value: change): JQuery
  def form(behavior: setting, name: on, value: submit): JQuery
  def form(behavior: setting, name: performance, value: Boolean): JQuery
  def form(behavior: setting, name: performance, value: Unit): Boolean
  def form(behavior: setting, name: prompt, value: Unit): PromptSettings
  def form(behavior: setting, name: prompt, value: PromptSettings): JQuery
  def form(behavior: setting, name: revalidate, value: Boolean): JQuery
  def form(behavior: setting, name: revalidate, value: Unit): Boolean
  def form(
    behavior: setting,
    name: rules,
    value: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]]
  ): JQuery
  def form(behavior: setting, name: rules, value: Unit): StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]]
  def form(behavior: setting, name: selector, value: Unit): SelectorSettings
  def form(behavior: setting, name: selector, value: SelectorSettings): JQuery
  def form(behavior: setting, name: silent, value: Boolean): JQuery
  def form(behavior: setting, name: silent, value: Unit): Boolean
  def form(behavior: setting, name: templates, value: Unit): TemplatesSettings
  def form(behavior: setting, name: templates, value: TemplatesSettings): JQuery
  def form(behavior: setting, name: text, value: Unit): TextSettings
  def form(behavior: setting, name: text, value: TextSettings): JQuery
  def form(behavior: setting, name: transition, value: String): JQuery
  def form(behavior: setting, name: transition, value: Unit): String
  def form(behavior: setting, name: verbose, value: Boolean): JQuery
  def form(behavior: setting, name: verbose, value: Unit): Boolean
  def form(settings: Fields): JQuery
  def form(settings: FormSettings): JQuery
  @JSName("form")
  var form_Original: Form
  /**
    * Adds errors to form, given an array errors
    */
  @JSName("form")
  def form_adderrors(behavior: `add errors`, errors: js.Array[String]): JQuery
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  @JSName("form")
  def form_addfield(behavior: `add field`, field: String, rules: String): JQuery
  @JSName("form")
  def form_addfield(behavior: `add field`, field: String, rules: js.Array[String]): JQuery
  @JSName("form")
  def form_addfield(behavior: `add field`, field: String, rules: Rules): JQuery
  /**
    * Adds fields object to existing fields
    * @since 2.2.11
    */
  @JSName("form")
  def form_addfields(behavior: `add fields`, fields: Fields): JQuery
  /**
    * Adds error prompt to the field with the given identifier
    */
  @JSName("form")
  def form_addprompt(behavior: `add prompt`, identifier: String, errors: String): JQuery
  @JSName("form")
  def form_addprompt(behavior: `add prompt`, identifier: String, errors: js.Array[String]): JQuery
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  @JSName("form")
  def form_addrule(behavior: `add rule`, field: String, rules: String): JQuery
  @JSName("form")
  def form_addrule(behavior: `add rule`, field: String, rules: js.Array[String]): JQuery
  @JSName("form")
  def form_addrule(behavior: `add rule`, field: String, rules: Rules): JQuery
  @JSName("form")
  def form_destroy(behavior: destroy): JQuery
  /**
    * gets browser property change event
    */
  @JSName("form")
  def form_getchangeevent(behavior: `get change event`): String
  /**
    * Returns element with matching name, id, or data-validate metadata to ID
    */
  @JSName("form")
  def form_getfield(behavior: `get field`, id: String): JQuery
  /**
    * Returns validation rules for a given jQuery-referenced input field
    */
  @JSName("form")
  def form_getvalidation(behavior: `get validation`, element: JQuery): js.Any
  /**
    * Returns value of element with id
    */
  @JSName("form")
  def form_getvalue(behavior: `get value`, id: String): js.Any
  /**
    * Returns object of element values that match array of ids. If no IDS are passed will return all fields
    */
  @JSName("form")
  def form_getvalues(behavior: `get values`): js.Any
  @JSName("form")
  def form_getvalues(behavior: `get values`, ids: js.Array[String]): js.Any
  /**
    * Returns whether a field exists
    */
  @JSName("form")
  def form_hasfield(behavior: `has field`, identifier: String): Boolean
  /**
    * Returns true/false whether a form passes its validation rules
    */
  @JSName("form")
  def form_isvalid(behavior: `is valid`): Boolean
  /**
    * Returns true/false whether a field passes its validation rules
    */
  @JSName("form")
  def form_isvalid(behavior: `is valid`, field: String): Boolean
  /**
    * Remove all validation for a field
    * @since 2.2.11
    */
  @JSName("form")
  def form_removefield(behavior: `remove field`, field: String): JQuery
  /**
    * @since 2.2.11
    */
  @JSName("form")
  def form_removefields(behavior: `remove fields`, fields: js.Array[String]): JQuery
  /**
    * Removes specific rule from field leaving other rules
    * @since 2.2.11
    */
  @JSName("form")
  def form_removerule(behavior: `remove rule`, field: String, rule: Rule): JQuery
  /**
    * @since 2.2.11
    */
  @JSName("form")
  def form_removerules(behavior: `remove rules`, fields: String, rules: js.Array[Rule]): JQuery
  @JSName("form")
  def form_removerules(behavior: `remove rules`, fields: js.Array[String], rules: js.Array[Rule]): JQuery
  @JSName("form")
  def form_setting(behavior: setting, value: FormSettings): JQuery
  /**
    * Sets value of element with id
    */
  @JSName("form")
  def form_setvalue(behavior: `set value`, id: String): JQuery
  /**
    * Sets key/value pairs from passed values object to matching ids
    */
  @JSName("form")
  def form_setvalues(behavior: `set values`, values: js.Any): JQuery
  /**
    * Submits selected form
    */
  @JSName("form")
  def form_submit(behavior: submit): JQuery
  /**
    * Validates form and calls onSuccess or onFailure
    */
  @JSName("form")
  def form_validateform(behavior: `validate form`): JQuery
}
object JQuery {
  
  inline def apply(form: Form): JQuery = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setForm(value: Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
  }
}
