package typings
package reactDashFormLib.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormState extends js.Object {
  var dirty: js.UndefOr[scala.Boolean] = js.undefined
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
    dirty: js.UndefOr[scala.Boolean] = js.undefined
  ): FormState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("nestedErrors")(nestedErrors)
    __obj.updateDynamic("touched")(touched)
    __obj.updateDynamic("values")(values)
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty)
    __obj.asInstanceOf[FormState]
  }
}

