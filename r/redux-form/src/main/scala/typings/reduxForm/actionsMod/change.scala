package typings.reduxForm.actionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/actions", "change")
@js.native
object change extends js.Object {
  def apply(form: String, field: String, value: js.Any): FormAction = js.native
  def apply(form: String, field: String, value: js.Any, touch: Boolean): FormAction = js.native
  def apply(form: String, field: String, value: js.Any, touch: Boolean, persistentSubmitErrors: Boolean): FormAction = js.native
}

