package typings.sketchapp

import typings.sketchapp.sketchappStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSColor extends StObject {
  
  var _class: color
  
  var alpha: Double
  
  var blue: Double
  
  var green: Double
  
  var red: Double
}
object SketchMSColor {
  
  inline def apply(alpha: Double, blue: Double, green: Double, red: Double): SketchMSColor = {
    val __obj = js.Dynamic.literal(_class = "color", alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchMSColor] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def set_class(value: color): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
