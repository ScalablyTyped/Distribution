package typings.sketchapp

import typings.sketchapp.sketchappStrings.gradientStop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSGradientStop extends StObject {
  
  var _class: gradientStop
  
  var color: SketchMSColor
  
  var position: Double
}
object SketchMSGradientStop {
  
  inline def apply(color: SketchMSColor, position: Double): SketchMSGradientStop = {
    val __obj = js.Dynamic.literal(_class = "gradientStop", color = color.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSGradientStop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchMSGradientStop] (val x: Self) extends AnyVal {
    
    inline def setColor(value: SketchMSColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def set_class(value: gradientStop): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
