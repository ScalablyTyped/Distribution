package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CMsgClientLogonPassword
  extends StObject
     with CMsgClientLogon {
  
  /**
    * Required unless login_key is used
    */
  var password: String
}
object CMsgClientLogonPassword {
  
  @scala.inline
  def apply(account_name: String, password: String): CMsgClientLogonPassword = {
    val __obj = js.Dynamic.literal(account_name = account_name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMsgClientLogonPassword]
  }
  
  @scala.inline
  implicit class CMsgClientLogonPasswordMutableBuilder[Self <: CMsgClientLogonPassword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
