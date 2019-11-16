package typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationState[T /* <: Route */] extends js.Object {
  var index: Double
  var routes: js.Array[T]
}

object NavigationState {
  @scala.inline
  def apply[T /* <: Route */](index: Double, routes: js.Array[T]): NavigationState[T] = {
    val __obj = js.Dynamic.literal(index = index, routes = routes)
  
    __obj.asInstanceOf[NavigationState[T]]
  }
}

