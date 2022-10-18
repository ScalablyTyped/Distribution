package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.blur
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blur
  extends StObject
     with AnyObject {
  
  var _class: blur
  
  var center: PointString
  
  var isEnabled: Boolean
  
  var motionAngle: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var saturation: Double
  
  var `type`: BlurType
}
object Blur {
  
  inline def apply(center: PointString, isEnabled: Boolean, saturation: Double, `type`: BlurType): Blur = {
    val __obj = js.Dynamic.literal(_class = "blur", center = center.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blur]
  }
  
  extension [Self <: Blur](x: Self) {
    
    inline def setCenter(value: PointString): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setMotionAngle(value: Double): Self = StObject.set(x, "motionAngle", value.asInstanceOf[js.Any])
    
    inline def setMotionAngleUndefined: Self = StObject.set(x, "motionAngle", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    inline def setType(value: BlurType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_class(value: blur): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
