package typings.sketchapp

import typings.sketchapp.anon.X
import typings.sketchapp.sketchappStrings.styleBlur
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSStyleBlur extends StObject {
  
  var _class: styleBlur
  
  var center: X
  
  var isEnabled: Double
  
  var motionAngle: Double
  
  var radius: Double
  
  var `type`: Double
}
object SketchMSStyleBlur {
  
  inline def apply(center: X, isEnabled: Double, motionAngle: Double, radius: Double, `type`: Double): SketchMSStyleBlur = {
    val __obj = js.Dynamic.literal(_class = "styleBlur", center = center.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], motionAngle = motionAngle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleBlur]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchMSStyleBlur] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: X): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Double): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setMotionAngle(value: Double): Self = StObject.set(x, "motionAngle", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_class(value: styleBlur): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
