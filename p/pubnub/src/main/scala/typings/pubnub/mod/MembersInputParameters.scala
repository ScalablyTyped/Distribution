package typings.pubnub.mod

import typings.pubnub.anon.Custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembersInputParameters
  extends StObject
     with GetObjectsParameters {
  
  var spaceId: String
  
  var users: js.Array[Custom]
}
object MembersInputParameters {
  
  inline def apply(spaceId: String, users: js.Array[Custom]): MembersInputParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembersInputParameters]
  }
  
  extension [Self <: MembersInputParameters](x: Self) {
    
    inline def setSpaceId(value: String): Self = StObject.set(x, "spaceId", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: js.Array[Custom]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: Custom*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
