package typings.reactNativeDraggableFlatlist.anon

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveCellSize extends StObject {
  
  var activeCellSize: js.UndefOr[Node] = js.undefined
  
  var autoscrollSpeed: js.UndefOr[Double] = js.undefined
  
  var autoscrollThreshold: js.UndefOr[Double] = js.undefined
  
  var hoverAnim: js.UndefOr[Node] = js.undefined
  
  var isDraggingCell: js.UndefOr[Node] = js.undefined
  
  var panGestureState: js.UndefOr[Node] = js.undefined
}
object ActiveCellSize {
  
  inline def apply(): ActiveCellSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveCellSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveCellSize] (val x: Self) extends AnyVal {
    
    inline def setActiveCellSize(value: Node): Self = StObject.set(x, "activeCellSize", value.asInstanceOf[js.Any])
    
    inline def setActiveCellSizeUndefined: Self = StObject.set(x, "activeCellSize", js.undefined)
    
    inline def setAutoscrollSpeed(value: Double): Self = StObject.set(x, "autoscrollSpeed", value.asInstanceOf[js.Any])
    
    inline def setAutoscrollSpeedUndefined: Self = StObject.set(x, "autoscrollSpeed", js.undefined)
    
    inline def setAutoscrollThreshold(value: Double): Self = StObject.set(x, "autoscrollThreshold", value.asInstanceOf[js.Any])
    
    inline def setAutoscrollThresholdUndefined: Self = StObject.set(x, "autoscrollThreshold", js.undefined)
    
    inline def setHoverAnim(value: Node): Self = StObject.set(x, "hoverAnim", value.asInstanceOf[js.Any])
    
    inline def setHoverAnimUndefined: Self = StObject.set(x, "hoverAnim", js.undefined)
    
    inline def setIsDraggingCell(value: Node): Self = StObject.set(x, "isDraggingCell", value.asInstanceOf[js.Any])
    
    inline def setIsDraggingCellUndefined: Self = StObject.set(x, "isDraggingCell", js.undefined)
    
    inline def setPanGestureState(value: Node): Self = StObject.set(x, "panGestureState", value.asInstanceOf[js.Any])
    
    inline def setPanGestureStateUndefined: Self = StObject.set(x, "panGestureState", js.undefined)
  }
}
