package typings.reactNativeTabView.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route[T /* <: typings.reactNativeTabView.typesMod.Route */] extends StObject {
  
  var route: T
}
object Route {
  
  inline def apply[T /* <: typings.reactNativeTabView.typesMod.Route */](route: T): Route[T] = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route[T]]
  }
  
  extension [Self <: Route[?], T /* <: typings.reactNativeTabView.typesMod.Route */](x: Self & Route[T]) {
    
    inline def setRoute(value: T): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
