package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleShadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSStyleShadow extends StObject {
  
  var _class: styleShadow
  
  var blurRadius: Double
  
  var color: SketchMSColor
  
  var contextSettings: SketchMSGraphicsContextSettings
  
  var isEnabled: Double
  
  var offsetX: Double
  
  var offsetY: Double
  
  var spread: Double
}
object SketchMSStyleShadow {
  
  inline def apply(
    blurRadius: Double,
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    isEnabled: Double,
    offsetX: Double,
    offsetY: Double,
    spread: Double
  ): SketchMSStyleShadow = {
    val __obj = js.Dynamic.literal(_class = "styleShadow", blurRadius = blurRadius.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], spread = spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleShadow]
  }
  
  extension [Self <: SketchMSStyleShadow](x: Self) {
    
    inline def setBlurRadius(value: Double): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
    
    inline def setColor(value: SketchMSColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setContextSettings(value: SketchMSGraphicsContextSettings): Self = StObject.set(x, "contextSettings", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Double): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setSpread(value: Double): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    inline def set_class(value: styleShadow): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
