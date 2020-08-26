package typings.reduxForm.actionsMod

import typings.reduxForm.anon.PartialInitializeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/actions", "initialize")
@js.native
object initialize extends js.Object {
  def apply(form: String, data: js.Any): FormAction = js.native
  def apply(
    form: String,
    data: js.Any,
    keepDirty: js.UndefOr[scala.Nothing],
    options: PartialInitializeOptions
  ): FormAction = js.native
  def apply(form: String, data: js.Any, keepDirty: Boolean): FormAction = js.native
  def apply(form: String, data: js.Any, keepDirty: Boolean, options: PartialInitializeOptions): FormAction = js.native
  def apply(form: String, data: js.Any, options: PartialInitializeOptions): FormAction = js.native
}

