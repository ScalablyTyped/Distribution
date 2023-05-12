package typings.storybookRouter.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteProps extends StObject {
  
  var children: ReactNode
  
  var hideOnly: js.UndefOr[Boolean] = js.undefined
  
  var path: String
  
  var startsWith: js.UndefOr[Boolean] = js.undefined
}
object RouteProps {
  
  inline def apply(path: String): RouteProps = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setHideOnly(value: Boolean): Self = StObject.set(x, "hideOnly", value.asInstanceOf[js.Any])
    
    inline def setHideOnlyUndefined: Self = StObject.set(x, "hideOnly", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStartsWith(value: Boolean): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
    
    inline def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
  }
}
