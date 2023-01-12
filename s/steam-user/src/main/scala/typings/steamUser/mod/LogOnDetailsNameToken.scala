package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogOnDetailsNameToken extends StObject {
  
  var accountName: String
  
  var autoRelogin: js.UndefOr[Boolean] = js.undefined
  
  var steamID: typings.steamid.mod.^ | String
  
  var webLogonToken: String
}
object LogOnDetailsNameToken {
  
  inline def apply(accountName: String, steamID: typings.steamid.mod.^ | String, webLogonToken: String): LogOnDetailsNameToken = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], steamID = steamID.asInstanceOf[js.Any], webLogonToken = webLogonToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogOnDetailsNameToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogOnDetailsNameToken] (val x: Self) extends AnyVal {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAutoRelogin(value: Boolean): Self = StObject.set(x, "autoRelogin", value.asInstanceOf[js.Any])
    
    inline def setAutoReloginUndefined: Self = StObject.set(x, "autoRelogin", js.undefined)
    
    inline def setSteamID(value: typings.steamid.mod.^ | String): Self = StObject.set(x, "steamID", value.asInstanceOf[js.Any])
    
    inline def setWebLogonToken(value: String): Self = StObject.set(x, "webLogonToken", value.asInstanceOf[js.Any])
  }
}
