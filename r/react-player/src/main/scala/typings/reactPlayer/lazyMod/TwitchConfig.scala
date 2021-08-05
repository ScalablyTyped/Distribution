package typings.reactPlayer.lazyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TwitchConfig extends StObject {
  
  var options: js.UndefOr[js.Object] = js.undefined
  
  var playerId: js.UndefOr[String] = js.undefined
}
object TwitchConfig {
  
  inline def apply(): TwitchConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitchConfig]
  }
  
  extension [Self <: TwitchConfig](x: Self) {
    
    inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPlayerId(value: String): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    
    inline def setPlayerIdUndefined: Self = StObject.set(x, "playerId", js.undefined)
  }
}
