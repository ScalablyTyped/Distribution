package typings.remixRunRouter.distRouterMod

import typings.remixRunRouter.distUtilsMod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseMatchesMatch extends StObject {
  
  var data: Any
  
  var handle: Any
  
  var id: String
  
  var params: Params[String]
  
  var pathname: String
}
object UseMatchesMatch {
  
  inline def apply(data: Any, handle: Any, id: String, params: Params[String], pathname: String): UseMatchesMatch = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMatchesMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseMatchesMatch] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHandle(value: Any): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Params[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
  }
}
