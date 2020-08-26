package typings.semanticUiProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl, 'success'> */
@js.native
trait PickImplsuccessSuccess extends js.Object {
  var success: String = js.native
}

object PickImplsuccessSuccess {
  @scala.inline
  def apply(success: String): PickImplsuccessSuccess = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsuccessSuccess]
  }
  @scala.inline
  implicit class PickImplsuccessSuccessOps[Self <: PickImplsuccessSuccess] (val x: Self) extends AnyVal {
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
    def setSuccess(value: String): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

