package typings.reactMovable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialX extends js.Object {
  
  var initialX: Double = js.native
  
  var initialY: Double = js.native
  
  var itemDragged: Double = js.native
  
  var itemDraggedOutOfBounds: Double = js.native
  
  var liveText: String = js.native
  
  var scrollWindow: Boolean = js.native
  
  var scrollingSpeed: Double = js.native
  
  var selectedItem: Double = js.native
  
  var targetHeight: Double = js.native
  
  var targetWidth: Double = js.native
  
  var targetX: Double = js.native
  
  var targetY: Double = js.native
}
object InitialX {
  
  @scala.inline
  def apply(
    initialX: Double,
    initialY: Double,
    itemDragged: Double,
    itemDraggedOutOfBounds: Double,
    liveText: String,
    scrollWindow: Boolean,
    scrollingSpeed: Double,
    selectedItem: Double,
    targetHeight: Double,
    targetWidth: Double,
    targetX: Double,
    targetY: Double
  ): InitialX = {
    val __obj = js.Dynamic.literal(initialX = initialX.asInstanceOf[js.Any], initialY = initialY.asInstanceOf[js.Any], itemDragged = itemDragged.asInstanceOf[js.Any], itemDraggedOutOfBounds = itemDraggedOutOfBounds.asInstanceOf[js.Any], liveText = liveText.asInstanceOf[js.Any], scrollWindow = scrollWindow.asInstanceOf[js.Any], scrollingSpeed = scrollingSpeed.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any], targetHeight = targetHeight.asInstanceOf[js.Any], targetWidth = targetWidth.asInstanceOf[js.Any], targetX = targetX.asInstanceOf[js.Any], targetY = targetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialX]
  }
  
  @scala.inline
  implicit class InitialXOps[Self <: InitialX] (val x: Self) extends AnyVal {
    
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
    def setInitialX(value: Double): Self = this.set("initialX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialY(value: Double): Self = this.set("initialY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDragged(value: Double): Self = this.set("itemDragged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDraggedOutOfBounds(value: Double): Self = this.set("itemDraggedOutOfBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveText(value: String): Self = this.set("liveText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollWindow(value: Boolean): Self = this.set("scrollWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollingSpeed(value: Double): Self = this.set("scrollingSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItem(value: Double): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetHeight(value: Double): Self = this.set("targetHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetWidth(value: Double): Self = this.set("targetWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetX(value: Double): Self = this.set("targetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetY(value: Double): Self = this.set("targetY", value.asInstanceOf[js.Any])
  }
}
