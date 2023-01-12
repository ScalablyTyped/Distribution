package typings.steamapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerBadges extends StObject {
  
  var badges: js.Array[Badge]
  
  var playerCurrentLevelXP: Double
  
  var playerLevel: Double
  
  var playerNextLevelXP: Double
  
  var playerXP: Double
}
object PlayerBadges {
  
  inline def apply(
    badges: js.Array[Badge],
    playerCurrentLevelXP: Double,
    playerLevel: Double,
    playerNextLevelXP: Double,
    playerXP: Double
  ): PlayerBadges = {
    val __obj = js.Dynamic.literal(badges = badges.asInstanceOf[js.Any], playerCurrentLevelXP = playerCurrentLevelXP.asInstanceOf[js.Any], playerLevel = playerLevel.asInstanceOf[js.Any], playerNextLevelXP = playerNextLevelXP.asInstanceOf[js.Any], playerXP = playerXP.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerBadges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayerBadges] (val x: Self) extends AnyVal {
    
    inline def setBadges(value: js.Array[Badge]): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
    
    inline def setBadgesVarargs(value: Badge*): Self = StObject.set(x, "badges", js.Array(value*))
    
    inline def setPlayerCurrentLevelXP(value: Double): Self = StObject.set(x, "playerCurrentLevelXP", value.asInstanceOf[js.Any])
    
    inline def setPlayerLevel(value: Double): Self = StObject.set(x, "playerLevel", value.asInstanceOf[js.Any])
    
    inline def setPlayerNextLevelXP(value: Double): Self = StObject.set(x, "playerNextLevelXP", value.asInstanceOf[js.Any])
    
    inline def setPlayerXP(value: Double): Self = StObject.set(x, "playerXP", value.asInstanceOf[js.Any])
  }
}
