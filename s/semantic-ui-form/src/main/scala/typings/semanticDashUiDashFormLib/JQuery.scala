package typings
package semanticDashUiDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("form")
  var form_Original: semanticDashUiDashFormLib.SemanticUINs.Form = js.native
  def form(): JQuery = js.native
  def form(settings: semanticDashUiDashFormLib.SemanticUINs.FormNs.Fields): JQuery = js.native
  def form(settings: semanticDashUiDashFormLib.SemanticUINs.FormSettings): JQuery = js.native
  /**
    * Adds errors to form, given an array errors
    */
  @JSName("form")
  def form_adderrors(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add errors`,
    errors: js.Array[java.lang.String]
  ): JQuery = js.native
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  @JSName("form")
  def form_addfield(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add field`,
    field: java.lang.String,
    rules: java.lang.String
  ): JQuery = js.native
  @JSName("form")
  def form_addfield(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add field`,
    field: java.lang.String,
    rules: js.Array[java.lang.String]
  ): JQuery = js.native
  @JSName("form")
  def form_addfield(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add field`,
    field: java.lang.String,
    rules: semanticDashUiDashFormLib.SemanticUINs.FormNs.Rules
  ): JQuery = js.native
  /**
    * Adds fields object to existing fields
    * @since 2.2.11
    */
  @JSName("form")
  def form_addfields(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add fields`,
    fields: semanticDashUiDashFormLib.SemanticUINs.FormNs.Fields
  ): JQuery = js.native
  /**
    * Adds error prompt to the field with the given identifier
    */
  @JSName("form")
  def form_addprompt(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add prompt`,
    identifier: java.lang.String,
    errors: java.lang.String
  ): JQuery = js.native
  @JSName("form")
  def form_addprompt(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add prompt`,
    identifier: java.lang.String,
    errors: js.Array[java.lang.String]
  ): JQuery = js.native
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  @JSName("form")
  def form_addrule(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add rule`,
    field: java.lang.String,
    rules: java.lang.String
  ): JQuery = js.native
  @JSName("form")
  def form_addrule(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add rule`,
    field: java.lang.String,
    rules: js.Array[java.lang.String]
  ): JQuery = js.native
  @JSName("form")
  def form_addrule(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add rule`,
    field: java.lang.String,
    rules: semanticDashUiDashFormLib.SemanticUINs.FormNs.Rules
  ): JQuery = js.native
  @JSName("form")
  def form_destroy(behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.destroy): JQuery = js.native
  /**
    * gets browser property change event
    */
  @JSName("form")
  def form_getchangeevent(behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`get change event`): java.lang.String = js.native
  /**
    * Returns element with matching name, id, or data-validate metadata to ID
    */
  @JSName("form")
  def form_getfield(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`get field`,
    id: java.lang.String
  ): JQuery = js.native
  /**
    * Returns validation rules for a given jQuery-referenced input field
    */
  @JSName("form")
  def form_getvalidation(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`get validation`,
    element: JQuery
  ): js.Any = js.native
  /**
    * Returns value of element with id
    */
  @JSName("form")
  def form_getvalue(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`get value`,
    id: java.lang.String
  ): js.Any = js.native
  /**
    * Returns object of element values that match array of ids. If no IDS are passed will return all fields
    */
  @JSName("form")
  def form_getvalues(behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`get values`): js.Any = js.native
  @JSName("form")
  def form_getvalues(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`get values`,
    ids: js.Array[java.lang.String]
  ): js.Any = js.native
  /**
    * Returns whether a field exists
    */
  @JSName("form")
  def form_hasfield(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`has field`,
    identifier: java.lang.String
  ): scala.Boolean = js.native
  /**
    * Returns true/false whether a form passes its validation rules
    */
  @JSName("form")
  def form_isvalid(behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`is valid`): scala.Boolean = js.native
  /**
    * Returns true/false whether a field passes its validation rules
    */
  @JSName("form")
  def form_isvalid(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`is valid`,
    field: java.lang.String
  ): scala.Boolean = js.native
  /**
    * Remove all validation for a field
    * @since 2.2.11
    */
  @JSName("form")
  def form_removefield(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`remove field`,
    field: java.lang.String
  ): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("form")
  def form_removefields(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`remove fields`,
    fields: js.Array[java.lang.String]
  ): JQuery = js.native
  /**
    * Removes specific rule from field leaving other rules
    * @since 2.2.11
    */
  @JSName("form")
  def form_removerule(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`remove rule`,
    field: java.lang.String,
    rule: semanticDashUiDashFormLib.SemanticUINs.FormNs.Rule
  ): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("form")
  def form_removerules(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`remove rules`,
    fields: java.lang.String,
    rules: js.Array[semanticDashUiDashFormLib.SemanticUINs.FormNs.Rule]
  ): JQuery = js.native
  @JSName("form")
  def form_removerules(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`remove rules`,
    fields: js.Array[java.lang.String],
    rules: js.Array[semanticDashUiDashFormLib.SemanticUINs.FormNs.Rule]
  ): JQuery = js.native
  @JSName("form")
  def form_setting(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.setting,
    value: semanticDashUiDashFormLib.SemanticUINs.FormSettings
  ): JQuery = js.native
  @JSName("form")
  def form_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-form.SemanticUI.FormSettings._Impl[K] */ js.Any = js.native
  @JSName("form")
  def form_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-form.SemanticUI.FormSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Sets value of element with id
    */
  @JSName("form")
  def form_setvalue(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`set value`,
    id: java.lang.String
  ): JQuery = js.native
  /**
    * Sets key/value pairs from passed values object to matching ids
    */
  @JSName("form")
  def form_setvalues(behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`set values`, values: js.Any): JQuery = js.native
  /**
    * Submits selected form
    */
  @JSName("form")
  def form_submit(behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.submit): JQuery = js.native
  /**
    * Validates form and calls onSuccess or onFailure
    */
  @JSName("form")
  def form_validateform(behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`validate form`): JQuery = js.native
}

