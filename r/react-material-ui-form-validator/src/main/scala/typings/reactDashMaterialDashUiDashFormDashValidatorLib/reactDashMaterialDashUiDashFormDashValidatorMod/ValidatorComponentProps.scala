package typings
package reactDashMaterialDashUiDashFormDashValidatorLib.reactDashMaterialDashUiDashFormDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorComponentProps extends js.Object {
  var errorMessages: js.UndefOr[js.Array[_] | java.lang.String] = js.undefined
  var name: java.lang.String
  var validatorListener: js.UndefOr[js.Function1[/* isValid */ scala.Boolean, scala.Unit]] = js.undefined
  var validators: js.UndefOr[js.Array[_]] = js.undefined
  var value: js.Any
  var withRequiredValidator: js.UndefOr[scala.Boolean] = js.undefined
}

object ValidatorComponentProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: js.Any,
    errorMessages: js.Array[_] | java.lang.String = null,
    validatorListener: js.Function1[/* isValid */ scala.Boolean, scala.Unit] = null,
    validators: js.Array[_] = null,
    withRequiredValidator: js.UndefOr[scala.Boolean] = js.undefined
  ): ValidatorComponentProps = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (errorMessages != null) __obj.updateDynamic("errorMessages")(errorMessages.asInstanceOf[js.Any])
    if (validatorListener != null) __obj.updateDynamic("validatorListener")(validatorListener)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    if (!js.isUndefined(withRequiredValidator)) __obj.updateDynamic("withRequiredValidator")(withRequiredValidator)
    __obj.asInstanceOf[ValidatorComponentProps]
  }
}

