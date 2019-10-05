package typings.reduxDashForm.libActionsMod

import typings.reduxDashForm.reduxDashFormMod.FormErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/actions", "stopAsyncValidation")
@js.native
object stopAsyncValidation extends js.Object {
  def apply(form: String): FormAction = js.native
  def apply(form: String, errors: FormErrors[_, _]): FormAction = js.native
}

