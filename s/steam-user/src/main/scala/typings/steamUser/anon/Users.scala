package typings.steamUser.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Users extends StObject {
  
  var users: Record[String, LocalizedString]
}
object Users {
  
  inline def apply(users: Record[String, LocalizedString]): Users = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Users]
  }
  
  extension [Self <: Users](x: Self) {
    
    inline def setUsers(value: Record[String, LocalizedString]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
  }
}
