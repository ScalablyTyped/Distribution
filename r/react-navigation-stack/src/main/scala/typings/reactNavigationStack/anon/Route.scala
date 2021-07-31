package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route extends StObject {
  
  var route: typings.reactNavigationStack.vendorTypesMod.Route[String]
}
object Route {
  
  @scala.inline
  def apply(route: typings.reactNavigationStack.vendorTypesMod.Route[String]): Route = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoute(value: typings.reactNavigationStack.vendorTypesMod.Route[String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
