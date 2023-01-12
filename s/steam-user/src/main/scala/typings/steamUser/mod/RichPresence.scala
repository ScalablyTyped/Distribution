package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RichPresence extends StObject {
  
  var connect: String
  
  @JSName("game:state")
  var gameColonstate: String
  
  var status: String
  
  var steam_display: String
  
  var time: js.UndefOr[String] = js.undefined
  
  var version: String
}
object RichPresence {
  
  inline def apply(connect: String, gameColonstate: String, status: String, steam_display: String, version: String): RichPresence = {
    val __obj = js.Dynamic.literal(connect = connect.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], steam_display = steam_display.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("game:state")(gameColonstate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichPresence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RichPresence] (val x: Self) extends AnyVal {
    
    inline def setConnect(value: String): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    inline def setGameColonstate(value: String): Self = StObject.set(x, "game:state", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSteam_display(value: String): Self = StObject.set(x, "steam_display", value.asInstanceOf[js.Any])
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
