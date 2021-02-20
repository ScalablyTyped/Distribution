package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSStyleReflection extends StObject {
  
  var _class: styleReflection = js.native
  
  var distance: Double = js.native
  
  var isEnabled: Double = js.native
  
  var strength: Double = js.native
}
object SketchMSStyleReflection {
  
  @scala.inline
  def apply(_class: styleReflection, distance: Double, isEnabled: Double, strength: Double): SketchMSStyleReflection = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleReflection]
  }
  
  @scala.inline
  implicit class SketchMSStyleReflectionMutableBuilder[Self <: SketchMSStyleReflection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Double): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: styleReflection): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
