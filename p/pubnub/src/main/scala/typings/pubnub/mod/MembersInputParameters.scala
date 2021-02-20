package typings.pubnub.mod

import typings.pubnub.anon.Custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembersInputParameters extends GetObjectsParameters {
  
  var spaceId: String = js.native
  
  var users: js.Array[Custom] = js.native
}
object MembersInputParameters {
  
  @scala.inline
  def apply(spaceId: String, users: js.Array[Custom]): MembersInputParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembersInputParameters]
  }
  
  @scala.inline
  implicit class MembersInputParametersMutableBuilder[Self <: MembersInputParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpaceId(value: String): Self = StObject.set(x, "spaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: js.Array[Custom]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: Custom*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
