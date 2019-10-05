package typings.reduxDashForm.reduxDashFormMod

import typings.reduxDashForm.libActionsMod.FormAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "clearFields")
@js.native
object clearFields extends js.Object {
  def apply(form: String, keepTouched: Boolean, persistentSubmitErrors: Boolean, fields: String*): FormAction = js.native
}

