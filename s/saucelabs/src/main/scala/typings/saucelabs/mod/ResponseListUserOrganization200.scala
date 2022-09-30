package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseListUserOrganization200
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var count: js.UndefOr[Double] = js.undefined
  
  var is_ancestor: js.UndefOr[Boolean] = js.undefined
  
  var users: js.UndefOr[js.Array[String]] = js.undefined
}
object ResponseListUserOrganization200 {
  
  inline def apply(): ResponseListUserOrganization200 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseListUserOrganization200]
  }
  
  extension [Self <: ResponseListUserOrganization200](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setIs_ancestor(value: Boolean): Self = StObject.set(x, "is_ancestor", value.asInstanceOf[js.Any])
    
    inline def setIs_ancestorUndefined: Self = StObject.set(x, "is_ancestor", js.undefined)
    
    inline def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
