package typings.steamUser.anon

import typings.steamid.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Members extends StObject {
  
  var members: js.Array[^]
  
  var name: String
}
object Members {
  
  inline def apply(members: js.Array[^], name: String): Members = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Members]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Members] (val x: Self) extends AnyVal {
    
    inline def setMembers(value: js.Array[^]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: ^ *): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
