package typings.reduxDashForm.libActionsMod

import typings.reduxDashForm.reduxDashFormMod.FormWarnings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/actions", "updateSyncWarnings")
@js.native
object updateSyncWarnings extends js.Object {
  def apply[T](form: String, syncWarnings: FormWarnings[_, T], warning: T): FormAction = js.native
}

