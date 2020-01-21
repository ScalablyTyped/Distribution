package typings.reduxForm

import typings.reduxForm.actionsMod.FormAction
import typings.reduxForm.actionsMod.InitializeOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnData extends js.Object {
  def apply(form: String, data: js.Any): FormAction = js.native
  def apply(form: String, data: js.Any, keepDirty: Boolean): FormAction = js.native
  def apply(form: String, data: js.Any, keepDirty: Boolean, options: Partial[InitializeOptions]): FormAction = js.native
  def apply(form: String, data: js.Any, options: Partial[InitializeOptions]): FormAction = js.native
}

