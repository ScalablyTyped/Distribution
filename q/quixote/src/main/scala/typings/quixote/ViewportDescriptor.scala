package typings.quixote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Viewport positions and sizes are available on QFrame.viewport()
@js.native
trait ViewportDescriptor extends StObject {
  
  // The lowest visible part of the page.
  var bottom: PositionDescriptor = js.native
  
  // Horizontal center: midway between right and left
  var center: PositionDescriptor = js.native
  
  // Height of the viewport.
  var height: SizeDescriptor = js.native
  
  // The leftmost visible part of the page.
  var left: PositionDescriptor = js.native
  
  // Vertical middle: midway between top and bottom.
  var middle: PositionDescriptor = js.native
  
  // The rightmost visible part of the page.
  var right: PositionDescriptor = js.native
  
  // The highest visible part of the page.
  var top: PositionDescriptor = js.native
  
  // Width of the viewport.
  var width: SizeDescriptor = js.native
}
object ViewportDescriptor {
  
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
  ): ViewportDescriptor = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportDescriptor]
  }
  
  @scala.inline
  implicit class ViewportDescriptorMutableBuilder[Self <: ViewportDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: PositionDescriptor): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: PositionDescriptor): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: SizeDescriptor): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: PositionDescriptor): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddle(value: PositionDescriptor): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: PositionDescriptor): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: PositionDescriptor): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: SizeDescriptor): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
