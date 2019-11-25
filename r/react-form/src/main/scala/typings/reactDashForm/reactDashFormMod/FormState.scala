package typings.reactDashForm.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormState extends js.Object {
  var dirty: js.UndefOr[Boolean] = js.undefined
  var errors: FormErrors
  var nestedErrors: NestedErrors
  var touched: Touched
  var values: FormValues
}

object FormState {
  @scala.inline
  def apply(
    errors: FormErrors,
    nestedErrors: NestedErrors,
    touched: Touched,
    values: FormValues,
    dirty: js.UndefOr[Boolean] = js.undefined
  ): FormState = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormState]
  }
}

