package typings.reduxForm.mod

import typings.reduxForm.PartialInitializeOptions
import typings.reduxForm.actionsMod.FormAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "initialize")
@js.native
object initialize extends js.Object {
  def apply(form: String, data: js.Any): FormAction = js.native
  def apply(form: String, data: js.Any, keepDirty: Boolean): FormAction = js.native
  def apply(form: String, data: js.Any, keepDirty: Boolean, options: PartialInitializeOptions): FormAction = js.native
  def apply(form: String, data: js.Any, options: PartialInitializeOptions): FormAction = js.native
}

