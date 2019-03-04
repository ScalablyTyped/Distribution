package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options that can be accepted by `findRoute()` and friends.
  */
trait RouteOptions extends js.Object {
  def routeCallback(roomName: java.lang.String, fromRoomName: java.lang.String): js.Any
}

object RouteOptions {
  @scala.inline
  def apply(routeCallback: js.Function2[java.lang.String, java.lang.String, js.Any]): RouteOptions = {
    val __obj = js.Dynamic.literal(routeCallback = routeCallback)
  
    __obj.asInstanceOf[RouteOptions]
  }
}

