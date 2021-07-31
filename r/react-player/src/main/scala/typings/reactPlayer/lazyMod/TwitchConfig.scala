package typings.reactPlayer.lazyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TwitchConfig extends StObject {
  
  var options: js.UndefOr[js.Object] = js.undefined
  
  var playerId: js.UndefOr[String] = js.undefined
}
object TwitchConfig {
  
  @scala.inline
  def apply(): TwitchConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitchConfig]
  }
  
  @scala.inline
  implicit class TwitchConfigMutableBuilder[Self <: TwitchConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPlayerId(value: String): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerIdUndefined: Self = StObject.set(x, "playerId", js.undefined)
  }
}
