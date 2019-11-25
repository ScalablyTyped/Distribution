package typings.semanticDashUiDashForm.SemanticUI

import typings.semanticDashUiDashForm.JQuery
import typings.semanticDashUiDashForm.SemanticUI.Form.Fields
import typings.semanticDashUiDashForm.SemanticUI.Form.Rule
import typings.semanticDashUiDashForm.SemanticUI.Form.Rules
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`add errors`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`add field`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`add fields`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`add prompt`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`add rule`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`get change event`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`get field`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`get validation`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`get value`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`get values`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`has field`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`is valid`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`remove field`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`remove fields`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`remove rule`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`remove rules`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`set value`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`set values`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`validate form`
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.destroy
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.setting
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Form")
@js.native
trait Form_ extends js.Object {
  var settings: FormSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Adds errors to form, given an array errors
    */
  def apply(behavior: `add errors`, errors: js.Array[String]): JQuery = js.native
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  def apply(behavior: `add field`, field: String, rules: String): JQuery = js.native
  def apply(behavior: `add field`, field: String, rules: js.Array[String]): JQuery = js.native
  def apply(behavior: `add field`, field: String, rules: Rules): JQuery = js.native
  /**
    * Adds fields object to existing fields
    * @since 2.2.11
    */
  def apply(behavior: `add fields`, fields: Fields): JQuery = js.native
  /**
    * Adds error prompt to the field with the given identifier
    */
  def apply(behavior: `add prompt`, identifier: String, errors: String): JQuery = js.native
  def apply(behavior: `add prompt`, identifier: String, errors: js.Array[String]): JQuery = js.native
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  def apply(behavior: `add rule`, field: String, rules: String): JQuery = js.native
  def apply(behavior: `add rule`, field: String, rules: js.Array[String]): JQuery = js.native
  def apply(behavior: `add rule`, field: String, rules: Rules): JQuery = js.native
  /**
    * gets browser property change event
    */
  def apply(behavior: `get change event`): String = js.native
  /**
    * Returns element with matching name, id, or data-validate metadata to ID
    */
  def apply(behavior: `get field`, id: String): JQuery = js.native
  /**
    * Returns validation rules for a given jQuery-referenced input field
    */
  def apply(behavior: `get validation`, element: JQuery): js.Any = js.native
  /**
    * Returns value of element with id
    */
  def apply(behavior: `get value`, id: String): js.Any = js.native
  /**
    * Returns object of element values that match array of ids. If no IDS are passed will return all fields
    */
  def apply(behavior: `get values`): js.Any = js.native
  def apply(behavior: `get values`, ids: js.Array[String]): js.Any = js.native
  /**
    * Returns whether a field exists
    */
  def apply(behavior: `has field`, identifier: String): Boolean = js.native
  /**
    * Returns true/false whether a form passes its validation rules
    */
  def apply(behavior: `is valid`): Boolean = js.native
  /**
    * Returns true/false whether a field passes its validation rules
    */
  def apply(behavior: `is valid`, field: String): Boolean = js.native
  /**
    * Remove all validation for a field
    * @since 2.2.11
    */
  def apply(behavior: `remove field`, field: String): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `remove fields`, fields: js.Array[String]): JQuery = js.native
  /**
    * Removes specific rule from field leaving other rules
    * @since 2.2.11
    */
  def apply(behavior: `remove rule`, field: String, rule: Rule): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `remove rules`, fields: String, rules: js.Array[Rule]): JQuery = js.native
  def apply(behavior: `remove rules`, fields: js.Array[String], rules: js.Array[Rule]): JQuery = js.native
  /**
    * Sets value of element with id
    */
  def apply(behavior: `set value`, id: String): JQuery = js.native
  /**
    * Sets key/value pairs from passed values object to matching ids
    */
  def apply(behavior: `set values`, values: js.Any): JQuery = js.native
  /**
    * Validates form and calls onSuccess or onFailure
    */
  def apply(behavior: `validate form`): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: setting, value: FormSettings): JQuery = js.native
  /**
    * Submits selected form
    */
  def apply(behavior: submit): JQuery = js.native
  def apply(settings: Fields): JQuery = js.native
  def apply(settings: FormSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-form.SemanticUI.FormSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-form.SemanticUI.FormSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

