package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options that can be accepted by `findRoute()` and friends.
  */
@js.native
trait RouteOptions extends js.Object {
  
  def routeCallback(roomName: String, fromRoomName: String): js.Any = js.native
}
object RouteOptions {
  
  @scala.inline
  def apply(routeCallback: (String, String) => js.Any): RouteOptions = {
    val __obj = js.Dynamic.literal(routeCallback = js.Any.fromFunction2(routeCallback))
    __obj.asInstanceOf[RouteOptions]
  }
  
  @scala.inline
  implicit class RouteOptionsOps[Self <: RouteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRouteCallback(value: (String, String) => js.Any): Self = this.set("routeCallback", js.Any.fromFunction2(value))
  }
}
