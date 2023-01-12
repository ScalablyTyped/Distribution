package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivacySettings extends StObject {
  
  var privacy_state: EPrivacyState
  
  var privacy_state_friendslist: EPrivacyState
  
  var privacy_state_gifts: EPrivacyState
  
  var privacy_state_inventory: EPrivacyState
  
  var privacy_state_ownedgames: EPrivacyState
  
  var privacy_state_playtime: EPrivacyState
}
object PrivacySettings {
  
  inline def apply(
    privacy_state: EPrivacyState,
    privacy_state_friendslist: EPrivacyState,
    privacy_state_gifts: EPrivacyState,
    privacy_state_inventory: EPrivacyState,
    privacy_state_ownedgames: EPrivacyState,
    privacy_state_playtime: EPrivacyState
  ): PrivacySettings = {
    val __obj = js.Dynamic.literal(privacy_state = privacy_state.asInstanceOf[js.Any], privacy_state_friendslist = privacy_state_friendslist.asInstanceOf[js.Any], privacy_state_gifts = privacy_state_gifts.asInstanceOf[js.Any], privacy_state_inventory = privacy_state_inventory.asInstanceOf[js.Any], privacy_state_ownedgames = privacy_state_ownedgames.asInstanceOf[js.Any], privacy_state_playtime = privacy_state_playtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivacySettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrivacySettings] (val x: Self) extends AnyVal {
    
    inline def setPrivacy_state(value: EPrivacyState): Self = StObject.set(x, "privacy_state", value.asInstanceOf[js.Any])
    
    inline def setPrivacy_state_friendslist(value: EPrivacyState): Self = StObject.set(x, "privacy_state_friendslist", value.asInstanceOf[js.Any])
    
    inline def setPrivacy_state_gifts(value: EPrivacyState): Self = StObject.set(x, "privacy_state_gifts", value.asInstanceOf[js.Any])
    
    inline def setPrivacy_state_inventory(value: EPrivacyState): Self = StObject.set(x, "privacy_state_inventory", value.asInstanceOf[js.Any])
    
    inline def setPrivacy_state_ownedgames(value: EPrivacyState): Self = StObject.set(x, "privacy_state_ownedgames", value.asInstanceOf[js.Any])
    
    inline def setPrivacy_state_playtime(value: EPrivacyState): Self = StObject.set(x, "privacy_state_playtime", value.asInstanceOf[js.Any])
  }
}
