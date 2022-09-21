package typings.sketchHqSketchFileFormatTs.typesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.colorControls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorControls
  extends StObject
     with AnyObject {
  
  var _class: colorControls
  
  var brightness: Double
  
  var contrast: Double
  
  var hue: Double
  
  var isEnabled: Boolean
  
  var saturation: Double
}
object ColorControls {
  
  inline def apply(brightness: Double, contrast: Double, hue: Double, isEnabled: Boolean, saturation: Double): ColorControls = {
    val __obj = js.Dynamic.literal(_class = "colorControls", brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorControls]
  }
  
  extension [Self <: ColorControls](x: Self) {
    
    inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    inline def set_class(value: colorControls): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
