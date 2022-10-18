package typings.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod

import typings.react.mod.ReactElement
import typings.storybookRouter.storybookRouterBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexRouteProps extends StObject {
  
  var element: js.UndefOr[ReactElement | Null] = js.undefined
  
  var index: `true`
}
object IndexRouteProps {
  
  inline def apply(): IndexRouteProps = {
    val __obj = js.Dynamic.literal(index = true)
    __obj.asInstanceOf[IndexRouteProps]
  }
  
  extension [Self <: IndexRouteProps](x: Self) {
    
    inline def setElement(value: ReactElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementNull: Self = StObject.set(x, "element", null)
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setIndex(value: `true`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
