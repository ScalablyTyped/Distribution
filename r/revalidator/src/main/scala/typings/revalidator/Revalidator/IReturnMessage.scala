package typings.revalidator.Revalidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReturnMessage extends js.Object {
  var errors: js.Array[IErrrorProperty] = js.native
  var valid: Boolean = js.native
}

object IReturnMessage {
  @scala.inline
  def apply(errors: js.Array[IErrrorProperty], valid: Boolean): IReturnMessage = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReturnMessage]
  }
  @scala.inline
  implicit class IReturnMessageOps[Self <: IReturnMessage] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: IErrrorProperty*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[IErrrorProperty]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
  }
  
}

