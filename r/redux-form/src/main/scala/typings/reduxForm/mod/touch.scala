package typings.reduxForm.mod

import typings.reduxForm.actionsMod.FormAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "touch")
@js.native
object touch extends js.Object {
  def apply(form: String, fields: String*): FormAction = js.native
}

