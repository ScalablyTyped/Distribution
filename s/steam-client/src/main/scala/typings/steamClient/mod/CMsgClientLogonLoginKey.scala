package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CMsgClientLogonLoginKey
  extends StObject
     with CMsgClientLogon {
  
  /**
    * Alternative to password
    */
  var login_key: String
}
object CMsgClientLogonLoginKey {
  
  @scala.inline
  def apply(account_name: String, login_key: String): CMsgClientLogonLoginKey = {
    val __obj = js.Dynamic.literal(account_name = account_name.asInstanceOf[js.Any], login_key = login_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMsgClientLogonLoginKey]
  }
  
  @scala.inline
  implicit class CMsgClientLogonLoginKeyMutableBuilder[Self <: CMsgClientLogonLoginKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogin_key(value: String): Self = StObject.set(x, "login_key", value.asInstanceOf[js.Any])
  }
}
