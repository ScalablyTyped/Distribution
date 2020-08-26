package typings.reduxForm.reduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedReduxFormContext extends js.Object {
  var _reduxForm: ReduxFormContext = js.native
}

object WrappedReduxFormContext {
  @scala.inline
  def apply(_reduxForm: ReduxFormContext): WrappedReduxFormContext = {
    val __obj = js.Dynamic.literal(_reduxForm = _reduxForm.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedReduxFormContext]
  }
  @scala.inline
  implicit class WrappedReduxFormContextOps[Self <: WrappedReduxFormContext] (val x: Self) extends AnyVal {
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
    def set_reduxForm(value: ReduxFormContext): Self = this.set("_reduxForm", value.asInstanceOf[js.Any])
  }
  
}

