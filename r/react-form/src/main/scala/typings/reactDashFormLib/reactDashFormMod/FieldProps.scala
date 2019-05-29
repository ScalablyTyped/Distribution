package typings
package reactDashFormLib.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldProps extends js.Object {
  var errorBefore: js.UndefOr[scala.Boolean] = js.undefined
  var field: js.UndefOr[
    java.lang.String | (js.Array[
      js.Array[reactLib.reactMod.ReactText] | reactLib.reactMod.ReactText | java.lang.String
    ])
  ] = js.undefined
  var isForm: js.UndefOr[scala.Boolean] = js.undefined
  var showErrors: js.UndefOr[scala.Boolean] = js.undefined
}

object FieldProps {
  @scala.inline
  def apply(
    errorBefore: js.UndefOr[scala.Boolean] = js.undefined,
    field: java.lang.String | (js.Array[
      js.Array[reactLib.reactMod.ReactText] | reactLib.reactMod.ReactText | java.lang.String
    ]) = null,
    isForm: js.UndefOr[scala.Boolean] = js.undefined,
    showErrors: js.UndefOr[scala.Boolean] = js.undefined
  ): FieldProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errorBefore)) __obj.updateDynamic("errorBefore")(errorBefore)
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(isForm)) __obj.updateDynamic("isForm")(isForm)
    if (!js.isUndefined(showErrors)) __obj.updateDynamic("showErrors")(showErrors)
    __obj.asInstanceOf[FieldProps]
  }
}

