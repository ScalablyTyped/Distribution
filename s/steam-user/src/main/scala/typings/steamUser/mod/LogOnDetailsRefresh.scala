package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogOnDetailsRefresh extends StObject {
  
  var clientOS: js.UndefOr[EOSType] = js.undefined
  
  var logonID: js.UndefOr[Double | String] = js.undefined
  
  var machineName: js.UndefOr[String] = js.undefined
  
  var refreshToken: String
  
  var steamID: js.UndefOr[typings.steamid.mod.^ | String] = js.undefined
}
object LogOnDetailsRefresh {
  
  inline def apply(refreshToken: String): LogOnDetailsRefresh = {
    val __obj = js.Dynamic.literal(refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogOnDetailsRefresh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogOnDetailsRefresh] (val x: Self) extends AnyVal {
    
    inline def setClientOS(value: EOSType): Self = StObject.set(x, "clientOS", value.asInstanceOf[js.Any])
    
    inline def setClientOSUndefined: Self = StObject.set(x, "clientOS", js.undefined)
    
    inline def setLogonID(value: Double | String): Self = StObject.set(x, "logonID", value.asInstanceOf[js.Any])
    
    inline def setLogonIDUndefined: Self = StObject.set(x, "logonID", js.undefined)
    
    inline def setMachineName(value: String): Self = StObject.set(x, "machineName", value.asInstanceOf[js.Any])
    
    inline def setMachineNameUndefined: Self = StObject.set(x, "machineName", js.undefined)
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setSteamID(value: typings.steamid.mod.^ | String): Self = StObject.set(x, "steamID", value.asInstanceOf[js.Any])
    
    inline def setSteamIDUndefined: Self = StObject.set(x, "steamID", js.undefined)
  }
}
