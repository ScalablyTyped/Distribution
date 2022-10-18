package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rect
  extends StObject
     with AnyObject {
  
  var _class: rect
  
  var constrainProportions: Boolean
  
  var height: Double
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object Rect {
  
  inline def apply(constrainProportions: Boolean, height: Double, width: Double, x: Double, y: Double): Rect = {
    val __obj = js.Dynamic.literal(_class = "rect", constrainProportions = constrainProportions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
  
  extension [Self <: Rect](x: Self) {
    
    inline def setConstrainProportions(value: Boolean): Self = StObject.set(x, "constrainProportions", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def set_class(value: rect): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
