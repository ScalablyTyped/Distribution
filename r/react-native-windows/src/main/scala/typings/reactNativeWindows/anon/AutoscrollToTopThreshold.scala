package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscrollToTopThreshold extends StObject {
  
  var autoscrollToTopThreshold: js.UndefOr[Double | Null] = js.undefined
  
  var minIndexForVisible: Double
}
object AutoscrollToTopThreshold {
  
  inline def apply(minIndexForVisible: Double): AutoscrollToTopThreshold = {
    val __obj = js.Dynamic.literal(minIndexForVisible = minIndexForVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscrollToTopThreshold]
  }
  
  extension [Self <: AutoscrollToTopThreshold](x: Self) {
    
    inline def setAutoscrollToTopThreshold(value: Double): Self = StObject.set(x, "autoscrollToTopThreshold", value.asInstanceOf[js.Any])
    
    inline def setAutoscrollToTopThresholdNull: Self = StObject.set(x, "autoscrollToTopThreshold", null)
    
    inline def setAutoscrollToTopThresholdUndefined: Self = StObject.set(x, "autoscrollToTopThreshold", js.undefined)
    
    inline def setMinIndexForVisible(value: Double): Self = StObject.set(x, "minIndexForVisible", value.asInstanceOf[js.Any])
  }
}
