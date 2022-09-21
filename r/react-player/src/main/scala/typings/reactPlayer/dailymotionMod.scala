package typings.reactPlayer

import typings.reactPlayer.baseMod.BaseReactPlayerProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dailymotionMod {
  
  @JSImport("react-player/dailymotion", JSImport.Default)
  @js.native
  open class default ()
    extends typings.reactPlayer.baseMod.default[DailyMotionPlayerProps]
  
  trait DailyMotionConfig extends StObject {
    
    var params: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object DailyMotionConfig {
    
    inline def apply(): DailyMotionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DailyMotionConfig]
    }
    
    extension [Self <: DailyMotionConfig](x: Self) {
      
      inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  type DailyMotionPlayer = typings.reactPlayer.baseMod.default[DailyMotionPlayerProps]
  
  trait DailyMotionPlayerProps
    extends StObject
       with BaseReactPlayerProps {
    
    var config: js.UndefOr[DailyMotionConfig] = js.undefined
  }
  object DailyMotionPlayerProps {
    
    inline def apply(): DailyMotionPlayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DailyMotionPlayerProps]
    }
    
    extension [Self <: DailyMotionPlayerProps](x: Self) {
      
      inline def setConfig(value: DailyMotionConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
}
