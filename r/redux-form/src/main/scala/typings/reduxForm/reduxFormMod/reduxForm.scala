package typings.reduxForm.reduxFormMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/reduxForm", "reduxForm")
@js.native
object reduxForm extends js.Object {
  def apply[FormData, P, ErrorType](config: ConfigProps[FormData, P, ErrorType]): FormDecorator[FormData, P, ErrorType] = js.native
  def apply[FormData, P, ErrorType](config: Partial[ConfigProps[FormData, P, ErrorType]]): FormDecorator[FormData, P, ErrorType] = js.native
}

