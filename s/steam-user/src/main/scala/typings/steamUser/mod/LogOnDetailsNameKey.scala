package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogOnDetailsNameKey extends StObject {
  
  var accountName: String
  
  var autoRelogin: js.UndefOr[Boolean] = js.undefined
  
  var clientOS: js.UndefOr[EOSType] = js.undefined
  
  var loginKey: String
  
  var logonID: js.UndefOr[Double | String] = js.undefined
  
  var machineName: js.UndefOr[String] = js.undefined
  
  var rememberPassword: js.UndefOr[Boolean] = js.undefined
}
object LogOnDetailsNameKey {
  
  inline def apply(accountName: String, loginKey: String): LogOnDetailsNameKey = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], loginKey = loginKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogOnDetailsNameKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogOnDetailsNameKey] (val x: Self) extends AnyVal {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAutoRelogin(value: Boolean): Self = StObject.set(x, "autoRelogin", value.asInstanceOf[js.Any])
    
    inline def setAutoReloginUndefined: Self = StObject.set(x, "autoRelogin", js.undefined)
    
    inline def setClientOS(value: EOSType): Self = StObject.set(x, "clientOS", value.asInstanceOf[js.Any])
    
    inline def setClientOSUndefined: Self = StObject.set(x, "clientOS", js.undefined)
    
    inline def setLoginKey(value: String): Self = StObject.set(x, "loginKey", value.asInstanceOf[js.Any])
    
    inline def setLogonID(value: Double | String): Self = StObject.set(x, "logonID", value.asInstanceOf[js.Any])
    
    inline def setLogonIDUndefined: Self = StObject.set(x, "logonID", js.undefined)
    
    inline def setMachineName(value: String): Self = StObject.set(x, "machineName", value.asInstanceOf[js.Any])
    
    inline def setMachineNameUndefined: Self = StObject.set(x, "machineName", js.undefined)
    
    inline def setRememberPassword(value: Boolean): Self = StObject.set(x, "rememberPassword", value.asInstanceOf[js.Any])
    
    inline def setRememberPasswordUndefined: Self = StObject.set(x, "rememberPassword", js.undefined)
  }
}
