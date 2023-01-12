package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSStyleReflection extends StObject {
  
  var _class: styleReflection
  
  var distance: Double
  
  var isEnabled: Double
  
  var strength: Double
}
object SketchMSStyleReflection {
  
  inline def apply(distance: Double, isEnabled: Double, strength: Double): SketchMSStyleReflection = {
    val __obj = js.Dynamic.literal(_class = "styleReflection", distance = distance.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleReflection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchMSStyleReflection] (val x: Self) extends AnyVal {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Double): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def set_class(value: styleReflection): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
