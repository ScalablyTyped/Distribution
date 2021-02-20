package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUSER_FIND_RESULT extends StObject {
  
  var users: js.Array[SFSUser] = js.native
}
object IUSER_FIND_RESULT {
  
  @scala.inline
  def apply(users: js.Array[SFSUser]): IUSER_FIND_RESULT = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUSER_FIND_RESULT]
  }
  
  @scala.inline
  implicit class IUSER_FIND_RESULTMutableBuilder[Self <: IUSER_FIND_RESULT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsers(value: js.Array[SFSUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: SFSUser*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
