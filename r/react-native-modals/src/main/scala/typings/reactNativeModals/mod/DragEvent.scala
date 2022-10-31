package typings.reactNativeModals.mod

import typings.reactNativeModals.anon.Height
import typings.reactNativeModals.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragEvent extends StObject {
  
  var axis: X
  
  var layout: Height
  
  var swipeDirection: SwipeDirection | Null
}
object DragEvent {
  
  inline def apply(axis: X, layout: Height): DragEvent = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], swipeDirection = null)
    __obj.asInstanceOf[DragEvent]
  }
  
  extension [Self <: DragEvent](x: Self) {
    
    inline def setAxis(value: X): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: Height): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setSwipeDirection(value: SwipeDirection): Self = StObject.set(x, "swipeDirection", value.asInstanceOf[js.Any])
    
    inline def setSwipeDirectionNull: Self = StObject.set(x, "swipeDirection", null)
  }
}
