package typings.steamapi.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerStats extends StObject {
  
  var achievements: Record[String, Any]
  
  var game: String
  
  var stats: Record[String, Any]
  
  var steamID: String
}
object PlayerStats {
  
  inline def apply(achievements: Record[String, Any], game: String, stats: Record[String, Any], steamID: String): PlayerStats = {
    val __obj = js.Dynamic.literal(achievements = achievements.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], steamID = steamID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayerStats] (val x: Self) extends AnyVal {
    
    inline def setAchievements(value: Record[String, Any]): Self = StObject.set(x, "achievements", value.asInstanceOf[js.Any])
    
    inline def setGame(value: String): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
    
    inline def setStats(value: Record[String, Any]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setSteamID(value: String): Self = StObject.set(x, "steamID", value.asInstanceOf[js.Any])
  }
}
