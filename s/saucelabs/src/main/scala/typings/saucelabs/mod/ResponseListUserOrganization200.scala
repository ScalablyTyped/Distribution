package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
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
  implicit class ResponseListUserOrganization200Ops[Self <: ResponseListUserOrganization200] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setIs_ancestor(value: Boolean): Self = this.set("is_ancestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_ancestor: Self = this.set("is_ancestor", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: String*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[String]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
}
