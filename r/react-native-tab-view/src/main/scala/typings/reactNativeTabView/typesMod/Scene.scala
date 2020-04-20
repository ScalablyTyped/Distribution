package typings.reactNativeTabView.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene[T /* <: Route */] extends js.Object {
  var route: T
}

object Scene {
  @scala.inline
  def apply[T /* <: Route */](route: T): Scene[T] = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene[T]]
  }
}

