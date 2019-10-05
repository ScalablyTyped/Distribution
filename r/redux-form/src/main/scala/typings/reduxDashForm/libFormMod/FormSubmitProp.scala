package typings.reduxDashForm.libFormMod

import typings.redux.reduxMod.Dispatch
import typings.reduxDashForm.libReduxFormMod.FormSubmitHandler
import typings.reduxDashForm.reduxDashFormMod.FormErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormSubmitProp[FormData, P, ErrorType] extends js.Object {
  var onSubmit: js.UndefOr[FormSubmitHandler[FormData, P, ErrorType]] = js.undefined
}

object FormSubmitProp {
  @scala.inline
  def apply[FormData, P, ErrorType](
    onSubmit: (FormData, /* dispatch */ Dispatch[js.Any], P) => Unit | (FormErrors[FormData, ErrorType]) | js.Promise[js.Any] = null
  ): FormSubmitProp[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal()
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction3(onSubmit))
    __obj.asInstanceOf[FormSubmitProp[FormData, P, ErrorType]]
  }
}

