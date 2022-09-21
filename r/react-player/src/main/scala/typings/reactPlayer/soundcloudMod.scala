package typings.reactPlayer

import typings.reactPlayer.baseMod.BaseReactPlayerProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundcloudMod {
  
  @JSImport("react-player/soundcloud", JSImport.Default)
  @js.native
  open class default ()
    extends typings.reactPlayer.baseMod.default[SoundCloudPlayerProps]
  
  trait SoundCloudConfig extends StObject {
    
    var options: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object SoundCloudConfig {
    
    inline def apply(): SoundCloudConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SoundCloudConfig]
    }
    
    extension [Self <: SoundCloudConfig](x: Self) {
      
      inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  type SoundCloudPlayer = typings.reactPlayer.baseMod.default[SoundCloudPlayerProps]
  
  trait SoundCloudPlayerProps
    extends StObject
       with BaseReactPlayerProps {
    
    var config: js.UndefOr[SoundCloudConfig] = js.undefined
  }
  object SoundCloudPlayerProps {
    
    inline def apply(): SoundCloudPlayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SoundCloudPlayerProps]
    }
    
    extension [Self <: SoundCloudPlayerProps](x: Self) {
      
      inline def setConfig(value: SoundCloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
}
