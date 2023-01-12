package typings.steamUser.mod

import typings.steamUser.steamUserStrings.l
import typings.steamUser.steamUserStrings.w
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Server extends StObject {
  
  var addr: String
  
  var appid: Double
  
  var bots: Double
  
  var dedicated: Boolean
  
  var gamedir: String
  
  var gametype: String
  
  var map: String
  
  var max_players: Double
  
  var name: String
  
  var os: w | l
  
  var players: Double
  
  var product: String
  
  var region: RegionCode
  
  var secure: Boolean
  
  var specport: Double | Null
  
  var steamid: typings.steamid.mod.^
  
  var version: String
}
object Server {
  
  inline def apply(
    addr: String,
    appid: Double,
    bots: Double,
    dedicated: Boolean,
    gamedir: String,
    gametype: String,
    map: String,
    max_players: Double,
    name: String,
    os: w | l,
    players: Double,
    product: String,
    region: RegionCode,
    secure: Boolean,
    steamid: typings.steamid.mod.^,
    version: String
  ): Server = {
    val __obj = js.Dynamic.literal(addr = addr.asInstanceOf[js.Any], appid = appid.asInstanceOf[js.Any], bots = bots.asInstanceOf[js.Any], dedicated = dedicated.asInstanceOf[js.Any], gamedir = gamedir.asInstanceOf[js.Any], gametype = gametype.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], max_players = max_players.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], players = players.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], steamid = steamid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], specport = null)
    __obj.asInstanceOf[Server]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Server] (val x: Self) extends AnyVal {
    
    inline def setAddr(value: String): Self = StObject.set(x, "addr", value.asInstanceOf[js.Any])
    
    inline def setAppid(value: Double): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    inline def setBots(value: Double): Self = StObject.set(x, "bots", value.asInstanceOf[js.Any])
    
    inline def setDedicated(value: Boolean): Self = StObject.set(x, "dedicated", value.asInstanceOf[js.Any])
    
    inline def setGamedir(value: String): Self = StObject.set(x, "gamedir", value.asInstanceOf[js.Any])
    
    inline def setGametype(value: String): Self = StObject.set(x, "gametype", value.asInstanceOf[js.Any])
    
    inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMax_players(value: Double): Self = StObject.set(x, "max_players", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOs(value: w | l): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setPlayers(value: Double): Self = StObject.set(x, "players", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: RegionCode): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSpecport(value: Double): Self = StObject.set(x, "specport", value.asInstanceOf[js.Any])
    
    inline def setSpecportNull: Self = StObject.set(x, "specport", null)
    
    inline def setSteamid(value: typings.steamid.mod.^): Self = StObject.set(x, "steamid", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
