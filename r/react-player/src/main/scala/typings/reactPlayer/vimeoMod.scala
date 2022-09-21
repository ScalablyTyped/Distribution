package typings.reactPlayer

import typings.reactPlayer.baseMod.BaseReactPlayerProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vimeoMod {
  
  @JSImport("react-player/vimeo", JSImport.Default)
  @js.native
  open class default ()
    extends typings.reactPlayer.baseMod.default[VimeoPlayerProps]
  
  trait VimeoConfig extends StObject {
    
    var playerOptions: js.UndefOr[Record[String, Any]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object VimeoConfig {
    
    inline def apply(): VimeoConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VimeoConfig]
    }
    
    extension [Self <: VimeoConfig](x: Self) {
      
      inline def setPlayerOptions(value: Record[String, Any]): Self = StObject.set(x, "playerOptions", value.asInstanceOf[js.Any])
      
      inline def setPlayerOptionsUndefined: Self = StObject.set(x, "playerOptions", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type VimeoPlayer = typings.reactPlayer.baseMod.default[VimeoPlayerProps]
  
  trait VimeoPlayerProps
    extends StObject
       with BaseReactPlayerProps {
    
    var config: js.UndefOr[VimeoConfig] = js.undefined
  }
  object VimeoPlayerProps {
    
    inline def apply(): VimeoPlayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VimeoPlayerProps]
    }
    
    extension [Self <: VimeoPlayerProps](x: Self) {
      
      inline def setConfig(value: VimeoConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
}
