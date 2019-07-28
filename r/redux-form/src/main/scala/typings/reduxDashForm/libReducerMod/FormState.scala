package typings.reduxDashForm.libReducerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormState extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var anyTouched: js.UndefOr[Boolean] = js.undefined
  var fields: js.UndefOr[StringDictionary[FieldState]] = js.undefined
  var registeredFields: js.Array[RegisteredFieldState]
  var submitErrors: js.UndefOr[StringDictionary[String]] = js.undefined
  var submitFailed: js.UndefOr[Boolean] = js.undefined
  var submitting: js.UndefOr[Boolean] = js.undefined
  var values: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object FormState {
  @scala.inline
  def apply(
    registeredFields: js.Array[RegisteredFieldState],
    active: String = null,
    anyTouched: js.UndefOr[Boolean] = js.undefined,
    fields: StringDictionary[FieldState] = null,
    submitErrors: StringDictionary[String] = null,
    submitFailed: js.UndefOr[Boolean] = js.undefined,
    submitting: js.UndefOr[Boolean] = js.undefined,
    values: StringDictionary[js.Any] = null
  ): FormState = {
    val __obj = js.Dynamic.literal(registeredFields = registeredFields)
    if (active != null) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(anyTouched)) __obj.updateDynamic("anyTouched")(anyTouched)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (submitErrors != null) __obj.updateDynamic("submitErrors")(submitErrors)
    if (!js.isUndefined(submitFailed)) __obj.updateDynamic("submitFailed")(submitFailed)
    if (!js.isUndefined(submitting)) __obj.updateDynamic("submitting")(submitting)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[FormState]
  }
}

