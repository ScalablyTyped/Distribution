package typings.schematicsAngular.utilityWorkspaceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppShellBuilderOptions extends StObject {
  
  var browserTarget: String
  
  var route: String
  
  var serverTarget: String
}
object AppShellBuilderOptions {
  
  inline def apply(browserTarget: String, route: String, serverTarget: String): AppShellBuilderOptions = {
    val __obj = js.Dynamic.literal(browserTarget = browserTarget.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], serverTarget = serverTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppShellBuilderOptions]
  }
  
  extension [Self <: AppShellBuilderOptions](x: Self) {
    
    inline def setBrowserTarget(value: String): Self = StObject.set(x, "browserTarget", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setServerTarget(value: String): Self = StObject.set(x, "serverTarget", value.asInstanceOf[js.Any])
  }
}
