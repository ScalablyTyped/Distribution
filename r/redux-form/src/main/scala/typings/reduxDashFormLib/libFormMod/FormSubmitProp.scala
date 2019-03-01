package typings
package reduxDashFormLib.libFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormSubmitProp[FormData, P, ErrorType] extends js.Object {
  var onSubmit: js.UndefOr[reduxDashFormLib.libReduxFormMod.FormSubmitHandler[FormData, P, ErrorType]] = js.undefined
}

object FormSubmitProp {
  @scala.inline
  def apply[FormData, P, ErrorType](onSubmit: reduxDashFormLib.libReduxFormMod.FormSubmitHandler[FormData, P, ErrorType] = null): FormSubmitProp[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal()
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit)
    __obj.asInstanceOf[FormSubmitProp[FormData, P, ErrorType]]
  }
}

