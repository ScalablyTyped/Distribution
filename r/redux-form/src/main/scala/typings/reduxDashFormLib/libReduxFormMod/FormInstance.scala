package typings
package reduxDashFormLib.libReduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormInstance[FormData, P, ErrorType]
  extends reactLib.reactMod.Component[P, js.Object, js.Any] {
  var dirty: scala.Boolean = js.native
  var invalid: scala.Boolean = js.native
  var pristine: scala.Boolean = js.native
  var registeredFields: js.Array[reduxDashFormLib.libReducerMod.RegisteredFieldState] = js.native
  var valid: scala.Boolean = js.native
  var values: stdLib.Partial[FormData] = js.native
  var wrappedInstance: reactLib.reactMod.ReactNs.ReactElement = js.native
  def reset(): scala.Unit = js.native
  def resetSection(sections: java.lang.String*): scala.Unit = js.native
  def submit(): js.Promise[_] = js.native
}

