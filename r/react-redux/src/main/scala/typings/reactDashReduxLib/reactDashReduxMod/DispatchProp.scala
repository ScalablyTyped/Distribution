package typings
package reactDashReduxLib.reactDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatchProp[A /* <: reduxLib.reduxMod.Action[_] */] extends js.Object {
  @JSName("dispatch")
  var dispatch_Original: reduxLib.reduxMod.Dispatch[A] = js.native
  def dispatch[T /* <: A */](action: T): T = js.native
}

