package typings
package reduxDashFormLib.libReducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormState extends js.Object {
  var active: js.UndefOr[java.lang.String] = js.undefined
  var anyTouched: js.UndefOr[scala.Boolean] = js.undefined
  var fields: js.UndefOr[org.scalablytyped.runtime.StringDictionary[FieldState]] = js.undefined
  var registeredFields: js.Array[RegisteredFieldState]
  var submitErrors: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var submitFailed: js.UndefOr[scala.Boolean] = js.undefined
  var submitting: js.UndefOr[scala.Boolean] = js.undefined
  var values: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object FormState {
  @scala.inline
  def apply(
    registeredFields: js.Array[RegisteredFieldState],
    active: java.lang.String = null,
    anyTouched: js.UndefOr[scala.Boolean] = js.undefined,
    fields: org.scalablytyped.runtime.StringDictionary[FieldState] = null,
    submitErrors: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    submitFailed: js.UndefOr[scala.Boolean] = js.undefined,
    submitting: js.UndefOr[scala.Boolean] = js.undefined,
    values: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): FormState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registeredFields")(registeredFields)
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

