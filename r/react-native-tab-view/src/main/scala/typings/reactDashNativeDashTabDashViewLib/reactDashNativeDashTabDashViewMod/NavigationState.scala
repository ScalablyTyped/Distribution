package typings
package reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationState[T /* <: Key */] extends js.Object {
  var index: scala.Double
  var routes: js.Array[T]
}

object NavigationState {
  @scala.inline
  def apply[T /* <: Key */](index: scala.Double, routes: js.Array[T]): NavigationState[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("routes")(routes)
    __obj.asInstanceOf[NavigationState[T]]
  }
}

