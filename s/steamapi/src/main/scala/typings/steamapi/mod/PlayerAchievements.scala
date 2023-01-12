package typings.steamapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerAchievements
  extends StObject
     with Player {
  
  var achievements: js.Array[Achievement]
  
  var gameName: String
  
  var steamID: String
}
object PlayerAchievements {
  
  inline def apply(achievements: js.Array[Achievement], gameName: String, profileUrl: String, steamID: String): PlayerAchievements = {
    val __obj = js.Dynamic.literal(achievements = achievements.asInstanceOf[js.Any], gameName = gameName.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], steamID = steamID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerAchievements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayerAchievements] (val x: Self) extends AnyVal {
    
    inline def setAchievements(value: js.Array[Achievement]): Self = StObject.set(x, "achievements", value.asInstanceOf[js.Any])
    
    inline def setAchievementsVarargs(value: Achievement*): Self = StObject.set(x, "achievements", js.Array(value*))
    
    inline def setGameName(value: String): Self = StObject.set(x, "gameName", value.asInstanceOf[js.Any])
    
    inline def setSteamID(value: String): Self = StObject.set(x, "steamID", value.asInstanceOf[js.Any])
  }
}
