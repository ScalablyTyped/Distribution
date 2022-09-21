package typings.reactPlayer

import typings.reactPlayer.baseMod.BaseReactPlayerProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twitchMod {
  
  @JSImport("react-player/twitch", JSImport.Default)
  @js.native
  open class default ()
    extends typings.reactPlayer.baseMod.default[TwitchPlayerProps]
  
  trait TwitchConfig extends StObject {
    
    var options: js.UndefOr[Record[String, Any]] = js.undefined
    
    var playerId: js.UndefOr[String] = js.undefined
  }
  object TwitchConfig {
    
    inline def apply(): TwitchConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwitchConfig]
    }
    
    extension [Self <: TwitchConfig](x: Self) {
      
      inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPlayerId(value: String): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
      
      inline def setPlayerIdUndefined: Self = StObject.set(x, "playerId", js.undefined)
    }
  }
  
  type TwitchPlayer = typings.reactPlayer.baseMod.default[TwitchPlayerProps]
  
  trait TwitchPlayerProps
    extends StObject
       with BaseReactPlayerProps {
    
    var config: js.UndefOr[TwitchConfig] = js.undefined
  }
  object TwitchPlayerProps {
    
    inline def apply(): TwitchPlayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwitchPlayerProps]
    }
    
    extension [Self <: TwitchPlayerProps](x: Self) {
      
      inline def setConfig(value: TwitchConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
}
