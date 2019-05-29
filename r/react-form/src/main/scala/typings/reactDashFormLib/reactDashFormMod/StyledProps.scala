package typings
package reactDashFormLib.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledProps extends FieldProps {
  var messageBefore: js.UndefOr[scala.Boolean] = js.undefined
  var noMessage: js.UndefOr[scala.Boolean] = js.undefined
  var touchValidation: js.UndefOr[scala.Boolean] = js.undefined
}

object StyledProps {
  @scala.inline
  def apply(
    errorBefore: js.UndefOr[scala.Boolean] = js.undefined,
    field: java.lang.String | (js.Array[
      js.Array[reactLib.reactMod.ReactText] | reactLib.reactMod.ReactText | java.lang.String
    ]) = null,
    isForm: js.UndefOr[scala.Boolean] = js.undefined,
    messageBefore: js.UndefOr[scala.Boolean] = js.undefined,
    noMessage: js.UndefOr[scala.Boolean] = js.undefined,
    showErrors: js.UndefOr[scala.Boolean] = js.undefined,
    touchValidation: js.UndefOr[scala.Boolean] = js.undefined
  ): StyledProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errorBefore)) __obj.updateDynamic("errorBefore")(errorBefore)
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(isForm)) __obj.updateDynamic("isForm")(isForm)
    if (!js.isUndefined(messageBefore)) __obj.updateDynamic("messageBefore")(messageBefore)
    if (!js.isUndefined(noMessage)) __obj.updateDynamic("noMessage")(noMessage)
    if (!js.isUndefined(showErrors)) __obj.updateDynamic("showErrors")(showErrors)
    if (!js.isUndefined(touchValidation)) __obj.updateDynamic("touchValidation")(touchValidation)
    __obj.asInstanceOf[StyledProps]
  }
}

