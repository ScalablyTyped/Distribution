package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogOnDetailsAnon extends StObject {
  
  var authCode: js.UndefOr[String] = js.undefined
  
  var autoRelogin: js.UndefOr[Boolean] = js.undefined
  
  var clientOS: js.UndefOr[EOSType] = js.undefined
  
  var dontRememberMachine: js.UndefOr[Boolean] = js.undefined
  
  var loginKey: js.UndefOr[String] = js.undefined
  
  var logonID: js.UndefOr[Double | String] = js.undefined
  
  var machineName: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var rememberPassword: js.UndefOr[Boolean] = js.undefined
  
  var steamID: js.UndefOr[typings.steamid.mod.^ | String] = js.undefined
  
  var twoFactorCode: js.UndefOr[String] = js.undefined
  
  var webLogonToken: js.UndefOr[String] = js.undefined
}
object LogOnDetailsAnon {
  
  inline def apply(): LogOnDetailsAnon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogOnDetailsAnon]
  }
  
  extension [Self <: LogOnDetailsAnon](x: Self) {
    
    inline def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
    
    inline def setAuthCodeUndefined: Self = StObject.set(x, "authCode", js.undefined)
    
    inline def setAutoRelogin(value: Boolean): Self = StObject.set(x, "autoRelogin", value.asInstanceOf[js.Any])
    
    inline def setAutoReloginUndefined: Self = StObject.set(x, "autoRelogin", js.undefined)
    
    inline def setClientOS(value: EOSType): Self = StObject.set(x, "clientOS", value.asInstanceOf[js.Any])
    
    inline def setClientOSUndefined: Self = StObject.set(x, "clientOS", js.undefined)
    
    inline def setDontRememberMachine(value: Boolean): Self = StObject.set(x, "dontRememberMachine", value.asInstanceOf[js.Any])
    
    inline def setDontRememberMachineUndefined: Self = StObject.set(x, "dontRememberMachine", js.undefined)
    
    inline def setLoginKey(value: String): Self = StObject.set(x, "loginKey", value.asInstanceOf[js.Any])
    
    inline def setLoginKeyUndefined: Self = StObject.set(x, "loginKey", js.undefined)
    
    inline def setLogonID(value: Double | String): Self = StObject.set(x, "logonID", value.asInstanceOf[js.Any])
    
    inline def setLogonIDUndefined: Self = StObject.set(x, "logonID", js.undefined)
    
    inline def setMachineName(value: String): Self = StObject.set(x, "machineName", value.asInstanceOf[js.Any])
    
    inline def setMachineNameUndefined: Self = StObject.set(x, "machineName", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setRememberPassword(value: Boolean): Self = StObject.set(x, "rememberPassword", value.asInstanceOf[js.Any])
    
    inline def setRememberPasswordUndefined: Self = StObject.set(x, "rememberPassword", js.undefined)
    
    inline def setSteamID(value: typings.steamid.mod.^ | String): Self = StObject.set(x, "steamID", value.asInstanceOf[js.Any])
    
    inline def setSteamIDUndefined: Self = StObject.set(x, "steamID", js.undefined)
    
    inline def setTwoFactorCode(value: String): Self = StObject.set(x, "twoFactorCode", value.asInstanceOf[js.Any])
    
    inline def setTwoFactorCodeUndefined: Self = StObject.set(x, "twoFactorCode", js.undefined)
    
    inline def setWebLogonToken(value: String): Self = StObject.set(x, "webLogonToken", value.asInstanceOf[js.Any])
    
    inline def setWebLogonTokenUndefined: Self = StObject.set(x, "webLogonToken", js.undefined)
  }
}
