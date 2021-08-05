package typings.reactRouter.mod

import typings.reactRouter.reactRouterStrings.PUSH
import typings.reactRouter.reactRouterStrings.REPLACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticRouterContext
  extends StObject
     with StaticContext {
  
  var action: js.UndefOr[PUSH | REPLACE] = js.undefined
  
  var location: js.UndefOr[js.Object] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object StaticRouterContext {
  
  inline def apply(): StaticRouterContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticRouterContext]
  }
  
  extension [Self <: StaticRouterContext](x: Self) {
    
    inline def setAction(value: PUSH | REPLACE): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setLocation(value: js.Object): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
