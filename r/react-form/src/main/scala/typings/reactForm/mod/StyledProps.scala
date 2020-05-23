package typings.reactForm.mod

import typings.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledProps extends FieldProps {
  var messageBefore: js.UndefOr[Boolean] = js.undefined
  var noMessage: js.UndefOr[Boolean] = js.undefined
  var touchValidation: js.UndefOr[Boolean] = js.undefined
}

object StyledProps {
  @scala.inline
  def apply(
    errorBefore: js.UndefOr[Boolean] = js.undefined,
    field: String | (js.Array[js.Array[ReactText] | ReactText | String]) = null,
    isForm: js.UndefOr[Boolean] = js.undefined,
    messageBefore: js.UndefOr[Boolean] = js.undefined,
    noMessage: js.UndefOr[Boolean] = js.undefined,
    showErrors: js.UndefOr[Boolean] = js.undefined,
    touchValidation: js.UndefOr[Boolean] = js.undefined
  ): StyledProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errorBefore)) __obj.updateDynamic("errorBefore")(errorBefore.get.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(isForm)) __obj.updateDynamic("isForm")(isForm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageBefore)) __obj.updateDynamic("messageBefore")(messageBefore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noMessage)) __obj.updateDynamic("noMessage")(noMessage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showErrors)) __obj.updateDynamic("showErrors")(showErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchValidation)) __obj.updateDynamic("touchValidation")(touchValidation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledProps]
  }
}

