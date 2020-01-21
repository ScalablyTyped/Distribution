package typings.reduxForm.mod

import typings.reduxForm.actionsMod.FormAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "updateSyncErrors")
@js.native
object updateSyncErrors extends js.Object {
  def apply[T](from: String, syncErrors: FormErrors[_, T], error: T): FormAction = js.native
}

