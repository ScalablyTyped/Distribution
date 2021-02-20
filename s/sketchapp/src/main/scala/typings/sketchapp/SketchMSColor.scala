package typings.sketchapp

import typings.sketchapp.sketchappStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSColor extends StObject {
  
  var _class: color = js.native
  
  var alpha: Double = js.native
  
  var blue: Double = js.native
  
  var green: Double = js.native
  
  var red: Double = js.native
}
object SketchMSColor {
  
  @scala.inline
  def apply(_class: color, alpha: Double, blue: Double, green: Double, red: Double): SketchMSColor = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSColor]
  }
  
  @scala.inline
  implicit class SketchMSColorMutableBuilder[Self <: SketchMSColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: color): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
