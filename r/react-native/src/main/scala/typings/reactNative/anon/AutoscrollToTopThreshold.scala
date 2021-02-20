package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoscrollToTopThreshold extends StObject {
  
  var autoscrollToTopThreshold: js.UndefOr[Double | Null] = js.native
  
  var minIndexForVisible: Double = js.native
}
object AutoscrollToTopThreshold {
  
  @scala.inline
  def apply(minIndexForVisible: Double): AutoscrollToTopThreshold = {
    val __obj = js.Dynamic.literal(minIndexForVisible = minIndexForVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscrollToTopThreshold]
  }
  
  @scala.inline
  implicit class AutoscrollToTopThresholdMutableBuilder[Self <: AutoscrollToTopThreshold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscrollToTopThreshold(value: Double): Self = StObject.set(x, "autoscrollToTopThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscrollToTopThresholdNull: Self = StObject.set(x, "autoscrollToTopThreshold", null)
    
    @scala.inline
    def setAutoscrollToTopThresholdUndefined: Self = StObject.set(x, "autoscrollToTopThreshold", js.undefined)
    
    @scala.inline
    def setMinIndexForVisible(value: Double): Self = StObject.set(x, "minIndexForVisible", value.asInstanceOf[js.Any])
  }
}
