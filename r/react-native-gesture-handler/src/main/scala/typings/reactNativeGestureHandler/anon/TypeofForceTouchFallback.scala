package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofForceTouchFallback extends StObject {
  
  /* static member */
  var forceTouchAvailable: Boolean
}
object TypeofForceTouchFallback {
  
  inline def apply(forceTouchAvailable: Boolean): TypeofForceTouchFallback = {
    val __obj = js.Dynamic.literal(forceTouchAvailable = forceTouchAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofForceTouchFallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofForceTouchFallback] (val x: Self) extends AnyVal {
    
    inline def setForceTouchAvailable(value: Boolean): Self = StObject.set(x, "forceTouchAvailable", value.asInstanceOf[js.Any])
  }
}
