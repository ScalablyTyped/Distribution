package typings.sketchapp

import typings.sketchapp.sketchappStrings.rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSRect extends StObject {
  
  var _class: rect = js.native
  
  var constrainProportions: Boolean = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object SketchMSRect {
  
  @scala.inline
  def apply(_class: rect, constrainProportions: Boolean, height: Double, width: Double, x: Double, y: Double): SketchMSRect = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], constrainProportions = constrainProportions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSRect]
  }
  
  @scala.inline
  implicit class SketchMSRectMutableBuilder[Self <: SketchMSRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstrainProportions(value: Boolean): Self = StObject.set(x, "constrainProportions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: rect): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
