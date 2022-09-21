package typings.storybookRouter.reactRouterIndexMod

import typings.react.mod.ReactNode
import typings.storybookRouter.anon.PartialLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutesProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var location: js.UndefOr[PartialLocation | String] = js.undefined
}
object RoutesProps {
  
  inline def apply(): RoutesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutesProps]
  }
  
  extension [Self <: RoutesProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setLocation(value: PartialLocation | String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
