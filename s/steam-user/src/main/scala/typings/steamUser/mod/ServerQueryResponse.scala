package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerQueryResponse extends StObject {
  
  var gameport: Double
  
  var ip: String
  
  var players: Double
  
  var port: Double
}
object ServerQueryResponse {
  
  inline def apply(gameport: Double, ip: String, players: Double, port: Double): ServerQueryResponse = {
    val __obj = js.Dynamic.literal(gameport = gameport.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], players = players.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerQueryResponse]
  }
  
  extension [Self <: ServerQueryResponse](x: Self) {
    
    inline def setGameport(value: Double): Self = StObject.set(x, "gameport", value.asInstanceOf[js.Any])
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setPlayers(value: Double): Self = StObject.set(x, "players", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
