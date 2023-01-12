package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseBackgroundPropType extends StObject {
  
  var rippleRadius: js.UndefOr[Double | Null] = js.undefined
  
  var `type`: String
}
object BaseBackgroundPropType {
  
  inline def apply(`type`: String): BaseBackgroundPropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseBackgroundPropType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseBackgroundPropType] (val x: Self) extends AnyVal {
    
    inline def setRippleRadius(value: Double): Self = StObject.set(x, "rippleRadius", value.asInstanceOf[js.Any])
    
    inline def setRippleRadiusNull: Self = StObject.set(x, "rippleRadius", null)
    
    inline def setRippleRadiusUndefined: Self = StObject.set(x, "rippleRadius", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
