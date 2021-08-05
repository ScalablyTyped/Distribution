package typings.sendcloud.mod

import typings.sendcloud.anon.Modifyat
import typings.sendcloud.sendcloudStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMemberListResponse extends StObject {
  
  var members: js.Array[Modifyat]
  
  var message: success
  
  var total_count: Double
}
object ListMemberListResponse {
  
  inline def apply(members: js.Array[Modifyat], total_count: Double): ListMemberListResponse = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], message = "success", total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberListResponse]
  }
  
  extension [Self <: ListMemberListResponse](x: Self) {
    
    inline def setMembers(value: js.Array[Modifyat]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: Modifyat*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    inline def setMessage(value: success): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
