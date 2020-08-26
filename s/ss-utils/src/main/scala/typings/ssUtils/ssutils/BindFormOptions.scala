package typings.ssUtils.ssutils

import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindFormOptions extends js.Object {
  var complete: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var error: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var onSubmitDisable: js.UndefOr[String] = js.native
  var validate: js.UndefOr[js.Function1[/* form */ HTMLFormElement, Boolean]] = js.native
  var validation: js.UndefOr[ValidationOptional] = js.native
}

object BindFormOptions {
  @scala.inline
  def apply(): BindFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindFormOptions]
  }
  @scala.inline
  implicit class BindFormOptionsOps[Self <: BindFormOptions] (val x: Self) extends AnyVal {
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
    def setComplete(value: /* repeated */ js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setError(value: /* repeated */ js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setOnSubmitDisable(value: String): Self = this.set("onSubmitDisable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSubmitDisable: Self = this.set("onSubmitDisable", js.undefined)
    @scala.inline
    def setValidate(value: /* form */ HTMLFormElement => Boolean): Self = this.set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    @scala.inline
    def setValidation(value: ValidationOptional): Self = this.set("validation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidation: Self = this.set("validation", js.undefined)
  }
  
}

