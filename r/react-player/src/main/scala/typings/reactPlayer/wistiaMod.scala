package typings.reactPlayer

import typings.reactPlayer.baseMod.BaseReactPlayerProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wistiaMod {
  
  @JSImport("react-player/wistia", JSImport.Default)
  @js.native
  open class default ()
    extends typings.reactPlayer.baseMod.default[WistiaPlayerProps]
  
  trait WistiaConfig extends StObject {
    
    var customControls: js.UndefOr[js.Array[Any]] = js.undefined
    
    var options: js.UndefOr[Record[String, Any]] = js.undefined
    
    var playerId: js.UndefOr[String] = js.undefined
  }
  object WistiaConfig {
    
    inline def apply(): WistiaConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WistiaConfig]
    }
    
    extension [Self <: WistiaConfig](x: Self) {
      
      inline def setCustomControls(value: js.Array[Any]): Self = StObject.set(x, "customControls", value.asInstanceOf[js.Any])
      
      inline def setCustomControlsUndefined: Self = StObject.set(x, "customControls", js.undefined)
      
      inline def setCustomControlsVarargs(value: Any*): Self = StObject.set(x, "customControls", js.Array(value*))
      
      inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPlayerId(value: String): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
      
      inline def setPlayerIdUndefined: Self = StObject.set(x, "playerId", js.undefined)
    }
  }
  
  type WistiaPlayer = typings.reactPlayer.baseMod.default[WistiaPlayerProps]
  
  trait WistiaPlayerProps
    extends StObject
       with BaseReactPlayerProps {
    
    var config: js.UndefOr[WistiaConfig] = js.undefined
  }
  object WistiaPlayerProps {
    
    inline def apply(): WistiaPlayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WistiaPlayerProps]
    }
    
    extension [Self <: WistiaPlayerProps](x: Self) {
      
      inline def setConfig(value: WistiaConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
}
