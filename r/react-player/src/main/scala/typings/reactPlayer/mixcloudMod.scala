package typings.reactPlayer

import typings.reactPlayer.baseMod.BaseReactPlayerProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixcloudMod {
  
  @JSImport("react-player/mixcloud", JSImport.Default)
  @js.native
  open class default ()
    extends typings.reactPlayer.baseMod.default[MixcloudPlayerProps]
  
  trait MixcloudConfig extends StObject {
    
    var options: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object MixcloudConfig {
    
    inline def apply(): MixcloudConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MixcloudConfig]
    }
    
    extension [Self <: MixcloudConfig](x: Self) {
      
      inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  type MixcloudPlayer = typings.reactPlayer.baseMod.default[MixcloudPlayerProps]
  
  trait MixcloudPlayerProps
    extends StObject
       with BaseReactPlayerProps {
    
    var config: js.UndefOr[MixcloudConfig] = js.undefined
  }
  object MixcloudPlayerProps {
    
    inline def apply(): MixcloudPlayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MixcloudPlayerProps]
    }
    
    extension [Self <: MixcloudPlayerProps](x: Self) {
      
      inline def setConfig(value: MixcloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
}
