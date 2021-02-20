package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapControlEvent extends StObject {
  
  var center: Center = js.native
  
  var delta: js.UndefOr[Double] = js.native
  
  var key: js.UndefOr[Double] = js.native
  
  var leftButton: js.UndefOr[Boolean] = js.native
  
  var middleButton: js.UndefOr[Boolean] = js.native
  
  var offsetCenter: Center = js.native
  
  var pointerType: js.UndefOr[String] = js.native
  
  var rightButton: js.UndefOr[Boolean] = js.native
  
  var srcEvent: js.Any = js.native
  
  var target: js.Any = js.native
  
  var `type`: String = js.native
}
object MapControlEvent {
  
  @scala.inline
  def apply(center: Center, offsetCenter: Center, srcEvent: js.Any, target: js.Any, `type`: String): MapControlEvent = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], offsetCenter = offsetCenter.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapControlEvent]
  }
  
  @scala.inline
  implicit class MapControlEventMutableBuilder[Self <: MapControlEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Center): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLeftButton(value: Boolean): Self = StObject.set(x, "leftButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftButtonUndefined: Self = StObject.set(x, "leftButton", js.undefined)
    
    @scala.inline
    def setMiddleButton(value: Boolean): Self = StObject.set(x, "middleButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleButtonUndefined: Self = StObject.set(x, "middleButton", js.undefined)
    
    @scala.inline
    def setOffsetCenter(value: Center): Self = StObject.set(x, "offsetCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerTypeUndefined: Self = StObject.set(x, "pointerType", js.undefined)
    
    @scala.inline
    def setRightButton(value: Boolean): Self = StObject.set(x, "rightButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightButtonUndefined: Self = StObject.set(x, "rightButton", js.undefined)
    
    @scala.inline
    def setSrcEvent(value: js.Any): Self = StObject.set(x, "srcEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
