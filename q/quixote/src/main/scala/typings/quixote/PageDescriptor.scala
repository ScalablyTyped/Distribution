package typings.quixote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Page positions and sizes are available on QFrame.page().
@js.native
trait PageDescriptor extends js.Object {
  
  // The bottom of the page.
  var bottom: PositionDescriptor = js.native
  
  // Horizontal center: midway between right and left.
  var center: PositionDescriptor = js.native
  
  // Height of the page.
  var height: SizeDescriptor = js.native
  
  // The left side of the page.
  var left: PositionDescriptor = js.native
  
  // Vertical middle: midway between top and bottom.
  var middle: PositionDescriptor = js.native
  
  // The right side of the page.
  var right: PositionDescriptor = js.native
  
  // The top of the page.
  var top: PositionDescriptor = js.native
  
  // Width of the page.
  var width: SizeDescriptor = js.native
}
object PageDescriptor {
  
  @scala.inline
  def apply(
    bottom: PositionDescriptor,
    center: PositionDescriptor,
    height: SizeDescriptor,
    left: PositionDescriptor,
    middle: PositionDescriptor,
    right: PositionDescriptor,
    top: PositionDescriptor,
    width: SizeDescriptor
  ): PageDescriptor = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageDescriptor]
  }
  
  @scala.inline
  implicit class PageDescriptorOps[Self <: PageDescriptor] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: PositionDescriptor): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: PositionDescriptor): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: SizeDescriptor): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: PositionDescriptor): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddle(value: PositionDescriptor): Self = this.set("middle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: PositionDescriptor): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: PositionDescriptor): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: SizeDescriptor): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
