package typings.reactPlayer

import typings.reactPlayer.baseMod.BaseReactPlayerProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object youtubeMod {
  
  @JSImport("react-player/youtube", JSImport.Default)
  @js.native
  open class default ()
    extends typings.reactPlayer.baseMod.default[YouTubePlayerProps]
  
  trait YouTubeConfig extends StObject {
    
    var embedOptions: js.UndefOr[Record[String, Any]] = js.undefined
    
    var onUnstarted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var playerVars: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object YouTubeConfig {
    
    inline def apply(): YouTubeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YouTubeConfig]
    }
    
    extension [Self <: YouTubeConfig](x: Self) {
      
      inline def setEmbedOptions(value: Record[String, Any]): Self = StObject.set(x, "embedOptions", value.asInstanceOf[js.Any])
      
      inline def setEmbedOptionsUndefined: Self = StObject.set(x, "embedOptions", js.undefined)
      
      inline def setOnUnstarted(value: () => Unit): Self = StObject.set(x, "onUnstarted", js.Any.fromFunction0(value))
      
      inline def setOnUnstartedUndefined: Self = StObject.set(x, "onUnstarted", js.undefined)
      
      inline def setPlayerVars(value: Record[String, Any]): Self = StObject.set(x, "playerVars", value.asInstanceOf[js.Any])
      
      inline def setPlayerVarsUndefined: Self = StObject.set(x, "playerVars", js.undefined)
    }
  }
  
  type YouTubePlayer = typings.reactPlayer.baseMod.default[YouTubePlayerProps]
  
  trait YouTubePlayerProps
    extends StObject
       with BaseReactPlayerProps {
    
    var config: js.UndefOr[YouTubeConfig] = js.undefined
  }
  object YouTubePlayerProps {
    
    inline def apply(): YouTubePlayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YouTubePlayerProps]
    }
    
    extension [Self <: YouTubePlayerProps](x: Self) {
      
      inline def setConfig(value: YouTubeConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
}
