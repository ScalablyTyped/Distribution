package typings.reduxForm.reduxFormMod

import typings.react.mod.Component
import typings.reduxForm.mod.RegisteredFieldState
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormInstance[FormData, P]
  extends Component[P, js.Object, js.Any] {
  var dirty: Boolean = js.native
  var invalid: Boolean = js.native
  var pristine: Boolean = js.native
  var registeredFields: js.Array[RegisteredFieldState] = js.native
  var valid: Boolean = js.native
  var values: Partial[FormData] = js.native
  var wrappedInstance: js.UndefOr[HTMLElement] = js.native
  def reset(): Unit = js.native
  def resetSection(sections: String*): Unit = js.native
  def submit(): js.Promise[_] = js.native
}

