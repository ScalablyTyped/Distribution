package typings.reduxDashForm.reduxDashFormMod

import typings.reduxDashForm.libActionsMod.FormAction
import typings.reduxDashForm.libActionsMod.InitializeOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "initialize")
@js.native
object initialize extends js.Object {
  def apply(form: String, data: js.Any): FormAction = js.native
  def apply(form: String, data: js.Any, keepDirty: Boolean): FormAction = js.native
  def apply(form: String, data: js.Any, keepDirty: Boolean, options: Partial[InitializeOptions]): FormAction = js.native
  def apply(form: String, data: js.Any, options: Partial[InitializeOptions]): FormAction = js.native
}

