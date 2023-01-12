package typings.quixote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Viewport positions and sizes are available on QFrame.viewport()
trait ViewportDescriptor extends StObject {
  
  // The lowest visible part of the page.
  var bottom: PositionDescriptor
  
  // Horizontal center: midway between right and left
  var center: PositionDescriptor
  
  // Height of the viewport.
  var height: SizeDescriptor
  
  // The leftmost visible part of the page.
  var left: PositionDescriptor
  
  // Vertical middle: midway between top and bottom.
  var middle: PositionDescriptor
  
  // The rightmost visible part of the page.
  var right: PositionDescriptor
  
  // The highest visible part of the page.
  var top: PositionDescriptor
  
  // Width of the viewport.
  var width: SizeDescriptor
}
object ViewportDescriptor {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ViewportDescriptor] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: PositionDescriptor): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: PositionDescriptor): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: SizeDescriptor): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: PositionDescriptor): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setMiddle(value: PositionDescriptor): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    inline def setRight(value: PositionDescriptor): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: PositionDescriptor): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: SizeDescriptor): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
