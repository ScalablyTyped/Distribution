package typings.reactForm.anon

import typings.react.mod.ReactText
import typings.reactForm.mod.FieldApi
import typings.reactForm.mod.RenderReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-form.react-form.StyledProps & {  children ? :(props : react-form.react-form.FieldApi): react-form.react-form.RenderReturn | react-form.react-form.RenderReturn} */
trait StyledPropschildrenpropsF extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ FieldApi, RenderReturn]) | RenderReturn] = js.undefined
  var errorBefore: js.UndefOr[Boolean] = js.undefined
  var field: js.UndefOr[String | (js.Array[js.Array[ReactText] | ReactText | String])] = js.undefined
  var isForm: js.UndefOr[Boolean] = js.undefined
  var messageBefore: js.UndefOr[Boolean] = js.undefined
  var noMessage: js.UndefOr[Boolean] = js.undefined
  var showErrors: js.UndefOr[Boolean] = js.undefined
  var touchValidation: js.UndefOr[Boolean] = js.undefined
}

object StyledPropschildrenpropsF {
  @scala.inline
  def apply(
    children: js.UndefOr[Null | (js.Function1[/* props */ FieldApi, RenderReturn]) | RenderReturn] = js.undefined,
    errorBefore: js.UndefOr[Boolean] = js.undefined,
    field: String | (js.Array[js.Array[ReactText] | ReactText | String]) = null,
    isForm: js.UndefOr[Boolean] = js.undefined,
    messageBefore: js.UndefOr[Boolean] = js.undefined,
    noMessage: js.UndefOr[Boolean] = js.undefined,
    showErrors: js.UndefOr[Boolean] = js.undefined,
    touchValidation: js.UndefOr[Boolean] = js.undefined
  ): StyledPropschildrenpropsF = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(errorBefore)) __obj.updateDynamic("errorBefore")(errorBefore.get.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(isForm)) __obj.updateDynamic("isForm")(isForm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageBefore)) __obj.updateDynamic("messageBefore")(messageBefore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noMessage)) __obj.updateDynamic("noMessage")(noMessage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showErrors)) __obj.updateDynamic("showErrors")(showErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchValidation)) __obj.updateDynamic("touchValidation")(touchValidation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledPropschildrenpropsF]
  }
}

