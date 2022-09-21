package typings.reactPlayer

import typings.reactPlayer.baseMod.BaseReactPlayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facebookMod {
  
  @JSImport("react-player/facebook", JSImport.Default)
  @js.native
  open class default ()
    extends typings.reactPlayer.baseMod.default[FacebookPlayerProps]
  
  trait FacebookConfig extends StObject {
    
    var appId: js.UndefOr[String] = js.undefined
    
    var attributes: js.UndefOr[js.Object] = js.undefined
    
    var playerId: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object FacebookConfig {
    
    inline def apply(): FacebookConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FacebookConfig]
    }
    
    extension [Self <: FacebookConfig](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setPlayerId(value: String): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
      
      inline def setPlayerIdUndefined: Self = StObject.set(x, "playerId", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type FacebookPlayer = typings.reactPlayer.baseMod.default[FacebookPlayerProps]
  
  trait FacebookPlayerProps
    extends StObject
       with BaseReactPlayerProps {
    
    var config: js.UndefOr[FacebookConfig] = js.undefined
  }
  object FacebookPlayerProps {
    
    inline def apply(): FacebookPlayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FacebookPlayerProps]
    }
    
    extension [Self <: FacebookPlayerProps](x: Self) {
      
      inline def setConfig(value: FacebookConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
}
