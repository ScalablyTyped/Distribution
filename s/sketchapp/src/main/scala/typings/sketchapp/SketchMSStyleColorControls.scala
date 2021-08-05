package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleColorControls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSStyleColorControls extends StObject {
  
  var _class: styleColorControls
  
  var brightness: Double
  
  var contrast: Double
  
  var hue: Double
  
  var isEnabled: Double
  
  var saturation: Double
}
object SketchMSStyleColorControls {
  
  inline def apply(brightness: Double, contrast: Double, hue: Double, isEnabled: Double, saturation: Double): SketchMSStyleColorControls = {
    val __obj = js.Dynamic.literal(_class = "styleColorControls", brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleColorControls]
  }
  
  extension [Self <: SketchMSStyleColorControls](x: Self) {
    
    inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Double): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    inline def set_class(value: styleColorControls): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
