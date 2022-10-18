package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var height: Double
  
  var route: typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
}
object Height {
  
  inline def apply(height: Double, route: typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  extension [Self <: Height](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
