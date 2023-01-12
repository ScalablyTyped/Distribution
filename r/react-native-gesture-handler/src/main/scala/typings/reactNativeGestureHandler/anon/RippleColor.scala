package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RippleColor extends StObject {
  
  var rippleColor: Null
}
object RippleColor {
  
  inline def apply(rippleColor: Null): RippleColor = {
    val __obj = js.Dynamic.literal(rippleColor = rippleColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RippleColor] (val x: Self) extends AnyVal {
    
    inline def setRippleColor(value: Null): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
  }
}
