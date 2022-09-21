package typings.storybookRouter.reactRouterIndexMod

import typings.react.mod.ReactNode
import typings.storybookRouter.anon.PartialLocation
import typings.storybookRouter.reactRouterNodeModulesHistoryIndexMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterProps extends StObject {
  
  var basename: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var location: PartialLocation | String
  
  var navigationType: js.UndefOr[Action] = js.undefined
  
  var navigator: Navigator
  
  var static: js.UndefOr[Boolean] = js.undefined
}
object RouterProps {
  
  inline def apply(location: PartialLocation | String, navigator: Navigator): RouterProps = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterProps]
  }
  
  extension [Self <: RouterProps](x: Self) {
    
    inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setLocation(value: PartialLocation | String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setNavigationType(value: Action): Self = StObject.set(x, "navigationType", value.asInstanceOf[js.Any])
    
    inline def setNavigationTypeUndefined: Self = StObject.set(x, "navigationType", js.undefined)
    
    inline def setNavigator(value: Navigator): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
  }
}
