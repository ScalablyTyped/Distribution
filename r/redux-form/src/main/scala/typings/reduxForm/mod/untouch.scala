package typings.reduxForm.mod

import typings.reduxForm.actionsMod.FormAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "untouch")
@js.native
object untouch extends js.Object {
  def apply(form: String, fields: String*): FormAction = js.native
}

