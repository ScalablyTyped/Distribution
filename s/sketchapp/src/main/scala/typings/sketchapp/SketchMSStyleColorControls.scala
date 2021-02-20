package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleColorControls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSStyleColorControls extends StObject {
  
  var _class: styleColorControls = js.native
  
  var brightness: Double = js.native
  
  var contrast: Double = js.native
  
  var hue: Double = js.native
  
  var isEnabled: Double = js.native
  
  var saturation: Double = js.native
}
object SketchMSStyleColorControls {
  
  @scala.inline
  def apply(
    _class: styleColorControls,
    brightness: Double,
    contrast: Double,
    hue: Double,
    isEnabled: Double,
    saturation: Double
  ): SketchMSStyleColorControls = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleColorControls]
  }
  
  @scala.inline
  implicit class SketchMSStyleColorControlsMutableBuilder[Self <: SketchMSStyleColorControls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Double): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: styleColorControls): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
