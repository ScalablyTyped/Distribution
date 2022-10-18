package typings.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationContextObject extends StObject {
  
  var basename: String
  
  var navigator: Navigator
  
  var static: Boolean
}
object NavigationContextObject {
  
  inline def apply(basename: String, navigator: Navigator, static: Boolean): NavigationContextObject = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationContextObject]
  }
  
  extension [Self <: NavigationContextObject](x: Self) {
    
    inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    inline def setNavigator(value: Navigator): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
  }
}
