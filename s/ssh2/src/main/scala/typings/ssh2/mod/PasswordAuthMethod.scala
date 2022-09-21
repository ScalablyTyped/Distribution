package typings.ssh2.mod

import typings.ssh2.ssh2Strings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordAuthMethod
  extends StObject
     with AuthMethod
     with AnyAuthMethod {
  
  var password: String
  
  @JSName("type")
  var type_PasswordAuthMethod: password
}
object PasswordAuthMethod {
  
  inline def apply(password: String, username: String): PasswordAuthMethod = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("password")
    __obj.asInstanceOf[PasswordAuthMethod]
  }
  
  extension [Self <: PasswordAuthMethod](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setType(value: password): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
