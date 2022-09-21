package typings.reactPlayer

import typings.reactPlayer.baseMod.BaseReactPlayerProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vidyardMod {
  
  @JSImport("react-player/vidyard", JSImport.Default)
  @js.native
  open class default ()
    extends typings.reactPlayer.baseMod.default[VidyardPlayerProps]
  
  trait VidyardConfig extends StObject {
    
    var options: js.UndefOr[Record[String, js.Object]] = js.undefined
  }
  object VidyardConfig {
    
    inline def apply(): VidyardConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VidyardConfig]
    }
    
    extension [Self <: VidyardConfig](x: Self) {
      
      inline def setOptions(value: Record[String, js.Object]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  type VidyardPlayer = typings.reactPlayer.baseMod.default[VidyardPlayerProps]
  
  trait VidyardPlayerProps
    extends StObject
       with BaseReactPlayerProps {
    
    var config: js.UndefOr[VidyardConfig] = js.undefined
  }
  object VidyardPlayerProps {
    
    inline def apply(): VidyardPlayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VidyardPlayerProps]
    }
    
    extension [Self <: VidyardPlayerProps](x: Self) {
      
      inline def setConfig(value: VidyardConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
}
