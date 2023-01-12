package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUSER_FIND_RESULT extends StObject {
  
  var users: js.Array[SFSUser]
}
object IUSER_FIND_RESULT {
  
  inline def apply(users: js.Array[SFSUser]): IUSER_FIND_RESULT = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUSER_FIND_RESULT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUSER_FIND_RESULT] (val x: Self) extends AnyVal {
    
    inline def setUsers(value: js.Array[SFSUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: SFSUser*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
