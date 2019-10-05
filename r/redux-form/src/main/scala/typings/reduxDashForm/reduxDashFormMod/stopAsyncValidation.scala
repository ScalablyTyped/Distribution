package typings.reduxDashForm.reduxDashFormMod

import typings.reduxDashForm.libActionsMod.FormAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "stopAsyncValidation")
@js.native
object stopAsyncValidation extends js.Object {
  def apply(form: String): FormAction = js.native
  def apply(form: String, errors: FormErrors[_, _]): FormAction = js.native
}

