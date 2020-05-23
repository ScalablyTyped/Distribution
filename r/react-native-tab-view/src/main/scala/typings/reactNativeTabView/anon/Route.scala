package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route[T /* <: typings.reactNativeTabView.typesMod.Route */] extends js.Object {
  var route: T
}

object Route {
  @scala.inline
  def apply[T](route: T): Route[T] = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route[T]]
  }
}

