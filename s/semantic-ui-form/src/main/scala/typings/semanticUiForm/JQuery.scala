package typings.semanticUiForm

import typings.semanticUiForm.SemanticUI.Form
import typings.semanticUiForm.SemanticUI.Form.Fields
import typings.semanticUiForm.SemanticUI.Form.Rule
import typings.semanticUiForm.SemanticUI.Form.Rules
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
import typings.semanticUiForm.semanticUiFormStrings.`is valid`
import typings.semanticUiForm.semanticUiFormStrings.`remove field`
import typings.semanticUiForm.semanticUiFormStrings.`remove fields`
import typings.semanticUiForm.semanticUiFormStrings.`remove rule`
import typings.semanticUiForm.semanticUiFormStrings.`remove rules`
import typings.semanticUiForm.semanticUiFormStrings.`set value`
import typings.semanticUiForm.semanticUiFormStrings.`set values`
import typings.semanticUiForm.semanticUiFormStrings.`validate form`
import typings.semanticUiForm.semanticUiFormStrings.destroy
import typings.semanticUiForm.semanticUiFormStrings.setting
import typings.semanticUiForm.semanticUiFormStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("form")
  var form_Original: Form = js.native
  def form(): JQuery = js.native
  def form(settings: Fields): JQuery = js.native
  def form(settings: FormSettings): JQuery = js.native
  /**
    * Adds errors to form, given an array errors
    */
  @JSName("form")
  def form_adderrors(behavior: `add errors`, errors: js.Array[String]): JQuery = js.native
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  @JSName("form")
  def form_addfield(behavior: `add field`, field: String, rules: String): JQuery = js.native
  @JSName("form")
  def form_addfield(behavior: `add field`, field: String, rules: js.Array[String]): JQuery = js.native
  @JSName("form")
  def form_addfield(behavior: `add field`, field: String, rules: Rules): JQuery = js.native
  /**
    * Adds fields object to existing fields
    * @since 2.2.11
    */
  @JSName("form")
  def form_addfields(behavior: `add fields`, fields: Fields): JQuery = js.native
  /**
    * Adds error prompt to the field with the given identifier
    */
  @JSName("form")
  def form_addprompt(behavior: `add prompt`, identifier: String, errors: String): JQuery = js.native
  @JSName("form")
  def form_addprompt(behavior: `add prompt`, identifier: String, errors: js.Array[String]): JQuery = js.native
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  @JSName("form")
  def form_addrule(behavior: `add rule`, field: String, rules: String): JQuery = js.native
  @JSName("form")
  def form_addrule(behavior: `add rule`, field: String, rules: js.Array[String]): JQuery = js.native
  @JSName("form")
  def form_addrule(behavior: `add rule`, field: String, rules: Rules): JQuery = js.native
  @JSName("form")
  def form_destroy(behavior: destroy): JQuery = js.native
  /**
    * gets browser property change event
    */
  @JSName("form")
  def form_getchangeevent(behavior: `get change event`): String = js.native
  /**
    * Returns element with matching name, id, or data-validate metadata to ID
    */
  @JSName("form")
  def form_getfield(behavior: `get field`, id: String): JQuery = js.native
  /**
    * Returns validation rules for a given jQuery-referenced input field
    */
  @JSName("form")
  def form_getvalidation(behavior: `get validation`, element: JQuery): js.Any = js.native
  /**
    * Returns value of element with id
    */
  @JSName("form")
  def form_getvalue(behavior: `get value`, id: String): js.Any = js.native
  /**
    * Returns object of element values that match array of ids. If no IDS are passed will return all fields
    */
  @JSName("form")
  def form_getvalues(behavior: `get values`): js.Any = js.native
  @JSName("form")
  def form_getvalues(behavior: `get values`, ids: js.Array[String]): js.Any = js.native
  /**
    * Returns whether a field exists
    */
  @JSName("form")
  def form_hasfield(behavior: `has field`, identifier: String): Boolean = js.native
  /**
    * Returns true/false whether a form passes its validation rules
    */
  @JSName("form")
  def form_isvalid(behavior: `is valid`): Boolean = js.native
  /**
    * Returns true/false whether a field passes its validation rules
    */
  @JSName("form")
  def form_isvalid(behavior: `is valid`, field: String): Boolean = js.native
  /**
    * Remove all validation for a field
    * @since 2.2.11
    */
  @JSName("form")
  def form_removefield(behavior: `remove field`, field: String): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("form")
  def form_removefields(behavior: `remove fields`, fields: js.Array[String]): JQuery = js.native
  /**
    * Removes specific rule from field leaving other rules
    * @since 2.2.11
    */
  @JSName("form")
  def form_removerule(behavior: `remove rule`, field: String, rule: Rule): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("form")
  def form_removerules(behavior: `remove rules`, fields: String, rules: js.Array[Rule]): JQuery = js.native
  @JSName("form")
  def form_removerules(behavior: `remove rules`, fields: js.Array[String], rules: js.Array[Rule]): JQuery = js.native
  @JSName("form")
  def form_setting(behavior: setting, value: FormSettings): JQuery = js.native
  @JSName("form")
  def form_setting[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-form.SemanticUI.FormSettings._Impl[K] */ js.Any = js.native
  @JSName("form")
  def form_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-form.SemanticUI.FormSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Sets value of element with id
    */
  @JSName("form")
  def form_setvalue(behavior: `set value`, id: String): JQuery = js.native
  /**
    * Sets key/value pairs from passed values object to matching ids
    */
  @JSName("form")
  def form_setvalues(behavior: `set values`, values: js.Any): JQuery = js.native
  /**
    * Submits selected form
    */
  @JSName("form")
  def form_submit(behavior: submit): JQuery = js.native
  /**
    * Validates form and calls onSuccess or onFailure
    */
  @JSName("form")
  def form_validateform(behavior: `validate form`): JQuery = js.native
}

