package typings.steamapi.mod

import typings.steamapi.steamapiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerServers
  extends StObject
     with Player {
  
  var banned: `false`
  
  var expires: Double
  
  /**
    * Date when this expires.
    */
  val expiresAt: js.Date
  
  /**
    * Date when the last action was executed.
    */
  val lastActionAt: js.Date
  
  var lastActionTime: Double
  
  var servers: js.Array[GameServer]
  
  var steamID: String
}
object PlayerServers {
  
  inline def apply(
    expires: Double,
    expiresAt: js.Date,
    lastActionAt: js.Date,
    lastActionTime: Double,
    profileUrl: String,
    servers: js.Array[GameServer],
    steamID: String
  ): PlayerServers = {
    val __obj = js.Dynamic.literal(banned = false, expires = expires.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], lastActionAt = lastActionAt.asInstanceOf[js.Any], lastActionTime = lastActionTime.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], servers = servers.asInstanceOf[js.Any], steamID = steamID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerServers]
  }
  
  extension [Self <: PlayerServers](x: Self) {
    
    inline def setBanned(value: `false`): Self = StObject.set(x, "banned", value.asInstanceOf[js.Any])
    
    inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresAt(value: js.Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    inline def setLastActionAt(value: js.Date): Self = StObject.set(x, "lastActionAt", value.asInstanceOf[js.Any])
    
    inline def setLastActionTime(value: Double): Self = StObject.set(x, "lastActionTime", value.asInstanceOf[js.Any])
    
    inline def setServers(value: js.Array[GameServer]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    inline def setServersVarargs(value: GameServer*): Self = StObject.set(x, "servers", js.Array(value*))
    
    inline def setSteamID(value: String): Self = StObject.set(x, "steamID", value.asInstanceOf[js.Any])
  }
}
