package typings.reactDashMaterialDashUiDashFormDashValidator.reactDashMaterialDashUiDashFormDashValidatorMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorComponentProps
  extends /* key */ StringDictionary[js.Any] {
  var errorMessages: js.UndefOr[js.Array[_] | String] = js.undefined
  var name: String
  var validatorListener: js.UndefOr[js.Function1[/* isValid */ Boolean, Unit]] = js.undefined
  var validators: js.UndefOr[js.Array[_]] = js.undefined
  var value: js.Any
  var withRequiredValidator: js.UndefOr[Boolean] = js.undefined
}

object ValidatorComponentProps {
  @scala.inline
  def apply(
    name: String,
    value: js.Any,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    errorMessages: js.Array[_] | String = null,
    validatorListener: /* isValid */ Boolean => Unit = null,
    validators: js.Array[_] = null,
    withRequiredValidator: js.UndefOr[Boolean] = js.undefined
  ): ValidatorComponentProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (errorMessages != null) __obj.updateDynamic("errorMessages")(errorMessages.asInstanceOf[js.Any])
    if (validatorListener != null) __obj.updateDynamic("validatorListener")(js.Any.fromFunction1(validatorListener))
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    if (!js.isUndefined(withRequiredValidator)) __obj.updateDynamic("withRequiredValidator")(withRequiredValidator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorComponentProps]
  }
}

