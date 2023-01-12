package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogOnDetailsNamePass extends StObject {
  
  var accountName: String
  
  var authCode: js.UndefOr[String] = js.undefined
  
  var autoRelogin: js.UndefOr[Boolean] = js.undefined
  
  var clientOS: js.UndefOr[EOSType] = js.undefined
  
  var dontRememberMachine: js.UndefOr[Boolean] = js.undefined
  
  var logonID: js.UndefOr[Double | String] = js.undefined
  
  var machineName: js.UndefOr[String] = js.undefined
  
  var password: String
  
  var rememberPassword: js.UndefOr[Boolean] = js.undefined
  
  var twoFactorCode: js.UndefOr[String] = js.undefined
}
object LogOnDetailsNamePass {
  
  inline def apply(accountName: String, password: String): LogOnDetailsNamePass = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogOnDetailsNamePass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogOnDetailsNamePass] (val x: Self) extends AnyVal {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
    
    inline def setAuthCodeUndefined: Self = StObject.set(x, "authCode", js.undefined)
    
    inline def setAutoRelogin(value: Boolean): Self = StObject.set(x, "autoRelogin", value.asInstanceOf[js.Any])
    
    inline def setAutoReloginUndefined: Self = StObject.set(x, "autoRelogin", js.undefined)
    
    inline def setClientOS(value: EOSType): Self = StObject.set(x, "clientOS", value.asInstanceOf[js.Any])
    
    inline def setClientOSUndefined: Self = StObject.set(x, "clientOS", js.undefined)
    
    inline def setDontRememberMachine(value: Boolean): Self = StObject.set(x, "dontRememberMachine", value.asInstanceOf[js.Any])
    
    inline def setDontRememberMachineUndefined: Self = StObject.set(x, "dontRememberMachine", js.undefined)
    
    inline def setLogonID(value: Double | String): Self = StObject.set(x, "logonID", value.asInstanceOf[js.Any])
    
    inline def setLogonIDUndefined: Self = StObject.set(x, "logonID", js.undefined)
    
    inline def setMachineName(value: String): Self = StObject.set(x, "machineName", value.asInstanceOf[js.Any])
    
    inline def setMachineNameUndefined: Self = StObject.set(x, "machineName", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setRememberPassword(value: Boolean): Self = StObject.set(x, "rememberPassword", value.asInstanceOf[js.Any])
    
    inline def setRememberPasswordUndefined: Self = StObject.set(x, "rememberPassword", js.undefined)
    
    inline def setTwoFactorCode(value: String): Self = StObject.set(x, "twoFactorCode", value.asInstanceOf[js.Any])
    
    inline def setTwoFactorCodeUndefined: Self = StObject.set(x, "twoFactorCode", js.undefined)
  }
}
