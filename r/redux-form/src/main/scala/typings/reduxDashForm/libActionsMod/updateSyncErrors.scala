package typings.reduxDashForm.libActionsMod

import typings.reduxDashForm.reduxDashFormMod.FormErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/actions", "updateSyncErrors")
@js.native
object updateSyncErrors extends js.Object {
  def apply[T](from: String, syncErrors: FormErrors[_, T], error: T): FormAction = js.native
}

