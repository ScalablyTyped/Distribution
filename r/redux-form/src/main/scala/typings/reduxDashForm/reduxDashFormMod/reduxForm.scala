package typings.reduxDashForm.reduxDashFormMod

import typings.reduxDashForm.libReduxFormMod.ConfigProps
import typings.reduxDashForm.libReduxFormMod.FormDecorator
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "reduxForm")
@js.native
object reduxForm extends js.Object {
  def apply[FormData, P, ErrorType](config: ConfigProps[FormData, P, ErrorType]): FormDecorator[FormData, P, Partial[ConfigProps[FormData, P, ErrorType]], ErrorType] = js.native
  def apply[FormData, P, ErrorType](config: Partial[ConfigProps[FormData, P, ErrorType]]): FormDecorator[FormData, P, ConfigProps[FormData, P, ErrorType], ErrorType] = js.native
}

