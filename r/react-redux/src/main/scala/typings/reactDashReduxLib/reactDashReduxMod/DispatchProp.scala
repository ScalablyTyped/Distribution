package typings
package reactDashReduxLib.reactDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatchProp[A /* <: reduxLib.reduxMod.Action[_] */] extends js.Object {
  var dispatch: reduxLib.reduxMod.Dispatch[A]
}

object DispatchProp {
  @scala.inline
  def apply[A /* <: reduxLib.reduxMod.Action[_] */](dispatch: reduxLib.reduxMod.Dispatch[A]): DispatchProp[A] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch)
  
    __obj.asInstanceOf[DispatchProp[A]]
  }
}

