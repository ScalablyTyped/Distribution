package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  var attribute: String
  
  var rippleRadius: js.UndefOr[Double] = js.undefined
  
  var `type`: String
}
object Attribute {
  
  inline def apply(attribute: String, `type`: String): Attribute = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setRippleRadius(value: Double): Self = StObject.set(x, "rippleRadius", value.asInstanceOf[js.Any])
    
    inline def setRippleRadiusUndefined: Self = StObject.set(x, "rippleRadius", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
