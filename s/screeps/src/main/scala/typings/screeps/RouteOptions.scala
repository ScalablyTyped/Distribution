package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options that can be accepted by `findRoute()` and friends.
  */
trait RouteOptions extends StObject {
  
  def routeCallback(roomName: String, fromRoomName: String): js.Any
}
object RouteOptions {
  
  @scala.inline
  def apply(routeCallback: (String, String) => js.Any): RouteOptions = {
    val __obj = js.Dynamic.literal(routeCallback = js.Any.fromFunction2(routeCallback))
    __obj.asInstanceOf[RouteOptions]
  }
  
  @scala.inline
  implicit class RouteOptionsMutableBuilder[Self <: RouteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRouteCallback(value: (String, String) => js.Any): Self = StObject.set(x, "routeCallback", js.Any.fromFunction2(value))
  }
}
