package typings
package semanticDashUiDashFormLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Form extends js.Object {
  var settings: FormSettings = js.native
  def apply(): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * Adds errors to form, given an array errors
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add errors`,
    errors: js.Array[java.lang.String]
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * Adds rule to existing rules for field
           * @since 2.2.11
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add field`,
    field: java.lang.String,
    rules: java.lang.String
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * Adds rule to existing rules for field
           * @since 2.2.11
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add field`,
    field: java.lang.String,
    rules: js.Array[java.lang.String]
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * Adds rule to existing rules for field
           * @since 2.2.11
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add field`,
    field: java.lang.String,
    rules: semanticDashUiDashFormLib.SemanticUINs.FormNs.Rules
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * Adds fields object to existing fields
           * @since 2.2.11
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add fields`,
    fields: semanticDashUiDashFormLib.SemanticUINs.FormNs.Fields
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * Adds error prompt to the field with the given identifier
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add prompt`,
    identifier: java.lang.String,
    errors: java.lang.String
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * Adds error prompt to the field with the given identifier
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add prompt`,
    identifier: java.lang.String,
    errors: js.Array[java.lang.String]
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * Adds rule to existing rules for field
           * @since 2.2.11
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add rule`,
    field: java.lang.String,
    rules: java.lang.String
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * Adds rule to existing rules for field
           * @since 2.2.11
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add rule`,
    field: java.lang.String,
    rules: js.Array[java.lang.String]
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * Adds rule to existing rules for field
           * @since 2.2.11
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`add rule`,
    field: java.lang.String,
    rules: semanticDashUiDashFormLib.SemanticUINs.FormNs.Rules
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * gets browser property change event
           */
  def apply(behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`get change event`): java.lang.String = js.native
  /**
           * Returns element with matching name, id, or data-validate metadata to ID
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`get field`,
    id: java.lang.String
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * Returns validation rules for a given jQuery-referenced input field
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`get validation`,
    element: semanticDashUiDashFormLib.JQuery
  ): js.Any = js.native
  /**
           * Returns value of element with id
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`get value`,
    id: java.lang.String
  ): js.Any = js.native
  /**
           * Returns object of element values that match array of ids. If no IDS are passed will return all fields
           */
  def apply(behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`get values`): js.Any = js.native
  /**
           * Returns object of element values that match array of ids. If no IDS are passed will return all fields
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`get values`,
    ids: js.Array[java.lang.String]
  ): js.Any = js.native
  /**
           * Returns whether a field exists
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`has field`,
    identifier: java.lang.String
  ): scala.Boolean = js.native
  /**
           * Returns true/false whether a form passes its validation rules
           */
  def apply(behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`is valid`): scala.Boolean = js.native
  /**
           * Returns true/false whether a field passes its validation rules
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`is valid`,
    field: java.lang.String
  ): scala.Boolean = js.native
  /**
           * Remove all validation for a field
           * @since 2.2.11
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`remove field`,
    field: java.lang.String
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * @since 2.2.11
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`remove fields`,
    fields: js.Array[java.lang.String]
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * Removes specific rule from field leaving other rules
           * @since 2.2.11
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`remove rule`,
    field: java.lang.String,
    rule: semanticDashUiDashFormLib.SemanticUINs.FormNs.Rule
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * @since 2.2.11
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`remove rules`,
    fields: java.lang.String,
    rules: js.Array[semanticDashUiDashFormLib.SemanticUINs.FormNs.Rule]
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * @since 2.2.11
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`remove rules`,
    fields: js.Array[java.lang.String],
    rules: js.Array[semanticDashUiDashFormLib.SemanticUINs.FormNs.Rule]
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * Sets value of element with id
           */
  def apply(
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`set value`,
    id: java.lang.String
  ): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * Sets key/value pairs from passed values object to matching ids
           */
  def apply(behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`set values`, values: js.Any): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * Validates form and calls onSuccess or onFailure
           */
  def apply(behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.`validate form`): semanticDashUiDashFormLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.destroy): semanticDashUiDashFormLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.setting, value: FormSettings): semanticDashUiDashFormLib.JQuery = js.native
  /**
           * Submits selected form
           */
  def apply(behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.submit): semanticDashUiDashFormLib.JQuery = js.native
  def apply(settings: semanticDashUiDashFormLib.SemanticUINs.FormNs.Fields): semanticDashUiDashFormLib.JQuery = js.native
  def apply(settings: FormSettings): semanticDashUiDashFormLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.setting, name: K): js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashFormLib.semanticDashUiDashFormLibStrings.setting,
    name: K,
    value: js.Any
  ): semanticDashUiDashFormLib.JQuery = js.native
}

