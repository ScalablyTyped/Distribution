package typings.reactPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WistiaConfig extends StObject {
  
  var options: js.UndefOr[js.Object] = js.undefined
  
  var playerId: js.UndefOr[String] = js.undefined
}
object WistiaConfig {
  
  inline def apply(): WistiaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WistiaConfig]
  }
  
  extension [Self <: WistiaConfig](x: Self) {
    
    inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPlayerId(value: String): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    
    inline def setPlayerIdUndefined: Self = StObject.set(x, "playerId", js.undefined)
  }
}
