package typings.steamapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Game extends StObject {
  
  var appID: Double
  
  var iconURL: String
  
  var logoURL: String
  
  var name: String
  
  var playTime: Double
  
  var playTime2: Double
}
object Game {
  
  inline def apply(appID: Double, iconURL: String, logoURL: String, name: String, playTime: Double, playTime2: Double): Game = {
    val __obj = js.Dynamic.literal(appID = appID.asInstanceOf[js.Any], iconURL = iconURL.asInstanceOf[js.Any], logoURL = logoURL.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], playTime = playTime.asInstanceOf[js.Any], playTime2 = playTime2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Game]
  }
  
  extension [Self <: Game](x: Self) {
    
    inline def setAppID(value: Double): Self = StObject.set(x, "appID", value.asInstanceOf[js.Any])
    
    inline def setIconURL(value: String): Self = StObject.set(x, "iconURL", value.asInstanceOf[js.Any])
    
    inline def setLogoURL(value: String): Self = StObject.set(x, "logoURL", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlayTime(value: Double): Self = StObject.set(x, "playTime", value.asInstanceOf[js.Any])
    
    inline def setPlayTime2(value: Double): Self = StObject.set(x, "playTime2", value.asInstanceOf[js.Any])
  }
}
