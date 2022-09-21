package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthMethod extends StObject {
  
  var `type`: AuthenticationType
  
  var username: String
}
object AuthMethod {
  
  inline def apply(`type`: AuthenticationType, username: String): AuthMethod = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthMethod]
  }
  
  extension [Self <: AuthMethod](x: Self) {
    
    inline def setType(value: AuthenticationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
