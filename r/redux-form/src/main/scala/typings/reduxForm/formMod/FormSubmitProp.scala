package typings.reduxForm.formMod

import typings.redux.mod.Dispatch
import typings.reduxForm.mod.FormErrors
import typings.reduxForm.reduxFormMod.DecoratedFormProps
import typings.reduxForm.reduxFormMod.FormSubmitHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormSubmitProp[FormData, P, ErrorType] extends js.Object {
  var onSubmit: js.UndefOr[FormSubmitHandler[FormData, P, ErrorType]] = js.native
}

object FormSubmitProp {
  @scala.inline
  def apply[FormData, P, ErrorType](): FormSubmitProp[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormSubmitProp[FormData, P, ErrorType]]
  }
  @scala.inline
  implicit class FormSubmitPropOps[Self <: FormSubmitProp[_, _, _], FormData, P, ErrorType] (val x: Self with (FormSubmitProp[FormData, P, ErrorType])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnSubmit(
      value: (FormData, /* dispatch */ Dispatch[js.Any], /* props */ DecoratedFormProps[FormData, P, ErrorType]) => Unit | (FormErrors[FormData, ErrorType]) | js.Promise[js.Any]
    ): Self = this.set("onSubmit", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
  }
  
}

