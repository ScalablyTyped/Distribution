package typings.reduxDashForm

import typings.reduxDashForm.libActionsMod.FormAction
import typings.reduxDashForm.reduxDashFormMod.FormWarnings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Form extends js.Object {
  def apply[T](form: String, syncWarnings: FormWarnings[_, T], warning: T): FormAction = js.native
}

