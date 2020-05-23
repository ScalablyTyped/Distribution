package typings.reduxForm.anon

import typings.reduxForm.actionsMod.FormAction
import typings.reduxForm.mod.FormErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallFromSyncErrorsError extends js.Object {
  def apply[T](from: String, syncErrors: FormErrors[_, T], error: T): FormAction = js.native
}

