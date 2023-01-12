package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TradeRestrictions extends StObject {
  
  var defaultEmailChangeProbationDays: js.UndefOr[Double] = js.undefined
  
  var defaultPasswordResetProbationDays: js.UndefOr[Double] = js.undefined
  
  var emailChangeProbationDays: js.UndefOr[Double] = js.undefined
  
  var newDeviceCooldownDays: js.UndefOr[Double] = js.undefined
  
  var passwordResetProbationDays: js.UndefOr[Double] = js.undefined
  
  var steamguardRequiredDays: js.UndefOr[Double] = js.undefined
}
object TradeRestrictions {
  
  inline def apply(): TradeRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TradeRestrictions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TradeRestrictions] (val x: Self) extends AnyVal {
    
    inline def setDefaultEmailChangeProbationDays(value: Double): Self = StObject.set(x, "defaultEmailChangeProbationDays", value.asInstanceOf[js.Any])
    
    inline def setDefaultEmailChangeProbationDaysUndefined: Self = StObject.set(x, "defaultEmailChangeProbationDays", js.undefined)
    
    inline def setDefaultPasswordResetProbationDays(value: Double): Self = StObject.set(x, "defaultPasswordResetProbationDays", value.asInstanceOf[js.Any])
    
    inline def setDefaultPasswordResetProbationDaysUndefined: Self = StObject.set(x, "defaultPasswordResetProbationDays", js.undefined)
    
    inline def setEmailChangeProbationDays(value: Double): Self = StObject.set(x, "emailChangeProbationDays", value.asInstanceOf[js.Any])
    
    inline def setEmailChangeProbationDaysUndefined: Self = StObject.set(x, "emailChangeProbationDays", js.undefined)
    
    inline def setNewDeviceCooldownDays(value: Double): Self = StObject.set(x, "newDeviceCooldownDays", value.asInstanceOf[js.Any])
    
    inline def setNewDeviceCooldownDaysUndefined: Self = StObject.set(x, "newDeviceCooldownDays", js.undefined)
    
    inline def setPasswordResetProbationDays(value: Double): Self = StObject.set(x, "passwordResetProbationDays", value.asInstanceOf[js.Any])
    
    inline def setPasswordResetProbationDaysUndefined: Self = StObject.set(x, "passwordResetProbationDays", js.undefined)
    
    inline def setSteamguardRequiredDays(value: Double): Self = StObject.set(x, "steamguardRequiredDays", value.asInstanceOf[js.Any])
    
    inline def setSteamguardRequiredDaysUndefined: Self = StObject.set(x, "steamguardRequiredDays", js.undefined)
  }
}
