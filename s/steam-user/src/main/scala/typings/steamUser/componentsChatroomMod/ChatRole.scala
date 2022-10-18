package typings.steamUser.componentsChatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRole extends StObject {
  
  var name: String
  
  var ordinal: Double
  
  var role_id: String
}
object ChatRole {
  
  inline def apply(name: String, ordinal: Double, role_id: String): ChatRole = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any], role_id = role_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRole]
  }
  
  extension [Self <: ChatRole](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setRole_id(value: String): Self = StObject.set(x, "role_id", value.asInstanceOf[js.Any])
  }
}
