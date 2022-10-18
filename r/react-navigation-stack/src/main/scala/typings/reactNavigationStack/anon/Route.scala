package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route extends StObject {
  
  var route: typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
}
object Route {
  
  inline def apply(route: typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]): Route = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  
  extension [Self <: Route](x: Self) {
    
    inline def setRoute(value: typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
