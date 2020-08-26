package typings.reduxForm.mod

import typings.reduxForm.actionsMod.FormAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "change")
@js.native
object change extends js.Object {
  def apply(form: String, field: String, value: js.Any): FormAction = js.native
  def apply(
    form: String,
    field: String,
    value: js.Any,
    touch: js.UndefOr[scala.Nothing],
    persistentSubmitErrors: Boolean
  ): FormAction = js.native
  def apply(form: String, field: String, value: js.Any, touch: Boolean): FormAction = js.native
  def apply(form: String, field: String, value: js.Any, touch: Boolean, persistentSubmitErrors: Boolean): FormAction = js.native
}

