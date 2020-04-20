package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options that can be accepted by `findRoute()` and friends.
  */
trait RouteOptions extends js.Object {
  def routeCallback(roomName: String, fromRoomName: String): js.Any
}

object RouteOptions {
  @scala.inline
  def apply(routeCallback: (String, String) => js.Any): RouteOptions = {
    val __obj = js.Dynamic.literal(routeCallback = js.Any.fromFunction2(routeCallback))
    __obj.asInstanceOf[RouteOptions]
  }
}

