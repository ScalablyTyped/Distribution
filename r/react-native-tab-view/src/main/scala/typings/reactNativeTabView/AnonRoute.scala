package typings.reactNativeTabView

import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRoute[T /* <: Route */] extends js.Object {
  var route: T
}

object AnonRoute {
  @scala.inline
  def apply[T /* <: Route */](route: T): AnonRoute[T] = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRoute[T]]
  }
}

