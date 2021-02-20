package typings.sendcloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMemberListOptions extends StObject {
  
  var api_key: String = js.native
  
  var api_user: String = js.native
  
  var end: js.UndefOr[Double] = js.native
  
  var mail_list_addr: js.UndefOr[String] = js.native
  
  var member_addr: js.UndefOr[String] = js.native
  
  var start: js.UndefOr[Double] = js.native
}
object ListMemberListOptions {
  
  @scala.inline
  def apply(api_key: String, api_user: String): ListMemberListOptions = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], api_user = api_user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberListOptions]
  }
  
  @scala.inline
  implicit class ListMemberListOptionsMutableBuilder[Self <: ListMemberListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_user(value: String): Self = StObject.set(x, "api_user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setMail_list_addr(value: String): Self = StObject.set(x, "mail_list_addr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMail_list_addrUndefined: Self = StObject.set(x, "mail_list_addr", js.undefined)
    
    @scala.inline
    def setMember_addr(value: String): Self = StObject.set(x, "member_addr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMember_addrUndefined: Self = StObject.set(x, "member_addr", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
