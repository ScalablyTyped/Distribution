package typings.steamapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Server extends StObject {
  
  var address: String
  
  var appID: Double
  
  var game: String
  
  var gmsindex: Double
  
  var lan: Boolean
  
  var port: Double
  
  var region: Double
  
  var secure: Boolean
  
  var specPort: Double
}
object Server {
  
  inline def apply(
    address: String,
    appID: Double,
    game: String,
    gmsindex: Double,
    lan: Boolean,
    port: Double,
    region: Double,
    secure: Boolean,
    specPort: Double
  ): Server = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], appID = appID.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], gmsindex = gmsindex.asInstanceOf[js.Any], lan = lan.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], specPort = specPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
  
  extension [Self <: Server](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAppID(value: Double): Self = StObject.set(x, "appID", value.asInstanceOf[js.Any])
    
    inline def setGame(value: String): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
    
    inline def setGmsindex(value: Double): Self = StObject.set(x, "gmsindex", value.asInstanceOf[js.Any])
    
    inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: Double): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSpecPort(value: Double): Self = StObject.set(x, "specPort", value.asInstanceOf[js.Any])
  }
}
