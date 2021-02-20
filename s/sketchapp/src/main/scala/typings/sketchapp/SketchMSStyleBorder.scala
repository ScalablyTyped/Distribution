package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleBorder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSStyleBorder extends StObject {
  
  var _class: styleBorder = js.native
  
  var color: SketchMSColor = js.native
  
  var contextSettings: SketchMSGraphicsContextSettings = js.native
  
  var fillType: Double = js.native
  
  var gradient: SketchMSGradient = js.native
  
  var isEnabled: Double = js.native
  
  var position: Double = js.native
  
  var thickness: Double = js.native
}
object SketchMSStyleBorder {
  
  @scala.inline
  def apply(
    _class: styleBorder,
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    fillType: Double,
    gradient: SketchMSGradient,
    isEnabled: Double,
    position: Double,
    thickness: Double
  ): SketchMSStyleBorder = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleBorder]
  }
  
  @scala.inline
  implicit class SketchMSStyleBorderMutableBuilder[Self <: SketchMSStyleBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: SketchMSColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextSettings(value: SketchMSGraphicsContextSettings): Self = StObject.set(x, "contextSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillType(value: Double): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradient(value: SketchMSGradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Double): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: styleBorder): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
