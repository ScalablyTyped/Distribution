package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveMembersParameters extends GetObjectsParameters {
  
  var spaceId: String = js.native
  
  var users: js.Array[String] = js.native
}
object RemoveMembersParameters {
  
  @scala.inline
  def apply(spaceId: String, users: js.Array[String]): RemoveMembersParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveMembersParameters]
  }
  
  @scala.inline
  implicit class RemoveMembersParametersMutableBuilder[Self <: RemoveMembersParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpaceId(value: String): Self = StObject.set(x, "spaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
