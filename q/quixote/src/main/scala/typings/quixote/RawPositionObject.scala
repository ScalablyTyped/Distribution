package typings.quixote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawPositionObject extends StObject {
  
  // bottom edge
  var bottom: Double
  
  // height (bottom edge minus top edge)
  var height: Double
  
  // left edge
  var left: Double
  
  // right edge
  var right: Double
  
  // top edge
  var top: Double
  
  // width (right edge minus left edge)
  var width: Double
}
object RawPositionObject {
  
  inline def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): RawPositionObject = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawPositionObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawPositionObject] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
