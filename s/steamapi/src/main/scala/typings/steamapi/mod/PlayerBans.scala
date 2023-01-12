package typings.steamapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerBans extends StObject {
  
  var communityBanned: Boolean
  
  var daysSinceLastBan: Double
  
  var economyBan: String
  
  var gameBans: Double
  
  /**
    * Date when the last ban occurred.
    */
  val lastBan: js.Date
  
  var steamID: String
  
  var vacBanned: Boolean
  
  var vacBans: Double
}
object PlayerBans {
  
  inline def apply(
    communityBanned: Boolean,
    daysSinceLastBan: Double,
    economyBan: String,
    gameBans: Double,
    lastBan: js.Date,
    steamID: String,
    vacBanned: Boolean,
    vacBans: Double
  ): PlayerBans = {
    val __obj = js.Dynamic.literal(communityBanned = communityBanned.asInstanceOf[js.Any], daysSinceLastBan = daysSinceLastBan.asInstanceOf[js.Any], economyBan = economyBan.asInstanceOf[js.Any], gameBans = gameBans.asInstanceOf[js.Any], lastBan = lastBan.asInstanceOf[js.Any], steamID = steamID.asInstanceOf[js.Any], vacBanned = vacBanned.asInstanceOf[js.Any], vacBans = vacBans.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerBans]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayerBans] (val x: Self) extends AnyVal {
    
    inline def setCommunityBanned(value: Boolean): Self = StObject.set(x, "communityBanned", value.asInstanceOf[js.Any])
    
    inline def setDaysSinceLastBan(value: Double): Self = StObject.set(x, "daysSinceLastBan", value.asInstanceOf[js.Any])
    
    inline def setEconomyBan(value: String): Self = StObject.set(x, "economyBan", value.asInstanceOf[js.Any])
    
    inline def setGameBans(value: Double): Self = StObject.set(x, "gameBans", value.asInstanceOf[js.Any])
    
    inline def setLastBan(value: js.Date): Self = StObject.set(x, "lastBan", value.asInstanceOf[js.Any])
    
    inline def setSteamID(value: String): Self = StObject.set(x, "steamID", value.asInstanceOf[js.Any])
    
    inline def setVacBanned(value: Boolean): Self = StObject.set(x, "vacBanned", value.asInstanceOf[js.Any])
    
    inline def setVacBans(value: Double): Self = StObject.set(x, "vacBans", value.asInstanceOf[js.Any])
  }
}
