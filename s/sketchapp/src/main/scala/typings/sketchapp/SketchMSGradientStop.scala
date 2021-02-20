package typings.sketchapp

import typings.sketchapp.sketchappStrings.gradientStop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSGradientStop extends StObject {
  
  var _class: gradientStop = js.native
  
  var color: SketchMSColor = js.native
  
  var position: Double = js.native
}
object SketchMSGradientStop {
  
  @scala.inline
  def apply(_class: gradientStop, color: SketchMSColor, position: Double): SketchMSGradientStop = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSGradientStop]
  }
  
  @scala.inline
  implicit class SketchMSGradientStopMutableBuilder[Self <: SketchMSGradientStop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: SketchMSColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: gradientStop): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
