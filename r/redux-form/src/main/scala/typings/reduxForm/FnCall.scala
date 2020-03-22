package typings.reduxForm

import typings.reduxForm.actionsMod.FormAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(form: String, data: js.Any): FormAction = js.native
  def apply(form: String, data: js.Any, keepDirty: Boolean): FormAction = js.native
  def apply(form: String, data: js.Any, keepDirty: Boolean, options: PartialInitializeOptions): FormAction = js.native
  def apply(form: String, data: js.Any, options: PartialInitializeOptions): FormAction = js.native
}

