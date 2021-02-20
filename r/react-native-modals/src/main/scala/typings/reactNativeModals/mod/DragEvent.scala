package typings.reactNativeModals.mod

import typings.reactNativeModals.anon.Height
import typings.reactNativeModals.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragEvent extends StObject {
  
  var axis: X = js.native
  
  var layout: Height = js.native
  
  var swipeDirection: String | Null = js.native
}
object DragEvent {
  
  @scala.inline
  def apply(axis: X, layout: Height): DragEvent = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragEvent]
  }
  
  @scala.inline
  implicit class DragEventMutableBuilder[Self <: DragEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: X): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: Height): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeDirection(value: String): Self = StObject.set(x, "swipeDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeDirectionNull: Self = StObject.set(x, "swipeDirection", null)
  }
}
