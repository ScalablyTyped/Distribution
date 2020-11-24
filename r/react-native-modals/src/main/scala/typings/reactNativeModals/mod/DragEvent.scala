package typings.reactNativeModals.mod

import typings.reactNativeModals.anon.Height
import typings.reactNativeModals.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragEvent extends js.Object {
  
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
  implicit class DragEventOps[Self <: DragEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAxis(value: X): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: Height): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeDirection(value: String): Self = this.set("swipeDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeDirectionNull: Self = this.set("swipeDirection", null)
  }
}
