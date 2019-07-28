package typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene[T] extends js.Object {
  var focused: Boolean
  var index: Double
  var route: T
}

object Scene {
  @scala.inline
  def apply[T](focused: Boolean, index: Double, route: T): Scene[T] = {
    val __obj = js.Dynamic.literal(focused = focused, index = index, route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Scene[T]]
  }
}

