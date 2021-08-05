package typings.reactRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticRouterProps extends StObject {
  
  var basename: js.UndefOr[String] = js.undefined
  
  var context: js.UndefOr[StaticRouterContext] = js.undefined
  
  var location: js.UndefOr[String | js.Object] = js.undefined
}
object StaticRouterProps {
  
  inline def apply(): StaticRouterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticRouterProps]
  }
  
  extension [Self <: StaticRouterProps](x: Self) {
    
    inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
    
    inline def setContext(value: StaticRouterContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setLocation(value: String | js.Object): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
