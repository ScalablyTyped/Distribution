package typings.ssDashUtils.ssutilsNs

import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindFormOptions extends js.Object {
  var complete: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var onSubmitDisable: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[js.Function1[/* form */ HTMLFormElement, Boolean]] = js.undefined
  var validation: js.UndefOr[ValidationOptional] = js.undefined
}

object BindFormOptions {
  @scala.inline
  def apply(
    complete: /* repeated */ js.Any => Unit = null,
    error: /* repeated */ js.Any => Unit = null,
    onSubmitDisable: String = null,
    validate: /* form */ HTMLFormElement => Boolean = null,
    validation: ValidationOptional = null
  ): BindFormOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (onSubmitDisable != null) __obj.updateDynamic("onSubmitDisable")(onSubmitDisable)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    if (validation != null) __obj.updateDynamic("validation")(validation)
    __obj.asInstanceOf[BindFormOptions]
  }
}

