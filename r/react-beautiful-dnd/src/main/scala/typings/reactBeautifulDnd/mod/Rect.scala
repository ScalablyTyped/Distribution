package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rect extends StObject {
  
  var bottom: Double
  
  // Rect
  var center: Position
  
  var height: Double
  
  var left: Double
  
  var right: Double
  
  // ClientRect
  var top: Double
  
  var width: Double
  
  // DOMRect
  var x: Double
  
  var y: Double
}
object Rect {
  
  @scala.inline
  def apply(
    bottom: Double,
    center: Position,
    height: Double,
    left: Double,
    right: Double,
    top: Double,
    width: Double,
    x: Double,
    y: Double
  ): Rect = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
  
  @scala.inline
  implicit class RectMutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: Position): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
