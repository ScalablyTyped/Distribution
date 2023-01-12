package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exclusive extends StObject {
  
  var exclusive: Boolean
  
  var rippleColor: String
}
object Exclusive {
  
  inline def apply(exclusive: Boolean, rippleColor: String): Exclusive = {
    val __obj = js.Dynamic.literal(exclusive = exclusive.asInstanceOf[js.Any], rippleColor = rippleColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exclusive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Exclusive] (val x: Self) extends AnyVal {
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
  }
}
