package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseListUserOrganization200
  extends /* key */ StringDictionary[js.Any] {
  
  var count: js.UndefOr[Double] = js.native
  
  var is_ancestor: js.UndefOr[Boolean] = js.native
  
  var users: js.UndefOr[js.Array[String]] = js.native
}
object ResponseListUserOrganization200 {
  
  @scala.inline
  def apply(): ResponseListUserOrganization200 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseListUserOrganization200]
  }
  
  @scala.inline
  implicit class ResponseListUserOrganization200MutableBuilder[Self <: ResponseListUserOrganization200] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setIs_ancestor(value: Boolean): Self = StObject.set(x, "is_ancestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_ancestorUndefined: Self = StObject.set(x, "is_ancestor", js.undefined)
    
    @scala.inline
    def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
