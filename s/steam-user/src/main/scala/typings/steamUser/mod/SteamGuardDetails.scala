package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SteamGuardDetails extends StObject {
  
  var canTrade: Boolean
  
  var isPhoneVerified: Boolean
  
  var isSteamGuardEnabled: Boolean
  
  var isTwoFactorEnabled: Boolean
  
  var timestampMachineSteamGuardEnabled: js.Date | Null
  
  var timestampSteamGuardEnabled: js.Date | Null
  
  var timestampTwoFactorEnabled: js.Date | Null
}
object SteamGuardDetails {
  
  inline def apply(
    canTrade: Boolean,
    isPhoneVerified: Boolean,
    isSteamGuardEnabled: Boolean,
    isTwoFactorEnabled: Boolean
  ): SteamGuardDetails = {
    val __obj = js.Dynamic.literal(canTrade = canTrade.asInstanceOf[js.Any], isPhoneVerified = isPhoneVerified.asInstanceOf[js.Any], isSteamGuardEnabled = isSteamGuardEnabled.asInstanceOf[js.Any], isTwoFactorEnabled = isTwoFactorEnabled.asInstanceOf[js.Any], timestampMachineSteamGuardEnabled = null, timestampSteamGuardEnabled = null, timestampTwoFactorEnabled = null)
    __obj.asInstanceOf[SteamGuardDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SteamGuardDetails] (val x: Self) extends AnyVal {
    
    inline def setCanTrade(value: Boolean): Self = StObject.set(x, "canTrade", value.asInstanceOf[js.Any])
    
    inline def setIsPhoneVerified(value: Boolean): Self = StObject.set(x, "isPhoneVerified", value.asInstanceOf[js.Any])
    
    inline def setIsSteamGuardEnabled(value: Boolean): Self = StObject.set(x, "isSteamGuardEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsTwoFactorEnabled(value: Boolean): Self = StObject.set(x, "isTwoFactorEnabled", value.asInstanceOf[js.Any])
    
    inline def setTimestampMachineSteamGuardEnabled(value: js.Date): Self = StObject.set(x, "timestampMachineSteamGuardEnabled", value.asInstanceOf[js.Any])
    
    inline def setTimestampMachineSteamGuardEnabledNull: Self = StObject.set(x, "timestampMachineSteamGuardEnabled", null)
    
    inline def setTimestampSteamGuardEnabled(value: js.Date): Self = StObject.set(x, "timestampSteamGuardEnabled", value.asInstanceOf[js.Any])
    
    inline def setTimestampSteamGuardEnabledNull: Self = StObject.set(x, "timestampSteamGuardEnabled", null)
    
    inline def setTimestampTwoFactorEnabled(value: js.Date): Self = StObject.set(x, "timestampTwoFactorEnabled", value.asInstanceOf[js.Any])
    
    inline def setTimestampTwoFactorEnabledNull: Self = StObject.set(x, "timestampTwoFactorEnabled", null)
  }
}
