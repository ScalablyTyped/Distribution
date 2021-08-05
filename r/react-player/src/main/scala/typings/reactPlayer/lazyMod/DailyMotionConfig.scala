package typings.reactPlayer.lazyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DailyMotionConfig extends StObject {
  
  var params: js.UndefOr[js.Object] = js.undefined
}
object DailyMotionConfig {
  
  inline def apply(): DailyMotionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DailyMotionConfig]
  }
  
  extension [Self <: DailyMotionConfig](x: Self) {
    
    inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
